<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";

	request.setAttribute("basePath", basePath);

	
%>
<!DOCTYPE html>
<html lang="zh">
<head>
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
<meta name="viewport"
	content="initial-scale=1, maximum-scale=1, user-scalable=no, width=device-width">
<meta charset="utf-8" />


<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>

<script src="plugin/flexslider/jquery.flexslider.js"></script>

<link rel="stylesheet" href="${basePath}plugin/flexslider/flexslider.css">

	<!-- Include owl css -->
	<!-- <link rel="stylesheet" href="plugin/owl-carousel/owl.carousel.css">
	<link rel="stylesheet" href="plugin/owl-carousel/owl.theme.css"> -->
    <!-- Include the main css -->
    <link rel="stylesheet" href="${basePath}css/common.css">
    <link rel="stylesheet" href="${basePath}css/main.css">
	<!--[if lt IE 9]>
      <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->

    <link rel="stylesheet" href="${basePath}css/animate.css" type="text/css">
    <script type="text/javascript" src="${basePath}js/wow.min.js"></script>




</head>

<body class="page-index pageActivity">
     <a id="#Page1"></a>
	<jsp:include page="../_include/head.jsp"></jsp:include>
	<jsp:include page="../page/${content}"></jsp:include>
	<jsp:include page="../_include/foot.jsp"></jsp:include>

	<!-- 右侧悬浮部分  -->
    <div class="flexed_r">
        <a class="flex-center trans_3" href="order.html">
            <span>
                <p><i class="icon icon-r1"></i></p>
                预约试听
            </span>
        </a>
        <a class="flex-center trans_3" href="contactus.html">
            <span>
                <p><i class="icon icon-r2"></i></p>
                联系我们
            </span>
        </a>
        <a class="flex-center trans_3 flexed_r_wx" href="#">
            <span>
                <p><i class="icon icon-r3"></i></p>
                在线咨询
            </span>
            <img class="flexed_r_wx trans_3" src="images/weixin.png" alt="">
        </a>
        <a class="flex-center trans_3 fanhui" href="#Page1">
            <span>
                <p><i class="icon icon-r4"></i></p>
                返回顶部
            </span>
        </a>
        <img class="lion" src="images/lion.png" alt="">
    </div>

	
	<!-- Include the jquery -->
	<script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>

	<script src="${basePath}plugin/flexslider/jquery.flexslider.js"></script>
	<!-- Include the owl-carousel js -->
	<!-- <script src="plugin/owl-carousel/owl.carousel.js"></script> -->
	<!-- Include the main js -->
	<script src="${basePath}js/microtek.js"></script>
	
	
	
	<!-- Include the owl-carousel js -->
	<!-- <script src="plugin/owl-carousel/owl.carousel.js"></script> -->
	<!-- Include the main js -->
	
	<script>
		$(document).ready(function() {
			var winW,
				hdH;

			winW = $(window).width();
			
			function headH(){
				if(winW<769){
					hdH = '50px';
				}else{
					hdH = '90px';
				}
			}
			function slideH(){
		    	var _h = $('.slide-1').height();
		    	console.log(_h-parseInt(hdH, 10));
		    	$('.slides li').height(_h-parseInt(hdH, 10));
		    }


		    // Init the flexslider
		    $('.flexslider').flexslider({
		        animation: "slide",
		        slideshow: true,
		        animationLoop: true,
		        slideshowSpeed: 5000,
		        controlNav: false, 
		        directionNav: true,
		        start: function(slider){
		          $('body').removeClass('loading');
		        }
		    });

		    


		    headH();
		    slideH();
		    //redraw
		    $(window).resize(function(){
				winW = $(window).width();
				headH();
				slideH();
			})
		});

			
     		
	</script>
	<script>
		$(function(){
             var str="${content}";
			if(str.indexOf("aboutmutong") != -1){ //关于沐童
				  $("#aboutmutong").addClass("cur");
			}else if(str.indexOf("coursesystem") != -1){ //课程体系
				 $("#coursesystem").addClass("cur");
			}else if(str.indexOf("order") != -1){ //预约试听
				 $("#order").addClass("cur");
			}else if(str.indexOf("activities") != -1||str.indexOf("activitydetails") != -1){ //精彩活动 以及精彩活动详情  
				 $("#activities").addClass("cur");
			}else if(str.indexOf("parentshome") != -1){//父母之家
				 $("#parentshome").addClass("cur");
			}else if(str.indexOf("news") != -1){// 新闻动态
				 $("#news").addClass("cur");
			}else if(str.indexOf("contactus") != -1){// 联系我们
				 $("#contactus").addClass("cur");
			}else{// 默认首页
				 $("#index").addClass("cur");
			}
			
			
			
			
		
		})

			
     		
	</script>

</body>

</html>