<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="Content-Style-Type" content="text/css"/>
	<meta http-equiv="Content-Script-Type" content="text/javascript"/>
	<meta http-equiv="imagetoolbar" content="text/javascript"/>
	<meta name="description" content=""/>
	<meta name="keywords" content=""/>
	<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="./css/pages.css">
<link rel="stylesheet" type="text/css" href="./css/form.css">
<title>パスワード再設定</title>
</head>
<body>
	<header>

    </header>
	<div id="main">
			<br>
				<div id="title">
					<span>RESETPASS</span>
				</div>
			<s:form action="ResetPasswordConfirmAction">
			<div>パスワードを再設定してください</div>
				<table>
					<tr>
						<td>メール</td>
						<td><s:textfield name="userId"/></td>
					</tr>
					<tr>
						<td>新規パスワード</td>
						<td><s:password name="newPassword"/></td>
					</tr>
					<tr>
						<td>新規パスワード(確認)</td>
						<td><s:password name="conPassword"/></td>
					</tr>
				</table>
				<br>
				<div id="button">
					<button type="submit" class="">&nbsp;再設定&nbsp;</button>
				</div>
			</s:form>
		<div id="error">
			<br>
				<s:property value="passwordErrorMessage"/>
			<br>
		</div>
	</div>

	<br>
	<footer>
	    <p>good tomorrow co.,ltd All rights reserved</p>
	</footer>

	 <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
		 <script>
		 </script>

</body>
</html>