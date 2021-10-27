import sbt._

lazy val MonitorAvro = Project(id = "monitor-avro", base = file("."))
    .enablePlugins(SbtAvrohugger)
    .settings(
      sourceGenerators in Compile += (avroScalaGenerateSpecific in Compile).taskValue,
      ProjectSettings.Settings
    )