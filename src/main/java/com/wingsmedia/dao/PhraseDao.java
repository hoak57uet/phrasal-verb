package com.wingsmedia.dao;

import com.wingsmedia.entity.Phrase;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Repository;

import java.util.List;

import javax.persistence.Query;

/**
 * Created by HoaPham on 7/19/17.
 */
@Repository
public class PhraseDao extends BaseDao<Phrase> {

  public List<Phrase> findAll(String searchStr, Integer page, Integer pageSize) {
    if (searchStr == null)
      searchStr = "";
    if (page == null)
      page = 0;
    searchStr = StringUtils.trim(searchStr).toLowerCase();
    String sql = "Select p from Phrase as p where lower(p.name) like :searchKey";
    Query query = entityManager.createQuery(sql)
        .setParameter("searchKey", '%' + searchStr + '%')
        .setFirstResult(pageSize == null ? 0 : page * pageSize);
    if (pageSize != null)
      query.setMaxResults(pageSize);
    return query.getResultList();
  }

  public Phrase findPhraseByName(String name) {
    name = StringUtils.trim(name).toLowerCase();
    String sql = "Select p from Phrase as p where lower(p.name) = :name";
    Query query = entityManager.createQuery(sql).setParameter("name", name);
    try {
      return (Phrase) query.getResultList().get(0);
    } catch (Exception e) {
      return null;
    }
  }

  public boolean isExistPhrase(String name) {
    return findPhraseByName(name) != null;
  }
}
