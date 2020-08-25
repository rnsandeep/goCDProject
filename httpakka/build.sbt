//import sbt.Keys._
import sbt._


name := "httpakka"

version := "1.0"

scalaVersion := "2.11.5"

val scalatest = "org.scalatest" %% "scalatest" % "3.1.0" % Test
val junit = "junit" % "junit" % "4.12" % Test


libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http-experimental" % "1.0",
  "com.typesafe.akka" %% "akka-http-spray-json-experimental" % "1.0",
  "com.typesafe.akka" %%"akka-http-testkit-experimental" % "1.0",
  "org.scalatest" %% "scalatest" % "3.1.0" % "test"
)