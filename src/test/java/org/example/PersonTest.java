package org.example;

import org.junit.Assert;
import org.junit.Test;

/** */
public class PersonTest
{
  /** */
  @Test
  public void testCreate()
  {
    final Address home = Address.create("2091", "Kensington Tower", "Manilla Street", "Canary Wharf", "London", "London", "United Kingdom");

    final Person john = Person.create("John", home);
    Assert.assertEquals("John", john.name());
    Assert.assertNotNull(john.address());
    Assert.assertEquals("2091", john.address().house());
    Assert.assertEquals("Kensington Tower", john.address().building());
  }
}
