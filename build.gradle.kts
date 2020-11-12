import org.ajoberstar.reckon.gradle.ReckonExtension

plugins {
    java
    idea
    id("us.ascendtech.gwt.lib") version "0.5.4" apply false
    id("org.ajoberstar.reckon") version "0.8.0"
}

configure<ReckonExtension> {
    scopeFromProp()
    stageFromProp("rc", "final")
}


defaultTasks("build")

subprojects {

    apply(plugin = "java")
    apply(plugin = "maven")
    apply(plugin = "idea")


    defaultTasks("build")
    group = "us.ascendtech"

    repositories {
        mavenCentral()
    }


    tasks.withType<JavaCompile> {
        options.isDebug = true
        options.debugOptions.debugLevel = "source,lines,vars"
        options.encoding = "UTF-8"
        options.compilerArgs.add("-parameters")
    }

    dependencies {
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.2.0")
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.2.0")
    }

    val sourcesJar = tasks.register<Jar>("sourcesJar") {
        classifier = "sources"
        from(sourceSets.getByName("main").allSource)
    }


    artifacts.add("archives", sourcesJar)

    tasks.withType<Jar> {
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    }

    java {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}