// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/hajime/pol/hajime_github/play/playapp/conf/routes
// @DATE:Mon Jul 01 08:08:05 JST 2019


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
