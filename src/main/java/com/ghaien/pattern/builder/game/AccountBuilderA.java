package com.ghaien.pattern.builder.game;

/**
 * 账号A构建者
 *
 * @author guo.haien
 * @date 2019/3/5 13:30
 */
public class AccountBuilderA implements AccountBuilder {

    private GameAccount gameAccount = new GameAccount();

    @Override
    public void chooseType() {
        gameAccount.setType("类型：微信");
    }

    @Override
    public void chooseAreaCode() {
        gameAccount.setAreaCode("区号：47区");
    }

    @Override
    public void fillNickname() {
        gameAccount.setNickname("昵称：打野送人头");
    }

    @Override
    public GameAccount getGameAccount() {
        return gameAccount;
    }
}
