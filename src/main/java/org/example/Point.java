package org.example;

import com.google.auto.value.AutoValue;

/** */
@AutoValue
public abstract class Point
{
  /** */
  Point()
  {
  }

  /** */
  public static Point of(double x, double y)
  {
    return new AutoValue_Point(x, y);
  }

  /** */
  abstract Double x();

  /** */
  abstract Double y();
}
