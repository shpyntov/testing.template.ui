package util;

import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;
import wordpress.models.AppConfig;

public class ApplicationManager {
    public static AppConfig config = new Yaml(new Constructor(AppConfig.class))
            .load(ApplicationManager.class.getClassLoader().getResourceAsStream("application/staging.yml"));
}
