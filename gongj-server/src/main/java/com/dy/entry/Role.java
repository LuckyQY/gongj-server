package com.dy.entry;

import java.io.Serializable;
import java.util.Set;

public class Role implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
    private Integer rid;

    private String rname;
    
    private Set<Module> modules;

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public String getRname() {
        return rname;
    }

    public void setRname(String rname) {
        this.rname = rname == null ? null : rname.trim();
    }

	public Set<Module> getModules() {
		return modules;
	}

	public void setModules(Set<Module> modules) {
		this.modules = modules;
	}
    
}