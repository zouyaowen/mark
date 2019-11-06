package top.suiyueran.mark.controller.vo;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UserVO {
	private Integer id;
	private String userName;
	private Integer age;
	private Integer gender;
	private LocalDateTime createTime;
	private LocalDateTime updateTime;
}
