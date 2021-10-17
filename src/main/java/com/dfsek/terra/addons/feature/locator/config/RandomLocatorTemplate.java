package com.dfsek.terra.addons.feature.locator.config;

import com.dfsek.tectonic.annotations.Value;
import com.dfsek.tectonic.loading.object.ObjectTemplate;

import com.dfsek.terra.addons.feature.locator.locators.RandomLocator;
import com.dfsek.terra.api.config.meta.Meta;
import com.dfsek.terra.api.structure.feature.Locator;
import com.dfsek.terra.api.util.Range;


public class RandomLocatorTemplate implements ObjectTemplate<Locator> {
    @Value("height")
    private @Meta Range height;
    
    @Value("amount")
    private @Meta Range amount;
    
    @Override
    public Locator get() {
        return new RandomLocator(height, amount);
    }
}
