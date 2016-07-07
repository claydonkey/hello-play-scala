package controllers

import javax.inject.{Singleton, Inject}
import play.api._
import play.api.mvc._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

@Singleton
class Application @Inject()(implicit webJarAssets: WebJarAssets)
  extends Controller   {


  def index = Action {
    Ok(views.html.index("Hello Play Framework","Welcome to Play Framework")(webJarAssets))
  }
}