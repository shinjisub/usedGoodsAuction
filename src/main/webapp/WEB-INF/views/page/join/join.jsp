<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/page/includeingFile/iCommonHead.jspf" %>
<%@include file="/WEB-INF/views/page/includeingFile/front/iHead.jspf" %>
<html>
<head>
	<title>회원가입</title>
</head>
<body>
	<div class="col-sm-12 col-md-12 col-lg-12">
		<form id="joinForm" action="/join/joinProc" method="post">
			<div style="width: 100%; min-height: 800px;">
				<h1>회원가입</h1><br>
				이름  : <input type="text" class="form-control"/><br>
				아이디  : <input type="text" class="form-control"/><br>
				비밀번호  : <input type="text" class="form-control"/><br>
				Email  : <input type="email" class="form-control" id="iEmail" value="spdlqjaksemf@naver.com"/><br>
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
