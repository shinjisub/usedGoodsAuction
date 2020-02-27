<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/page/includeingFile/iCommonHead.jspf" %>
<%@include file="/WEB-INF/views/page/includeingFile/front/iHead.jspf" %>
<html>
<head>
	<title>회원가입</title>
</head>
<script type="text/javascript">
$(document).ready(function(){
	//-- email검증
	$('#btnEmail').click(function(){
		$.ajax({
		  url: '/emailProc',
		  type: 'post',
		  data: { email : $('#iEmail').val()},
		  dataType: 'json',
		  contentType: "application/json",
		}).done(function(response) {
		    // 성공 시 동작
			console.log('sussces');
	    }).fail(function(error) {
		    // 실패 시 동작
		}).always(function(response) {
		    // 완료 시 동작
		});
	});
	
	$('#josinForm').submit(function(){
		return false;
	});
});
</script>
<body>
	<div class="class="col-sm-12 col-md-12 col-lg-12"">
		<form id="joinForm">
			<div style="width: 100%; min-height: 800px;">
				<h1>회원가입</h1><br>
				이름  : <input type="text"/><br>
				아이디  : <input type="text"/><br>
				비밀번호  : <input type="text"/><br>
				Email  : <input type="email" id="iEmail" value="spdlqjaksemf@naver.com"/><br>
				<input type="text"/><button type="button" class="btn-danger" id="btnEmail">이메일인증</button>
				<br>
				<br>
				<br>
				<button class="btn-info">가입완료</button>
			</div>
		</form>
		<%@include file="/WEB-INF/views/page/includeingFile/front/iFooter.jspf" %>
	</div>
</body>
</html>
