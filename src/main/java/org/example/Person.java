package org.example;

import com.google.auto.value.AutoValue;

/** */
@AutoValue
public abstract class Person
{
  /** */
  Person()
  {
  }

  /** */
  public static Person create(final String name, final Address address)
  {
    return new AutoValue_Person(name, address);
  }

  /** */
  abstract String name();

  /** */
  abstract Address address();
}
