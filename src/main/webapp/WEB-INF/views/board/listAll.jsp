<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="UTF-8">
<title>list All</title>
<script type="text/javascript">
	var result = '${msg}';
	if (result == '성공') {
		alert(result + '입니다.');
	} else {
		alert(result + '게시판 등록 실패입니다.');
	}
</script>
</head>
<body>
	<table class="table table-board" border="1px" width="80%" align="center">
		<tr>
			<th style="width:10%">글번호</th>
			<th style="width:30%">제목</th>
			<th style="width:20%">작성자</th>
			<th style="width:20%">날짜</th>
			<th style="width:20%">조회수</th>
		</tr>
	
	<c:forEach items= "${boardList }" var="boardVO">
        <tr>
            <td>${boardVO.no }</td>
            <td><a href="/board/detail?no=${boardVO.no}">${boardVO.title }</a></td>
            <td>${boardVO.writer }</td>
            <td><fmt:formatDate pattern="yyyy-MM-dd HH:mm" value="${boardVO.date }"></fmt:formatDate> </td>
            <td><span> ${boardVO.count }</span> </td>
        </tr>
	</c:forEach>
	</table>
</body>
</html>