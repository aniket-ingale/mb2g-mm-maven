package guru.springframework;

import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;
import org.mapstruct.Mapper;

@Mapper
public interface Converter {
    UserCommand userToUserCommand(User source);

    User userCommandToUser(UserCommand destination);
}
