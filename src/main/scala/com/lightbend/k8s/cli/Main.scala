/*
 * Copyright © 2014-2016 Lightbend, Inc. All rights reserved.
 * No information contained herein may be reproduced or transmitted in any form
 * or by any means without the express written permission of Lightbend, Inc.
 */

package com.lightbend.k8s.cli

import scopt.OptionParser

object Main {
  case class InputArgs(foo: Option[String] = None)

  val defaultInputArgs = InputArgs()

  val parser = new OptionParser[InputArgs]("k8s-cli") {
    head("k8s-cli", "0.1.0")

    help("help").text("Print this help text")

    opt[String]('f', "foo")
      .text("test switch called foo")
      .action((v, c) => c.copy(foo = Some(v)))
  }

  def run(inputArgs: InputArgs): Unit = {
    println(s"Got input args: $inputArgs")
  }

  def main(args: Array[String]): Unit = {
    parser.parse(args, defaultInputArgs).foreach(run)
  }
}
