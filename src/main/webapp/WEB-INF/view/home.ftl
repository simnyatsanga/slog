<!DOCTYPE HTML>
<html>
    <head>
        <title>Simba's Blog</title>
        <link type="text/css" href="css/application.css" rel="stylesheet"></link>
    </head>
    <body>
        <#list articles as article>
            <h2>${article.title}</h2>
        </#list>
    </body>
</html>