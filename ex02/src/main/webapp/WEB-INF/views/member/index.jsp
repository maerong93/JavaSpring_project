<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>메인 페이지 입니다. (로그인)</h2>

<form action="index" method="post">
	<table border="1" class="tb">
		<tr>
			<td>아이디</td>
			<td><input type="text" name="id" ></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="pw"></td>
		</tr>
		<tr>
			 <td colspan="2">
			 <input type="submit" value="로그인" >
			 <input type="button" value="회원가입" onclick="location.href='join'">
			 </td>
		</tr>		
	</table>
</form>

<script>
	

</script>
</body>
</html>