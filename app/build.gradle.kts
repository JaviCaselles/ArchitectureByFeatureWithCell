plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.javi.architecturebyfeature"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.javi.architecturebyfeature"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(project(":checkout:checkout-feature1"))
    implementation(project(":checkout:checkout-feature2"))

    implementation(project(":cliente:cliente-feature1"))
    implementation(project(":cliente:cliente-feature2"))

    implementation(project(":content:content-feature1"))
    implementation(project(":content:content-feature2"))

    implementation(project(":grids:grids-feature1"))
    implementation(project(":grids:grids-feature2"))

    implementation(project(":pdp:pdp-feature1"))
    implementation(project(":pdp:pdp-feature2"))

}