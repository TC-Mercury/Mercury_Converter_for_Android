plugins {
    id("com.android.application") version "8.13.1" apply false
}
allprojects {
    repositories {
        google()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
    }
}