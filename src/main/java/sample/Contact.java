package sample;

import net.karneim.pojobuilder.GeneratePojoBuilder;

@GeneratePojoBuilder
public class Contact {
  public String name;

  @Override
  public String toString() {
    return "Contact [name=" + name + "]";
  }
}
