package com.funtl.myshop.plus.provider.api;

import com.funtl.myshop.plus.provider.domain.UmsAdmin;

/**
 * 用户管理服务
 * <p>
 * Description:
 * </p>
 *
 * @author Lusifer
 * @version v1.0.0
 * @date 2019-07-26 09:32:31
 * @see com.funtl.myshop.plus.provider.api
 *
 */
public interface UmsAdminService {

    /**
     * 新增用户
     * @param umsAdmin {@link UmsAdmin}
     * @return 大于 0 则表示添加成功
     */
    int insert(UmsAdmin umsAdmin);

    /**
     * 获取用户
     * @param username 用户名
     * @return {@link UmsAdmin}
     */
    UmsAdmin get(String username);

    /**
     * 获取用户
     * @param umsAdmin {@link UmsAdmin}
     * @return {@link UmsAdmin}
     */
    UmsAdmin get(UmsAdmin umsAdmin);

}
