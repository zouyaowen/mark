package top.suiyueran.mark.converter;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;

import top.suiyueran.mark.entity.UserDO;
import top.suiyueran.mark.model.UserBO;

@Mapper
public interface UserConverter {
	UserConverter INSTANCE = Mappers.getMapper(UserConverter.class);

	@Mappings({ @Mapping(source = "studyCost", target = "studyCost") })
	UserBO toBO(UserDO userDO);

	@Mappings({ @Mapping(source = "studyCost", target = "studyCost") })
	UserDO toBO(UserBO userDO);

	List<UserBO> toBO(List<UserDO> userDOList);

	List<UserDO> toDO(List<UserBO> UserBOList);
}
