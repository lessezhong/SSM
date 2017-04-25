<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript">
	function mes() {
	try {
		addlert("来了异常跑出来了");
	} catch (e) {
		alert("这是什么鬼啊？"+e.message);
	}
		
	}
	function showName(Object,o){
		alert(Object.name.length);
	}
</script>
</head>

<body>
	<button id="demo" onclick="showName(person)"></button>
	<br>
	<script type="text/javascript">
		document.write("hello world");
		document.write("<br>");
	</script>
	This is my JSP page.
	<br>
	<script type="text/javascript">
		mes();
		var carname = new String;
		carname = "hai";
		document.getElementById("demo").innerHTML = carname;
		person = new Object();
		person.name = "hello hai";
	</script>
</body>
</html>
