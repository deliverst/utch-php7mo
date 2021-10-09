# Practica 1

_Desarrollar aplicación que utilice el patrón MVC. La aplicación debe tener la capacidad de recibir información y entregar resultados, según el caso de uso descrito a continuación._

_La aplicación es para una empresa distribuidora de herramientas manuales, eléctricas y de construcción. La aplicación debe almacenar en una base de datos la información de los productos y los clientes._

_La aplicación debe contar con las operaciones CRUD para ambos, herramientas y clientes._

_Desarrollar reporte de investigación de una aplicación móvil, considerando el patrón de diseño MVC._

_Documento en word y enlace en Git para descarga del software_

## Instalación

_Creación de base de datos postgres_
```
CREATE DATABASE utchapp;
```


## Peticiones & JSON 🚀

_GET_
```
http://localhost:8098/herramientas/all
```

_POST_

```
http://localhost:8098/herramientas/create
```

_PUT_

```
http://localhost:8098/herramientas/update/1
```

_JSON_
```
{
  "nombreHerramienta":"Pulidora",
  "precio":"200",
  "cantidad":6
}
```

_DELETE_

```
http://localhost:8098/herramientas/delete/1
```


---
⌨️ con ❤️ por [deliverst](https://github.com/deliverst)👌
