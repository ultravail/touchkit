package org.vaadin.touchkit.v7.itest.oldtests;

import org.vaadin.touchkit.ui.NavigationView;
import org.vaadin.touchkit.ui.VerticalComponentGroup;
import org.vaadin.touchkit.v7.AbstractTouchKitIntegrationTest;

import com.vaadin.ui.CssLayout;
import com.vaadin.v7.ui.OptionGroup;

public class Selects extends AbstractTouchKitIntegrationTest {

    public Selects() {
        NavigationView navigationView = new NavigationView();
        navigationView.setCaption("Various selection possibilities");

        CssLayout l = new CssLayout();

        OptionGroup optionGroup = new OptionGroup();
        optionGroup.addItem("One");
        optionGroup.addItem("Two");
        optionGroup.addItem("Three");
        VerticalComponentGroup verticalComponentGroup = new VerticalComponentGroup(
                "OptionGroup");
        verticalComponentGroup.addComponent(optionGroup);

        l.addComponent(verticalComponentGroup);
        
        optionGroup = new OptionGroup();
        optionGroup.addItem("One");
        optionGroup.addItem("Two");
        optionGroup.addItem("Three");
        optionGroup.setMultiSelect(true);
        
        verticalComponentGroup = new VerticalComponentGroup(
                "OptionGroup (multiselect)");
        verticalComponentGroup.addComponent(optionGroup);
        verticalComponentGroup.addComponent(optionGroup);

        l.addComponent(verticalComponentGroup);
        
        

        navigationView.setContent(l);
        addComponent(navigationView);
        
        TestUtils.makeSmallTabletSize(navigationView);

    }

}
