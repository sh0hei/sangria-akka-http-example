name := "sangria-akka-http-example"
version := "0.1.0-SNAPSHOT"

description := "An example GraphQL server written with akka-http, circe and sangria."

scalaVersion := "2.13.5"
scalacOptions ++= Seq("-deprecation", "-feature")

val akkaVersion = "2.6.14"
val circeVersion = "0.13.0"
val sangriaAkkaHttpVersion = "0.0.2"

libraryDependencies ++= Seq(
  "org.sangria-graphql" %% "sangria" % "2.1.3",
  "org.sangria-graphql" %% "sangria-slowlog" % "2.0.1",
  "org.sangria-graphql" %% "sangria-circe" % "1.3.1",

  "org.sangria-graphql" %% "sangria-akka-http-core" % sangriaAkkaHttpVersion,
  "org.sangria-graphql" %% "sangria-akka-http-circe" % sangriaAkkaHttpVersion,

  "com.typesafe.akka" %% "akka-http" % "10.2.4",
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "de.heikoseeberger" %% "akka-http-circe" % "1.36.0",

  "io.circe" %% "circe-core" % circeVersion,
  "io.circe" %% "circe-parser" % circeVersion,
  "io.circe" %% "circe-optics" % circeVersion,
  
  "org.scalatest" %% "scalatest" % "3.2.8" % Test
)

Revolver.settings
enablePlugins(JavaAppPackaging)
