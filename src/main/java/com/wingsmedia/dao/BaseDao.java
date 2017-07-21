package com.wingsmedia.dao;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

/**
 * Created by HoaPham on 7/19/17.
 */

public class BaseDao<T> {
  @Autowired
  EntityManager entityManager;

  public void insert(T entity) {
    entityManager.persist(entity);
  }

  public void delete(T entity) {
    entityManager.remove(entity);
  }
}
