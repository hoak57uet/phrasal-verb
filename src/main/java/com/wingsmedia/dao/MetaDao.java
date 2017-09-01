package com.wingsmedia.dao;

import com.wingsmedia.constant.Constants;
import com.wingsmedia.entity.ActiveStatus;
import com.wingsmedia.entity.FacebookToken;
import com.wingsmedia.entity.MenuItem;

import org.springframework.stereotype.Repository;

import java.util.List;

import javax.persistence.Query;


/**
 * Created by HoaPham on 7/31/17.
 */

@Repository
public class MetaDao extends BaseDao<MenuItem> {
  public List<MenuItem> getMenu() {
    String sql = "Select m from MenuItem m";
    Query query = entityManager.createQuery(sql);
    return query.getResultList();
  }

  public FacebookToken getFacebookToken() {
    String sql = "select f from FacebookToken f";
    Query query = entityManager.createQuery(sql);
    try {
      return (FacebookToken) query.getResultList().get(0);
    } catch (Exception e) {
      return null;
    }
  }

  public void createfbToken(String t) {
    FacebookToken token = new FacebookToken().setToken(Constants.facebookToken);
    entityManager.persist(token);

  }

  public ActiveStatus getActive(String app) {
    String sql = "select a from ActiveStatus a where a.app =:app";
    Query query = entityManager.createQuery(sql).setParameter("app", app);
    try {
      return (ActiveStatus) query.getResultList().get(0);
    } catch (Exception e) {
      return null;
    }
  }
}
