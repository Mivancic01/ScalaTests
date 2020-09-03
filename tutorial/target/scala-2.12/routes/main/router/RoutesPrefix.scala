// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Directories/IntelliJ Projects/SbtTest/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Mon Apr 06 10:26:25 CEST 2020


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
