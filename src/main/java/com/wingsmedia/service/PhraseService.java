package com.wingsmedia.service;

import com.wingsmedia.dao.PhraseDao;
import com.wingsmedia.dto.PhraseDTO;
import com.wingsmedia.entity.Phrase;
import com.wingsmedia.utils.MapUtils;

import org.apache.commons.lang3.StringUtils;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;

/**
 * Created by HoaPham on 7/19/17.
 */

@Service
@Transactional
public class PhraseService implements IPhraseService {
  @Autowired
  PhraseDao phraseDao;
  @Autowired
  Mapper mapper;

  @Override
  public PhraseDTO createPhrase(String name, String enMeaning, String viMeaning, String enExample, String viExample) {
    Phrase phrase = new Phrase().setName(StringUtils.trim(name))
        .setEnMeaning(enMeaning)
        .setViMeaning(viMeaning)
        .setEnExample(enExample)
        .setViExMeaning(viExample);
    phraseDao.insert(phrase);
    return mapper.map(phrase, PhraseDTO.class);
  }

  @Override
  public List<PhraseDTO> listPhrases(String searchStr, Integer page, Integer pageSize) {
    List<Phrase> phrases = phraseDao.findAll(searchStr, page, pageSize);
    return MapUtils.mapList(phrases, PhraseDTO.class);
  }
}
