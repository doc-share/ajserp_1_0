<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>




<div id="fullpage">
	<div class="head-plh"></div>
	<!-- Section1 Begin -->
	<div class="section section-1 wow fadeInUp" data-wow-duration="1s"
		data-wow-delay="0.2s">
		<div class="slide slide-1" data-anchor="slide1">
			<div class="flexslider">
				<ul class="slides">

					<c:forEach items="${bannerImages}" var="slide"
						varStatus="idxStatus">
							<li class="order"
							style="background-image:url(${basePath}api/base/attachment/downloadbyAttId?attId=${slide.cnimageurl})">
							
							<input type="hidden" value="${slide.cndetailurl}" class="alick">
							
						</li>
					
					</c:forEach>



				</ul>
			</div>
		</div>
	</div>
	
	<script>
	$(function() {

		// 点击order按钮
		$(".order").click(function() {
			var obj=$(this);
			var s =obj.find(".alick").val();
			window.document.location.href=s;
		})

	})
</script>
	
	
	
	
	<!-- Section1 End -->
	<!-- Section2 Begin -->
	<div class="section section-2 clearfix">
		<div class="round_logo flex-center wow fadeInDown"
			data-wow-duration="1s" data-wow-delay="0.2s">
			<div class="flex-center">
				<img src="images/logo_1.png" alt="">
			</div>
			<div class="roud_bg"></div>
		</div>
		<div class="left  fadeInLeft" id="leftimg" data-wow-duration="1s"
			data-wow-delay="0.2s"
			style="background-image:url(${basePath}api/base/attachment/downloadbyAttId?attId=${brandinfo.indeximage});background-size: cover">

		</div>
		<div class="right wow fadeInRight" data-wow-duration="1s"
			data-wow-delay="0.2s">
			<div class="right_box flex-center-left">
				<div>
					<div class="tit">
						<span>关于沐橦</span> <em>ABOUT US</em>
					</div>
					<div class="content">
						${brandinfo.mtremark}
						<div>
							<a href="aboutmutong.html" class="ui-btn-more trans_3">MORE+</a>
						</div>

					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Section2 End -->
	<!-- Section3 Begin -->
	<div class="section section-3">
		<div class="main">
			<c:choose>
				<c:when test="${curr!=null}">
					<a href="coursesystemdatails.html?step=${curr.uid}">
						<div class="left  fadeInLeft" data-wow-duration="1s"
							data-wow-delay="0.2s"
							style="background: url('${basePath}api/base/attachment/downloadbyAttId?attId=${curr.indeximage}') no-repeat 0 bottom #fedd78; background-size:100% auto">
							<div class="tit">
								<span>课程体系</span> <em>ABOUT US</em>
							</div>
						</div>
					</a>
				</c:when>
				<c:otherwise>
					<div class="left  fadeInLeft" data-wow-duration="1s"
						data-wow-delay="0.2s"
						style="background: url('images/i_2.jpg') no-repeat 0 bottom #fedd78; background-size: 100% auto;">

						<div class="tit">
							<span>课程体系</span> <em>ABOUT US</em>
						</div>
					</div>
				</c:otherwise>
			</c:choose>


			<div class="right flex">
				<a class="relative flex-center bg1 wow fadeInRight"
					data-wow-duration="1s" data-wow-delay="0.4s"
					href="coursesystemdatails.html?step=A"> <span>早教课程</span>
					<div></div>
				</a> <a class="relative flex-center bg2 wow fadeInRight"
					data-wow-duration="1s" data-wow-delay="0.6s"
					href="coursesystemdatails.html?step=B"> <span>托育课程</span>
					<div></div>
				</a> <a class="relative flex-center bg3 wow fadeInRight"
					data-wow-duration="1s" data-wow-delay="0.8s"
					href="coursesystemdatails.html?step=C"> <span>奇幻之旅</span>
					<div></div>
				</a> <a class="relative flex-center bg4 wow fadeInRight"
					data-wow-duration="1s" data-wow-delay="0.10s"
					href="coursesystemdatails.html?step=D"> <span>成长*BABY</span>
					<div></div>
				</a> <a class="relative flex-center bg5 wow fadeInRight"
					data-wow-duration="1s" data-wow-delay="1.2s"
					href="coursesystemdatails.html?step=E"> <span>音乐*BABY</span>
					<div></div>
				</a> <a class="relative flex-center bg6 wow fadeInRight"
					data-wow-duration="1s" data-wow-delay="1.4s"
					href="coursesystemdatails.html?step=F"> <span>创意*BABY</span>
					<div></div>
				</a>
			</div>
		</div>
	</div>
	<!-- Section3 End -->
	<!-- Section4 Begin -->
	<div class="section section-4">
		<div class="main">
			<div class="left">
				<div class="title">
					<div class="tit wow fadeInDown" data-wow-duration="1s"
						data-wow-delay="0.2s">
						<span>父母之家</span> <em>PARENTS</em>
					</div>
				</div>
				<div class="clearfix hoverImg wow fadeInUp" data-wow-duration="1s"
					data-wow-delay="0.2s">
					<c:choose>
						<c:when test="${parentslist[0]!=null}">
							<div >
								<a href="parentshomedetails.html?uid=${parentslist[0].uid}">
								 <img 
										src="${basePath}api/base/attachment/downloadbyAttId?attId=${parentslist[0].image}"
										alt="">
								</a>
							</div>
							<a href="parentshomedetails.html?uid=${parentslist[0].uid}">
								<p>${parentslist[0].title}</p>
							</a>
						</c:when>
						<c:otherwise>
							<div>
								<img src="images/i_3.jpg" alt="">
							</div>
							<p>壹号贝贝创意BABY课程，和孩子一起发现世界</p>

						</c:otherwise>
					</c:choose>



				</div>
			</div>
			<div class="right">
				<ul>
					<c:choose>
						<c:when test="${parentslist[1]!=null}">
							<li class="flex-center-left trans_3 wow fadeInUp"
								data-wow-duration="1s" data-wow-delay="0.2s"><a
								href="parentshomedetails.html?uid=${parentslist[1].uid}">
									<div class="box">${parentslist[1].title}</div>
							</a></li>
							<li  class="hoverImg trans_3 wow fadeInUp" data-wow-duration="1s"
								data-wow-delay="0.4s">
								<a href="parentshomedetails.html?uid=${parentslist[1].uid}" > 
								    <img src="${basePath}api/base/attachment/downloadbyAttId?attId=${parentslist[1].image}"	alt="">
								</a>
								</li>
						</c:when>
						<c:otherwise>
							<li class="flex-center-left trans_3 wow fadeInUp"
								data-wow-duration="1s" data-wow-delay="0.2s">
								<div class="box">壹号贝贝创意BABY课程，和孩子一起发现世界</div>
							</li>
							<li class="hoverImg trans_3 wow fadeInUp" data-wow-duration="1s"
								data-wow-delay="0.4s"><img src="images/i_4.jpg" alt=""></li>
						</c:otherwise>
					</c:choose>

					<c:choose>
						<c:when test="${parentslist[2]!=null}">
							<li class="flex-center-left trans_3 wow fadeInUp"
								data-wow-duration="1s" data-wow-delay="0.2s"><a
								href="parentshomedetails.html?uid=${parentslist[2].uid}">
									<div class="box">${parentslist[2].title}</div>
							</a></li>
							<li href="parentshomedetails.html?uid=${parentslist[2].uid}" class="hoverImg trans_3 wow fadeInUp" data-wow-duration="1s"
								data-wow-delay="0.4s">
								<a  href="parentshomedetails.html?uid=${parentslist[2].uid}" >
								  <img src="${basePath}api/base/attachment/downloadbyAttId?attId=${parentslist[2].image}"	alt="">
								</a>
								
								</li>
						</c:when>
						<c:otherwise>
							<li class="flex-center-left trans_3 wow fadeInUp"
								data-wow-duration="1s" data-wow-delay="0.2s">
								<div class="box">壹号贝贝创意BABY课程，和孩子一起发现世界</div>
							</li>
							<li class="hoverImg trans_3 wow fadeInUp" data-wow-duration="1s"
								data-wow-delay="0.4s"><img src="images/i_4.jpg" alt=""></li>
						</c:otherwise>
					</c:choose>

					<c:choose>
						<c:when test="${parentslist[3]!=null}">
							<li class="flex-center-left trans_3 wow fadeInUp"
								data-wow-duration="1s" data-wow-delay="0.2s"><a
								href="parentshomedetails.html?uid=${parentslist[3].uid}">
									<div class="box">${parentslist[3].title}</div>
							</a></li>
							<li href="parentshomedetails.html?uid=${parentslist[3].uid}" class="hoverImg trans_3 wow fadeInUp" data-wow-duration="1s"
								data-wow-delay="0.4s">
								<a href="parentshomedetails.html?uid=${parentslist[3].uid}" >
								 <img src="${basePath}api/base/attachment/downloadbyAttId?attId=${parentslist[3].image}"	alt="">
								</a>
								
								</li>
						</c:when>
						<c:otherwise>
							<li class="flex-center-left trans_3 wow fadeInUp"
								data-wow-duration="1s" data-wow-delay="0.2s">
								<div class="box">壹号贝贝创意BABY课程，和孩子一起发现世界</div>
							</li>
							<li class="hoverImg trans_3 wow fadeInUp" data-wow-duration="1s"
								data-wow-delay="0.4s"><img src="images/i_4.jpg" alt=""></li>
						</c:otherwise>
					</c:choose>

					<c:choose>
						<c:when test="${parentslist[4]!=null}">
							<li class="flex-center-left trans_3 wow fadeInUp"
								data-wow-duration="1s" data-wow-delay="0.2s"><a
								href="parentshomedetails.html?uid=${parentslist[4].uid}">
									<div class="box">${parentslist[4].title}</div>
							</a></li>
							<li  class="hoverImg trans_3 wow fadeInUp" data-wow-duration="1s"
								data-wow-delay="0.4s">
								<a href="parentshomedetails.html?uid=${parentslist[4].uid}">
								 <img src="${basePath}api/base/attachment/downloadbyAttId?attId=${parentslist[4].image}" alt="">
								</a>
								
								</li>
						</c:when>
						<c:otherwise>
							<li class="flex-center-left trans_3 wow fadeInUp"
								data-wow-duration="1s" data-wow-delay="0.2s">
								<div class="box">壹号贝贝创意BABY课程，和孩子一起发现世界</div>
							</li>
							<li class="hoverImg trans_3 wow fadeInUp" data-wow-duration="1s"
								data-wow-delay="0.4s"><img src="images/i_4.jpg" alt=""></li>
						</c:otherwise>
					</c:choose>



				</ul>
			</div>
		</div>
	</div>
	<!-- Section4 End -->

</div>
<!-- Foot Begin -->
<footer style="margin-top: 120px;">
        <div class="contact wow fadeInUp" data-wow-duration="1s" data-wow-delay="0.2s">
            <span>
                <a href="order.html" class="btn btn1">
                    <i class="icon icon-c1"></i>试听预约
                </a>
                <img src="images/lion2.png" alt="">
                <a href="contactus.html" class="btn">
                    <i class="icon icon-c2"></i>联系我们
                </a>
            </span>
        </div>

  <div class="foot wow fadeInUp" data-wow-duration="1s" data-wow-delay="0.2s">
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
                        <dd><a href="aboutmutong.html">关于沐橦</a></dd>
                        <dd><a href="coursesystem.html">课程体系</a></dd>
                        <dd><a href="order.html">预约试听</a></dd>
                        <dd><a href="activities.html">精彩活动</a></dd>
                        <dd><a href="parentshome.html">父母之家</a></dd>
                        <dd><a href="news.html">新闻动态</a></dd>
                        <dd><a href="contactus.html">联系我们</a></dd>
                    </dl>
                    <dl>
                        <dt>
                            <span>课程体系</span>
                        </dt>
                        <dd><a href="coursesystemdatails.html?step=A">早教课程</a></dd>
                        <dd><a href="coursesystemdatails.html?step=B">托育课程</a></dd>
                        <dd><a href="coursesystemdatails.html?step=C">奇幻之旅</a></dd>
                        <dd><a href="coursesystemdatails.html?step=D">成长*BABY</a></dd>
                        <dd><a href="coursesystemdatails.html?step=E">音乐*BABY</a></dd>
                        <dd><a href="coursesystemdatails.html?step=F">创意*BABY</a></dd>
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
        <div class="ft_bottom wow fadeInUp" data-wow-duration="1s" data-wow-delay="0.2s">
            <div class="main">
            壹号贝贝· 长泰沐橦店  版权所有 Copyright ©2018-2019 备案号：闽ICP备88888888号</div>
        </div>
    </footer>