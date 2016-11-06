<%@page import="com.jfree.framework.i18n.I18n"%>
<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%
	response.setHeader("Pragma", "No-cache");
	response.setHeader("Cache-Control", "no-cache");
	response.setDateHeader("Expires", 0);
%>
<%
	String context = request.getContextPath();
	request.setAttribute("context", context);
	String langType = I18n.getLanguage();
	request.setAttribute("langType", langType);
	String language = I18n.getAllText();
	request.setAttribute("language", language);
%>
<!-- 新 Bootstrap 核心 CSS 文件 -->
<link rel="stylesheet" href="${context }/javascript/bootstrap-3.3.6-dist/css/bootstrap.min.css">
<!-- 可选的Bootstrap主题文件（一般不用引入） -->
<link rel="stylesheet" href="${context }/javascript/bootstrap-3.3.6-dist/css/bootstrap-theme.min.css">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="${context }/javascript/jquery.min.js"></script>
<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="${context }/javascript/bootstrap-3.3.6-dist/js/bootstrap.min.js"></script>
<script>
	var context = "${context }";
	var lang;
	$(document).ready(function() {
		langType = "${langType}";
		lang = ${ language };
	});
</script>
