package com.ghaien.pattern.builder.game;

/**
 * 游戏账号
 *
 * @author guo.haien
 * @date 2019/3/5 13:23
 */
public class GameAccount {

    private String type;

    private String areaCode;

    private String nickname;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "账号信息：\n" +
                type + "\n" +
                areaCode + "\n" +
                nickname;
    }
}
