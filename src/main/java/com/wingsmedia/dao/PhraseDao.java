package com.wingsmedia.dao;

import com.wingsmedia.entity.Phrase;

import org.springframework.stereotype.Repository;

import java.util.List;

import javax.persistence.Query;

/**
 * Created by HoaPham on 7/19/17.
 */
@Repository
public class PhraseDao extends BaseDao<Phrase> {

  public List<Phrase> findAll(String searchStr, Integer page, Integer pageSize) {
    String sql = "Select p from Phrase as p";
    Query query = entityManager.createQuery(sql);
    return query.getResultList();
  }
}
