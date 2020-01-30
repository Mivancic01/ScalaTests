
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object helloWorld extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(name: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.16*/("""
"""),format.raw/*2.1*/("""<html>
<head>
    <title>Hello """),_display_(/*4.19*/name),format.raw/*4.23*/("""</title>
</head>
<body>
<p>Hello there, """),_display_(/*7.18*/name/*7.22*/.toUpperCase),format.raw/*7.34*/("""!</p>
</body>
</html>"""))
      }
    }
  }

  def render(name:String): play.twirl.api.HtmlFormat.Appendable = apply(name)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (name) => apply(name)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2020-01-30T14:36:17.525981
                  SOURCE: D:/Directories/EssentialPlay Test Programs/ScalaTests/play-samples-play-scala-hello-world-tutorial/app/views/helloWorld.scala.html
                  HASH: 7cbbb16c545b0d6c57da1a6af6a5ce04620465e0
                  MATRIX: 734->1|843->15|871->17|931->51|955->55|1025->99|1037->103|1069->115
                  LINES: 21->1|26->1|27->2|29->4|29->4|32->7|32->7|32->7
                  -- GENERATED --
              */
          