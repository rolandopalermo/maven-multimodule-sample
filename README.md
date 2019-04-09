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