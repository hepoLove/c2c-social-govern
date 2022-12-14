package com.hepo.c2c.social.govern.mall.utils;

/**
 * redis key的变量
 *
 * @author linhaibo
 */
public class RedisConstants {

    public static final String LOGIN_CODE_KEY = "login:code:";

    public static final Long LOGIN_CODE_TTL = 30L;


    public static final String LOGIN_USER_KEY = "login:token:";

    public static final Long LOGIN_USER_TTL = 30L;

    public static final String USER_INFO_KEY = "user:info:";

    public static final Long USER_INFO_TTL = 1L;


    public static final String USER_SIGN_KEY = "user:sign:";

    public static final String CACHE_SHOP_KEY = "cache:shop:";

    public static final Long CACHE_SHOP_TTL = 3L;

    public static final Long CACHE_NULL_TTL = 2L;

    /**
     * 店铺分布式锁key
     */
    public static final String LOCK_SHOP_KEY = "lock:shop:";

    public static final String SECKILL_STOCK_KEY = "seckill:stock:";

    public static final String CREATE_ORDER_KEY = "create:order:";

    public static final Long CREATE_ORDER_TTL = 1L;

    public static final String LOCK_ORDER_KEY = "lock:order:";

    public static final String BLOG_LIKE_KEY = "blog:like:";

    public static final String BLOG_FEED_KEY = "blog:feed:";
    public static final String FOLLOWS_USER_KEY = "follows:user:";
    public static final String SHOP_GEO_KEY = "shop:geo:";
}
