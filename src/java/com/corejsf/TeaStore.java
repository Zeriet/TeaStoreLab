package com.corejsf;

import java.io.Serializable;
import javax.inject.Named; 
   // or import javax.faces.bean.ManagedBean;
import javax.enterprise.context.RequestScoped; 
   // or import javax.faces.bean.RequestScoped;

@Named // or @ManagedBean
@RequestScoped
public class TeaStore implements Serializable {
  private String selectedType;
  
  public String getSelectedType() { return selectedType; }
  
  public String changeTeaType(String newValue) {
     selectedType = newValue;
     return selectedType;
  }
}
