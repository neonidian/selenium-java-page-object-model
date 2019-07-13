defaultTasks("clean", "test")

plugins {
    `java-library`
}

repositories {
    jcenter()
}

dependencies {
    api("org.apache.commons:commons-math3:3.6.+")
    implementation("com.google.guava:guava:27.0.1-jre")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.4.+")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.4.+")
    testImplementation("org.seleniumhq.selenium:selenium-java:4.0.+")
    testImplementation("io.github.bonigarcia:webdrivermanager:3.6.+")
    testImplementation("org.hamcrest:hamcrest-all:1.3")
    implementation("commons-configuration:commons-configuration:1.10")
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

