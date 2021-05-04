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
        viewBinding = true
    }
}

dependencies {
    api(project(":common:foundation"))
    api(project(":common:share:navigation"))
    api(project(":common:share:resources"))
}