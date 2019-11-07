package top.suiyueran.mark.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UserDO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String userName;
	private Integer age;
	private Integer gender;
	private LocalDateTime createTime;
	private LocalDateTime updateTime;
}
