<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro de produtos</title>
</head>
<body>
	<form method="post" action="form/salvar">
		<div>
			<label for="title">Titulo</label> <input type="text" name="titulo"
				id="title" />
		</div>
		<div>
			<label for="description">Descrição</label>
			<textarea rows="10" cols="20" name="descricao" id="description">
</textarea>
		</div>
		<div>
			<label for="pages">Número de paginas</label> <input type="text"
				name="paginas" id="pages" />
		</div>
		<div>
			<input type="submit" value="Enviar">
		</div>
	</form>
</body>
</html>