package assign1.utils;

import assign1.constants.CmdFlags;
import org.apache.commons.cli.*;

import java.util.HashMap;

public class ParseArgs {
    public static HashMap<String,String> parse(String []args) throws ParseException,MissingOptionException{

        Options options = new Options();
        Option name=new Option("name", "name", true, "name of the item");
        name.setRequired(true);
        Option price=new Option("price", "price", true, "price of the item");
        name.setRequired(true);
        Option type=new Option("type", "type", true, "type of the item");
        name.setRequired(true);
        Option quantity=new Option("quantity", "quantity", true, "quantity of the item");
        name.setRequired(true);
        options.addOption(name);
        options.addOption(price);
        options.addOption(type);
        options.addOption(quantity);

        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args);

        HashMap<String,String> map=new HashMap<>();
        map.put("name",cmd.getOptionValue("name"));
        map.put("price",cmd.getOptionValue("price"));
        map.put("quantity",cmd.getOptionValue("quantity"));
        map.put("type",cmd.getOptionValue("type"));

        return map;
    }
}
