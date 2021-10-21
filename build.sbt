name := "monitor-avro"

scalaVersion := "2.12.0"

ThisBuild / organization := "org.me"
ThisBuild / version := "0.1-SNAPSHOT"

libraryDependencies ++= Dependencies.avro

enablePlugins(SbtAvrohugger)
(Compile / sourceGenerators) += (Compile / avroScalaGenerateSpecific).taskValue