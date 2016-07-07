name := """hello-play-scala"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.5.0",
 "org.webjars" % "bootstrap" % "3.1.1-2"

)

dockerExposedPorts := Seq(9000,9090)

enablePlugins(JavaAppPackaging)

enablePlugins(DockerPlugin)

routesGenerator := InjectedRoutesGenerator