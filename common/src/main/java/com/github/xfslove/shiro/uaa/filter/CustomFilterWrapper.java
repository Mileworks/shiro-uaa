package com.github.xfslove.shiro.uaa.filter;

import javax.servlet.Filter;

/**
 * Created by hanwen on 2017/10/10.
 */
public interface CustomFilterWrapper {

  Filter getFilter();

  String getName();
}
