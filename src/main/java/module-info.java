module waterworld {
    requires hanyaeger;
	requires javafx.graphics;
	requires java.desktop;

    exports com.github.hanyaeger.tutorial;

    opens audio;
    opens backgrounds;
    opens sprites;
}
