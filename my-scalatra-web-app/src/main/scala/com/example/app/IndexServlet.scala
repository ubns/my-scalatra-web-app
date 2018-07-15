package com.example.app

import org.scalatra._

class IndexServlet extends ScalatraServlet {

  get("/login") {
    views.html.login()
  }
}
