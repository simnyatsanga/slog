<html>
    <head>
        <title>Simba's Blog</title>
        <link href='http://fonts.googleapis.com/css?family=Merienda+One' rel='stylesheet' type='text/css'>
        <link type="text/css" href="css/application.css" rel="stylesheet"></link>
    </head>
    <body>


       <h1 class="full container">Simba's Blog</h1>

       <#list articles as article>
            <article style="background: url(images/1.jpg) fixed no-repeat;">
                <div class="large centered container content">
                 <h2>${article.title}</h2>
                 <time datetime="${article.createdDate}">${article.createdDate}</time>
                 <h3>${article.summary}</h3>
                 <p>
                    ${article.body}
                 </p>
            </article>
       </#list>


       <#list 1..6 as i>
       <article style="background: url('/images/${i}.jpg') center center fixed no-repeat;">
         <div class="large centered container content">

             <h2>Our First Article </h2>
             <time datetime="2013-08-09">9 August 2013</time>
             <h3>Now that we know who you are, I know who I am. I'm not a mistake! It all makes sense!</h3>

             <div class="content-body">
                 <h4>I gotta piss</h4>
                 <p>You think water moves fast? You should see ice. It moves like it has a mind.
                 Like it knows it killed the world once and got a taste for murder. After the avalanche, it took us a week to climb out.
                 Now, I don't know exactly when we turned on each other, but I know that seven of us survived the slide... and only five made it out.
                 Now we took an oath, that I'm breaking now. We said we'd say it was the snow that killed the other two, but it wasn't.
                 Nature is lethal but it doesn't hold a candle to man. </p>

                 <h4>Uuummmm, this is a tasty burger!</h4>
                 <p>Now that there is the Tec-9, a crappy spray gun from South Miami.
                 This gun is advertised as the most popular gun in American crime.
                 Do you believe that shit? It actually says that in the little book that comes with it: the most popular gun in American crime.
                 Like they're actually proud of that shit.  </p>

                 <h4>I gotta piss</h4>
                 <p>Now that we know who you are, I know who I am.
                 I'm not a mistake! It all makes sense! In a comic, you know how you can tell who the arch-villain's going to be?
                 He's the exact opposite of the hero. And most times they're friends, like you and me!
                 I should've known way back when... You know why, David? Because of the kids. They called me Mr Glass. </p>
                    <h4>I gotta piss</h4>
                                  <p>You think water moves fast? You should see ice. It moves like it has a mind.
                                  Like it knows it killed the world once and got a taste for murder. After the avalanche, it took us a week to climb out.
                                  Now, I don't know exactly when we turned on each other, but I know that seven of us survived the slide... and only five made it out.
                                  Now we took an oath, that I'm breaking now. We said we'd say it was the snow that killed the other two, but it wasn't.
                                  Nature is lethal but it doesn't hold a candle to man. </p>

                                  <h4>Uuummmm, this is a tasty burger!</h4>
                                  <p>Now that there is the Tec-9, a crappy spray gun from South Miami.
                                  This gun is advertised as the most popular gun in American crime.
                                  Do you believe that shit? It actually says that in the little book that comes with it: the most popular gun in American crime.
                                  Like they're actually proud of that shit.  </p>

                                  <h4>I gotta piss</h4>
                                  <p>Now that we know who you are, I know who I am.
                                  I'm not a mistake! It all makes sense! In a comic, you know how you can tell who the arch-villain's going to be?
                                  He's the exact opposite of the hero. And most times they're friends, like you and me!
                                  I should've known way back when... You know why, David? Because of the kids. They called me Mr Glass. </p>
             </div>
         </div>
       </article>
       </#list>
       <script type="text/javascript" src="javascripts/color.js"></script>
       <script type="text/javascript" src="javascripts/jquery.js"></script>
       <script type="text/javascript" src="javascripts/color-thief.js"></script>
       <script type="text/javascript" src="javascripts/application.js"></script>
    </body>
</html>