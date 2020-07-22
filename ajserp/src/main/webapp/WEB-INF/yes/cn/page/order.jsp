<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!--  预约试听 -->



<div class="contactUs appointment">
	<div class="head-plh"></div>
	<div class="contactUs_bg">
		<div class="main">
			<div class="title">
				<h3 class="wow fadeInUp" data-wow-duration="1s"
					data-wow-delay="0.1s">VIP待遇听课体验</h3>
				<p class="wow fadeInUp" data-wow-duration="1s" data-wow-delay="0.2s">VIP待遇听课体验</p>
			</div>
			<div class="mod-forms">
				<div class="ui-item ui-item-input wow fadeInUp"
					data-wow-duration="1s" data-wow-delay="0.3s">
					<div class="ui-item-box">
						<div class="flex">
							<span class="ui-label">您的称呼</span> <input class="ui-input"
								id="name" type="text" placeholder="请输入家长姓名">
						</div>
					</div>
				</div>

				<div class="ui-item ui-item-input wow fadeInUp"
					data-wow-duration="1s" data-wow-delay="0.4s">
					<div class="ui-item-box">
						<div class="flex">
							<span class="ui-label">手 机 号</span> <input
								class="ui-input flex-1" type="text" id="tel"
								placeholder="请输入您的手机号，免费获取试听">
						</div>
					</div>
				</div>
				<div class="ui-item ui-item-input wow fadeInUp"
					data-wow-duration="1s" data-wow-delay="0.4s">
					<div class="ui-item-box">
						<div class="flex">
							<span class="ui-label">日期</span> <input class="ui-input flex-1"
								type="date" id="nbrdate">
						</div>
					</div>
				</div>
				<div class="ui-item ui-item-input wow fadeInUp"
					data-wow-duration="1s" data-wow-delay="0.4s">
					<div class="ui-item-box">
						<div class="flex">
							<span class="ui-label">年龄</span> <input class="ui-input flex-1"
								type="number" id="age" placeholder="请输入幼儿的年龄">
						</div>
					</div>
				</div>

				<div class="ui-item ui-item-input wow fadeInUp"
					data-wow-duration="1s" data-wow-delay="0.7s">
					<div class="ui-item-box">
						<div class="flex select">
							<span class="ui-label">课程体系</span> <select
								class="ui-select flex-1" name="" id="curriculum">
								<option value="">请选择试听课程体系</option>
								<option value="A">早教课程</option>
								<option value="B">托育课程</option>
								<option value="C">奇幻之旅</option>
								<option value="D">成长*BABY</option>
								<option value="E">音乐*BABY</option>
								<option value="F">早教课程</option>
							</select>
						</div>
					</div>
				</div>
				<div class="ui-item btnBox wow fadeInUp" data-wow-duration="1s"
					data-wow-delay="0.8s">
					<div class="ui-item-box">
						<a href="#" class="ui-btn-submit order">立即预约</a>
					</div>
				</div>
			</div>
		</div>
	</div>

</div>

<script>
	$(function() {

		// 点击order按钮
		$(".order").click(function() {
			if (!$('#name').val().trim()) {
				//toastr.error(''); 不可用
				alert("请输入您的名字!");
				return;
			}
			if (!$('#tel').val().trim()) {
				//toastr.error('请输入手机号!');
				alert("请输入手机号!");
				return;
			}
			if (!/^1\d{10}$/.test($("#tel").val())) {
				alert("手机号格式错误!");
				//toastr.error('手机号格式错误!');
				return;
			}
			if (!$('#nbrdate').val().trim()) {
				//toastr.error('请输入手机号!');
				alert("请输入日期!");
				return;
			}
			if (!$('#age').val().trim()) {
				alert("请输入年龄!");
				return;
			} 
			
			if (!$('#curriculum').val().trim()) {
				alert("请选择课程!");
				return;
			} 

			$.ajax({
				type : 'POST',
				dataType : "json",
				contentType : 'application/json;charset=UTF-8',
				url : '${basePath}api/baby/prelisencurriculum',
				data : JSON.stringify({
					name : $('#name').val(),
					phone : $('#tel').val(),
					age : $('#age').val(),
					curriculumtype : $('#curriculum').val(),
					nbrdate:format( $('#nbrdate').val(),'yyyy-MM-dd HH:mm:ss') 
				}),
				success : function(res) {
					//toastr.success("预约成功!")
					alert("预约成功!");
					// 刷新当前页
					window.location.reload();
				},
				error : function(res) {
				
					alert(res.responseJSON.message);
				}
			});

		})

var format = function(time, format) {   //前台获取时间，转化为国际时间，可以当做工具使用
    var t = new Date(time);
    var tf = function(i){return (i < 10 ? '0' : "") + i};
    return format.replace(/yyyy|MM|dd|HH|mm|ss/g, function(a){
        switch(a){
            case 'yyyy':
                return tf(t.getFullYear());
                break;
            case 'MM':
                return tf(t.getMonth() + 1);
                break;
            case 'mm':
                return tf(t.getMinutes());
                break;
            case 'dd':
                return tf(t.getDate());
                break;
            case 'HH':
                return tf(t.getHours());
                break;
            case 'ss':
                return tf(t.getSeconds());
                break;
        }
    })
}

	})
</script>

<!-- Foot Begin -->
<footer class="footerLine wow fadeInUp" data-wow-duration="1s"
	data-wow-delay="0.2s">
	<div class="ft_bottom">
		<div class="main">壹号贝贝· 长泰沐橦店 版权所有 Copyright ©2018-2019
			备案号：闽ICP备88888888号</div>
	</div>
</footer>

