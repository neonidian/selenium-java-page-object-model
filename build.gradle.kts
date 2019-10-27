plugins {
    `java`
}

defaultTasks("clean", "test")

repositories {
    jcenter()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.5.+")
    testImplementation("org.seleniumhq.selenium:selenium-java:4.0.+")
    testImplementation("io.github.bonigarcia:webdrivermanager:3.7.+")
    testImplementation("org.hamcrest:hamcrest-all:1.3")
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}

tasks.wrapper {
    gradleVersion = "5.6.3"
}
