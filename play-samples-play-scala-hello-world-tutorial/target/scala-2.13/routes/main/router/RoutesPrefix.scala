// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Directories/EssentialPlay Test Programs/ScalaTests/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Sun Feb 02 00:43:06 CET 2020


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
