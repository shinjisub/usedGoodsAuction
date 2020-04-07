<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/page/includeingFile/iCommonHead.jspf" %>
<%@include file="/WEB-INF/views/page/includeingFile/front/iHead.jspf" %>
<html>
<head>
	<title>상품판매</title>
</head>
<body>
	<div class="col-sm-12 col-md-12 col-lg-12">

		<form id="joinForm" action="/product/addProduct" method="POST" enctype="multipart/form-data">
			<div style="width: 100%; min-height: 800px;">
				<h1>상품올리기 </h1><br>
				<table>
					<tbody>
						<tr>
							<th>상품이름 : </th>
							<td>
								<input type="text" name="product_name" class="form-control"/>
							</td>
						</tr>
						<tr>
							<th>상품사진 : </th>
							<td>
								<input type="file" name="product" class="form-control"/>
							</td>
						</tr>
					</tbody>
				</table>
				<button type="submit" class="btn-primary">등록하기</button>
				<button type="button" class="btn-danger" onclick="location.href='${contextPath}'">취소하기</button>

			</div>
		</form>
		
		<%@include file="/WEB-INF/views/page/includeingFile/front/iFooter.jspf" %>
	</div>
	<script>
		$(document).ready(function(){
			$('form').submit(function(){
			});
		});
	</script>
</body>
</html>
