package com.ntyl.retiresCadres.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "RetiredCadres", description = "RetiredCadres")//对类进行swagger注解
public class RetiredCadres {
    @ApiModelProperty(value = "身份证号", name = "identityId")//对类的字段属性进行swagger注解
    private String identityId;

    @ApiModelProperty(value = "名字", name = "name")
    private String name;

    @ApiModelProperty(value = "年龄", name = "age")
    private int age;

    @ApiModelProperty(value = "户籍所在地", name = "nativePlace")
    private String nativePlace;

    @ApiModelProperty(value = "出生年月日", name = "birthday")
    private String birthday;

    @ApiModelProperty(value = "性别", name = "gender")
    private String gender;


    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    @Override
    public String toString() {
        return "RetiredCadres{" +
                "identityId=" + identityId +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", nativePlace='" + nativePlace + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
