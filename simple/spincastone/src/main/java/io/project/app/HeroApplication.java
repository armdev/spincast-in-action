package io.project.app;

import javax.inject.Inject;

import org.spincast.core.server.Server;
import org.spincast.defaults.bootstrapping.Spincast;
import org.spincast.plugins.routing.DefaultRouter;

/**
 *
 * @author armena
 */
public class HeroApplication {

    public static void main(String[] args) {
        Spincast.init(args);
    }

    /**
     *
     * @param router
     * @param server
     */
    @Inject
    protected void init(DefaultRouter router, Server server) {

        router.GET("/").handle(context -> context.response().sendHtml("<h1>Aloha Browser</h1>"));
        server.start();
    }

}
