pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ArchitectureByFeature"
include(":app")
include(":grids")
include(":pdp")
include(":cliente")
include(":checkout")
include(":content")
include(":common")
include(":cliente:cliente-feature1")
include(":cliente:cliente-data")
include(":cliente:cliente-feature2")
include(":content:content-data")
include(":content:content-feature1")
include(":content:content-feature2")
include(":checkout:checkout-data")
include(":checkout:checkout-feature1")
include(":checkout:checkout-feature2")
include(":grids:grids-data")
include(":grids:grids-feature1")
include(":grids:grids-feature2")
include(":pdp:pdp-data")
include(":pdp:pdp-feature1")
include(":analytics")
include(":pdp:pdp-feature2")
