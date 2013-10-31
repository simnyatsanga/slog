<!DOCTYPE HTML>
<html>
    <head>
        <title>Simba's Blog</title>
        <link type="text/css" href="css/application.css" rel="stylesheet"></link>
    </head>
    <body>
        <div class="col-12">
            <h1>Simba's Blog</h1>
        </div>



       <#list 1..3 as i>
            <div class="col-4">a${i}</div>
       </#list>


       <#list 1..6 as i>
           <div class="col-2"> b${i} </div>
        </#list>

        <#list 1..12 as i>
            <div class="col-1"> c${i} </div>
        </#list>
    </body>
</html>