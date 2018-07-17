package com.example.app

import org.scalatra._

class AuthServlet extends ScalatraServlet {

  get("/") {
    views.html.login()
  }

  post("/") {
    val id = params.get("id")
    val pass = params.get("pass")
    views.html.admin()
  }

}
