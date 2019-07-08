defaultTasks("test")

plugins {
    `java-library`
}

repositories {
    jcenter()
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}


dependencies {
    api("org.apache.commons:commons-math3:3.6.1")
    implementation("com.google.guava:guava:27.0.1-jre")
    testRuntime("org.junit.jupiter:junit-jupiter-engine:5.4.+")
    testCompile("org.junit.jupiter:junit-jupiter-api:5.4.+")
    testCompile("org.seleniumhq.selenium:selenium-java:4.0.+")
    compile("commons-configuration:commons-configuration:1.10")
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = "5.5"
}
