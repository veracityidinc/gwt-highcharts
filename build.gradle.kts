plugins {
    java
    `java-library`
    `maven-publish`
}

defaultTasks("build")

subprojects {

    apply(plugin = "java")
    apply(plugin = "java-library")
    apply(plugin = "maven-publish")

    java {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    val sourcesJar = tasks.register<Jar>("sourcesJar") {
        archiveClassifier.set("sources")
        from(sourceSets.getByName("main").allSource)
    }

    tasks.withType<JavaCompile> {
        options.isDebug = true
        options.debugOptions.debugLevel = "source,lines,vars"
        options.encoding = "UTF-8"
        options.compilerArgs.add("-parameters")
    }

    artifacts.add("archives", sourcesJar)

    publishing {
        publications {
            create<MavenPublication>("mavenJava") {
                from(components["java"])
                artifact(tasks["sourcesJar"])
                pom {
                    url.set("https://github.com/veracityidinc/gwt-highcharts")
                    licenses {
                        license {
                            name.set("The Apache License, Version 2.0")
                            url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                        }
                    }
                    developers {
                        developer {
                            id.set("mdavis")
                            name.set("Matt Davis")
                            email.set("matt.davis@ascend-tech.us")
                            organization.set("Ascendant Software Technology, LLC")
                            organizationUrl.set("https://www.ascend-tech.us")
                        }
                        developer {
                            id.set("payam.meyer")
                            name.set("Payam Mayer")
                            email.set("payam.meyer@ascend-tech.us")
                            organization.set("Ascendant Software Technology, LLC")
                            organizationUrl.set("https://www.ascend-tech.us")
                        }
                        developer {
                            id.set("bp")
                            name.set("Bogdan Petridean")
                            email.set("bpetridean@veracityid.com")
                            organization.set("VeracityId")
                            organizationUrl.set("https://veracityid.com/")
                        }
                    }
                    scm {
                        connection.set("git@github.com:veracityidinc/gwt-highcharts.git")
                        developerConnection.set("git@github.com:veracityidinc/gwt-highcharts.git")
                        url.set("https://github.com/veracityidinc/gwt-highcharts.git")
                    }
                    name.set(project.name)
                    description.set(project.name)
                }
            }
        }
    }

    defaultTasks("build")
    group = "us.ascendtech"
    version = "1.2.6"

    repositories {
        mavenCentral()
    }

    dependencies {
        implementation("com.google.jsinterop:jsinterop-annotations:2.0.0")
        testImplementation("org.junit.jupiter:junit-jupiter-api:5.2.0")
        testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.2.0")
    }

    tasks.withType<Jar> {
        duplicatesStrategy = DuplicatesStrategy.EXCLUDE
    }

}