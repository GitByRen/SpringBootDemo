package com.example.bean;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ConfigurationProperties:告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定
 * prefix="person"：配置文件中哪个下面的所有属性进行一一映射，默认从全局配置文件读取
 * 
 * 这个组件必须是容器中的组件，才能提供功能
 * 
 * @PropertySource:加载指定的配置文件
 */

//@PropertySource(value= {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
public class Person {

    /**
     * @Value("${person.last-name}"),@Value("#{22}"),需要一个一个配置，麻烦
     * @Value注解不支持JSR303数据校验,@ConfigurationProperties支持
     * @ConfigurationProperties不支持SPEL,@Value支持
     * @ConfigurationProperties支持复杂封装，@Value不支持
     */
    private String              lastName;
    private Integer             age;
    private Boolean             boss;
    private Date                birth;

//    @Value("person.maps")  启动报错，不支持复杂封装
    private Map<String, Object> maps;
    private List<Object>        lists;
    private Dog                 dog;

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Person [lastName=" + lastName + ", age=" + age + ", boss=" + boss + ", birth=" + birth + ", maps="
               + maps + ", lists=" + lists + ", dog=" + dog + "]";
    }

}
