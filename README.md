# Ohjelmistotekniikka, harjoitystyö
![Badge telling if Mvane tests pass.](https://github.com/Le0nerdo/Network-Clipboard/workflows/Java%20CI%20with%20Maven/badge.svg)
[![codecov](https://codecov.io/gh/Le0nerdo/Network-Clipboard/branch/main/graph/badge.svg?token=H0Z401L8CI)](https://codecov.io/gh/Le0nerdo/Network-Clipboard)

[Ohjelma](https://github.com/Le0nerdo/Network-Clipboard) [Release](https://github.com/Le0nerdo/Network-Clipboard/releases/tag/v0.1.0)

## Dokumentaatio
[vaatimusäärittely](/dokumentaatio/vaatimusmaarittely.md)

[työaikakirjanpito](/dokumentaatio/tyoaikakirjanpito.md)

[arkkitehtuuri](/dokumentaatio/arkkitehtuuri.md)

## Development
The program can be started with the main method in [defaultpackage.Main.java](https://github.com/Le0nerdo/Network-Clipboard/blob/main/src/main/java/defaultpackage/Main.java).

### Run tests
```shell
mvn test
```

### Run checkstyle
```shell
mvn jxr:jxr checkstyle:checkstyle
```

### Run Jacoco (test coverage)
```shell
mvn clean jacoco:prepare-agent install jacoco:report
```

### Build jar
It is recommended to use Project Manager for Java VSCode extension!

You can also use shade through the command line (takes long, just ignore all the alerts). The jar file will be in the "./target" folder.
```shell
mvn package shade:shade
```
