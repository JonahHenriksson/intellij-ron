import org.jetbrains.intellij.platform.gradle.TestFrameworkType
import org.jetbrains.intellij.platform.gradle.tasks.PatchPluginXmlTask

plugins {
    id("java")
    id("org.jetbrains.intellij.platform") version "2.1.0"
}

group = "org.jonahhenriksson"
version = "1.5"

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}

sourceSets {
    main {
        java {
            srcDirs("src/main/gen")
        }
    }
}

repositories {
    mavenCentral()

    intellijPlatform {
        defaultRepositories()
    }
}

dependencies {
    intellijPlatform {
        intellijIdeaCommunity("2024.2")

        bundledPlugin("com.intellij.java")

        pluginVerifier()
        zipSigner()
        instrumentationTools()

        testFramework(TestFrameworkType.Platform)
    }

    testImplementation("junit:junit:4.13.2")
}


intellijPlatform {

    pluginConfiguration {
        changeNotes.set("""Updated to support 2024.2 edition of Intellij IDEs""")
    }

    publishing {
        token.set(System.getenv("INTELLIJ_MARKETPLACE_TOKEN"))
    }
}