import sbt._

object Dependencies {
  lazy val avro = Seq(
    "org.apache.avro" % "avro" % versions.avro
  )

  object versions {
    val avro = "1.10.2"
  }
}
