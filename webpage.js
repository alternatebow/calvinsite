var $test = $('.foo');
$test.on('click', function(){
	$(this).html('<div style="color: red">something has changed here</div>')
});

var $starWars = $('.bar');
$starWars.on('ready', function(){
	$(this).fade('quick')
});