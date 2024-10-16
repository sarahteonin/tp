package seedu.address.logic.parser;

import static seedu.address.logic.Messages.MESSAGE_INVALID_NAME_DISPLAYED;

import seedu.address.logic.commands.DeleteAppointmentCommand;
import seedu.address.logic.parser.exceptions.ParseException;
import seedu.address.model.person.Name;

/**
 * Parses input arguments and creates a new DeleteAppointmentCommand object
 */
public class DeleteAppointmentCommandParser implements Parser<DeleteAppointmentCommand> {
    /**
     * Parses the given {@code String} of arguments in the context of the DeleteAppointmentCommand
     * and returns a DeleteAppointmentCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public DeleteAppointmentCommand parse(String args) throws ParseException {
        try {
            Name name = ParserUtil.parseName(args);
            return new DeleteAppointmentCommand(name);
        } catch (ParseException pe) {
            throw new ParseException(MESSAGE_INVALID_NAME_DISPLAYED, pe);
        }
    }
}