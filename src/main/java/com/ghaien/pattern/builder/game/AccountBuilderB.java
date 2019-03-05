package com.ghaien.pattern.builder.game;

/**
 * 账号B构建者
 *
 * @author guo.haien
 * @date 2019/3/5 13:33
 */
public class AccountBuilderB implements AccountBuilder {

    private GameAccount gameAccount = new GameAccount();

    @Override
    public void chooseType() {
        gameAccount.setType("类型：QQ");
    }

    @Override
    public void chooseAreaCode() {
        gameAccount.setAreaCode("区号：49区");
    }

    @Override
    public void fillNickname() {
        gameAccount.setNickname("昵称：辅助抢人头");
    }

    @Override
    public GameAccount getGameAccount() {
        return gameAccount;
    }
}
