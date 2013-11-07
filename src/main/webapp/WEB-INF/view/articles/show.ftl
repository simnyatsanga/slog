<!DOCTYPE HTML>

<html>
    <h1>${article.title}</h1>
    <form action="/articles/delete/${article.id}" method ="POST">
    <input name="_method" type="hidden" value="DELETE" />
        <input value="delete" type ="submit"/>
    </form>
</html>