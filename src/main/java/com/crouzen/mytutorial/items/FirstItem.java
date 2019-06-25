package com.crouzen.mytutorial.items;

import com.crouzen.mytutorial.MyTutorial;
import net.minecraft.item.Item;

public class FirstItem extends Item {
    public FirstItem() {
        super(new Item.Properties()
                .maxStackSize(1)
                .group(MyTutorial.setup.itemGroup));
        setRegistryName("firstitem");
    }
}
