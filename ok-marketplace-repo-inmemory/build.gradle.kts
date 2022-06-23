plugins {
    kotlin("jvm")
}

dependencies {

    val ehcacheVersion: String by project
    val coroutinesVersion: String by project

    implementation(kotlin("stdlib"))
    implementation(project(":ok-marketplace-common"))

    implementation("org.ehcache:ehcache:$ehcacheVersion")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutinesVersion")

    testImplementation(project(":ok-marketplace-repo-test"))
}
