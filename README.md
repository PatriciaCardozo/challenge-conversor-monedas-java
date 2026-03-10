# challenge-conversor-monedas-java
Conversor de monedas en Java que utiliza una API de tasas de cambio para realizar conversiones entre diferentes divisas.
# Conversor de Monedas en Java 💱

Este proyecto es un conversor de monedas desarrollado en Java que permite convertir valores entre diferentes divisas mediante un menú interactivo en consola.

## Funcionalidades

- Conversión entre distintas monedas
- Menú interactivo para el usuario
- Lógica de conversión implementada en Java
- Preparado para consumir la API de ExchangeRate-API y obtener tasas en tiempo real

## Uso de la API real

- La API utilizada es **ExchangeRate-API**.
- La clave usada en el proyecto es: `255e7bc526e4eeed2e6d5ae0`.
- Para usar tu propia clave, reemplaza `API_KEY` en `Conversor.java`.
- Las conversiones se hacen usando la tasa actual de la API.

## Tecnologías utilizadas

- Java
- HttpClient
- Gson (para manejar JSON)
- Programación Orientada a Objetos
- GitHub

## Estructura del proyecto
src/
Main.java → Punto de entrada del programa
Conversor.java → Lógica de conversión de monedas con API real
ApiClient.java → Cliente HTTP para consumir API
README.md → Documentación del proyecto
.gitignore → Archivos ignorados

## Autor
Patricia
