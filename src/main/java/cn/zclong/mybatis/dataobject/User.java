package cn.zclong.mybatis.dataobject;

import java.util.Date;

/**
 * User -> user
 * 2019-02-05
 */
@lombok.Getter
@lombok.Setter
@lombok.EqualsAndHashCode(callSuper = false)
public class User extends BaseDO {
    private String name;

    private String password;

    /**
     * 开始时间
     */
    private Date effectiveFrom;

    /**
     * 结束时间
     */
    private Date effectiveTo;

    /**
     * 逻辑删标识：Y正常、N删除
     */
    private String isDelete;

    /**
     * 逻辑删除说明
     */
    private String dbRemark;

    private static final long serialVersionUID = 1L;
}