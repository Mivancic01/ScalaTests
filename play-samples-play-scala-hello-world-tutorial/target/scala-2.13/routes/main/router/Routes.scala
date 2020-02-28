// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Directories/EssentialPlay Test Programs/ScalaTests/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Fri Feb 07 10:41:39 CET 2020

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_2: controllers.HomeController,
  // @LINE:18
  MarkLewisController_0: controllers.MarkLewisController,
  // @LINE:34
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_2: controllers.HomeController,
    // @LINE:18
    MarkLewisController_0: controllers.MarkLewisController,
    // @LINE:34
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_2, MarkLewisController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, MarkLewisController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """explore""", """controllers.HomeController.explore"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """tutorial""", """controllers.HomeController.tutorial"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """testTimes/""" + "$" + """msg<[^/]+>/""" + "$" + """times<[^/]+>""", """controllers.HomeController.test(msg:String, times:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """headers""", """controllers.HomeController.headers"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """display""", """controllers.HomeController.displayInfo"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """testTwirl/""" + "$" + """name<[^/]+>""", """controllers.HomeController.TestTwirl(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """testForm""", """controllers.HomeController.TestForm"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """JsonIndex""", """controllers.HomeController.JsonIndex"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """TodoIndex""", """controllers.MarkLewisController.TodoIndex"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """product/""" + "$" + """prodType<[^/]+>/""" + "$" + """prodNum<[^/]+>""", """controllers.MarkLewisController.product(prodType:String, prodNum:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """productRE/""" + "$" + """prodType<[a-z]{2}\d\d>/""" + "$" + """prodNum<[^/]+>""", """controllers.MarkLewisController.product(prodType:String, prodNum:Int)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.MarkLewisController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validateGet""", """controllers.MarkLewisController.validateLoginGet(username:String, password:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createUser""", """controllers.MarkLewisController.createUser"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validatePost""", """controllers.MarkLewisController.validateLoginPost"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validateForm""", """controllers.MarkLewisController.validateLoginForm"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.MarkLewisController.logout"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """addTask""", """controllers.MarkLewisController.addTask"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """deleteTask""", """controllers.MarkLewisController.deleteTask"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """testAsync""", """controllers.MarkLewisController.testAsync"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delayAsync""", """controllers.MarkLewisController.delayAsync"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HomeController_explore1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("explore")))
  )
  private[this] lazy val controllers_HomeController_explore1_invoker = createInvoker(
    HomeController_2.explore,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "explore",
      Nil,
      "GET",
      this.prefix + """explore""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HomeController_tutorial2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("tutorial")))
  )
  private[this] lazy val controllers_HomeController_tutorial2_invoker = createInvoker(
    HomeController_2.tutorial,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "tutorial",
      Nil,
      "GET",
      this.prefix + """tutorial""",
      """""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_HomeController_test3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("testTimes/"), DynamicPart("msg", """[^/]+""",true), StaticPart("/"), DynamicPart("times", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_test3_invoker = createInvoker(
    HomeController_2.test(fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "test",
      Seq(classOf[String], classOf[Int]),
      "GET",
      this.prefix + """testTimes/""" + "$" + """msg<[^/]+>/""" + "$" + """times<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_HomeController_headers4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("headers")))
  )
  private[this] lazy val controllers_HomeController_headers4_invoker = createInvoker(
    HomeController_2.headers,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "headers",
      Nil,
      "GET",
      this.prefix + """headers""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_displayInfo5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("display")))
  )
  private[this] lazy val controllers_HomeController_displayInfo5_invoker = createInvoker(
    HomeController_2.displayInfo,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "displayInfo",
      Nil,
      "GET",
      this.prefix + """display""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_TestTwirl6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("testTwirl/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HomeController_TestTwirl6_invoker = createInvoker(
    HomeController_2.TestTwirl(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "TestTwirl",
      Seq(classOf[String]),
      "GET",
      this.prefix + """testTwirl/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_TestForm7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("testForm")))
  )
  private[this] lazy val controllers_HomeController_TestForm7_invoker = createInvoker(
    HomeController_2.TestForm,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "TestForm",
      Nil,
      "GET",
      this.prefix + """testForm""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_JsonIndex8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("JsonIndex")))
  )
  private[this] lazy val controllers_HomeController_JsonIndex8_invoker = createInvoker(
    HomeController_2.JsonIndex,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "JsonIndex",
      Nil,
      "GET",
      this.prefix + """JsonIndex""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_MarkLewisController_TodoIndex9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("TodoIndex")))
  )
  private[this] lazy val controllers_MarkLewisController_TodoIndex9_invoker = createInvoker(
    MarkLewisController_0.TodoIndex,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MarkLewisController",
      "TodoIndex",
      Nil,
      "GET",
      this.prefix + """TodoIndex""",
      """Mark Lewis Controller""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_MarkLewisController_product10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("product/"), DynamicPart("prodType", """[^/]+""",true), StaticPart("/"), DynamicPart("prodNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MarkLewisController_product10_invoker = createInvoker(
    MarkLewisController_0.product(fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MarkLewisController",
      "product",
      Seq(classOf[String], classOf[Int]),
      "GET",
      this.prefix + """product/""" + "$" + """prodType<[^/]+>/""" + "$" + """prodNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_MarkLewisController_product11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("productRE/"), DynamicPart("prodType", """[a-z]{2}\d\d""",false), StaticPart("/"), DynamicPart("prodNum", """[^/]+""",true)))
  )
  private[this] lazy val controllers_MarkLewisController_product11_invoker = createInvoker(
    MarkLewisController_0.product(fakeValue[String], fakeValue[Int]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MarkLewisController",
      "product",
      Seq(classOf[String], classOf[Int]),
      "GET",
      this.prefix + """productRE/""" + "$" + """prodType<[a-z]{2}\d\d>/""" + "$" + """prodNum<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_MarkLewisController_login12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_MarkLewisController_login12_invoker = createInvoker(
    MarkLewisController_0.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MarkLewisController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_MarkLewisController_validateLoginGet13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validateGet")))
  )
  private[this] lazy val controllers_MarkLewisController_validateLoginGet13_invoker = createInvoker(
    MarkLewisController_0.validateLoginGet(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MarkLewisController",
      "validateLoginGet",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """validateGet""",
      """""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_MarkLewisController_createUser14_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createUser")))
  )
  private[this] lazy val controllers_MarkLewisController_createUser14_invoker = createInvoker(
    MarkLewisController_0.createUser,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MarkLewisController",
      "createUser",
      Nil,
      "POST",
      this.prefix + """createUser""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_MarkLewisController_validateLoginPost15_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validatePost")))
  )
  private[this] lazy val controllers_MarkLewisController_validateLoginPost15_invoker = createInvoker(
    MarkLewisController_0.validateLoginPost,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MarkLewisController",
      "validateLoginPost",
      Nil,
      "POST",
      this.prefix + """validatePost""",
      """""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_MarkLewisController_validateLoginForm16_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validateForm")))
  )
  private[this] lazy val controllers_MarkLewisController_validateLoginForm16_invoker = createInvoker(
    MarkLewisController_0.validateLoginForm,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MarkLewisController",
      "validateLoginForm",
      Nil,
      "POST",
      this.prefix + """validateForm""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_MarkLewisController_logout17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_MarkLewisController_logout17_invoker = createInvoker(
    MarkLewisController_0.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MarkLewisController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_MarkLewisController_addTask18_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("addTask")))
  )
  private[this] lazy val controllers_MarkLewisController_addTask18_invoker = createInvoker(
    MarkLewisController_0.addTask,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MarkLewisController",
      "addTask",
      Nil,
      "POST",
      this.prefix + """addTask""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_MarkLewisController_deleteTask19_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("deleteTask")))
  )
  private[this] lazy val controllers_MarkLewisController_deleteTask19_invoker = createInvoker(
    MarkLewisController_0.deleteTask,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MarkLewisController",
      "deleteTask",
      Nil,
      "POST",
      this.prefix + """deleteTask""",
      """""",
      Seq()
    )
  )

  // @LINE:29
  private[this] lazy val controllers_MarkLewisController_testAsync20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("testAsync")))
  )
  private[this] lazy val controllers_MarkLewisController_testAsync20_invoker = createInvoker(
    MarkLewisController_0.testAsync,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MarkLewisController",
      "testAsync",
      Nil,
      "GET",
      this.prefix + """testAsync""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_MarkLewisController_delayAsync21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delayAsync")))
  )
  private[this] lazy val controllers_MarkLewisController_delayAsync21_invoker = createInvoker(
    MarkLewisController_0.delayAsync,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.MarkLewisController",
      "delayAsync",
      Nil,
      "GET",
      this.prefix + """delayAsync""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_Assets_versioned22_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned22_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:8
    case controllers_HomeController_explore1_route(params@_) =>
      call { 
        controllers_HomeController_explore1_invoker.call(HomeController_2.explore)
      }
  
    // @LINE:9
    case controllers_HomeController_tutorial2_route(params@_) =>
      call { 
        controllers_HomeController_tutorial2_invoker.call(HomeController_2.tutorial)
      }
  
    // @LINE:10
    case controllers_HomeController_test3_route(params@_) =>
      call(params.fromPath[String]("msg", None), params.fromPath[Int]("times", None)) { (msg, times) =>
        controllers_HomeController_test3_invoker.call(HomeController_2.test(msg, times))
      }
  
    // @LINE:11
    case controllers_HomeController_headers4_route(params@_) =>
      call { 
        controllers_HomeController_headers4_invoker.call(HomeController_2.headers)
      }
  
    // @LINE:12
    case controllers_HomeController_displayInfo5_route(params@_) =>
      call { 
        controllers_HomeController_displayInfo5_invoker.call(HomeController_2.displayInfo)
      }
  
    // @LINE:13
    case controllers_HomeController_TestTwirl6_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_HomeController_TestTwirl6_invoker.call(HomeController_2.TestTwirl(name))
      }
  
    // @LINE:14
    case controllers_HomeController_TestForm7_route(params@_) =>
      call { 
        controllers_HomeController_TestForm7_invoker.call(HomeController_2.TestForm)
      }
  
    // @LINE:15
    case controllers_HomeController_JsonIndex8_route(params@_) =>
      call { 
        controllers_HomeController_JsonIndex8_invoker.call(HomeController_2.JsonIndex)
      }
  
    // @LINE:18
    case controllers_MarkLewisController_TodoIndex9_route(params@_) =>
      call { 
        controllers_MarkLewisController_TodoIndex9_invoker.call(MarkLewisController_0.TodoIndex)
      }
  
    // @LINE:19
    case controllers_MarkLewisController_product10_route(params@_) =>
      call(params.fromPath[String]("prodType", None), params.fromPath[Int]("prodNum", None)) { (prodType, prodNum) =>
        controllers_MarkLewisController_product10_invoker.call(MarkLewisController_0.product(prodType, prodNum))
      }
  
    // @LINE:20
    case controllers_MarkLewisController_product11_route(params@_) =>
      call(params.fromPath[String]("prodType", None), params.fromPath[Int]("prodNum", None)) { (prodType, prodNum) =>
        controllers_MarkLewisController_product11_invoker.call(MarkLewisController_0.product(prodType, prodNum))
      }
  
    // @LINE:21
    case controllers_MarkLewisController_login12_route(params@_) =>
      call { 
        controllers_MarkLewisController_login12_invoker.call(MarkLewisController_0.login)
      }
  
    // @LINE:22
    case controllers_MarkLewisController_validateLoginGet13_route(params@_) =>
      call(params.fromQuery[String]("username", None), params.fromQuery[String]("password", None)) { (username, password) =>
        controllers_MarkLewisController_validateLoginGet13_invoker.call(MarkLewisController_0.validateLoginGet(username, password))
      }
  
    // @LINE:23
    case controllers_MarkLewisController_createUser14_route(params@_) =>
      call { 
        controllers_MarkLewisController_createUser14_invoker.call(MarkLewisController_0.createUser)
      }
  
    // @LINE:24
    case controllers_MarkLewisController_validateLoginPost15_route(params@_) =>
      call { 
        controllers_MarkLewisController_validateLoginPost15_invoker.call(MarkLewisController_0.validateLoginPost)
      }
  
    // @LINE:25
    case controllers_MarkLewisController_validateLoginForm16_route(params@_) =>
      call { 
        controllers_MarkLewisController_validateLoginForm16_invoker.call(MarkLewisController_0.validateLoginForm)
      }
  
    // @LINE:26
    case controllers_MarkLewisController_logout17_route(params@_) =>
      call { 
        controllers_MarkLewisController_logout17_invoker.call(MarkLewisController_0.logout)
      }
  
    // @LINE:27
    case controllers_MarkLewisController_addTask18_route(params@_) =>
      call { 
        controllers_MarkLewisController_addTask18_invoker.call(MarkLewisController_0.addTask)
      }
  
    // @LINE:28
    case controllers_MarkLewisController_deleteTask19_route(params@_) =>
      call { 
        controllers_MarkLewisController_deleteTask19_invoker.call(MarkLewisController_0.deleteTask)
      }
  
    // @LINE:29
    case controllers_MarkLewisController_testAsync20_route(params@_) =>
      call { 
        controllers_MarkLewisController_testAsync20_invoker.call(MarkLewisController_0.testAsync)
      }
  
    // @LINE:30
    case controllers_MarkLewisController_delayAsync21_route(params@_) =>
      call { 
        controllers_MarkLewisController_delayAsync21_invoker.call(MarkLewisController_0.delayAsync)
      }
  
    // @LINE:34
    case controllers_Assets_versioned22_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned22_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
