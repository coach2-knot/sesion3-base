# Proyecto Base Vacio - Selenium POM (Sesion 3)

Plantilla base con **Java + Selenium + JUnit 5** para construir tus Page Objects
y tests desde cero.

## Incluye

- `pom.xml` con dependencias Selenium + JUnit 5
- `ConfigLoader` para `config.properties`
- `BaseTest` (setup/teardown de driver + wait)
- `DriverFactory` (Chrome / Firefox / Edge + headless)
- `BasePage` con helpers reutilizables
- Estructura de paquetes `config`, `core`, `pages`, `tests`

## No incluye (a propósito)

- Páginas concretas (`LoginPage`, `InventoryPage`, etc.)
- Tests de ejemplo

## Estructura

```text
src/test/java/com/knotacademy/qc/selenium/
├── config/
│   └── ConfigLoader.java
├── core/
│   ├── BaseTest.java
│   └── DriverFactory.java
├── pages/
│   └── BasePage.java
└── tests/
    ├── .gitkeep
    └── sample/
        └── .gitkeep
```

## Siguiente uso sugerido

1. Edita `src/test/resources/config.properties`
2. Crea tu primer Page Object en `pages/`
3. Crea tus tests en `tests/`
4. Ejecuta `mvn test`

## Comandos utiles

```bash
mvn test
mvn test -Dbrowser=firefox
mvn test -Dbrowser=edge
mvn test -Dbrowser=chrome -Dheadless=true
```
