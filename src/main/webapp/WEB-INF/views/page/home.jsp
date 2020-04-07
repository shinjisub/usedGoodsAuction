<!DOCTYPE HTML>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/page/includeingFile/iCommonHead.jspf" %>
<html>
	<head>
		<title>${pageTitle}</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8" />
		<meta name="description" content="" />
		<meta name="keywords" content="" />
	</head>
	<body>

		<!-- Wrapper -->
			<div class="wrapper style1">
				<!-- Header -->
				<%@include file="/WEB-INF/views/page/includeingFile/front/iHead.jspf" %>
				
				<!-- Extra -->
				<div id="extra">
					<div class="container">
						<div class="row no-collapse-1">
							<section class="4u"> <a href="#" class="image featured"><img src="${imgPath}/product/product1.jpg" alt=""></a>
								<div class="box">
									<p>Donec leo, vivamus fermentum nibh in augue praesent a lacus at urna congue rutrum  wisi maecenas ligula.</p>
									<a href="join" class="button">Read More</a> </div>
							</section>
							<section class="4u"> <a href="#" class="image featured"><img src="${imgPath}/product/product2.jpg" alt=""></a>
								<div class="box">
									<p>Donec leo, vivamus fermentum nibh in augue praesent a lacus at urna congue rutrum  wisi maecenas ligula.</p>
									<a href="#" class="button">Read More</a> </div>
							</section>
							<section class="4u"> <a href="#" class="image featured"><img src="${imgPath}/product/product3.jpg" alt=""></a>
								<div class="box">
									<p>Donec leo, vivamus fermentum nibh in augue praesent a lacus at urna congue rutrum  wisi maecenas ligula.</p>
									<a href="#" class="button">Read More</a> </div>
							</section>
						</div>
						<div class="row no-collapse-1">
							<section class="4u"> <a href="#" class="image featured"><img src="${imgPath}/product/product4.jpg" alt=""></a>
								<div class="box">
									<p>Donec leo, vivamus fermentum nibh in augue praesent a lacus at urna congue rutrum  wisi maecenas ligula.</p>
									<a href="#" class="button">Read More</a> </div>
							</section>
							<section class="4u"> <a href="#" class="image featured"><img src="${imgPath}/product/product5.jpg" alt=""></a>
								<div class="box">
									<p>Donec leo, vivamus fermentum nibh in augue praesent a lacus at urna congue rutrum  wisi maecenas ligula.</p>
									<a href="#" class="button">Read More</a> </div>
							</section>
							<section class="4u"> <a href="#" class="image featured"><img src="${imgPath}/product/product6.jpg" alt=""></a>
								<div class="box">
									<p>Donec leo, vivamus fermentum nibh in augue praesent a lacus at urna congue rutrum  wisi maecenas ligula.</p>
									<a href="#" class="button">Read More</a> </div>
							</section>
						</div>
					</div>
				</div>

			<!-- Main -->
			<div id="main">
				<div class="container">
					<div class="row"> 
						
						<!-- Content -->
						<div class="6u">
							<section>
								<ul class="style">
									<li class="fa fa-wrench">
										<h3>Integer ultrices</h3>
										<span>In posuere eleifend odio. Quisque semper augue mattis wisi. Maecenas ligula. Pellentesque viverra vulputate enim. Aliquam erat volutpat. Maecenas condimentum enim tincidunt risus accumsan.</span> </li>
									<li class="fa fa-leaf">
										<h3>Aliquam luctus</h3>
										<span>In posuere eleifend odio. Quisque semper augue mattis wisi. Maecenas ligula. Pellentesque viverra vulputate enim. Aliquam erat volutpat. Maecenas condimentum enim tincidunt risus accumsan.</span> </li>
								</ul>
							</section>
						</div>
						<div class="6u">
							<section>
								<ul class="style">
									<li class="fa fa-cogs">
										<h3>Integer ultrices</h3>
										<span>In posuere eleifend odio. Quisque semper augue mattis wisi. Maecenas ligula. Pellentesque viverra vulputate enim. Aliquam erat volutpat. Maecenas condimentum enim tincidunt risus accumsan.</span> </li>
									<li class="fa fa-road">
										<h3>Aliquam luctus</h3>
										<span>In posuere eleifend odio. Quisque semper augue mattis wisi. Maecenas ligula. Pellentesque viverra vulputate enim. Aliquam erat volutpat. Maecenas condimentum enim tincidunt risus accumsan.</span> </li>
								</ul>
							</section>
						</div>
					</div>
				</div>
			</div>
			<div id="footer" class="wrapper style2">
				<div class="container">
					<section>
						<header class="major">
							<h2>Mauris vulputate dolor</h2>
							<span class="byline">Integer sit amet pede vel arcu aliquet pretium</span>
						</header>
						<form method="post" action="#">
							<div class="row half">
								<div class="12u">
									<input class="text" type="text" name="name" id="name" placeholder="Name" />
								</div>
							</div>
							<div class="row half">
								<div class="12u">
									<input class="text" type="text" name="email" id="email" placeholder="Email" />
								</div>
							</div>
							<div class="row half">
								<div class="12u">
									<textarea name="message" id="message" placeholder="Message"></textarea>
								</div>
							</div>
							<div class="row half">
								<div class="12u">
									<ul class="actions">
										<li>
											<input type="submit" value="Send Message" class="button alt" />
										</li>
									</ul>
								</div>
							</div>
						</form>
					</section>
				</div>
			</div>
	</div>

	<!-- Footer -->
	<%@include file="/WEB-INF/views/page/includeingFile/front/iFooter.jspf" %>
	</body>
</html>