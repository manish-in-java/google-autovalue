package org.example;

import com.google.auto.value.AutoValue;

/** */
@AutoValue
public abstract class Address
{
  /** */
  Address()
  {
  }

  public static Address create(final String house, final String building, final String street,
      final String locality, final String city, final String province, final String country)
  {
    return new AutoValue_Address(house, building, street, locality, city, province, country);
  }

  /** */
  abstract String house();

  /** */
  abstract String building();

  /** */
  abstract String street();

  /** */
  abstract String locality();

  /** */
  abstract String city();

  /** */
  abstract String province();

  /** */
  abstract String country();
}
