$(function(){
	init();
});
/**
 * 初始化
 */
function init(){
	$("#date").datepicker({
		inline: true
	});
}

function gridResize(){
	$(window).scrollTop(0);
    $(document.body).css("overflow", "hidden");
 	$(".iframe").height($(window).height());
	$(".iframe").width($(window).width()); 
 	$(window).resize(function() {
 		$(".iframe").height($(window).height());
		$(".iframe").width($(window).width()); 
	});
 	$(window).scroll(function(){
 		var scrollTop = $(window).scrollTop();
 		$("#menus").attr("top",scrollTop - scrollTop);
 	});
 	$("#test").click(function(){
 		var height = $(".iframe").height();
 		$(window).scrollTop(height);
 	});
}