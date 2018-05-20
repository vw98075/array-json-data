package com.vw.customdatatypes.usertype;

import org.hibernate.dialect.PostgreSQL94Dialect;

import java.sql.Types;

public class CustomPostgreSQLDialect extends PostgreSQL94Dialect {

    public CustomPostgreSQLDialect() {
        this.registerColumnType(Types.JAVA_OBJECT, "json");
    }
}
