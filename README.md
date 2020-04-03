# Aplicación distribuida segura en todos sus frentes #

## Prerrequisitos ##
Se debe tener conocimientos claros de la programación Orientada a objetos, y en el manejo de maven y java.

## Construido con ##
[Maven](https://maven.apache.org/): Para la gestión de dependencias.

[Spring Boot](https://spring.io/projects/spring-boot): Para la gestion de la parte de aplicacion Web Segura.

[Java](https://www.java.com/es/download/): Como lenguaje de programación manejado.

## Arquitectura ##
![](https://github.com/JonatanGonzalez09/AREP-Seguridad/blob/master/images/modelo.png)


La explicación del diseño de la arquitectura se encuentra en el Latex.

## Compilr y ejecutar ##
Para descargar las dependencias y empaquetar el proyecto ejecutamos los siguientes comandos:
```
  mvn clean install
  mvn package 
```
## Documentación ##
Para genera la documentacion se uso el comando: ``` mvn javadoc:jar ```

**La documentación se puede mirar en la carpeta APIdocs en la raiz del repositorio.**

## Documento en Latex ##
El documento con la descripción del proyecto se puede encontrar en el siguiente [enlace](https://github.com/JonatanGonzalez09/AREP-Seguridad/blob/master/images/Aplicacion%20Segura%20AREP.pdf)
 
## Pruebas y Verificación de Seguridad ##
**1.La primera prueba que realizamos fue acceder por el protocolo http y por el puerto 8081, pero el resultado fue que la pagina necesiaba un certificado TLS.**
![](https://github.com/JonatanGonzalez09/AREP-Seguridad/blob/master/images/prueba1.png)

**2.En la segunda prueba accedimos por el protocolo https y el puerto 8081, aca nos arroja un error de que la pagina no es segura pero damos click en configuracion avanzada y nos redirige al menu en el cual podremos ingresar a nuestra aplicación segura**
![](https://github.com/JonatanGonzalez09/AREP-Seguridad/blob/master/images/prueba2.png)

**3. En la tercera prueba digitamos nuestro usuario y contraseña, la cual tenemos almacenada en la base de datos PostgreSQL**
![](https://github.com/JonatanGonzalez09/AREP-Seguridad/blob/master/images/prueba3.png)

**4.En la cuarta parte se ve la correcta validación del usuario ya que nos deja ingresar y por consiguiente sale un mensaje de correcto inicio de sesión**
![](https://github.com/JonatanGonzalez09/AREP-Seguridad/blob/master/images/prueba4.png)

**5. En esta parte volvemos a verificar si tenemos permisos por el protocolo http, pero no tenemos permisos para acceder ya que no se sabe que usuario tiene la sesión iniciada**
![](https://github.com/JonatanGonzalez09/AREP-Seguridad/blob/master/images/prueba5.png)

## Licencia ##
Este proyecto cuenta con la licencia [**GNU General Public License v3.0**](https://github.com/JonatanGonzalez09/AREP-Seguridad/blob/master/LICENSE)

## Autor ##
Jonatan Esteban Gonzalez Rodriguez
