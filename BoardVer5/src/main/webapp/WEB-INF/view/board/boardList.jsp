<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리스트</title>
<script defer src="/res/js/boardList.js?ver=3"></script>   <!-- js사용 ex) moveToDetail의 정의의 수고로움을 덤 -->
<link rel ="stylesheet" href="/res/css/boardList.css?ver=6"> 
</head>
<body>
	<h1>리스트</h1>
	<div>${loginUser.unm}님 환영합니다 <a href="/user/logout">Logout</a></div>
	<div>
		<a href="write"><button>글 작성</button></a>
	</div>
		 <div>
		<table>
			<tr>
				<th>no</th>
				<th>제목</th>
				<th>글쓴이</th>
				<th>작성일</th>
			</tr>
			<c:forEach var="item" items="${requestScope.list}">   <!-- 리퀘스트 첨부터 물어본다 -->
				<tr class = "record" onclick="moveToDetail(${item.iboard})">   
					<td>${item.iboard}</td>
					<td>${item.title}</td>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
					<td>${item.unm}</td>
					<td>${item.regdt}</td>			
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>	
		 