package cn.bdqn.springcloud.entity;

import java.io.Serializable;

/**
 * (Payment)实体类
 *
 * @author makejava
 * @since 2020-05-16 17:35:03
 */
public class Payment implements Serializable {
    private static final long serialVersionUID = -17392388582553597L;
    /**
    * id
    */
    private Long id;
    
    private String serial;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

}