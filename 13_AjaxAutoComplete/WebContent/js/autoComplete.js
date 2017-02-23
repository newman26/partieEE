
function autoComple(saisieHtml) {

	// pour les navigateur autre que IE6 et IE5
	var XHR= new XMLHttpRequest;
	
	XHR.open("GET", "ser?pSaisie="+saisieHtml, "true");
	XHR.send();
	
	XHR.onreadystatechange=function(){
		if(XHR.readyState==4&& XHR.status==200){
			
			document.getElementById("idSuggest").innerHTML=XHR.responseText;
		}
		
	}
	
	
}