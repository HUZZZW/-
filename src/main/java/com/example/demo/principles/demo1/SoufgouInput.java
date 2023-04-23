package com.example.demo.principles.demo1;

/**
 * @author Yiming Hu
 * @data 4/12/2023 4:43 PM
 * @Description:
 */
public class SoufgouInput {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display(){
        skin.display();
    }
}
