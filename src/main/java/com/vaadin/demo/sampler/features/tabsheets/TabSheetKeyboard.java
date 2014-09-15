package com.vaadin.demo.sampler.features.tabsheets;

import com.vaadin.demo.sampler.APIResource;
import com.vaadin.demo.sampler.Feature;
import com.vaadin.demo.sampler.NamedExternalResource;
import com.vaadin.ui.TabSheet;

@SuppressWarnings("serial")
public class TabSheetKeyboard extends Feature {

    @Override
    public Version getSinceVersion() {
        return Version.V68;
    }

    @Override
    public String getName() {
        return "Tabsheet, using keyboard";
    }

    @Override
    public String getDescription() {
        return "A tab can be focused with the tabulator key or by using the mouse. Tabs can be switched with the left and right arrow keys. Closable tabs can be closed with the Del key.";
    }

    @Override
    public APIResource[] getRelatedAPI() {
        return new APIResource[] { new APIResource(TabSheet.class) };
    }

    @SuppressWarnings("unchecked")
    @Override
    public Class<? extends Feature>[] getRelatedFeatures() {
        return new Class[] { TabSheetScrolling.class, TabSheetIcons.class,
                TabSheetDisabled.class };
    }

    @Override
    public NamedExternalResource[] getRelatedResources() {
        // TODO Auto-generated method stub
        return null;
    }

}
