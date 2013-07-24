<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"></meta>
<script type="text/javascript" src="/callCenter/js/ajax.js" ></script>
<style>
body {
	/*background-image: url(${pageContext.request.contextPath}/images/fons_punts.gif);*/
	font-family: tahoma, Arial, Helvetica, sans-serif;
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	height: 100%;
	color: #686868;
}

body, a, td, ul, li{
	font-family: tahoma, Arial, Helvetica, sans-serif;
	font-size:12px;	
	color:#686868;
}
#header {
	background-color: #eee;
	height: 49px;
	margin-bottom: 0px;
	background-color: #dfe8f6;
	padding: 10px 10px 0px 5px;
	display: block;
}
/*Style pel checkCall (header)*/
a, a:visited, a:link, a:active{
	text-decoration:none;
}

a:hover{
	font-weight:bold;
}

</style>

<script type="text/javascript">
//script pel checkCall (header)
function show(onOff, id){
	var capa = document.getElementById(id);
	if(onOff){
		capa.style.display = 'block';
	}else{
		capa.style.display = 'none';
	}
}

function toggle(id){
	var capa = document.getElementById(id);
	if(capa.style.display == 'none'){
		capa.style.display = 'block';
	}else{
		capa.style.display = 'none';
	}
}

function checkCall(){
	var timerCheckCall = 0;
	sendAjaxS("/callCenter/servlets/SRVCallCenter?op=checkNewCall&idUser="+document.getElementById('idUser').value+"&idLineNumber="+document.getElementById('idLineNumber').value,"divIncomingCall");
	if(document.getElementById('idIncomingCall')!=null && document.getElementById('idIncomingCall').value!=""){
		timerCheckCall = setTimeout('checkCall()',1000);
	}
	else{
		timerCheckCall = setTimeout('checkCall()',1000);
	}
}

function hangUp(){
	sendAjaxS("/callCenter/servlets/SRVCallCenter?op=hangUp&idLineNumber="+document.getElementById('idLineNumber').value+"&idUser="+document.getElementById('idUser').value,"divIncomingCall");
	setTimeout('checkCall()',1000);
}

function endCall(){
	sendAjaxS("/callCenter/servlets/SRVCallCenter?op=endCall&idLineNumber="+document.getElementById('idLineNumber').value+"&idUser="+document.getElementById('idUser').value,"divIncomingCall");
	setTimeout('checkCall()',1000);
}

function fwdCall(){
	sendAjaxS("/callCenter/servlets/SRVCallCenter?op=forward&callToFwd="+document.getElementById('callToFwd').value+"&idLineNumber="+document.getElementById('idLineNumber').value+"&idUser="+document.getElementById('idUser').value,"divIncomingCall");
	setTimeout('checkCall()',1000);
}

function makeCall(){
	sendAjaxS("/callCenter/servlets/SRVCallCenter?op=makeCall&callTo="+document.getElementById('callToFwd').value+"&idLineNumber="+document.getElementById('idLineNumber').value+"&idUser="+document.getElementById('idUser').value,"divIncomingCall");
	setTimeout('checkCall()',1000);
}
</script>
</head>
<body>
<script type="text/javascript">
	varCheckCall = function(){
		setTimeout('checkCall()',1000);
	}
	if (window.attachEvent) 
		window.attachEvent("onload", varCheckCall);
	else
		window.addEventListener("onload", varCheckCall);
</script>
Usuari: <input type="text" id="idUser" name="idUser" value="usu102" />
Telèfon: <input type="text" id="idLineNumber" name="idLineNumber" value="102" />
Call To: <input type="text" id="callToFwd" name="callToFwd" value="100" />
<div id="divIncomingCall" style="background-color:white;width:100px;height:100px;">&nbsp;</div>
<a href="javascript:makeCall();">Make Call</a> | 
<a href="javascript:hangUp();">Hang up</a> |
<a href="javascript:alert('TODO: held();');">Held</a> | 
<a href="javascript:fwdCall();">Deflect</a> |
<a href="javascript:endCall();">endCall</a>
</body>
</html>