package com.example.app

import org.scalatra._

class ExScalatraServlet extends ScalatraServlet {

  get("/:id") {
    <P>Get {params("id")}</P>
  }

  post("/") {

  }

  put("/:id") {

  }

  delete("/:id") {

  }
}
