<%-- 
    Document   : AltaUsuario
    Created on : 09/10/2019, 10:15:12 AM
    Author     : administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <%
        boolean sesionIniciada = (boolean) (request.getSession().getAttribute("usuario") != null);
    %>

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/body.css">
        <link rel="stylesheet" type="text/css" href="css/header.css">
        <link rel="stylesheet" type="text/css" href="css/menu.css">
        <link rel="stylesheet" type="text/css" href="css/widget.css">
        <link rel="stylesheet" type="text/css" href="css/footer.css">
       	<link rel="stylesheet" type="text/css" href="css/contenido-alta-usuario.css">
        <link rel="stylesheet" type="text/css" href="iconos/style.css">

        <title>UyTube - Registrarse</title>
    </head>
    <body>

        <div class="container-fluid" style="padding-left: 0; padding-right: 0px;">
            <div class="row">
                <div class="col-12">

                    <%
                        if (sesionIniciada) {
                    %>
                     <jsp:include page="include/header-usuario.jsp" />
                    <%
                        } else {
                    %>
                    <jsp:include page="include/header-visitante.jsp" />
                    <%
                        }
                    %>
                </div>
            </div>		
        </div>
        <div class="container-fluid" style="padding-left: 0; padding-right: 0px;">
            <div class="row">
                <div class="col-12">
                    <div class="relleno-header"></div>
                </div>
            </div>
        </div>
        <div class="container-fluid" style="padding-left: 0; padding-right: 0px;">
            <div class="row">
                <div class="col-12">
                    <section class="principal">				
                        <%
                            if (sesionIniciada) {
                        %>
                        <jsp:include page="include/menu-usuario.jsp" />
                        <%
                        } else {
                        %>
                        <jsp:include page="include/menu-visitante.jsp" />
                        <%
                            }
                        %>
                        <div class="contenido">
                            <section class="contenido-flexible">
                                <div class="principal d-flex flex-row justify-content-center">
                                    <section class="d-flex  flex-lg-row flex-wrap justify-content-lg-between">
                                        <form class="form-signin" action="usuario-agregar" method="post" enctype="multipart/form-data">
                                            <h1 class="h3 mb-3 font-weight-normal" id="Texto_ingrese">Ingrese sus datos</h1><br>
                                            <input class="form-control" type="text" name="nickname" placeholder="Nickname" id="input_Nickname" required>
                                            <span class="small" id="msjNickname"></span>
                                            <br>

                                            <div class="row">
                                                <div class="col-md-6 mb-3">
                                                    <input type="text" class="form-control" name="nombre" id="input_Nombre" placeholder="Nombre" required>
                                                </div>
                                                <div class="col-md-6 mb-3">
                                                    <input type="text" class="form-control" name="apellido" id="input_Apellido" placeholder="Apellido" required>
                                                </div>
                                            </div>

                                            <input class="form-control" type="email" name="email" placeholder="Email" id="email" required>
                                            <span class="small" id="msjEmail"></span>
                                            <br>

                                            <input class="form-control" name="fechaNa" type="date" id="input_fecha" name="trip-start"><br>
                                            <input class="form-control" type="password" name="password" placeholder="Contraseña" id="input_Contrasenia" onfocus="borrar()" required><br>
                                            <input class="form-control" type="password" placeholder="Repita contraseña" id="input_Repetir_contraseña" onblur="check()" required>
                                            <span class="small" id='message'></span>

                                            <div class="d-block my-3">
                                                <label for="cc-name">Privacidad del canal</label>
                                                <div class="custom-control custom-radio">
                                                    <input id="publico" name="privacidad" value="PUBLICO" type="radio" class="custom-control-input" checked >
                                                    <label class="custom-control-label" for="publico">Publico</label>
                                                </div>
                                                <div class="custom-control custom-radio">
                                                    <input id="privado" name="privacidad" value="PRIVADO" type="radio" class="custom-control-input" >
                                                    <label class="custom-control-label" for="privado">Privado</label>
                                                </div>
                                            </div>
                                            <hr class="mb-4">

                                            <input class="form-control" name="canal" type="text" placeholder="Nombre del Canal" id="input_Nombre_canal" required>
                                            <small class="text-muted">Opcional*</small><br><br>

                                            <textarea class="form-control" name="descripcion" id="input_descripcion" placeholder="Descripción del Canal" rows="3"></textarea>
                                            <small class="text-muted">Opcional*</small><br><br>


                                            <label id="label_email">Imagen de perfil</label>
                                            
                                            <div class="form-group">
                                                <input id="input_Imagen_Perfil" name="imagen" accept=".PNG,.JPG,.jpg,.png" type="file" class="file" multiple=false data-preview-file-type="any"><br>
                                                <small class="text-muted">Opcional*</small>
                                            </div>

                                            <hr class="mb-4">

                                            <div class="btn-toolbar" role="toolbar" aria-label="Toolbar with button groups">
                                                <div class="btn-group mr-2" role="group" aria-label="First group">
                                                    <button class="btn btn-lg btn-danger btn-block" type="reset" id="btn_Limpiar">Limpiar</button>
                                                </div>
                                                <div class="btn-group mr-2" role="group" aria-label="Second group">
                                                    <button class="btn btn-lg btn-primary btn-block" type="submit" id="btn_Registrarme">Registrarme</button>
                                                </div>
                                            </div>

                                            <p class="mt-5 mb-3 text-muted" id="texto_copy">&copy; 2019-2020</p>
                                        </form>
                                    </section>
                                </div>									
                            </section>
                        </div>
                    </section>	
                </div>
            </div>
        </div>

        <%@ include file='include/widgets.html' %>
        <%@ include file='include/footer.html' %>

        <script src="js/jquery-3.4.1.min.js"></script>
        <script src="js/bootstrap.bundle.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/funciones.js"></script>
        <<script src="js/alta-usuario.js"></script>
    </body>
</html>