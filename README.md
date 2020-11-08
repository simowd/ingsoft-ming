<!-- LOGO -->
<p align="center">
  <a href="https://github.com/simowd/ingsoft-ming">
    <img src="/Logo.png" alt="Logo" width="350" height="350">
  </a>
  
<!-- SHIELDS -->
<p align="center">
  <a>
    <img alt="GitHub code size in bytes" src="https://img.shields.io/github/languages/code-size/simowd/ingsoft-ming?style=flat-square">
    <img alt="Lines of code" src="https://img.shields.io/tokei/lines/github.com/simowd/ingsoft-ming?style=flat-square">
    <img alt="GitHub contributors" src="https://img.shields.io/github/contributors/simowd/ingsoft-ming?style=flat-square">
    <img alt="GitHub last commit" src="https://img.shields.io/github/last-commit/simowd/ingsoft-ming?style=flat-square">
    <img alt="GitHub issues" src="https://img.shields.io/github/issues/simowd/ingsoft-ming?style=flat-square">
    <img alt="GitHub pull requests" src="https://img.shields.io/github/issues-pr/simowd/ingsoft-ming?style=flat-square">
    <img alt="GitHub commit activity" src="https://img.shields.io/github/commit-activity/m/simowd/ingsoft-ming?style=flat-square">
    <img alt="GitHub" src="https://img.shields.io/github/license/simowd/ingsoft-ming?style=flat-square">
    <img alt="GitHub top language" src="https://img.shields.io/github/languages/top/simowd/ingsoft-ming?style=flat-square">
    <img alt="GitHub Repo stars" src="https://img.shields.io/github/stars/simowd/ingsoft-ming?style=social">
  </a>
  
<!-- TITLE -->
  <h1 align="center">Ming - Tienda Virtual de Videojuegos</h1>

<!-- TABLE OF CONTENTS -->
## Tabla de Contenidos

* [Acerca del Proyecto](#Acerca-del-Proyecto)
  * [Herramientas Utilizadas](#Herramientas-Utilizadas)
  * [Instalación para Linux](#Instalación-para-Linux)
* [Contribuidores](#Contribuidores)
* [Licencia](#Licencia)

<!-- ABOUT THE PROJECT -->
## Acerca del Proyecto

Ming es un proyecto para la materia de Ingeniería del Software de la Universidad Católica Boliviana San Pablo 2020 realizado por estudiantes de la
carrera de Ingeniería de Sistemas, Ming es una tienda virtual especializada en videojuegos indies, donde los usuarios pueden visualizar un catálogo 
y poder adquirir los diferentes juegos.

Para este proyecto existen tres tipos de Usuarios:
* Usuario común que compra los diferentes videojuegos.
* Editor o Publisher que publica los diferentes juegos que realiza.
* Administrador que administra videojuegos como

### Herramientas Utilizadas
En esta sección se muestra las herramientas utilizadas en el proyecto.

<!-- LOGOS LINKS -->
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Java](https://www.oracle.com/technetwork/es/java/javase/downloads/index.html)
* [MyBatis](https://mybatis.org/mybatis-3/es/)
* [MySQL](https://www.mysql.com/)

<!-- TOOLS IMAGE -->
<p align="center">
  <a href="https://github.com/simowd/ingsoft-ming">
    <img src="/Herramientas.jpg" alt="Logo" width="900" height="500">
  </a>

### Instalación para Linux

1. Clonar el repositorio:
```
git clone https://github.com/simowd/ingsoft-ming.git
```
2. Iniciar Docker:
```sh
systemctl start docker
sudo docker start mydb
sudo docker exec -it mydb mysql -uroot -p
```
3. Configurar la Base de Datos:
```sh
sudo docker exec -e LANG=C.UTF-8 -it mydb bash
mysql -uroot -p
CREATE DATABASE ming DEFAULT CHARACTER SET 'utf8' DEFAULT COLLATE utf8_general_ci;
USE ming;
```
4. Crear todas las tablas con: TMING_create_4.sql
5. Copiar todos los datos de: data_ming.sql

<!-- CONTRIBUTORS -->
## Contribuidores
<table>
  <tr>
    <td align="center"><a href="https://github.com/SergioPru4"><img src="https://avatars0.githubusercontent.com/u/52050964?s=460&u=29df9188bbe8724fe1c11be588f9640d1d97c18b&v=4" width="175px;" alt=""/><br /><sub><b>SergioPru4</b</td>
    <td align="center"><a href="https://github.com/simowd"><img src="https://avatars2.githubusercontent.com/u/41243969?s=460&u=57c6513a19817251057739193544778e7418cba7&v=4" width="175px;" alt=""/><br /><sub><b>simowd</b</td>
    <td align="center"><a href="https://github.com/JuancaJcA"><img src="https://avatars1.githubusercontent.com/u/48498478?s=460&u=d74157caf5cdda004619fa62d1e542f5924beefc&v=4" width="175px;" alt=""/><br /><sub><b>JuancaJcA</b</td>
    <td align="center"><a href="https://github.com/Muerir"><img src="https://avatars1.githubusercontent.com/u/47600456?s=460&u=50c5d38858d246e2d08144737f23691f63040d01&v=4" width="175px;" alt=""/><br /><sub><b>Muerir</b</td>
    <td align="center"><a href="https://github.com/Fulano2141"><img src="https://avatars1.githubusercontent.com/u/28693068?s=460&u=b5ec0baa8279b3cac61685521852b517e8d0d894&v=4" width="175px;" alt=""/><br /><sub><b>Fulano2141</b</td>
  </tr>
</table>

<!-- LICENSE -->
## Licencia
Distribuida bajo la licencia GPL - 3.0 ([Licencia](https://github.com/simowd/ingsoft-ming/blob/main/LICENSE))
