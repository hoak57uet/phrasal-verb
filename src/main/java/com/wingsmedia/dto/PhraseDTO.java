package com.wingsmedia.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by HoaPham on 7/19/17.
 */

public class PhraseDTO extends BaseDTO {
  @JsonProperty("name")
  private String name;
  @JsonProperty("en_meaning")
  private String enMeaning;

  @JsonProperty("vi_meaning")
  private String viMeaning;
  @JsonProperty("en_example")
  private String enExample;
  @JsonProperty("vi_ex_meaning")
  private String viExMeaning;

  public PhraseDTO() {
  }

  public String getName() {
    return name;
  }

  public PhraseDTO setName(String name) {
    this.name = name;
    return this;
  }

  public String getEnMeaning() {
    return enMeaning;
  }

  public PhraseDTO setEnMeaning(String enMeaning) {
    this.enMeaning = enMeaning;
    return this;
  }

  public String getViMeaning() {
    return viMeaning;
  }

  public PhraseDTO setViMeaning(String viMeaning) {
    this.viMeaning = viMeaning;
    return this;
  }

  public String getEnExample() {
    return enExample;
  }

  public PhraseDTO setEnExample(String enExample) {
    this.enExample = enExample;
    return this;
  }

  public String getViExMeaning() {
    return viExMeaning;
  }

  public PhraseDTO setViExMeaning(String viExMeaning) {
    this.viExMeaning = viExMeaning;
    return this;
  }
}
