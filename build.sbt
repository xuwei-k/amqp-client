name := "amqp-client"

organization := "com.github.sstone"
 
version := "1.3-SNAPSHOT"
 
scalaVersion := "2.11.5"

scalacOptions  ++= Seq("-feature", "-language:postfixOps")
 
resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= {
  val akkaVersion = "2.3.9"
  Seq(
    "com.typesafe.akka"    %% "akka-actor"          % akkaVersion,
    "com.rabbitmq"         % "amqp-client"          % "3.4.4",
    "com.typesafe.akka"    %% "akka-testkit"        % akkaVersion  % "test",
    "org.scalatest"        %% "scalatest"           % "2.2.4" % "test",
    "junit"                % "junit"                % "4.11" % "test",
    "com.typesafe.akka"    %% "akka-slf4j"          % akkaVersion,
    "ch.qos.logback"       %  "logback-classic"     % "1.0.0"
  )
}
