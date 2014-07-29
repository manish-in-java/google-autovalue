package org.example;

import org.junit.Assert;
import org.junit.Test;

/** */
public class PointTest
{
  /** */
  @Test
  public void testOf()
  {
    final Point point = Point.of(Math.random(), Math.random());

    Assert.assertNotNull(point);
    Assert.assertNotEquals(0, point.x());
    Assert.assertNotEquals(0, point.y());
  }
}
