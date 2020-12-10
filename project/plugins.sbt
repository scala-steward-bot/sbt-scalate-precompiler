scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

addSbtPlugin("org.scalariform"  % "sbt-scalariform" % "1.8.3")
addSbtPlugin("com.jsuereth"     % "sbt-pgp"         % "2.1.1")

libraryDependencies += "org.scala-sbt" %% "scripted-plugin" % sbtVersion.value
