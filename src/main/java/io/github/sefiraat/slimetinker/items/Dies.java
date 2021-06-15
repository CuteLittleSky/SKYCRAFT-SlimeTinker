package io.github.sefiraat.slimetinker.items;

import io.github.sefiraat.slimetinker.SlimeTinker;
import io.github.sefiraat.slimetinker.categories.Categories;
import io.github.sefiraat.slimetinker.utils.SkullTextures;
import io.github.sefiraat.slimetinker.utils.ThemeUtils;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public final class Dies {

    public static final String DIE_DESC = "A die to create a cast from";

    protected static final ItemStack[] RECIPE_DIE_SHOVEL_HEAD = new ItemStack[] {
            null,    new ItemStack(Material.COBBLESTONE),    null,
            null,    null,                                   null,
            null,    null,                                   null
    };

    protected static final ItemStack[] RECIPE_DIE_PICKAXE_HEAD = new ItemStack[] {
            new ItemStack(Material.COBBLESTONE),    new ItemStack(Material.COBBLESTONE),    new ItemStack(Material.COBBLESTONE),
            null,                                   null,                                   null,
            null,                                   null,                                   null
    };

    protected static final ItemStack[] RECIPE_DIE_AXE_HEAD = new ItemStack[] {
            new ItemStack(Material.COBBLESTONE),    new ItemStack(Material.COBBLESTONE),    null,
            new ItemStack(Material.COBBLESTONE),    null,                                   null,
            null,                                   null,                                   null
    };

    protected static final ItemStack[] RECIPE_DIE_HOE_HEAD = new ItemStack[] {
            new ItemStack(Material.COBBLESTONE),    new ItemStack(Material.COBBLESTONE),    null,
            null,                                   null,                                   null,
            null,                                   null,                                   null
    };

    protected static final ItemStack[] RECIPE_DIE_SWORD_BLADE = new ItemStack[] {
            null,    new ItemStack(Material.COBBLESTONE),    null,
            null,    new ItemStack(Material.COBBLESTONE),    null,
            null,    null,                                   null
    };

    protected static final ItemStack[] RECIPE_DIE_TOOL_ROD = new ItemStack[] {
            null,    null,                          null,
            null,    new ItemStack(Material.STICK), null,
            null,    null,                          null
    };

    public static final SlimefunItemStack DIE_SHOVEL_HEAD =
            ThemeUtils.themedItemStack(
                    "DIE_SHOVEL_HEAD",
                    SkullTextures.PART_SHOVEL_HEAD,
                    ThemeUtils.ThemeItemType.CAST,
                    "Die: Stone Shovel Head",
                    ThemeUtils.PASSIVE + DIE_DESC
            );

    public static final SlimefunItemStack DIE_PICKAXE_HEAD =
            ThemeUtils.themedItemStack(
                    "DIE_PICKAXE_HEAD",
                    SkullTextures.PART_PICKAXE_HEAD,
                    ThemeUtils.ThemeItemType.CAST,
                    "Die: Stone Pickaxe Head",
                    ThemeUtils.PASSIVE + DIE_DESC
            );

    public static final SlimefunItemStack DIE_AXE_HEAD =
            ThemeUtils.themedItemStack(
                    "DIE_AXE_HEAD",
                    SkullTextures.PART_AXE_HEAD,
                    ThemeUtils.ThemeItemType.CAST,
                    "Die: Stone Axe Head",
                    ThemeUtils.PASSIVE + DIE_DESC
            );

    public static final SlimefunItemStack DIE_HOE_HEAD =
            ThemeUtils.themedItemStack(
                    "DIE_HOE_HEAD",
                    SkullTextures.PART_HOE_HEAD,
                    ThemeUtils.ThemeItemType.CAST,
                    "Die: Stone Hoe Head",
                    ThemeUtils.PASSIVE + DIE_DESC
            );

    public static final SlimefunItemStack DIE_SWORD_BLADE =
            ThemeUtils.themedItemStack(
                    "DIE_SWORD_BLADE",
                    SkullTextures.PART_SWORD_BLADE,
                    ThemeUtils.ThemeItemType.CAST,
                    "Die: Stone Axe Head",
                    ThemeUtils.PASSIVE + DIE_DESC
            );

    public static final SlimefunItemStack DIE_TOOL_ROD =
            ThemeUtils.themedItemStack(
                    "DIE_TOOL_ROD",
                    SkullTextures.PART_TOOL_ROD,
                    ThemeUtils.ThemeItemType.CAST,
                    "Die: Tool Rod",
                    ThemeUtils.PASSIVE + DIE_DESC
            );


    public static void set(SlimeTinker p) {
        new UnplaceableBlock(Categories.CASTS, DIE_SHOVEL_HEAD, RecipeType.ENHANCED_CRAFTING_TABLE, RECIPE_DIE_SHOVEL_HEAD).register(p);
        new UnplaceableBlock(Categories.CASTS, DIE_PICKAXE_HEAD, RecipeType.ENHANCED_CRAFTING_TABLE, RECIPE_DIE_PICKAXE_HEAD).register(p);
        new UnplaceableBlock(Categories.CASTS, DIE_AXE_HEAD, RecipeType.ENHANCED_CRAFTING_TABLE, RECIPE_DIE_AXE_HEAD).register(p);
        new UnplaceableBlock(Categories.CASTS, DIE_HOE_HEAD, RecipeType.ENHANCED_CRAFTING_TABLE, RECIPE_DIE_HOE_HEAD).register(p);
        new UnplaceableBlock(Categories.CASTS, DIE_SWORD_BLADE, RecipeType.ENHANCED_CRAFTING_TABLE, RECIPE_DIE_SWORD_BLADE).register(p);
        new UnplaceableBlock(Categories.CASTS, DIE_TOOL_ROD , RecipeType.ENHANCED_CRAFTING_TABLE, RECIPE_DIE_TOOL_ROD).register(p);
    }
}
