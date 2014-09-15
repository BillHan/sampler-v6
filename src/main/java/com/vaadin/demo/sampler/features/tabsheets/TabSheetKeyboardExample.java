package com.vaadin.demo.sampler.features.tabsheets;

import com.vaadin.event.FieldEvents.FocusEvent;
import com.vaadin.event.FieldEvents.FocusListener;
import com.vaadin.ui.Label;
import com.vaadin.ui.TabSheet;
import com.vaadin.ui.TabSheet.Tab;
import com.vaadin.ui.TextField;
import com.vaadin.ui.VerticalLayout;

@SuppressWarnings("serial")
public class TabSheetKeyboardExample extends VerticalLayout {

    private TabSheet t;

    public TabSheetKeyboardExample() {
        // Tab 1 content
        VerticalLayout l1 = new VerticalLayout();
        l1.setMargin(true);
        l1.addComponent(new Label("There are no previously saved actions."));
        // Tab 2 content
        VerticalLayout l2 = new VerticalLayout();
        l2.setMargin(true);
        l2.addComponent(new Label("There are no saved notes."));
        // Tab 3 content
        VerticalLayout l3 = new VerticalLayout();
        l3.setMargin(true);
        l3.addComponent(new Label("There are currently no issues."));
        // Tab 4 content
        VerticalLayout l4 = new VerticalLayout();
        l4.setMargin(true);
        l4.addComponent(new Label("There are no comments."));
        // Tab 5 content
        VerticalLayout l5 = new VerticalLayout();
        l5.setMargin(true);
        l5.addComponent(new Label("There is no new feedback."));

        t = new TabSheet();
        t.setHeight("200px");
        t.setWidth("400px");
        t.addListener(new FocusListener() {
            public void focus(FocusEvent event) {
                String caption = t.getTab(t.getSelectedTab()).getCaption();
                getWindow().showNotification("Tabsheet focused",
                        "Selected tab: " + caption);
            }
        });

        final Tab saved = t.addTab(l1, "Saved actions");
        saved.setClosable(false);
        final Tab notes = t.addTab(l2, "Notes");
        notes.setClosable(true);
        final Tab issues = t.addTab(l3, "Issues");
        issues.setClosable(false);
        final Tab comments = t.addTab(l4, "Comments");
        comments.setClosable(true);
        final Tab feedback = t.addTab(l5, "Feedback");
        feedback.setClosable(false);

        setSpacing(true);

        TextField tf = new TextField();
        tf.setWidth("300px");
        tf.setInputPrompt("Focus this, then use tab to focus the tabsheet");
        addComponent(tf);

        addComponent(t);

        tf = new TextField();
        tf.setWidth("300px");
        tf.setInputPrompt("Focus this, then use shift-tab to focus the tabsheet");
        addComponent(tf);
    }
}
