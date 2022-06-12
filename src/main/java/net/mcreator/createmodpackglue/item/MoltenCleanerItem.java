
package net.mcreator.createmodpackglue.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.createmodpackglue.init.CreateModpackGlueModFluids;

public class MoltenCleanerItem extends BucketItem {
	public MoltenCleanerItem() {
		super(CreateModpackGlueModFluids.MOLTEN_CLEANER,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
