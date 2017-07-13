package test.util;

import org.apache.commons.lang.StringUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author 王猛
 * @Date 2017/5/1 12:40
 * @Discribe:
 */
public class CookieUtil {


    private static final String SAVEPATH = "/";

    /**
     * 得到cookie值
     *
     * @param request
     * @param name    cookie 名称
     * @return
     */
    public static String getCookie(HttpServletRequest request, String name) {

        if (StringUtils.isNotEmpty(name)) {
            Cookie[] cs = request.getCookies();
            if (cs != null)
                for (Cookie c : cs) {
                    if (name.equals(c.getName())) {
                        return c.getValue();
                    }
                }
        }
        return null;
    }

    /**
     * 添加cookie
     *
     * @param response
     * @param name     cookie 名称
     * @param value    cookie 值
     */
    public static void addCookie(HttpServletResponse response, String name, String value) {
        Cookie cookie = new Cookie(name, value);
        cookie.setPath(SAVEPATH);
        response.addCookie(cookie);
    }

    /**
     * 移除cookie
     *
     * @param response
     * @param name
     */
    public static void removeCookie(HttpServletResponse response, String name) {

        Cookie cookie = new Cookie(name, null);
        cookie.setPath(SAVEPATH);
        cookie.setMaxAge(0);
        response.addCookie(cookie);
    }
}
