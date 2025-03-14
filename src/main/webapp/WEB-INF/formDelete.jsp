<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Remover Tarefa</title>
</head>
<body>
    <h1>Editar Tarefa</h1>
    <p>Tem certeza que deseja excluir a tarefa ${tarefa.descricao}?</p>
    <form action="/tarefas/delete" method="post">
        <input type="hidden" name="id" value="${tarefa.id}"/>
         <label>Descrição</label>
         <input type="text" name="descricao" value="${tarefa.descricao}"/>
         <button type="submit">Remover</button>
    </form>
</body>
</html>