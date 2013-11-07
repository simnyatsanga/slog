$(document).ready( function() {

   $.each( $('article'), function() {
        var imageUrl = $(this).css('background-image').replace('url(', '').replace(')', '');
        var articleImage = new Image();
        articleImage.src = imageUrl;

        var that = this;
        $(articleImage).load(function() {

            var colorThief = new ColorThief();

            var colors = colorThief.getPalette(this, 3);
            var alternativeColor = Color().rgb(colors[2]);
            var bodyBackground = alternativeColor;
            bodyBackground.clearer(0.3);
            var bodyBackgroundString = bodyBackground.rgbaString();

            var alternativeColorString = alternativeColor.rgbaString();

            var primaryColor = Color().rgb(colorThief.getColor(articleImage));
            var primaryColorString = primaryColor.rgbaString();
            var invertedColor = primaryColor.negate();
            var invertedColorString =  invertedColor.rgbaString();

            $(that).find("h2, h3").css('color', invertedColorString);
            $(that).find("h2, h3").css('text-shadow', "2px 2px 3px " + primaryColorString)

            $(that).find('time').css('background-color', alternativeColorString);
            $(that).find('time').css('color', primaryColorString);
            $(that).find('time').css('text-shadow', "0px 0px 6px" + primaryColor.lighten(0.3).rgbaString());
        });


   });
});