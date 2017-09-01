package com.wingsmedia.service;

import com.wingsmedia.constant.Constants;
import com.wingsmedia.dao.MetaDao;
import com.wingsmedia.dto.MenuDTO;
import com.wingsmedia.dto.MetaDTO;
import com.wingsmedia.entity.ActiveStatus;
import com.wingsmedia.entity.FacebookToken;
import com.wingsmedia.entity.MenuItem;
import com.wingsmedia.utils.MapUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import javax.transaction.Transactional;

/**
 * Created by HoaPham on 7/31/17.
 */

@Service
@Transactional
public class MetaService implements IMetaService {
  @Autowired
  MetaDao metaDao;

  @Override
  public MetaDTO getMetaData() {
    List<MenuItem> menuItems = metaDao.getMenu();
    List<MenuDTO> menuDTOS = MapUtils.mapList(menuItems, MenuDTO.class);
    MetaDTO metaDTO = new MetaDTO()
        .setMenuDTOs(menuDTOS)
        .setDefaultMenu(0)
        .setFbToken(Constants.facebookToken);
    return metaDTO;
  }

  @Override
  public FacebookToken getFacebookToken() {
    return metaDao.getFacebookToken();
  }

  @Override
  public void createToken(String token) {
    metaDao.createfbToken(token);
  }

  @Override
  public ActiveStatus getActive(String app) {
    return metaDao.getActive(app);
  }
}
