import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport._
import akka.http.scaladsl.server.Directives._
import akka.stream.ActorMaterializer
import spray.json.DefaultJsonProtocol._
import scala.collection.JavaConverters._
object httpakka {

  implicit val actorSystem = ActorSystem("rest-api")

  implicit val actorMaterializer = ActorMaterializer()

  val route =
    path("greet"/Segment) {
      name =>
        get {
          val greeting = "Hello Hai: " + name
          complete {
            greeting
          }
        }
    }~
      path("health") {
        get {
          complete(StatusCodes.OK)
        }
      }

  def main(args: Array[String]) {


    Http().bindAndHandle(route, "0.0.0.0", 8080)
  }
}
