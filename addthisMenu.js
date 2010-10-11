init();
function init()
{
	c = document.getElementsByTagName('a');
	if (c) {
		renderToolbox(c);
	}
}
		function renderToolbox(collection) {
			for (var i = 0; i < collection.length; i++) {
				var b = collection[i];
				var bStyle ="small-count";
	            if (b == null) continue;
				c = b.className
				if(c.match('addthis_buzz_counter')) {
					if(b.getAttribute("buzzButton") != null) {
						bStyle = b.getAttribute("buzzButton");
					}
					addthis.init();
					b.innerHTML =  '<a href="http://www.google.com/buzz/post" class="google-buzz-button" title=' + addthis_share.title + 'data-message='+ addthis_share.title +' data-url='+  addthis_share.url +'  data-locale="en"  data-button-style='+ bStyle +'></a>';
					var sTag = document.createElement('script');
					sTag.setAttribute('src', 'http://www.google.com/buzz/api/button.js');
					sTag.setAttribute('type', 'text/javascript');
					document.body.appendChild(sTag);
				}
			}
		}
