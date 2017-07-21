package com.wingsmedia.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by HoaPham on 7/19/17.
 */

@Entity
@Table(name = "phrase")
public class Phrase extends BaseEntity {
  @Column(name = "name",nullable = false)
  private String name;
  @Column(name = "en_meaning")
  private String enMeaning;

  @Column(name = "vi_meaning")
  private String viMeaning;
  @Column(name = "en_example")
  private String enExample;
  @Column(name = "vi_ex_meaning")
  private String viExMeaning;

  public Phrase() {
  }

  public String getName() {
    return name;
  }

  public Phrase setName(String name) {
    this.name = name;
    return this;
  }

  public String getEnMeaning() {
    return enMeaning;
  }

  public Phrase setEnMeaning(String enMeaning) {
    this.enMeaning = enMeaning;
    return this;
  }

  public String getViMeaning() {
    return viMeaning;
  }

  public Phrase setViMeaning(String viMeaning) {
    this.viMeaning = viMeaning;
    return this;
  }

  public String getEnExample() {
    return enExample;
  }

  public Phrase setEnExample(String enExample) {
    this.enExample = enExample;
    return this;
  }

  public String getViExMeaning() {
    return viExMeaning;
  }

  public Phrase setViExMeaning(String viExMeaning) {
    this.viExMeaning = viExMeaning;
    return this;
  }
}
