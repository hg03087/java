<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>글 작성</title>
</head>
<style>
input[type=reset] {
    color : red;
}
input[type=text]:hover {
    background : aliceblue;
}
input[type=text]:focus {
    font-size : 120%;
}

</style>
<body>
	<h1>글 작성</h1>
	<div>
		<form action="write"method="post">
		<div><input type="text" name="title" placeholder="제목"></div>
		<div><textarea name="ctnt" placeholder="내용"></textarea></div>
		<div>
			<input type="submit" value="글쓰기">
			<input type="reset" value="초기화">
			<a href="/board/boardList"><button>목록</button></a>
		</div>
		
		</form>
	</div>
</body>
</html>