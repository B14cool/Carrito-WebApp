<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Predicación Pública - Iniciar sesión</title>
    </head>
    <body>
        <div class="navbar"
             <h2>Predicación pública</h2>
            <ul>
                <li><a class="actual" href="#">Inicio</a></li>
                <li><a href="#">INICIAR SESION</a></li>
                <li><a href="#">REGISTRARSE</a></li>
            </ul>
        </div>
        <div class="form">
            <form action="LoginServlet" method="POST">
                <input type="text" name="user" value="Usuario">
                <input type="password" name="password" value="Contraseña">
                <input type="submit" value="Enviar">
            </form>
        </div>
    </body>
</html>
