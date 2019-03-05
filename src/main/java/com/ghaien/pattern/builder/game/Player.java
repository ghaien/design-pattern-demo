package com.ghaien.pattern.builder.game;

/**
 * 客户端
 *
 * @author guo.haien
 * @date 2019/3/5 13:43
 */
public class Player {

    public static void main(String[] args) {
        AccountDirector director = new AccountDirector();
        AccountBuilder builderA = new AccountBuilderA();
        director.createAccount(builderA);
        System.out.println(builderA.getGameAccount());
        System.out.println("-------------");
        AccountBuilder builderB = new AccountBuilderB();
        director.createAccount(builderB);
        System.out.println(builderB.getGameAccount());
        /*输出
        账号信息：
        类型：微信
        区号：47区
        昵称：打野送人头
        -------------
        账号信息：
        类型：QQ
        区号：49区
        昵称：辅助抢人头
         */
    }
}
