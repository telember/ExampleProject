import Dependencies.addAndroidLifecycle
import Dependencies.addGlide
import Dependencies.addKoin
import Dependencies.addKotlinCoroutine
import Dependencies.addNavigation
import Dependencies.addRetrofit
import Dependencies.addSupportLibs

plugins {
    id("commons.android-library")
}

dependencies {
    api(Dependencies.KotlinLibs.kotlinStd)
    addKoin()
    addKotlinCoroutine()
    addNavigation()
    addRetrofit()
    addSupportLibs()
    addGlide()
    addAndroidLifecycle()
}