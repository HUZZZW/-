package com.example.demo.principles.demo1;

/**
 * @author Yiming Hu
 * @data 4/12/2023 4:45 PM
 * @Description:开闭原则
 */
public class test{
    public static void main(String[] args) {
        //1,创建搜狗输入法对象
        SoufgouInput input = new SoufgouInput();
        //2,创建皮肤对象
        defaultSkin skin = new defaultSkin();
        heimaSkin skin1 = new heimaSkin();
        //3,将皮肤设置到输入法里面
        input.setSkin(skin1);
        //4,显示皮肤
        input.display();
    }
}
