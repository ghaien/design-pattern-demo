package com.ghaien.pattern.builder.game;

/**
 * 游戏账户创建者
 *
 * @author guo.haien
 * @date 2019/3/5 13:26
 */
public interface AccountBuilder {
    /**
     * 选择账号类型
     */
    void chooseType();

    /**
     * 选择区号
     */
    void chooseAreaCode();

    /**
     * 填写昵称
     */
    void fillNickname();

    /**
     * 获取账号对象
     *
     * @return 账号对象
     */
    GameAccount getGameAccount();
}
