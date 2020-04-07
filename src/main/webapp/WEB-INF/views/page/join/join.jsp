<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/page/includeingFile/iCommonHead.jspf" %>
<%@include file="/WEB-INF/views/page/includeingFile/front/iHead.jspf" %>
<html>
<head>
	<title>회원가입</title>
</head>
<style type="text/css">
	td {
		border : 2px solid gray;
	}
</style>
<body>
	<div class="col-sm-12 col-md-12 col-lg-12">

		<form action="/join/joinProc" method="POST">
			<div style="width: 100%; min-height: 800px;">
				<h1>회원가입</h1><br>
				<table>
					<tbody>
						<tr>
							<th>이름 : </th>
							<td>
								<input type="text" name="member_name" class="form-control"/>
							</td>
						</tr>
						<tr>
							<th>아이디  : </th>
							<td>
								<input type="text" name="member_id" class="form-control"/>
								<button type="button" class="btn-danger" id="btnIdCheck">중복확인</button>
							</td>
						</tr>
						<tr>
							<th>비밀번호  : </th>
							<td>
								<input type="text" name="member_password" class="form-control"/><br>
							</td>
						</tr>
						<tr>
							<th>Email  : </th>
							<td>
								<input type="email" name="member_email" class="form-control" id="iEmail" value="spdlqjaksemf@naver.com"/><br>
							</td>
						</tr>
						<tr>
							<th>Phone  : </th>
							<td>
								<input type="text" name="member_phone" class="form-control" /><br>
							</td>
						</tr>
						<tr>
							<th>Address  : </th>
							<td>
								<input type="text" name="member_addr" class="form-control"/><br>
							</td>
						</tr>
					</tbody>
				</table>
				<button type="submit" class="btn-primary">가입완료</button>
				<button type="button" class="btn-danger" onclick="pageBack();">돌아가기</button>

			</div>
		</form>
		
		<%@include file="/WEB-INF/views/page/includeingFile/front/iFooter.jspf" %>
	</div>
	<script>
		$(document).ready(function(){
			var memberIdDuplicate = false;

			$('#btnIdCheck').on('click', function(){
				let userId = $('input[name="member_id"]').val();
				if($.trim(userId) == '' || userId == null){
					alert('아이디를 입력해주세요.');
					return false;
				}

				action.commonAjax('${contextPath}join/memberIdDuplicate', {'member_id' : userId}, 'get', true);
			});
			
			$('form').submit(function(){
				/* if(!memberIdDuplicate){
					alert('아이디중복체크를 해주세요.');
					return memberIdDuplicate;
				} */
			});
		});
	</script>
</body>
</html>
