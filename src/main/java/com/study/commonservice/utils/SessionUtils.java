package com.study.commonservice.utils;

import com.study.commonservice.interfaces.SessionUser;

public class SessionUtils {
    private static ThreadLocal<SessionUser> map = new ThreadLocal<SessionUser>();


    public static SessionUser getUserInfo() {
        SessionUser sesssionUserVO = map.get();
        return sesssionUserVO;
    }

    public static void setUserInfo(SessionUser vo) {
        map.set(vo);

    }
}
