plugins {
    id("jd-project.kotlin")
    application
}

dependencies {
    implementation(project(":jd-project-kotlin"))
}

application {
    // Use `./gradlew :jd-project-kotlin-example:run` to run `Main`
    // Use `./gradlew :jd-project-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.jd_project.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
