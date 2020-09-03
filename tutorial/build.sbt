lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """play-scala-hello-world-tutorial""",
    organization := "com.example",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.12.8",
    libraryDependencies ++= Seq(
      guice,
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test,
      "com.typesafe.slick" %% "slick"           % "3.3.0",
      "com.h2database"      % "h2"              % "1.4.197",
      "ch.qos.logback"      % "logback-classic" % "1.2.3"
    ),
    scalacOptions ++= Seq(
      "-deprecation",
      "-encoding", "UTF-8",
      "-unchecked",
      "-feature",
      "-language:implicitConversions",
      "-language:postfixOps",
      "-Xfatal-warnings"
    )
  )

initialCommands in console := """
                                |import slick.jdbc.H2Profile.api._
                                |import Example._
                                |import scala.concurrent.Await
                                |import scala.concurrent.duration._
                                |import scala.concurrent.ExecutionContext.Implicits.global
                                |val db = Database.forConfig("chapter04")
                                |def exec[T](program: DBIO[T]): T = Await.result(db.run(program), 5000 milliseconds)
                                |exec(populate)
""".trim.stripMargin

val appDependencies = Seq(
  "org.sorm-framework" % "sorm" % "0.3.118",
  "com.h2database" % "h2" % "1.3.168"
)