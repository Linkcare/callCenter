function getHTTPObject() {
	if (typeof XMLHttpRequest != 'undefined') {
		return new XMLHttpRequest();
	}
	try {
		return new ActiveXObject("Msxml2.XMLHTTP");
	} catch (e) {
		try {
			return new ActiveXObject("Microsoft.XMLHTTP");
		} catch (e) {}
	}
	return false;
}

function sendAjaxA(url, destino, onLoad){
	alert("sendAjaxA is deprecated. please contact linkcare");
	/*var http = getHTTPObject();
	http.open("GET", url+"&dummy="+Math.random()+"&aj=t", true);
	http.onreadystatechange = function() {
		if (http.readyState == 4) {
			try{
				var objeto = document.getElementById(destino);
				objeto.innerHTML = http.responseText;
				if(onLoad!=null){
					eval(onLoad);
				}
			}catch(e){ 
				alert(e+'\n'+http.responseText);
			}
		}
	}
	http.send(null);*/
}

function sendAjaxS(url, destino){
	var http = getHTTPObject();
	var server = "";
	var params = "";
	if (url.indexOf("?") >= 0) {
		server=url.substring(0,url.indexOf("?"));
		if(url.length>url.indexOf("?")+1){
			params = url.substring(url.indexOf("?")+1,url.length);
		}
		params=params+"&dummy="+Math.random()+"&aj=t";
	} else {
		server = url;
		params = "dummy="+Math.random()+"&aj=t";
	}
	http.open("POST", server, false);
	http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded; charset=UTF-8');
	http.send(params);
	try{
		var objeto = document.getElementById(destino);
		objeto.innerHTML = http.responseText;
	}catch(e){ 
		alert(e+'\n'+http.responseText);
	}
}

function sendAjaxS(url, destino,onLoad){
	var http = getHTTPObject();
	var server = "";
	var params = "";
	if (url.indexOf("?") >= 0) {
		server=url.substring(0,url.indexOf("?"));
		if(url.length>url.indexOf("?")+1){
			params = url.substring(url.indexOf("?")+1,url.length);
		}
		params=params+"&dummy="+Math.random()+"&aj=t";
	} else {
		server = url;
		params = "dummy="+Math.random()+"&aj=t";
	}
	http.open("POST", server, false);
	 http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded; charset=UTF-8');
	http.send(params);
	try{
		var objeto = document.getElementById(destino);
		objeto.innerHTML = http.responseText;
		if(onLoad!=null){
			eval(onLoad);
		}
	}catch(e){ 
		alert(e+'\n'+http.responseText);
	}
}

/*
 * Funcion que envía via Ajax un conjunto de formularios separados por ";"
 */
function sendAjaxFormS(url, destino, formularios){
	var cadenaFormulario = "";
	var sepCampos = "";
	var formulario = formularios.split(";");
	for(var y=0;y<formulario.length;y++){
		var form = document.getElementById(formulario[y]);
	    var longitudFormulario = form.elements.length;
	    for (var i=0; i <= form.elements.length-1;i++) {
		    //TODO Añadir control para el type select multiple, ahora mismo enviaría sólo el primer seleccionado
			if(form.elements[i].type != "checkbox" && form.elements[i].type != "radio"){
	        cadenaFormulario += sepCampos+form.elements[i].name+'='+encodeURI(form.elements[i].value);
	        sepCampos="&";
		    }else{
				if(form.elements[i].checked){
					cadenaFormulario += sepCampos+form.elements[i].name+'='+encodeURI(form.elements[i].value);
			        sepCampos="&";
				}
			}
	    }
	}
    
    var http = getHTTPObject();
    http.open("POST", url, false);
    http.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded; charset=UTF-8');
    http.send(cadenaFormulario);
    try{
		var objeto = document.getElementById(destino);
		objeto.innerHTML = http.responseText;
	}catch(e){ 
		alert(e+'\n'+http.responseText);
	}
}