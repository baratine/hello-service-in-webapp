package com.caucho.examples;

import io.baratine.core.Service;

/**
 * The service is deployed into web app context and is available for rest calls
 * via curl 'http://localhost{:port}/{context}/jamp/hello?m=hello&p0=World'
 *
 * e.g. curl 'http://localhost:8080/hello/jamp/hello?m=hello&p0=World'
 */
@Service("public:///hello")
public class HelloServiceImpl
{
  public String hello(String arg)
  {
    return "Hello " + arg;
  }
}
