package guru.springframework;

import guru.springframework.domain.UserCommand;
import guru.springframework.entities.User;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-01-13T13:18:11-0500",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 13.0.1 (AdoptOpenJDK)"
)
public class ConverterImpl implements Converter {

    @Override
    public UserCommand userToUserCommand(User source) {
        if ( source == null ) {
            return null;
        }

        UserCommand userCommand = new UserCommand();

        if ( source.getId() != null ) {
            userCommand.setId( source.getId() );
        }
        userCommand.setFirstName( source.getFirstName() );
        userCommand.setLastName( source.getLastName() );
        userCommand.setEmail( source.getEmail() );

        return userCommand;
    }

    @Override
    public User userCommandToUser(UserCommand destination) {
        if ( destination == null ) {
            return null;
        }

        User user = new User();

        user.setId( destination.getId() );
        user.setFirstName( destination.getFirstName() );
        user.setLastName( destination.getLastName() );
        user.setEmail( destination.getEmail() );

        return user;
    }
}
