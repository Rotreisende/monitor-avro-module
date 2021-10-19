name := "monitor-avro"

scalaVersion := "2.12.0"

ThisBuild / organization := "org.me"
ThisBuild / version := "0.1-SNAPSHOT"

libraryDependencies ++= Seq(
  Dependencies.avro
).flatten

enablePlugins(SbtAvrohugger)
(Compile / sourceGenerators) += (Compile / avroScalaGenerateSpecific).taskValue


resolvers += Resolver.mavenLocal