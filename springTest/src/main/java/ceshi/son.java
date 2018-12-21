package ceshi;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class son {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "son{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
