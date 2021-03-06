name := "akka-quickstart-scala"

version := "1.0"

scalaVersion := "2.13.4"

mainClass in Compile := Some("DragonMite.DragonMiteServer")

val akkaVersion = "2.6.10"
val JacksonVersion = "2.10.5.1"



libraryDependencies ++= Seq(
  "com.google.code.gson" % "gson" % "2.8.5",

  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion,
  "com.typesafe.akka" %% "akka-persistence-cassandra" % "1.0.4",
  "com.typesafe.akka" %% "akka-persistence" % akkaVersion,
  "com.typesafe.akka" %% "akka-persistence-query" % akkaVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,
  "com.typesafe.akka" %% "akka-http" % "10.1.8",
  "com.typesafe.akka" %% "akka-http-core" % "10.2.2",
  "com.typesafe.akka" %% "akka-http-spray-json" % "10.2.2",
  "com.typesafe.akka" %% "akka-http2-support" % "10.2.2",

  "com.typesafe.akka" %% "akka-remote" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster-tools" % akkaVersion,
  "com.typesafe.akka" %% "akka-cluster-sharding" % akkaVersion,

  "com.typesafe.akka" %% "akka-stream-kafka" % "2.0.7",
  "com.fasterxml.jackson.core" % "jackson-databind" % JacksonVersion,

  "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
  "ch.qos.logback" % "logback-classic" % "1.2.3",

  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion % Test,
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test,
  "org.scalatest" %% "scalatest" % "3.1.4" % Test,
  "com.typesafe.akka" %% "akka-http-testkit" % "10.2.2" % Test


)

