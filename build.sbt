name := "euler"

version := "1.0"

scalaVersion := "2.11.2"

scalacOptions ++= Seq("-unchecked",
                        "-feature",
                        "-deprecation")

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test"
