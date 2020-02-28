// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Directories/EssentialPlay Test Programs/ScalaTests/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Fri Feb 07 10:41:39 CET 2020

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def tutorial: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.tutorial",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "tutorial"})
        }
      """
    )
  
    // @LINE:13
    def TestTwirl: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.TestTwirl",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "testTwirl/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
    // @LINE:10
    def test: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.test",
      """
        function(msg0,times1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "testTimes/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("msg", msg0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("times", times1))})
        }
      """
    )
  
    // @LINE:15
    def JsonIndex: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.JsonIndex",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "JsonIndex"})
        }
      """
    )
  
    // @LINE:8
    def explore: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.explore",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "explore"})
        }
      """
    )
  
    // @LINE:11
    def headers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.headers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "headers"})
        }
      """
    )
  
    // @LINE:12
    def displayInfo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.displayInfo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "display"})
        }
      """
    )
  
    // @LINE:14
    def TestForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.TestForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "testForm"})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:34
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:34
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseMarkLewisController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def product: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MarkLewisController.product",
      """
        function(prodType0,prodNum1) {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "product/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("prodType", prodType0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Int]].javascriptUnbind + """)("prodNum", prodNum1))})
          }
        
        }
      """
    )
  
    // @LINE:22
    def validateLoginGet: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MarkLewisController.validateLoginGet",
      """
        function(username0,password1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "validateGet" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("username", username0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("password", password1)])})
        }
      """
    )
  
    // @LINE:23
    def createUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MarkLewisController.createUser",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "createUser"})
        }
      """
    )
  
    // @LINE:29
    def testAsync: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MarkLewisController.testAsync",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "testAsync"})
        }
      """
    )
  
    // @LINE:27
    def addTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MarkLewisController.addTask",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "addTask"})
        }
      """
    )
  
    // @LINE:30
    def delayAsync: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MarkLewisController.delayAsync",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delayAsync"})
        }
      """
    )
  
    // @LINE:28
    def deleteTask: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MarkLewisController.deleteTask",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deleteTask"})
        }
      """
    )
  
    // @LINE:26
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MarkLewisController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:24
    def validateLoginPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MarkLewisController.validateLoginPost",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "validatePost"})
        }
      """
    )
  
    // @LINE:18
    def TodoIndex: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MarkLewisController.TodoIndex",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "TodoIndex"})
        }
      """
    )
  
    // @LINE:25
    def validateLoginForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MarkLewisController.validateLoginForm",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "validateForm"})
        }
      """
    )
  
    // @LINE:21
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.MarkLewisController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }


}
