package io.gezzer.webapp;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import lombok.Data;

@Data
@Named
@SessionScoped
public class ControlBean implements Serializable {
    private String text;


    @PostConstruct  
    public void init() {
        text = "";
    }

    public String openNewWindow(){
        return "newWindow";
    }

    

}
