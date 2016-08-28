var $test = $('.foo');
$test.on('click', function(){
	$(this).html('<div style="color: red">something has changed here</div>')
});