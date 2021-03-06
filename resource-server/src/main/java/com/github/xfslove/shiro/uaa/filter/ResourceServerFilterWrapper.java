package com.github.xfslove.shiro.uaa.filter;

import javax.servlet.Filter;

/**
 * Created by hanwen on 2017/10/10.
 */
public class ResourceServerFilterWrapper implements CustomFilterWrapper {

  private String serverScheme;

  private String serverHost;

  private int serverPort;

  private String serverContextPath;

  private String clientId;

  private String clientSecret;

  @Override
  public Filter getFilter() {
    ResourceServerFilter filter = new ResourceServerFilter();
    filter.setServerScheme(serverScheme);
    filter.setServerHost(serverHost);
    filter.setServerPort(serverPort);
    filter.setServerContextPath(serverContextPath);
    filter.setClientId(clientId);
    filter.setClientSecret(clientSecret);
    return filter;
  }

  @Override
  public String getName() {
    return "resource-server";
  }

  public void setServerScheme(String serverScheme) {
    this.serverScheme = serverScheme;
  }

  public void setServerHost(String serverHost) {
    this.serverHost = serverHost;
  }

  public void setServerPort(int serverPort) {
    this.serverPort = serverPort;
  }

  public void setServerContextPath(String serverContextPath) {
    this.serverContextPath = serverContextPath;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }
}
