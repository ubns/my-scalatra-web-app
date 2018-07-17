package com.example.app

import org.scalatra._

class AuthServlet extends ScalatraServlet {

  get("/") {
    views.html.login()
  }

  post("/login") {
    views.html.admin()
  }

}
