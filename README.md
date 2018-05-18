This small project demonstrates that the `@Category` annotation from JUnit 4 is not honoured by the JUnit 5 Vintage engine. Run

```
$ mvn clean
```

to see that the test `CategorizedTest` fails although is should not run at all according to the configuration of the maven-surefire-plugin.

