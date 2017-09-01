package com.wingsmedia.service;

import com.wingsmedia.dto.MetaDTO;
import com.wingsmedia.entity.ActiveStatus;
import com.wingsmedia.entity.FacebookToken;

/**
 * Created by HoaPham on 7/31/17.
 */

public interface IMetaService {

  MetaDTO getMetaData();

  FacebookToken getFacebookToken();

  void createToken(String token);

  ActiveStatus getActive(String app);
}
