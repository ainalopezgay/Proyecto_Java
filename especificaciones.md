## Nombre del proyecto
DictionaryApp

## Descripción
Se trata de una aplicación que, al introducir el usuario una palabra en inglés, se consulta la Free Dictionary API para 
devolver su significado, pronunciación fonética y sinónimos.
Esta aplicación puede ser útil para estudiantes de idiomas, o como acceso rápido a un diccionario.

## API utilizada
| Campo | Detalle |
|---|---|
| Nombre | Free Dictionary API |
| URL base | https://dictionaryapi.dev/ |
| Documentación | https://api.dictionaryapi.dev/api/v2/entries/en/<word> |
| Autenticación requerida | No |
| Formato de respuesta | JSON |


## Endpoints que voy a usar

| Endpoint | Descripción | Ejemplo de llamada |
|---|---|---|
|  | Devuelve información completa de una palabra | https://api.dictionaryapi.dev/api/v2/entries/en/hello |


## Funcionalidades principales

Lista las cosas que hará tu aplicación. Empieza por lo más simple.

- [ ] Funcionalidad 1: Conectarse a la API y obtener el JSON de una palabra dada.
- [ ] Funcionalidad 2: Mostrar la definición de la palabra.
- [ ] Funcionalidad 3: Obtener la pronunciación fonética de la palabra.
- [ ] Funcionalidad 4: Mostrar una lista de sinónimos de dicha palabra (si los tiene).


## Clases previstas

| Clase | Responsabilidad |
|---|---|
| BuscadorDiccionario | Qué representa o hace |

---

## Diagrama de clases UML

*(Inserta aquí la imagen o el diagrama en texto)*

---

## Ejemplo de respuesta JSON de la API

*(Pega aquí un fragmento real de la respuesta de la API para el endpoint principal)*

```json
{
  "ejemplo": "pega aquí la respuesta real"
}
```

---

## Dudas o decisiones pendientes
