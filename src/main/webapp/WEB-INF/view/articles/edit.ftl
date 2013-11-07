<!DOCTYPE HTML>

<html>
    <form action="/articles/update/${article.id}" method="POST">
        <input name="_method" type="hidden" value="PUT" />
        <#include "*/articles/articleform.ftl">
    </form>
</html>