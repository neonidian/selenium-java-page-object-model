# Selenium Page Object Model With Java

Selenium project uses page object modelling where tests, pages(with HTML elements defined) and selenium framework reside
in their respective packages

## Running the tests

* [Gradle](https://gradle.org/) is used as the build tool

* Pre-requisite: Gradle, Java and firefox browser installed (Other browsers can also be configured)

* To run the tests, open a command line and go to the project directory. Use `./gradlew`(for Linux and Mac) or `gradlew`(for Windows) in the command line 

* Test report is generated in build/reports/tests/test/index.html

## Java Compatability

* Has been tested with Java 8 (OpenJDK 8) and Java 11 (OpenJDK 11)

## Structure

* The projects follows the standard java convention. So, since the project is about tests, all the tests are located 
in src/test and there is no src/main

* The package `se.ica.framework` has selenium actions like defining the browser, the actions that can be done in a page

* The package `se.ica.pages` has functionality for a specific web page of a website

* The package `se.ica.tests` has the tests

* Note that the assertions are located in a [class](src/test/java/se/ica/framework/SeleniumActions.java) 
which is not the class where [tests](src/test/java/se/ica/tests/OnlinePageTest.java) are present -> something  different from the usual convention

## Website Used

* This project uses https://www.ica.se, a Swedish retail company that provides online and store shopping
