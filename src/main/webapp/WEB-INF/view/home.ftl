<!DOCTYPE HTML>
<html>
    <head>
        <title>Simba's Blog</title>
        <link type="text/css" href="css/application.css" rel="stylesheet"></link>
    </head>
    <body>


       <h1 class="full container">Simba's Blog</h1>

        <div class="small centered container ">
           <div class="row">
               <#list 1..4 as i>
                    <div class="col-4">a${i}</div>
               </#list>
           </div>
        </div>

       <div class="row">
           <#list 1..6 as i>
               <div class="col-2"> b${i} </div>
            </#list>
       </div>

        <div class="row">
            <#list 1..12 as i>
                <div class="col-1"> c${i} </div>
            </#list>
        </div>

        <div class="full container">
            <div class="row">
            <#list 1..8 as i>
               <div class="col-12 fill"><img src="images/${i}.jpg" alt="clown" /></div>
            </#list>

            </div>
        </div>

    </body>
</html>