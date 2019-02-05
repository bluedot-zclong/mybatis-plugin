package cn.zclong.mybatis.plugin;

import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.internal.types.JavaTypeResolverDefaultImpl;

import java.sql.Types;

/**
 * @author zclong
 * @since 2019/2/3
 */
public class JavaTypeResolverDefault extends JavaTypeResolverDefaultImpl {

    public JavaTypeResolverDefault() {
        super();
        typeMap.put(Types.CHAR, new JdbcTypeInformation("CHAR",
                new FullyQualifiedJavaType(String.class.getName())));

        typeMap.put(Types.TINYINT, new JdbcTypeInformation("TINYINT",
                new FullyQualifiedJavaType(Integer.class.getName())));
        typeMap.put(Types.SMALLINT, new JdbcTypeInformation("SMALLINT",
                new FullyQualifiedJavaType(Integer.class.getName())));

    }

}
