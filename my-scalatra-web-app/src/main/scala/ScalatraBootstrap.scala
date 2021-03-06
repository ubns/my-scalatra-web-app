import com.example.app._
import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    context.mount(new ExScalatraServlet, "/articles/*")
    context.mount(new MyScalatraServlet, "/*");
    context.mount(new AuthServlet, "/auth/*");
  }
}
