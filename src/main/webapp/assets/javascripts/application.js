$(document).ready( function() {

   $.each( $('img'), function() {
        var colorThief = new ColorThief();
        var primaryColor = Color().rgb(colorThief.getColor(this));
        var shadowColor = primaryColor.rgbaString();
        var invertedColor = primaryColor.negate();
        var colors = colorThief.getPalette(this, 3);
        var textColor =  invertedColor.rgbaString();



        $(this).parent().find("h2").css('color', textColor);
        $(this).parent().find("h2").css('text-shadow', "2px 2px 3px " + shadowColor)
   });
});