
var scopes = 'https://www.googleapis.com/auth/userinfo.email';
var client_id = '1019548776931-blbnd36ce3sd81n11di7nqavmsm1skrs.apps.googleusercontent.com';
    
        function handleAuth() {
    	  var request = gapi.client.oauth2.userinfo.get().execute(function(resp) {
    	    if (resp.code) {
    	    	window.location.replace("http://stackoverflow.com");
    	    }
    	    else {
    	    	document.getElementById('loginButton').style.visibility = 'hidden';
      	      document.getElementById('login').innerText = 'Welcome ' + resp.name;
    	    }
    	  });
    	}
        
        function signin(mode, callback) {
        	  gapi.auth.authorize({client_id: client_id,scope: scopes, immediate: mode},callback);
        }
    
        function init() {
        	var apisToLoad;
        	var callback = function() {
        	   if (--apisToLoad == 0) {
        	     signin(true, handleAuth);
        	   }
        	}
        	  
        	apisToLoad = 2;
        	//Parameters are APIName,APIVersion,CallBack function,API Root 
        	gapi.client.load('anxisendpoint', 'v1', callback, 'http://localhost:8888/_ah/api');
        	//gapi.client.load('anxisendpoint', 'v1', callback, 'https://mybackendapi.appspot.com/_ah/api');
        	gapi.client.load('oauth2','v2',callback);
        }