package com.lotus.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
@Slf4j
public class BeforFilter extends ZuulFilter {

    @Override
    public String filterType() {
        // 包含四种字符串类型的：
        // pre：路由之前
        //routing：路由之时
        //post： 路由之后
        //error：发送错误调用
        return "pre";
    }

    @Override
    public int filterOrder() {
        // 过滤排序
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        // 是否开启过滤
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        // 最主要的过滤 逻辑
        log.info("开始鉴权....");
        RequestContext rc = RequestContext.getCurrentContext();
        // 和普通拦截器不同的是：最后返回null表示通过，而拦截器需要返回true,false来表达
        HttpServletRequest request = rc.getRequest();
        System.out.printf("请求方法%s", request.getMethod());
        System.out.printf("请求地址来自：%s", request.getRemoteHost());
        String token = request.getHeader("Authorization");
        if (StringUtils.isEmpty(token)) {
            rc.setSendZuulResponse(false);// 不转发
            rc.setResponseStatusCode(400);// 返回错误码400
            try {
                rc.getResponse().getWriter().write("token is empty");// 返回消息
            } catch (Exception e) {

            }
            return null;
        }
        log.info("鉴权通过");
        return null;
    }
}
