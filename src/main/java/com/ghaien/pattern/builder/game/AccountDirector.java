package com.ghaien.pattern.builder.game;

/**
 * 账号创建指挥者
 *
 * @author guo.haien
 * @date 2019/3/5 13:42
 */
public class AccountDirector {
    /**
     * 创建账号
     *
     * @param accountBuilder 账号创建者
     */
    public void createAccount(AccountBuilder accountBuilder) {
        accountBuilder.chooseType();
        accountBuilder.chooseAreaCode();
        accountBuilder.fillNickname();
    }
}
