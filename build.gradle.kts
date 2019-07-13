import java.nio.charset.StandardCharsets.UTF_8

plugins {
    `java-library`
}

defaultTasks("clean", "test")

repositories {
    jcenter()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.4.+")
    testImplementation("org.seleniumhq.selenium:selenium-java:4.0.+")
    testImplementation("io.github.bonigarcia:webdrivermanager:3.6.+")
    testImplementation("org.hamcrest:hamcrest-all:1.3")
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = "5.5.1"
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}

tasks.withType(JavaCompile::class) {
    options.encoding = UTF_8.displayName()
}

