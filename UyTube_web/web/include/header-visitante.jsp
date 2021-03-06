<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
Header para el visitante
-->
<div class="container-fluid" style="padding-left: 0; padding-right: 0px;">
    <div class="row">
        <div class="col-12">
            <header class="header">
                <nav>
                    <div class="navbar-dark item-header item-header1" id="navLogo">
                        <label class="icon-menu1"></label>
                        <a href="presentacion"><img class="fotoLogo" src="imagenes/logoChico.jpeg" alt="UyTube"></a>					
                    </div>	
                    <div class="navbar-dark item-header item-header2">					  
                        <div id="navbarSupportedContent">		
                            <form class="form-inline my-2 my-lg-0 formBuscar" action="buscar" id="formBuscar" method="get">
                                <input class=" mr-sm-2" name="texto" type="search" placeholder="Buscar" aria-label="Search">
                                <button class="btn btn-primary" id="btnBuscar" type="submit">Buscar</button>
                            </form>
                        </div>
                    </div>
                    <div class="perfil item-header item-header3">
                        <a href="inicio-sesion">
                            <button type="button" id="iniciar-sesion" class="btn btn-outline-primary"><span class="icon-user-tie"></span> INICIAR SESIÓN</button>                            
                        </a>                        
                    </div>
                </nav>

            </header>

        </div>
    </div>		
</div>