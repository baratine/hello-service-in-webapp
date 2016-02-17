package com.caucho.examples;

import io.baratine.service.Result;
import io.baratine.service.Service;
import io.baratine.web.http.Get;
import io.baratine.web.http.Query;
import static io.baratine.web.Web.include;
import static io.baratine.web.Web.property;

/**
 * Run main and navigate to http://localhost:8080/index.html
 */

public class Main
{
  public static void main(String[] args)
  {
    property("server.file", "classpath:/html");

    include(Hello.class).start();
  }

  @Service("public:///hello")
  public static class Hello
  {
    @Get
    public void hello(@Query("q") String value, Result<String> result)
    {
      result.ok("hello " + value + " !");
    }
  }
}
