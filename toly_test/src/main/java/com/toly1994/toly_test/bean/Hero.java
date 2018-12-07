package com.toly1994.toly_test.bean;

/**
 * 作者：张风捷特烈<br/>
 * 时间：2018/12/6 0006:16:39<br/>
 * 邮箱：1981462002@qq.com<br/>
 * 说明：
 */
public class Hero {
    private String star;
    private String nickName;
    private String name;

    public Hero(String star, String nickName, String name) {
        this.star = star;
        this.nickName = nickName;
        this.name = name;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "star='" + star + '\'' +
                ", nickName='" + nickName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
