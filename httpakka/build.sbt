//import sbt.Keys._
import sbt._

import Dependencies._

val buildVersion = sys.env.getOrElse("GO_PIPELINE_LABEL", "0.1.0-SNAPSHOT")

ThisBuild / scalaVersion     := "2.11.5"
ThisBuild / version          := buildVersion
ThisBuild / organization     := "com.avalara"

lazy val akkaDependencies = Seq(
  "com.typesafe.akka" %% "akka-http-experimental" % "1.0",
  "com.typesafe.akka" %% "akka-http-spray-json-experimental" % "1.0",
  "com.typesafe.akka" %%"akka-http-testkit-experimental" % "1.0",
  "org.scalatest" %% "scalatest" % "3.1.0" % "test"
)

lazy val root = (project in file("."))
  .settings(
    name := "httpakka",
    libraryDependencies ++= rootDependencies ++ akkaDependencies,
    resolvers ++= Seq(
      Resolver.mavenLocal
    )
  )
