<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Predicación pública - Registro</title>
    </head>
    <body>
        <div class="navbar"
             <h2>Predicación pública</h2>
            <ul>
                <li><a class="actual" href="#">Inicio</a></li>
                <li><a href="#">INICIAR SESION</a></li>
                <li><a href="#">REGISTRARSE</a></li>
            </ul>
        <h1>Regístrate!</h1>
        <div class="registro">
            <form action="LoginServlet" method="POST">
                <label for="usuario">Usuario</label>
                <p><input type="text" name="user"></p>
                
                <label for="contrasena">Contraseña</label>
                <p><input type="password" name="contrasena"></p>
                
                <label for="contrasena2">Repita la contraseña</label>
                <p><input type="password" name="contrasena2"></p>
                
                
                <label for="nombre">Nombre</label>
                <p><input type="text" name="nombre"</p>
                <p><input type="submit" name="enviar" value="Aceptar" <input type="button" name="back" value="Regresar"</p>
    </body>
</html>
