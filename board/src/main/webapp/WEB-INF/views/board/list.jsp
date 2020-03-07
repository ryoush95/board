<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<title>게시판</title>
</head>
<body>

	<div id="root">
		<header>
			<h1>게시판</h1>
		</header>

		<hr />

		<nav>처음화면 - 글쓰기 - 로그인</nav>

		<hr />

		<table>
			<tr>
				<th>글번호</th>
				<th>글제목</th>
				<th>작성자</th>
				<th>작성일자</th>
			</tr>

			<c:forEach items="${list}" var="list">
				<tr>
					<td>${list.bno }</td>
					<td><a href = "/board/read?bno=${list.bno }">${list.title }</a></td>
					<td>${list.writer }</td>
					<td><fmt:formatDate value="${list.regDate }" pattern="yyyy-mm-dd"></fmt:formatDate></td>
				</tr>
			</c:forEach>

		</table>

		<hr />

	</div>

</body>
</html>