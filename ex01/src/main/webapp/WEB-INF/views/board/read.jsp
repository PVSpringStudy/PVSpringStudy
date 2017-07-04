<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
    <%@ page session="false"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<%@include file="../include/header.jsp"%>

<form role="form" method="post">
<input type="hidden" name = "bno" value="${boardVO.bno }">
</form>


<div class = "box-body">

	<div class = "form-group">
	<label for="exaxmpleInputEmail1">Title</label>
	<input type="text" name="title" class="form-control" value="${boardVO.title }" readonly="readonly">
	</div>

	<div class = "form-group">
	<label for="exaxmpleInputPassword1">Content</label>
	<input type="text" name="content" class="form-control" value="${boardVO.content }" readonly="readonly">
	</div>

	<div class = "form-group">
	<label for="exaxmpleInputEmail1">Writer</label>
	<input type="text" name="writer" class="form-control" value="${boardVO.writer }" readonly="readonly">
	</div>

</div>

<div class="box-footer">
<button type="submit" class="btn btn-warning">Modify</button>
<button type="submit" class="btn btn-danger">Remove</button>
<button type="submit" class="btn btn-primary">List All</button>

</div>
</body>
</html>