package com.vaadin.addon.touchkit.gwt.client;

import com.vaadin.terminal.gwt.client.ui.textfield.VTextField;

public class EmailFieldWidget extends VTextField {

    public EmailFieldWidget() {
        getElement().setPropertyString("type", "email");
        getElement().setAttribute("autocapitalize", "off");
        getElement().setAttribute("autocorrect", "off");
    }

}