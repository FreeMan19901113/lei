<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/includes/common.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>系统用户</title>
</head>
</head>
<body>
	<table id="dg">
	</table>
</body>
</html>
<script>
	$('#dg').datagrid({
		url : 'find.html',
		height : 600,
		isField : "id",
		pagination : true,//显示分页  
		pageSize : 20,//分页大小  
		pageList : [ 15 ,20 ,30 ,50  ],//每页的个数  
		fit : false,//自动补全  
		fitColumns : true,
		iconCls : "icon-save",//图标  
		title : "用户管理",
		columns : [ [ {
			field : 'listId',
			title : 'ID',
			width : 250
		}, {
			field : 'username',
			title : '用户名',
			width : 250
		}, {
			field : 'password',
			title : '密码',
			width : 250,
			align : 'right'
		}, {
			field : 'remark',
			title : '备注',
			width : 250,
			align : 'right'
		} ] ]
	});
</script>