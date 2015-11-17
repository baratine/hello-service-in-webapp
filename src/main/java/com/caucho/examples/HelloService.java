package com.caucho.examples;

import io.baratine.core.Result;

public interface HelloService
{
  void hello(String arg, Result<String> result);
}
