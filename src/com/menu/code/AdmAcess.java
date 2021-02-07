package com.menu.code;

public class AdmAcess {

    private int password = 12345678;




    public AdmAcess(){


    }


    public AdmAcess(int password) {
        this.password = password;
    }

    public Integer getPassword() {
        return password;
    }

    public void setPassword(Integer password) {
        this.password = password;
    }


    public boolean openAcess(Integer admPassword){
        if(admPassword==password){
            return true;
        }
        else{
            return false;
        }
    }
}
