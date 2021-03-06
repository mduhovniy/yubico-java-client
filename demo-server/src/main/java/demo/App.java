package demo;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class App extends Application<Config> {
    @Override
    public void initialize(Bootstrap<Config> bootstrap) {
    }

    @Override
    public void run(Config config, Environment environment) throws Exception {
        environment.jersey().register(new Resource());
    }

    public static void main(String... args) throws Exception {
        new App().run(args);
    }
}
