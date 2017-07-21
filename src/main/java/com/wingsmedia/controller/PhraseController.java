package com.wingsmedia.controller;

import com.wingsmedia.dto.PhraseDTO;
import com.wingsmedia.dto.ResponseDTO;
import com.wingsmedia.entity.Phrase;
import com.wingsmedia.service.IPhraseService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by HoaPham on 7/19/17.
 */

@RestController
@RequestMapping("/phrase")
public class PhraseController {
  @Autowired
  IPhraseService phraseService;

  @RequestMapping(value = "/create", method = RequestMethod.POST)
  ResponseDTO<PhraseDTO> createPhrase(@RequestParam("name") String name,
                                      @RequestParam("enMeaning") String enMeaning,
                                      @RequestParam("viMeaning") String viMeaning,
                                      @RequestParam("enExample") String enExample,
                                      @RequestParam("viExample") String viExample) {
    return new ResponseDTO<PhraseDTO>(phraseService.createPhrase(name, enMeaning, viMeaning, enExample, viExample));
  }

  @RequestMapping(value = "/list", method = RequestMethod.GET)
  ResponseDTO<List<PhraseDTO>> listPhrase(@RequestParam(value = "searchStr", required = false) String searchStr,
                                          @RequestParam(value = "page", required = false) Integer page,
                                          @RequestParam(value = "pageSize", required = false) Integer pageSize) {
    return new ResponseDTO<List<PhraseDTO>>(phraseService.listPhrases(searchStr, page, pageSize));
  }

  @RequestMapping(value = "/create.html", method = RequestMethod.GET)
  ModelAndView pageCreatePhrase() {
    return new ModelAndView("create-phrase");
  }
}
