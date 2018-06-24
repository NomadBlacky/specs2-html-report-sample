lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "specs2-html-report-sample",
    libraryDependencies ++= Seq(
      "org.specs2" %% "specs2-html" % "4.3.0" % "test"
    ),
    testOptions in Test += Tests.Argument(TestFrameworks.Specs2,  "console", "html", "!pandoc", "html.outdir", "docs")
  )
