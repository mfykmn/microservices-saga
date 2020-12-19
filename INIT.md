# ツールのインストール
## SDKMANのインストール
```ShellSession
user@host: ~ $ curl -s https://get.sdkman.io | bash
user@host: ~ $ source "$HOME/.sdkman/bin/sdkman-init.sh"
```

## Gradleのインストール
```ShellSession
user@host: ~ $ sdk install gradle 6.7.1
```

# アプリケーション初期設定
## Gradle init実行
```ShellSession
user@host: ~/workspace/microservice-saga $ gradle init
Welcome to Gradle 6.7.1!

Here are the highlights of this release:
 - File system watching is ready for production use
 - Declare the version of Java your build requires
 - Java 15 support

For more details see https://docs.gradle.org/6.7.1/release-notes.html

Starting a Gradle Daemon (subsequent builds will be faster)

Select type of project to generate:
  1: basic
  2: application
  3: library
  4: Gradle plugin
Enter selection (default: basic) [1..4] 2

Select implementation language:
  1: C++
  2: Groovy
  3: Java
  4: Kotlin
  5: Scala
  6: Swift
Enter selection (default: Java) [1..6] 4

Split functionality across multiple subprojects?:
  1: no - only one application project
  2: yes - application and library projects
Enter selection (default: no - only one application project) [1..2] 1

Select build script DSL:
  1: Groovy
  2: Kotlin
Enter selection (default: Kotlin) [1..2] 2

Project name (default: microservices-saga): sample
Source package (default: sample): 

> Task :init
Get more help with your project: https://docs.gradle.org/6.7.1/samples/sample_building_kotlin_applications.html

BUILD SUCCESSFUL in 2m 7s
2 actionable tasks: 2 executed
```