package com.wingsmedia.service;

import com.wingsmedia.dto.PhraseDTO;

import java.util.List;

/**
 * Created by HoaPham on 7/19/17.
 */

public interface IPhraseService {

  PhraseDTO createPhrase(String name, String enMeaning, String viMeaning, String enExample, String viExample);

  List<PhraseDTO> listPhrases(String searchStr, Integer page, Integer pageSize);
}
