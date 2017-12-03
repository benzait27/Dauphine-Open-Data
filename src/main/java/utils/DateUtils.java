package utils;


import javax.enterprise.context.ApplicationScoped;
import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Ziad & Sofian  on 03/12/2017.
 */

@ApplicationScoped
public class DateUtils {

    private static final Logger LOGGER = Logger.getLogger(DateUtils.class.getName());

    /**
     *  return date with a specific format (formatOpt)
     *  if formatOpt is null (optional) we return with a specific format : dd/MM/yyyy HH:mm
     * @param localDate
     * @param formatOpt
     * @return
     * @throws DateTimeException
     */
    public static String transformDate(LocalDateTime localDate, Optional<String> formatOpt) throws DateTimeException {
        String format = formatOpt.isPresent() ? formatOpt.get() : "dd/MM/yyyy HH:mm";
        DateTimeFormatter dateTimeFormatter = null;
        try{
            dateTimeFormatter = DateTimeFormatter.ofPattern(format);
        }
        catch(IllegalArgumentException illegal){
            LOGGER.log( Level.ALL, "error in pattern of dateTimeFormatter ", format );
            throw illegal;
        }

        return localDate.format(dateTimeFormatter);
    }


}
