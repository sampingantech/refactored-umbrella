object GradlePlugins {
    const val ANDROID = "com.android.tools.build:gradle:4.1.0-beta04"

    interface GradlePlugin {
        val ID: String
        val VERSION: String
        val APPLY: Boolean
            get() = true
    }

    object Kotlin : GradlePlugin {
        override val ID = "gradle-plugin"
        override val VERSION = "1.3.72"
    }

    private object Detekt : GradlePlugin {
        override val ID: String = "io.gitlab.arturbosch.detekt"
        override val VERSION: String = "1.8.0"
    }

    private object Spotless : GradlePlugin {
        override val ID: String = "com.diffplug.gradle.spotless"
        override val VERSION: String = "3.30.0"
        override val APPLY: Boolean = false
    }

    private object DependencyAnalysis : GradlePlugin {
        override val ID: String = "com.autonomousapps.dependency-analysis"
        override val VERSION: String = "0.49.0"
    }

    val plugins = listOf(Detekt, Spotless, DependencyAnalysis)
}
