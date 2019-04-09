# Usage

```bash
$ cd /maven-multimodule-sample
$ mvn clean install
```

`DEV environment`
```bash
$ cd /maven-multimodule-sample/sample-rest
$ mvn spring-boot:run -PDevelopment
```

`QA environment`
```bash
$ cd /maven-multimodule-sample/sample-rest
$ mvn spring-boot:run -PTesting
```

`PRD environment`
```bash
$ cd /maven-multimodule-sample/sample-rest
$ mvn spring-boot:run -PProduction
```

# Samples
## Request
Get a book by id
* GET http://localhost:8080/maven-multimodule-sample/books/id

## Response
```json
{
    "id": 1,
    "title": "Java SE 8 for the Really Impatient",
    "description": "Eagerly anticipated by millions of programmers, Java SE 8 is the most important Java update in many years."
}
```

## Request
Create a book
* POST http://localhost:8080/maven-multimodule-sample/books

```json
{
    "title": "Java SE 8 for the Really Impatient",
    "description": "Eagerly anticipated by millions of programmers, Java SE 8 is the most important Java update in many years."
}
```

## Response
```json
{
    "id": 1,
    "title": "Java SE 8 for the Really Impatient",
    "description": "Eagerly anticipated by millions of programmers, Java SE 8 is the most important Java update in many years."
}
```