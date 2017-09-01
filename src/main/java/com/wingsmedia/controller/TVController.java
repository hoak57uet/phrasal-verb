package com.wingsmedia.controller;

import com.wingsmedia.dto.CategoryDTO;
import com.wingsmedia.dto.ChannelDTO;
import com.wingsmedia.dto.ResponseDTO;
import com.wingsmedia.service.ITvService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by HoaPham on 8/16/17.
 */

@RestController
@RequestMapping("/channels")
public class TVController {
  @Autowired
  ITvService tvService;

  @RequestMapping("/list")
  ResponseDTO<List<ChannelDTO>> listChannel() {
    return new ResponseDTO<>(tvService.getAllChannels());
  }

  @RequestMapping("/create")
  ResponseDTO createChannel(
      @RequestParam("name") String name,
      @RequestParam("icon") MultipartFile icon,
      @RequestParam("link") String link) {

    return new ResponseDTO();
  }

  @RequestMapping("/import")
  ResponseDTO importChannel() {
    tvService.importChannel();
    return new ResponseDTO();
  }

  @RequestMapping("/")
  ResponseDTO<List<CategoryDTO>> allCategory() {
    return new ResponseDTO<>(tvService.allCategory());
  }
}
