/**
 * Common JS
 */
$(document).ready(function(){
	console.log('------------------------ common JS ------------------------')
});


/**
 * Page Back
 * @returns
 */
function pageBack(){
	let test = history.back();
};

/**
 * Login 관련
 */
var login = {
	cookie : function() {
		
	},
};

/**
 * Util 관련
 */
var util = function() {

	var validation = function(){}

};


/**
 * Action 관련
 */
var action = {
	commonAjax : function(pUrl, params, pType, pSysc){
		let Type, url, type, dataType, sysc;
		url =  (pUrl == null || $.trim(pUrl) == '')? ''   : globalContextPath+'/'+pUrl;
		type = (pType == null || $.trim(pType) == '')? 'post' : pType;
		
		$.ajax({
			url: url,
			type: type,
			data: params,
			dataType: dataType,
			async : (pSysc == null)? false : pSysc
		}).done(function(data) {
			
	    }).fail(function(error) {
		});
	},
	commonAjaxSusses : function(){
		return ajaxSussesObject;
	},
	commonAjaxError : function(){
		return ajaxErrorObject;
	},
	
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