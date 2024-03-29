<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>订单查询页面</title>
<style type="text/css">
	table{ border: 1px solid black;width: 99%}
	td{ border: 1px solid black;}
	
	.tdlast{text-align: center;padding: 10px 0}
	.tdfirst{ background-image: url("images/table_title_mid.gif");background-repeat: repeat-x;}
</style>
<script type="text/javascript">
	function del(){
		var msg="你真的要删除吗？\n\n请确认！"
		if(true==confirm(msg)){
		return true;
		}else{
		return false;
		}
}
</script>
</head>
<body>
	<div>
	<table border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td colspan="4" class="tdfirst">查看订单</td>
		</tr>
		<tr>
			<td>
				<form name="conditionForm" action="QueryOrderServlet" method="post">
					订单标号:<input type="text" name="ord_id"/>
					订单类型:<input type="text" name="ord_type"/>
					<input type="submit" value="提交">
				</form>
			</td>
		</tr>
		<tr>
			<td>
				<table border="1" cellpadding="0" cellspacing="0">
					<tr>
						<td>订单标号</td>
						<td>订单价格</td>
						<td>订单日期</td>
						<td>订单类型</td>
						<td>操作</td>
					</tr>
					<c:forEach items="${ordersList}" var="g">
					<tr>
						<td>${g.ord_id }</td>
						<td>${g.ord_price }</td>
						<td>${g.ord_date }</td>
						<td>${g.ord_type}</td>
						<td>
							<a href="OrderDetailServlet?ord_id=${g.ord_id}">查看</a>
						</td>
					</tr>
					</c:forEach>
				</table>
				共${pageCount}页,当前第${page}页
				<c:choose>
					<c:when test="${page==1}">
						首页
					</c:when>
					<c:otherwise>
						<a href="QueryOrderServlet?page=1&&ord_id=${ord_id }}&&ord_type=${ord_type}">首页</a>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${page-1==0 }">
						上一页
					</c:when>
					<c:otherwise>
						<a href="QueryOrderServlet?page=${page-1}&&ord_id=${ord_id}&&ord_type=${ord_type}">上一页</a>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${page+1>pageCount}">
						下一页
					</c:when>
					<c:otherwise>
						<a href="QueryOrderServlet?page=${page+1}&&ord_id=${ord_id}&&ord_type=${ord_type}">下一页</a>
					</c:otherwise>
				</c:choose>
				<c:choose>
					<c:when test="${page==pageCount }">
						尾页
					</c:when>
					<c:otherwise>
						<a href="QueryOrderServlet?page=${pageCount}&&ord_id=${ord_id}&&ord_type=${ord_type}">尾页</a>
					</c:otherwise>
				</c:choose>
				
			</td>
		</tr>
	</table>
	</div>
</body>


</html>