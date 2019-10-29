<%-- 
    Document   : 404_2
    Created on : 12/10/2019, 04:17:57 AM
    Author     : Carlos BM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="iconos/style.css">
        <link rel="icon" type="image/png" href="imagenes/icono.png" />
        <title>UyTube - 404</title>
        
    <style>
        *
        {
            font-family: 'PT Sans Caption', sans-serif, 'arial', 'Times New Roman';
        }

        /* Error Page */
        .error .clip .shadow
        {
            height: 180px;  /*Contrall*/
        }
        .error .clip:nth-of-type(2) .shadow
        {
            width: 130px;   /*Contrall play with javascript*/ 
        }
        .error .clip:nth-of-type(1) .shadow, .error .clip:nth-of-type(3) .shadow
        {
            width: 250px; /*Contrall*/
        }
        .error .digit
        {
            width: 150px;   /*Contrall*/
            height: 150px;  /*Contrall*/
            line-height: 150px; /*Contrall*/
            font-size: 120px;
            font-weight: bold;
        }
        .error h2   /*Contrall*/
        {
            font-size: 32px;
        }
        .error .msg /*Contrall*/
        {
            top: -190px;
            left: 30%;
            width: 80px;
            height: 80px;
            line-height: 80px;
            font-size: 32px;
        }
        .error span.triangle    /*Contrall*/
        {
            top: 70%;
            right: 0%;
            border-left: 20px solid #535353; /*triandulito del uy*/
            border-top: 15px solid transparent;
            border-bottom: 15px solid transparent;
        }


        .error .container-error-404
        {
            margin-top: 10%;
            position: relative;
            height: 250px;
            padding-top: 40px;
        }
        .error .container-error-404 .clip
        {
            display: inline-block;
            transform: skew(-45deg);
        }
        .error .clip .shadow
        {

            overflow: hidden;
        }
        .error .clip:nth-of-type(2) .shadow
        {
            overflow: hidden;
            position: relative;
            box-shadow: inset 20px 0px 20px -15px rgba(150, 150, 150,0.8), 20px 0px 20px -15px rgba(150, 150, 150,0.8);
        }

        .error .clip:nth-of-type(3) .shadow:after, .error .clip:nth-of-type(1) .shadow:after
        {
            content: "";
            position: absolute;
            right: -8px;
            bottom: 0px;
            z-index: 9999;
            height: 100%;
            width: 10px;
            background: linear-gradient(90deg, transparent, rgba(173,173,173, 0.8), transparent);
            border-radius: 50%;
        }
        .error .clip:nth-of-type(3) .shadow:after
        {
            left: -8px;
        }
        .error .digit
        {
            position: relative;
            top: 8%;
            color: white;
            background: #f5360d;  /* fondo de los circulos*/
            border-radius: 50%;
            display: inline-block;
            transform: skew(45deg);
        }
        .error .clip:nth-of-type(2) .digit
        {
            left: -10%;
        }
        .error .clip:nth-of-type(1) .digit
        {
            right: -20%;
        }.error .clip:nth-of-type(3) .digit
        {
            left: -20%;
        }    
        .error h2
        {
            color: #A2A2A2; /*uy tube se cayó*/
            font-weight: bold;
            padding-bottom: 20px;
        }
        .error .msg
        {
            position: relative;
            z-index: 9999;
            display: block;
            background: #535353; /*logo*/
            color: #A2A2A2; /*uy*/
            border-radius: 50%;
            font-style: italic;
        }
        .error .triangle
        {
            position: absolute;
            z-index: 999;
            transform: rotate(45deg);
            content: "";
            width: 0; 
            height: 0; 
        }

        /* Error Page */
        @media(max-width: 767px)
        {
            /* Error Page */
            .error .clip .shadow
            {
                height: 100px;  /*Contrall*/
            }
            .error .clip:nth-of-type(2) .shadow
            {
                width: 80px;   /*Contrall play with javascript*/ 
            }
            .error .clip:nth-of-type(1) .shadow, .error .clip:nth-of-type(3) .shadow
            {
                width: 100px; /*Contrall*/
            }
            .error .digit
            {
                width: 80px;   /*Contrall*/
                height: 80px;  /*Contrall*/
                line-height: 80px; /*Contrall*/
                font-size: 52px;
            }
            .error h2   /*Contrall*/
            {
                font-size: 24px;
            }
            .error .msg /*Contrall*/
            {
                top: -110px;
                left: 15%;
                width: 40px;
                height: 40px;
                line-height: 40px;
                font-size: 18px;
            }
            .error span.triangle    /*Contrall*/
            {
                top: 70%;
                right: -3%;
                border-left: 10px solid #535353; /*no se*/
                border-top: 8px solid transparent;
                border-bottom: 8px solid transparent;
            }
            .error .container-error-404
            {
                height: 150px;
            }
            /* Error Page */
        }

        /*--------------------------------------------Framework --------------------------------*/

        .overlay { position: relative; z-index: 20; } /*done*/
        .ground-color { background: white; }  /*done*/
        .item-bg-color { background: #EAEAEA } /*done*/

        /* Padding Section*/
        .padding-top { padding-top: 10px; } /*done*/
        .padding-bottom { padding-bottom: 10px; }   /*done*/
        .padding-vertical { padding-top: 10px; padding-bottom: 10px; }
        .padding-horizontal { padding-left: 10px; padding-right: 10px; }
        .padding-all { padding: 10px; }   /*done*/

        .no-padding-left { padding-left: 0px; }    /*done*/
        .no-padding-right { padding-right: 0px; }   /*done*/
        .no-vertical-padding { padding-top: 0px; padding-bottom: 0px; }
        .no-horizontal-padding { padding-left: 0px; padding-right: 0px; }
        .no-padding { padding: 0px; }   /*done*/
        /* Padding Section*/

        /* Margin section */
        .margin-top { margin-top: 10px; }   /*done*/
        .margin-bottom { margin-bottom: 10px; } /*done*/
        .margin-right { margin-right: 10px; } /*done*/
        .margin-left { margin-left: 10px; } /*done*/
        .margin-horizontal { margin-left: 10px; margin-right: 10px; } /*done*/
        .margin-vertical { margin-top: 10px; margin-bottom: 10px; } /*done*/
        .margin-all { margin: 10px; }   /*done*/
        .no-margin { margin: 0px; }   /*done*/

        .no-vertical-margin { margin-top: 0px; margin-bottom: 0px; }
        .no-horizontal-margin { margin-left: 0px; margin-right: 0px; }

        .inside-col-shrink { margin: 0px 20px; }    /*done - For the inside sections that has also Title section*/ 
        /* Margin section */

        hr
        { margin: 0px; padding: 0px; border-top: 1px dashed #999; }
        /*--------------------------------------------FrameWork------------------------*/
    </style>
</head>

<body>

    <!-- Error Page -->
    <div class="error">
        <div class="container-floud">
            <div class="col-xs-12 ground-color text-center">
                <div class="container-error-404">
                    <div class="clip"><div class="shadow"><span class="digit thirdDigit">4</span></div></div>
                    <div class="clip"><div class="shadow"><span class="digit secondDigit">0</span></div></div>
                    <div class="clip"><div class="shadow"><span class="digit firstDigit">1</span></div></div>
                    <div class="msg">Uy!<span class="triangle"></span></div>
                </div>
                <h2 class="h1">¡Uy!, parece que este mate no es tuyo</h2>
                <%
                    String mensajeError = (String) request.getAttribute("mensajeError");
                    if (mensajeError != null){
                        String msj = "";
                        for (int idx = 0; idx < mensajeError.length(); idx++) {
                            if (mensajeError.charAt(idx) == '\n'){
                                break;
                            }
                            msj += mensajeError.charAt(idx);
                        }
                %>
                <h2 class="h1" style="font-size: 20px;"><%= msj %></h2>
                <%
                    }
                %>
                
                <h2 class="h1">
                    <a href="/uytube/">Ir al inicio</a>
                </h2>
            </div>
        </div>
    </div>
    <!-- Error Page -->
</body>
</html>