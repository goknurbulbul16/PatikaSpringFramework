package com.goknurbulbul.bean;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named (value = "cdiBean")
@RequestScoped
@Setter @Getter

public class JsfBean {
    private String patika;
    public JsfBean() {
        patika ="Spring Boot Eğitimine Hoşgeldiniz";

    }
}
