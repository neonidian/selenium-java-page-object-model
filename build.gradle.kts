plugins {
    java
}

defaultTasks("test")

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.7.+")
    testImplementation("org.seleniumhq.selenium:selenium-java:4.0.+")
    testImplementation("io.github.bonigarcia:webdrivermanager:4.2.+")
    testImplementation("org.hamcrest:hamcrest-all:1.3")
}

tasks {
    test {
        useJUnitPlatform()
        testLogging {
            events("passed", "skipped", "failed")
        }
        outputs.upToDateWhen { false }
    }
    compileTestJava {
        options.encoding = "UTF-8"
    }
    wrapper {
        gradleVersion = "7.0.2"
    }
}
