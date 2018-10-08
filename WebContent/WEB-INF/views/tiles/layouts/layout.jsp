<%@ page contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html lang="ko">
	<head>
		<tiles:insertAttribute name="head"/>
	</head>
	<body>
		<div id="wrap">
			<tiles:insertAttribute name="gnb"/>
			<div id="contents">
				<tiles:insertAttribute name="content"/>
			</div>
		</div>
	</body>
</html>