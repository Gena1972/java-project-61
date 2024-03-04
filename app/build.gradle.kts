plugins {

    application
  //  checkstyle
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

tasks.getByName("run", JavaExec::class) {
    standardInput = System.`in`
}


application {
    mainClass = "hexlet.code.App"
}


repositories {
    mavenCentral()
}

