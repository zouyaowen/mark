package top.suiyueran.mark.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class UserBO {
	private Integer id;
	private String userName;
	private Integer age;
	private Integer gender;
	private LocalDateTime createTime;
	private LocalDateTime updateTime;
	private String studyCost;
}
