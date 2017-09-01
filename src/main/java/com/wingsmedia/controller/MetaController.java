package com.wingsmedia.controller;

import com.wingsmedia.dto.MetaDTO;
import com.wingsmedia.dto.ResponseDTO;
import com.wingsmedia.entity.ActiveStatus;
import com.wingsmedia.entity.FacebookToken;
import com.wingsmedia.service.IMetaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HoaPham on 7/31/17.
 */

@RestController
@RequestMapping("/meta")
public class MetaController {
  @Autowired
  IMetaService metaService;

  @RequestMapping(value = "/listMenu", method = RequestMethod.GET)
  public ResponseDTO<MetaDTO> getMetaData() {
    return new ResponseDTO<>(metaService.getMetaData());
  }

  @RequestMapping(value = "/facebook-token", method = RequestMethod.GET)
  public ResponseDTO<FacebookToken> getFacebookToken() {
    return new ResponseDTO<>(metaService.getFacebookToken());
  }

  @RequestMapping(value = "/facebook-token", method = RequestMethod.POST)
  public ResponseDTO createFacebookToken(@RequestParam("token") String token) {
    metaService.createToken(token);
    return new ResponseDTO("Success");
  }

  @RequestMapping(value = "/active", method = RequestMethod.GET)
  public ResponseDTO<Boolean> checkActive(@RequestParam("app") String app) {
    ActiveStatus activeStatus = metaService.getActive(app);
    if (activeStatus == null)
      return new ResponseDTO<>(true);
    return new ResponseDTO<>(activeStatus.getActive());
  }
}
