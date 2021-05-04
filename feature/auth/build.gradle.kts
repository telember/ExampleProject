import Dependencies.addTesting

plugins {
    id("com.android.library")
    kotlin(PlugIns.kotlinAndroid)
}

android {
    compileSdkVersion(Dependencies.Android.compileSdkVersion)
    buildToolsVersion = Dependencies.Android.buildToolsVersion

    defaultConfig {
        minSdkVersion(Dependencies.Android.minSdkVersion)
        targetSdkVersion(Dependencies.Android.targetSdkVersion)
    }

    buildFeatures {
        viewBinding  = true
    }
}

dependencies {
    implementation(project(":common:core"))
    implementation(project(":common:share:data"))

    addTesting()
}