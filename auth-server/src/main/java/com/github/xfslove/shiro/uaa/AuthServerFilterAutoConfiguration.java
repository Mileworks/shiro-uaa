package com.github.xfslove.shiro.uaa;

import com.github.xfslove.shiro.uaa.filter.AuthServerFilterChainDefinition;
import com.github.xfslove.shiro.uaa.filter.CustomFilterChainDefinition;
import org.apache.shiro.realm.Realm;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;

/**
 * Created by hanwen on 2017/9/21.
 */
@AutoConfigureBefore({ShiroFilterAutoConfiguration.class, ShiroAutoConfiguration.class})
@ConditionalOnClass(Realm.class)
public class AuthServerFilterAutoConfiguration {

//  @Bean
//  protected CustomFilterWrapper oauth2ServerFilter(ApplicationContext applicationContext) {
//    AuthServerFilterWrapper oAuth2ServerFilterWrapper = new AuthServerFilterWrapper();
//    oAuth2ServerFilterWrapper.setAccessTokenService(applicationContext.getBean(AccessTokenService.class));
//    return oAuth2ServerFilterWrapper;
//  }

  @Bean
  public CustomFilterChainDefinition oauth2ServerFilterChain() {
    return new AuthServerFilterChainDefinition();
  }
}
