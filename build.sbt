import sbt._
import com.typesafe.sbt.SbtScalariform.ScalariformKeys
import de.heikoseeberger.sbtheader.HeaderPattern
import scalariform.formatter.preferences.AlignSingleLineCaseStatements


scalaVersion := "2.11.11"

enablePlugins(ScalaNativePlugin, AutomateHeaderPlugin)

libraryDependencies ++= List(
  "com.github.scopt"  %%% "scopt"    % "3.7.0",
  "io.argonaut"       %%% "argonaut" % "6.3-SNAPSHOT"
)

ScalariformKeys.preferences :=
  ScalariformKeys.preferences.value
    .setPreference(AlignSingleLineCaseStatements, true)
    .setPreference(AlignSingleLineCaseStatements.MaxArrowIndent, 100)

HeaderPlugin.autoImport.headers := Map(
  "scala" -> (
    HeaderPattern.cStyleBlockComment,
    """|/*
       | * Copyright © 2014-2016 Lightbend, Inc. All rights reserved.
       | * No information contained herein may be reproduced or transmitted in any form
       | * or by any means without the express written permission of Lightbend, Inc.
       | */
       |
       |""".stripMargin
    ),
  "conf" -> (
    HeaderPattern.hashLineComment,
    """|# Copyright © 2014-2016 Lightbend, Inc. All rights reserved.
       |# No information contained herein may be reproduced or transmitted in any form
       |# or by any means without the express written permission of Lightbend, Inc.
       |
       |""".stripMargin
    )
)
