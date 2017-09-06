import de.heikoseeberger.sbtheader.HeaderPattern

scalaVersion := "2.11.11"

enablePlugins(ScalaNativePlugin, AutomateHeaderPlugin)

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
