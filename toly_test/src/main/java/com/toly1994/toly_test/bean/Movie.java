package com.toly1994.toly_test.bean;

/**
 * 作者：张风捷特烈<br/>
 * 时间：2018/12/6 0006:21:46<br/>
 * 邮箱：1981462002@qq.com<br/>
 * 说明：
 */
public class Movie {
    private String name;
    private String imgUrl;
    private String star;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }

    public Movie() {
    }

    public Movie(String name, String imgUrl, String star) {
        this.name = name;
        this.imgUrl = imgUrl;
        this.star = star;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", imgUrl='" + imgUrl + '\'' +
                ", star='" + star + '\'' +
                '}';
    }
}
