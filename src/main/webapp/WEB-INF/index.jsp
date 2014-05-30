<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Index!</title>
</head>
<body>
<h3>Pagina urls a servicios.</h3>
<br>
<h4>1) Servicio Rest Simple</h4>
<a href="http://localhost:8080/servicios/sensores/activar/12345">http://localhost:8080/servicios/sensores/activar/12345</a>

<h4>2) Servicios con diferentes Handler Exception</h4>
<span>
<a href="http://localhost:8080/servicios/errores/obtenerException/runtime">http://localhost:8080/servicios/errores/obtenerException/runtime</a>  (single handler de RuntimeException)
</span>
<br>
<span>
<a href="http://localhost:8080/servicios/errores/obtenerException/custom">http://localhost:8080/servicios/errores/obtenerException/custom</a>  (single handler de CustomGenericException)
</span>
<br>
<span>
<a href="http://localhost:8080/servicios/errores/obtenerException/global">http://localhost:8080/servicios/errores/obtenerException/global</a>   (global handler de IoException)
</span>


<h4>3) Servicios con Response Json/xml</h4>
<span>
<a href="http://localhost:8080/servicios/sensores/xml">http://localhost:8080/servicios/sensores/xml</a>
</span>
<br>
<span>
<a href="http://localhost:8080/servicios/sensores/json">http://localhost:8080/servicios/sensores/json</a>
</span>
<br>


<br><br><br><br><br>
<br>
<br>

<span>@author  ptamburro</span>
