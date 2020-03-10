/**
 * Common JS
 */
$(document).ready(function(){ console.log('------------------------ common JS ------------------------')});

/**
 * Util
 */
var util = function() {

	var validation = function(){}

};



/**
 * Action 관련
 */
var action = {
	
	commonAjax : function(pUrl, params, pType, pSysc){
		var Type, url, type, dataType, sysc;
		url =  (pUrl == null || $.trim(pUrl) == '')? ''   : globalContextPath+'/'+pUrl;
		type = (pType == null || $.trim(pType) == '')? 'post' : pType;
		sysc = (pSysc == null)? false : pSysc;
		
		$.ajax({
			url: url,
			type: type,
			data: params,
			dataType: dataType
		}).done(function(response) {
			// 성공 시 동작
			console.log('sussces');
	    }).fail(function(error) {
			    // 실패 시 동작
		});
	}
}

//-- Ajax
function commonAjax(){
	$.ajax({
	  url: '주소',
	  type: 'get 또는 post',
	  data: { test : 'zzzz'},
	  dataType: 'json'
	}).done(function(response) {
	    // 성공 시 동작
		console.log('sussces');
    }).fail(function(error) {
	    // 실패 시 동작
	}).always(function(response) {
	    // 완료 시 동작
	});
}