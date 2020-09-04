import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.testkit.ScalatestRouteTest
import org.scalatest.{Matchers, WordSpec}

class Test1 extends WordSpec with Matchers with ScalatestRouteTest {

  import httpakka.route

  "Task1" should {
    "return greeting the name with Hello Hai: supplied" in {
      Get("/greet/Sandeep") ~> route ~> check {
        status shouldBe StatusCodes.OK
        entityAs[String] shouldBe "Hello Hai: Sandeep"
      }
    }
    "return ok status " in {
      Get("/health") ~> route ~> check {
        status shouldBe StatusCodes.OK
        entityAs[String] shouldBe "OK"
      }
    }
  }
}
