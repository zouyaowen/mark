package top.suiyueran.mark.model;

import java.time.LocalDateTime;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Data;
import top.suiyueran.mark.group.FirstGroup;
import top.suiyueran.mark.group.SecondGroup;

@Data
public class UserModel {
	@NotNull(message = "id不能为空", groups = FirstGroup.class)
	private Integer id;
	@NotBlank
	private String userName;
	@NotNull
	private Integer age;
	@NotNull(message = "gender不能为空", groups = FirstGroup.class)
	private Integer gender;
	@NotNull(message = "createTime不能为空", groups = SecondGroup.class)
	private LocalDateTime createTime;
	@NotNull
	private LocalDateTime updateTime;
	@Email
	private String email;

}
