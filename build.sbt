name := "blog"

version := "1.0-alpha"

libraryDependencies ++= Seq(
  jdbc,
  "mysql" % "mysql-connector-java" % "5.1.35",
  anorm,
  cache
)     

play.Project.playScalaSettings
