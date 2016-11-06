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
<link rel="stylesheet" type="text/css"
	href="${context }/javascript/easy-ui/css/default.css" />
<link rel="stylesheet" type="text/css"
	href="${context }/javascript/easy-ui/js/themes/default/easyui.css" />
<link rel="stylesheet" type="text/css"
	href="${context }/javascript/easy-ui/js/themes/icon.css" />
<script type="text/javascript"
	src="${context }/javascript/easy-ui/js/jquery-1.4.2.min.js"></script>
<script type="text/javascript"
	src="${context }/javascript/easy-ui/js/jquery.easyui.js"></script>
<script type="text/javascript"
	src="${context }/javascript/easy-ui/js/outlook2.js"></script>
<script>
	var context = "${context }";
	var lang;
	$(document).ready(function() {
		langType = "${langType}";
		lang = ${ language };
	});
</script>
