package com.wingsmedia.dao;

import com.wingsmedia.entity.mytv.Channel;
import com.wingsmedia.entity.mytv.TVCategory;

import org.springframework.stereotype.Repository;

import java.util.List;

import javax.persistence.Query;


/**
 * Created by HoaPham on 8/16/17.
 */

@Repository
public class TvDao extends BaseDao<Channel> {

  public List<Channel> findAll() {
    String sql = "Select c from Chanxnel c where c.isDie is null or  c.isDie = false order by c.orderIdx";
    Query query = entityManager.createQuery(sql);
    return query.getResultList();
  }

  public List<TVCategory> findAllCategories() {
    String sql = "Select c from TVCategory c where c.isActive = true order by c.orderId";
    Query query = entityManager.createQuery(sql);
    return query.getResultList();
  }
}
