// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Directories/EssentialPlay Test Programs/ScalaTests/play-samples-play-scala-hello-world-tutorial/conf/routes
// @DATE:Sun Feb 02 00:43:06 CET 2020

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseMarkLewisController MarkLewisController = new controllers.ReverseMarkLewisController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseMarkLewisController MarkLewisController = new controllers.javascript.ReverseMarkLewisController(RoutesPrefix.byNamePrefix());
  }

}
