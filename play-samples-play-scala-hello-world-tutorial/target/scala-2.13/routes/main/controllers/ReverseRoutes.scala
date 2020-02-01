// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Directories/EssentialPlay Test Programs/ScalaTests/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Sun Feb 02 00:43:06 CET 2020

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def tutorial(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "tutorial")
    }
  
    // @LINE:13
    def TestTwirl(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "testTwirl/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:10
    def test(msg:String, times:Int): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "testTimes/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("msg", msg)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("times", times)))
    }
  
    // @LINE:15
    def JsonIndex(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "JsonIndex")
    }
  
    // @LINE:8
    def explore(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "explore")
    }
  
    // @LINE:11
    def headers(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "headers")
    }
  
    // @LINE:12
    def displayInfo(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "display")
    }
  
    // @LINE:14
    def TestForm(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "testForm")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:30
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:18
  class ReverseMarkLewisController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def product(prodType:String, prodNum:Int): Call = {
    
      (prodType: @unchecked, prodNum: @unchecked) match {
      
        // @LINE:19
        case (prodType, prodNum)  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "product/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("prodType", prodType)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Int]].unbind("prodNum", prodNum)))
      
      }
    
    }
  
    // @LINE:22
    def validateLoginGet(username:String, password:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "validateGet" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("username", username)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("password", password)))))
    }
  
    // @LINE:24
    def createUser(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "createUser")
    }
  
    // @LINE:26
    def validateLoginPost(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "validatePost")
    }
  
    // @LINE:18
    def TodoIndex(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "TodoIndex")
    }
  
    // @LINE:21
    def login(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }


}
