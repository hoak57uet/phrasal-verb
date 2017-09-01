package com.wingsmedia.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by HoaPham on 8/1/17.
 */

@Entity
@Table(name = "idiom")
public class Idiom extends BaseEntity {
  private String name;
  private String enMeaning;
  private String viMeaning;

  public String getName() {
    return name;
  }

  public Idiom setName(String name) {
    this.name = name;
    return this;
  }

  public String getEnMeaning() {
    return enMeaning;
  }

  public Idiom setEnMeaning(String enMeaning) {
    this.enMeaning = enMeaning;
    return this;
  }

  public String getViMeaning() {
    return viMeaning;
  }

  public Idiom setViMeaning(String viMeaning) {
    this.viMeaning = viMeaning;
    return this;
  }
}
