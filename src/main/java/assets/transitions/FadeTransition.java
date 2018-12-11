/*
 * src.main.java.fxml.transitions
 * Version: (Default) 1.0.0
 * Created: 00:09 ~ 27/10/2018
 * buitr Copyright
 */
package assets.transitions;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 * The type Fade transition.
 */
public class FadeTransition {
    /**
     * Apply fade transition.
     *
     * @param node        the node
     * @param duration    the duration
     * @param event       the event
     * @param startValue  the start value
     * @param endValue    the end value
     * @param repeatTime  the repeat time
     * @param autoReverse the auto reverse
     */
    public static void applyFadeTransition(Node node, Duration duration, EventHandler<ActionEvent> event,
                                           double startValue, double endValue, int repeatTime, boolean autoReverse) {
        doFade(node, duration, startValue, endValue, repeatTime, autoReverse);
        javafx.animation.FadeTransition fadeIn = doFade(node, duration, startValue, endValue, repeatTime, autoReverse);
        fadeIn.setOnFinished(event);

        javafx.animation.FadeTransition fadeOut = doFade(node, duration, endValue, startValue, repeatTime, autoReverse);

        fadeOut.play();
        fadeOut.setOnFinished(e -> {
            fadeIn.play();
        });
    }

    private static javafx.animation.FadeTransition doFade(Node node, Duration duration, double startValue, double endValue, int repeatTime, boolean autoReverse) {
        javafx.animation.FadeTransition fade = new javafx.animation.FadeTransition(duration, node);
        fade.setCycleCount(repeatTime);
        fade.setFromValue(startValue);
        fade.setToValue(endValue);
        fade.setAutoReverse(autoReverse);
        return fade;
    }
}
