name := "blog"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  "mysql" % "mysql-connector-java" % "5.1.27",
  anorm,
  cache
)     

play.Project.playScalaSettings
