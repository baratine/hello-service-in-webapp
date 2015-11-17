package com.caucho.examples;

import io.baratine.core.ResultFuture;
import io.baratine.core.ServiceManager;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Class shows how to invoke the service using java code
 */
public class TestServlet extends HttpServlet
{
  @Override
  protected void service(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException
  {
    ServiceManager serviceManager = ServiceManager.current();

    HelloService service
      = serviceManager.lookup("/hello").as(HelloService.class);

    ResultFuture<String> result = new ResultFuture();

    service.hello("World", result);

    res.getWriter().println(result.get());
  }
}
