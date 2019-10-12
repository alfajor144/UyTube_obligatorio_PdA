<%-- 
    Document   : Presentacion
    Created on : 07/10/2019, 03:40:03 PM
    Author     : administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
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
       	<link rel="stylesheet" type="text/css" href="css/contenido-index.css">
        <link rel="stylesheet" type="text/css" href="iconos/style.css">
        <link rel="icon" type="image/png" href="imagenes/icono.png" />
        <title>UyTube</title>
    </head>
    <body>

        <%@include file='include/header-usuario.html' %>
        <div class="container-fluid">
            <div class="row">
                <div class="col-12">
                    <div class="relleno-header"></div>
                </div>
            </div>
        </div>
        <div class="container-fluid">
            <div class="row">
                <div class="col-12">
                    <section class="principal">						
                        <%@ include file='include/menu-usuario.html' %>
                        <div class="contenido">
                            <section class="contenido-flexible">
                                <!--================== Aca va el contenido central para agregar ========================== -->					
                                <h3>Lo nuevo</h3>

                                <div class="card" >
                                    <a href="/uytube/video-consultar?id=1">
                                        <img src="https://i.ytimg.com/vi/MiiK2JB6FHo/hqdefault.jpg" class="card-img-top" alt="Nombre del video">
                                    </a>

                                    <div class="card-body">
                                        <h5 class="card-title">Titulo del video</h5>
                                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>

                                    </div>
                                </div>

                                <div class="card" >
                                    <a href="/uytube/video-consulta&idr?id=2"><img src="https://i.ytimg.com/vi/OVjbqdm_JVI/hqdefault.jpg" class="card-img-top" alt="Nombre del video"></a>										
                                    <div class="card-body">
                                        <h5 class="card-title">Titulo del video</h5>
                                        <p class="card-text">Some quick example text to buile and make up the bulk of the card's content.</p>
                                    </div>
                                </div>
                                <div class="card" >
                                    <a href="/uytube/video-consultar?id=3">
                                        <img src="https://i.ytimg.com/vi/Yq-Kfc81h5s/hqdefault.jpg" class="card-img-top" alt="Nombre del video">
                                    </a>
                                    <div class="card-body">
                                        <h5 class="card-title">Titulo del video</h5>
                                        <p class="card-text">Some quick example text e and make up the bulk of the card's content.</p>
                                    </div>
                                </div>
                                <div class="card" >
                                    <a href="/uytube/video-consultar?id=4">
                                        <img src="https://i.ytimg.com/vi/MiiK2JB6FHo/hqdefault.jpg" class="card-img-top" alt="Nombre del video">
                                    </a>
                                    <div class="card-body">
                                        <h5 class="card-title">Titulo del video</h5>
                                        <p class="card-text">Some quiard title and make up the bulk of the card's content.</p>
                                    </div>
                                </div>
                                <div class="card" >
                                    <a href="/uytube/video-consultar?id=5">
                                        <img src="https://i.ytimg.com/vi/MiiK2JB6FHo/hqdefault.jpg" class="card-img-top" alt="Nombre del video">
                                    </a>

                                    <div class="card-body">
                                        <h5 class="card-title">Titulo del video</h5>
                                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>

                                    </div>
                                </div>

                                <div class="card" >
                                    <a href="/uytube/video-consultar?id=6"><img src="https://i.ytimg.com/vi/OVjbqdm_JVI/hqdefault.jpg" class="card-img-top" alt="Nombre del video"></a>										
                                    <div class="card-body">
                                        <h5 class="card-title">Titulo del video</h5>
                                        <p class="card-text">Some quick example text to buile and make up the bulk of the card's content.</p>
                                    </div>
                                </div>
                                <div class="card" >
                                    <a href="/uytube/video-consultar?id=7">
                                        <img src="https://i.ytimg.com/vi/Yq-Kfc81h5s/hqdefault.jpg" class="card-img-top" alt="Nombre del video">
                                    </a>
                                    <div class="card-body">
                                        <h5 class="card-title">Titulo del video</h5>
                                        <p class="card-text">Some quick example text e and make up the bulk of the card's content.</p>
                                    </div>
                                </div>
                                <div class="card" >
                                    <a href="/uytube/video-consulta&id=1234">
                                        <img src="https://i.ytimg.com/vi/MiiK2JB6FHo/hqdefault.jpg" class="card-img-top" alt="Nombre del video">
                                    </a>
                                    <div class="card-body">
                                        <h5 class="card-title">Titulo del video</h5>
                                        <p class="card-text">Some quiard title and make up the bulk of the card's content.</p>
                                    </div>
                                </div>  
                                <!-- Fin del contenido central -->
                            </section>
                        </div>

                    </section>	
                </div>
            </div>
        </div>

        <%@ include file='include/widgets.html' %>
        <%@ include file='include/footer.html' %>

        <script src="js/jquery-3.4.1.min_1.js"></script>
        <script src="js/bootstrap.bundle.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/funciones.js"></script>
        <script src="js/index.js"></script>
    </body>
</html>
