package org.vaadin.touchkit.v7.itest;

import org.vaadin.touchkit.v7.AbstractTouchKitIntegrationTest;
import org.vaadin.touchkit.v7.ui.NumberField;

import com.vaadin.ui.Notification;
import com.vaadin.v7.event.FieldEvents.TextChangeEvent;
import com.vaadin.v7.event.FieldEvents.TextChangeListener;
import com.vaadin.v7.ui.TextField;

public class NumberFieldTest extends AbstractTouchKitIntegrationTest {

    public NumberFieldTest() {
        setDescription("This is NumberField test");

        final NumberField nf = new NumberField("NumberField");
        nf.setImmediate(true);
        nf.addTextChangeListener(new TextChangeListener() {
            @Override
			public void textChange(TextChangeEvent event) {
                Notification.show("New numberfield value: " + event.getText());
            }
        });

        final TextField tf = new TextField("TextField");
        tf.setImmediate(true);
        tf.addTextChangeListener(new TextChangeListener() {
            @Override
			public void textChange(TextChangeEvent event) {
                nf.setValue(event.getText());
            }
        });

        addComponent(tf);
        addComponent(nf);
    }
}
