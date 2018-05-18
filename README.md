This small project demonstrates that the `@Category` annotation from JUnit 4 is not honoured by the JUnit 5 Vintage engine. Run

```
$ mvn clean test
```

to see that the test `CategorizedTest` fails although is should not run at all according to the configuration of the maven-surefire-plugin:

```
[INFO] -------------------------------------------------------
[INFO]  T E S T S
[INFO] -------------------------------------------------------
[INFO] Running junit4.CategorizedTest
[ERROR] Tests run: 1, Failures: 1, Errors: 0, Skipped: 0, Time elapsed: 0 s <<< FAILURE! - in junit4.CategorizedTest
[ERROR] should_not_run  Time elapsed: 0 s  <<< FAILURE!
java.lang.AssertionError: Test should not be executed at all!
        at junit4.CategorizedTest.should_not_run(CategorizedTest.java:12)

[INFO] Running junit4.SimpleTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in junit4.SimpleTest
[INFO] Running junit5.AnotherSimpleTest
[INFO] Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0 s - in junit5.AnotherSimpleTest
[INFO]
[INFO] Results:
[INFO]
[ERROR] Failures:
[ERROR]   CategorizedTest.should_not_run:12 Test should not be executed at all!
[INFO]
[ERROR] Tests run: 3, Failures: 1, Errors: 0, Skipped: 0
```

