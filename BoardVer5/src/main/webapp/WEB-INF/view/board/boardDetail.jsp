<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제목</title>
<link rel="stylesheet"
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
<style>
	.hidden { display: none; }
	.fa-heart { colr: red; }
</style>

<script defer src ="/res/js/boardDetail.js"></script>
</head>
<body>
	<div><a href="/board/write">글쓰기</a></div>
	<div><a href="/board/boardList"><button>목록</button></a></div>
	<h1>${data.title}
	<c:if test="${data.isFav == 0}">
		<a href="fav?iboard=${param.iboard}&fav=1"><i class="fas fa-heart"></i></a>
	</c:if>
	<c:if test="${data.isFav == 1}">
		<a href="fav?iboard=${param.iboard}&fav=0"><i class="fas fa-heart-broken"></i></a>
	</c:if>
	</h1>
	<div>글번호: ${data.iboard}</div>
	<div>글쓴이: ${data.unm}</div>

	<div>${data.ctnt}</div>
	<h3>댓글</h3>
		<div>
		<form id="insFrm" action="/board/cmt" method="post">
		<input type="hidden" name="icmt" value="0">
		<input type= "hidden" name="iboard" value="${data.iboard}">
		<div>
			<textarea name="cmt" placeholder="댓글 내용"></textarea>
			<input type="submit" value="댓글 작성">
		</div>
		</form>
		
		<form id="updFrm" action="/board/cmt" method="post" class="hidden">
		<input type="hidden" name="icmt" value="0">
		<input type= "hidden" name="iboard" value="${data.iboard}">
		<div>
			<textarea name="cmt" placeholder="댓글 내용"></textarea>
			<input type="submit" value="댓글 수정">
			<input type="button" value="댓글 취소" onclick="showInsFrm();">
		</div>
		</form>
		
	<div>
		<table>
			<tr>
				<th>내용</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>비고</th>
			</tr>	
			<c:forEach items="${requestScope.cmtList}" var="item">     <!-- requestScope 다이렉트로 물어봐 퍼포먼스 향상 -->
			<tr>
				<td>${item.cmt}</td>
				<td>${item.unm}</td>
				<td>${item.regdate}</td>
					<td>
					<c:if test="${item.iuser == sessionScope.loginUser.iuser}">  <!-- 내가 쓴 글만 수정 가능하게끔 -->
						<input type="button" value="수정" onclick="updCmt(${item.icmt}, '${item.cmt.trim()}');">         <!-- 버튼과 a 태그 함께 쓸 땐 a태그로 감싼다 -->
						<button onclick="delCmt(${requestScope.data.iboard}, ${item.icmt})">삭제</button>      <!-- iuser 값을 주면 나중에 해킹 가능 -->
					</c:if>	
					</td>
			</tr>
			</c:forEach>	
		</table>
		</div>
	</div>
</body>
</html>