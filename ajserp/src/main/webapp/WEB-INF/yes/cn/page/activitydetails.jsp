<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!--  精彩活动 详情-->



<div class="activity">
	<div class="head-plh"></div>
	<div class="wow fadeInUp" data-wow-duration="1s" data-wow-delay="0.2s">
	 <a href="${bannerImages.cndetailurl}">
		<div class="banner"
			style="background-image:url(${basePath}api/base/attachment/downloadbyAttId?attId=${bannerImages.cnimageurl})">
		</div>
		</a>
	</div>
	<div class="activity_bg activityView">
		<div class="main">
			<div class="title wow fadeInUp" data-wow-duration="1s"
				data-wow-delay="0.2s">
				<h3>${exercise.title}</h3>
				<p>时间：${exercise.nbrdate}</p>
			</div>
			<div class="view">
				<div class="wow fadeInUp" data-wow-duration="1s"
					data-wow-delay="0.2s">
					<c:choose>
						<c:when test="${exercise.status==10}">
				${exercise.exercisedesca}
				</c:when>
						<c:otherwise>
				${exercise.exercisedescb}
					</c:otherwise>
					</c:choose>


				</div>
				<div class="colorBg wow fadeInUp" data-wow-duration="1s"
					data-wow-delay="0.2s"></div>

				<c:if test="${exercise.status==10}">

					<div class="mod-forms wow fadeInUp" data-wow-duration="1s"
						data-wow-delay="0.2s">
						<div class="ui-box-3">
							<div class="ui-item ui-item-input">
								<div class="ui-item-box">
									<div class="flex">
										<span class="ui-label">您的称呼</span> <input class="ui-input"
											type="text" id="name" placeholder="请输入家长姓名">
									</div>
								</div>
							</div>
							<div class="ui-item ui-item-input">
								<div class="ui-item-box">
									<div class="flex">
										<span class="ui-label">手 机 号</span> <input
											class="ui-input flex-1" type="text" id="tel"
											placeholder="请输入您的手机号，免费获取试听">
									</div>
								</div>
							</div>
							<div class="ui-item ui-item-input">
								<div class="ui-item-box">
									<div class="flex">
										<span class="ui-label">备注</span> <input
											class="ui-input flex-1" type="text" id="remark"
											placeholder="请输入你的备注信息"">
									</div>
								</div>
							</div>
							<div class="ui-item ui-item-input">
								<div class="ui-item-box"></div>
							</div>
							<div class="ui-item ui-item-input">
								<div class="ui-item-box">
									<div class="flex order ">
										<input class="ui-input flex-1" type="button" value="立即预约"
											style="background: #70c43e; color: #FFFFFF">
									</div>
								</div>
							</div>

						</div>

						<div class="ui-item">
							<div class="ui-item-box">&nbsp;</div>
						</div>
				</c:if>



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
			// 备注可为空
			/* if (!$('#remark').val().trim()) {
				toastr.error('请输入备注!');
				return;
			} */

			$.ajax({
				type : 'POST',
				dataType : "json",
				contentType : 'application/json;charset=UTF-8',
				url : '${basePath}api/baby/exerciseorder',
				data : JSON.stringify({
					name : $('#name').val(),
					tel : $('#tel').val(),
					remark : $('#remark').val()
				}),
				success : function(res) {
					//toastr.success("预约成功!")
					alert("预约成功!");
					// 刷新当前页
					window.location.reload();
				},
				error : function(res) {
					//toastr.error(res.responseJSON.message);
					alert(res.responseJSON.message);
				}
			});

		})

	})
</script>

    <!-- Foot Begin -->
    <footer class="wow fadeInUp" data-wow-duration="1s" data-wow-delay="0.2s">
        <!-- <div class="contact">
            <span>
                <a href="#" class="btn btn1">
                    <i class="icon icon-c1"></i>试听预约
                </a>
                <img src="images/lion2.png" alt="">
                <a href="#" class="btn">
                    <i class="icon icon-c2"></i>联系我们
                </a>
            </span>
        </div> -->
        <img class="tree" src="images/tree.png" alt="">
        <div class="foot">
            <div class="main">
                <div class="top">
                    <div class="item flex">
                        <span class="ico">
                            <i class="icon icon-f1"></i>
                        </span>
                        <div class="flex-1">
                            <span>领先教育</span>
                            <p>背景实力雄厚的早教机构</p>
                        </div>
                    </div>
                    <div class="item flex">
                        <span class="ico">
                            <i class="icon icon-f2"></i>
                        </span>
                        <div class="flex-1">
                            <span>智能测评</span>
                            <p>最适合中国宝宝的多元智能测评</p>
                        </div>
                    </div>
                    <div class="item flex">
                        <span class="ico">
                            <i class="icon icon-f3"></i>
                        </span>
                        <div class="flex-1">
                            <span>课程体系</span>
                            <p>全方面多方位的教育环境熏陶</p>
                        </div>
                    </div>
                </div>
                <div class="bottom">
                    <dl>
                        <dt>
                            <span>导航Navigation</span>
                        </dt>
                        <dd><a href="#">关于沐橦</a></dd>
                        <dd><a href="#">课程体系</a></dd>
                        <dd><a href="#">预约试听</a></dd>
                        <dd><a href="#">精彩活动</a></dd>
                        <dd><a href="#">父母之家</a></dd>
                        <dd><a href="#">新闻动态</a></dd>
                        <dd><a href="#">联系我们</a></dd>
                    </dl>
                    <dl>
                        <dt>
                            <span>课程体系</span>
                        </dt>
                        <dd><a href="#">早教课程</a></dd>
                        <dd><a href="#">托育课程</a></dd>
                        <dd><a href="#">奇幻之旅</a></dd>
                        <dd><a href="#">成长*BABY</a></dd>
                        <dd><a href="#">音乐*BABY</a></dd>
                        <dd><a href="#">创意*BABY</a></dd>
                    </dl>
                    <dl>
                        <dt><span>联系我们</span></dt>
                        <dd>
                            <div class="ct">
                                <p class="clearfix"><i class="icon icon-f4"></i>福建· 漳州· 长泰县金座丽景10号楼（写字楼）三楼310-317号</p>
                                <p class="clearfix"><i class="icon icon-f4"></i><span class="col-yellow">0596-8216986</span>（周一到周五 8:00-18:00）</p>
                                <p class="clearfix"><i class="icon icon-f4"></i><a href="">http://www.XXXXX.com</a></p>
                            </div>
                        </dd>
                    </dl>
                    <div class="wx">
                        <img src="images/weixin.png" alt="">
                    </div>
                </div>
            </div>
        </div>
        <div class="ft_bottom">
            <div class="main">
            壹号贝贝· 长泰沐橦店  版权所有 Copyright ©2018-2019 备案号：闽ICP备88888888号</div>
        </div>
    </footer>