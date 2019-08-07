package com.test.sys_zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

/**
 * zuul自定义路由过滤器
 */
@Component
public class MyZuulFilter extends ZuulFilter {
    @Override
    public String filterType() {
        System.out.println("myZuulFilter : filterType");
        return "post";
    }

    @Override
    public int filterOrder() {
        System.out.println("myZuulFilter : filterOrder");
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        System.out.println("myZuulFilter : shouldFilter");
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("myZuulFilter : run");

        RequestContext context = RequestContext.getCurrentContext();

        return null;
    }
}
