package com.easy.db.model;

import java.lang.reflect.Field;

import com.easy.db.annotation.PrimaryKey;
import com.easy.db.enums.AssignType;


/**
 * 主键
 */
public class Primarykey extends Property {
    private static final long serialVersionUID = 2304252505493855513L;

    public AssignType assign;

    public Primarykey(Property p, AssignType assign) {
        this(p.column, p.field, assign);
    }

    public Primarykey(String column, Field field, AssignType assign) {
		super(column, field);
		this.assign = assign;
	}

	public boolean isAssignedBySystem() {
		return assign == AssignType.AUTO_INCREMENT;
	}

	public boolean isAssignedByMyself() {
		return assign == AssignType.BY_MYSELF;
	}
}
