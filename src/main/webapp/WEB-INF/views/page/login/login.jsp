<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/page/includeingFile/iCommonHead.jspf" %>
<html>
<body>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Login</title>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="icon" type="image/png" href="${imgPath }/login/images/icons/favicon.ico"/>
	<link rel="stylesheet" type="text/css" href="${cssPath }/login/vendor/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="${cssPath }/login/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
	<link rel="stylesheet" type="text/css" href="${cssPath }/login/fonts/Linearicons-Free-v1.0.0/icon-font.min.css">
	<link rel="stylesheet" type="text/css" href="${cssPath }/login/vendor/animate/animate.css">
	<link rel="stylesheet" type="text/css" href="${cssPath }/login/vendor/css-hamburgers/hamburgers.min.css">
	<link rel="stylesheet" type="text/css" href="${cssPath }/login/vendor/select2/select2.min.css">
	<link rel="stylesheet" type="text/css" href="${cssPath }/login/util.css">
	<link rel="stylesheet" type="text/css" href="${cssPath }/login/main.css">
</head>
<body>
	<div class="limiter">
		<div class="container-login100">
			<div class="wrap-login100 p-l-50 p-r-50 p-t-77 p-b-30">
				<form class="login100-form validate-form" id="loginForm">
					<span class="login100-form-title p-b-55">
						Login
					</span>

					<div class="wrap-input100 validate-input m-b-16" data-validate = "Valid email is required: ex@abc.xyz">
						<input class="input100" type="text" id="member_id" name="email" placeholder="Email">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<span class="lnr lnr-envelope"></span>
						</span>
					</div>

					<div class="wrap-input100 validate-input m-b-16" data-validate = "Password is required">
						<input class="input100" type="password" name="pass" placeholder="Password">
						<span class="focus-input100"></span>
						<span class="symbol-input100">
							<span class="lnr lnr-lock"></span>
						</span>
					</div>

					<div class="contact100-form-checkbox m-l-4">
						<input class="input-checkbox100" id="check" type="checkbox" name="remember-me">
						<label class="label-checkbox100" for="check">
							Remember me
						</label>
					</div>
					
					<div class="container-login100-form-btn p-t-25">
						<button class="login100-form-btn">
							Login
						</button>
					</div>

					<div class="text-center w-full p-t-42 p-b-22">
						<span class="txt1">
							Or login with
						</span>
					</div>

					<a href="#" class="btn-face m-b-10">
						<i class="fa fa-facebook-official"></i>
						Facebook
					</a>

					<a href="#" class="btn-google m-b-10">
						<img src="${imgPath }/login/icons/icon-google.png" alt="GOOGLE">
						Google
					</a>

					<div class="text-center w-full p-t-115">
						<span class="txt1">
							Not a member?
						</span>
						<a class="txt1 bo1 hov1" href="/join">Sign up now</a>
					</div>
				</form>
			</div>
		</div>
	</div>

	<!-- Script -->	
	<script src="${cssPath }/login/vendor/jquery/jquery-3.2.1.min.js"></script>
	<script src="${cssPath }/login/vendor/bootstrap/js/popper.js"></script>
	<script src="${cssPath }/login/vendor/bootstrap/js/bootstrap.min.js"></script>
	<script src="${cssPath }/login/vendor/select2/select2.min.js"></script>
	<script src="${jsPath }/login/main.js"></script>
	<script type="text/javascript">
	$(document).ready(function(){
	/*
		// 1. 로딩되면 저장되어잇는지 쿠키값을 가져온다.
		// let getCookie = $.cookie('login_id');
		// 2. 체크박스가 true 경우 바로 id값에다가 가져온쿠키의 값을 넣어준다.
		if(!getCookie){
			let member_id = $('#member_id');
			member_id.val(getCookie);
			$('#check').prop('checked', true);
		}

		// 3. 체크박스 체크후 저장할경우 쿠키저장한뒤 Submit 시킨다.
		$('#loginForm').on('submit', function(e){
			if(('#check').is('checked')){
				//쿠키를 저장한다.
				$.cookie('login_id', $('#member_id').val(),{
		            //쿠키보관일
		            expires : 7
		            //도메인
		           ,domain : '${contextPath}'
		            //https/http 결정
		           ,secure : false
				});
			} else {
				// 쿠키를 삭제한다.
				$.removeCookie('login_id');
			}
		});
	*/
	});
	
	</script>
</body>
</html>