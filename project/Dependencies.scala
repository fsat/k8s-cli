/*
 * Copyright © 2014-2016 Lightbend, Inc. All rights reserved.
 * No information contained herein may be reproduced or transmitted in any form
 * or by any means without the express written permission of Lightbend, Inc.
 */

import sbt._

object Version {
  val scopt        = "3.4.0"
  val scalaTest    = "3.0.1"
}

object Library {
  val scopt        = "com.github.scopt"         %% "scopt"          % Version.scopt
  val scalaTest    = "org.scalatest"            %% "scalatest"      % Version.scalaTest
}
