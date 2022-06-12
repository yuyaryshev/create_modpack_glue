
package net.mcreator.createmodpackglue.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.createmodpackglue.init.CreateModpackGlueModFluids;

public class AdvMoltenCleanerItem extends BucketItem {
	public AdvMoltenCleanerItem() {
		super(CreateModpackGlueModFluids.ADV_MOLTEN_CLEANER,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
