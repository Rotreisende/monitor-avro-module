name := "monitor-avro"

version := "0.1"

scalaVersion := "2.12.0"

libraryDependencies ++= Seq(
  Dependencies.avro
).flatten

enablePlugins(SbtAvrohugger)
(Compile / sourceGenerators) += (Compile / avroScalaGenerateSpecific).taskValue

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")