import sbt.Keys._

object ProjectSettings {
  lazy val Settings = Seq(
    organization := "ru.monitor",
    version := "0.1",
    scalaVersion := "2.12.10",
    libraryDependencies ++= Dependencies.avro,
  )
}
