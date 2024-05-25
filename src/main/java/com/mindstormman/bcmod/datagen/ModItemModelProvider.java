package com.mindstormman.bcmod.datagen;

import com.mindstormman.bcmod.BCMod;
import com.mindstormman.bcmod.block.ArbutusWood;
import com.mindstormman.bcmod.block.CedarWood;
import com.mindstormman.bcmod.block.YellowCedarWood;
import com.mindstormman.bcmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BCMod.MOD_ID, existingFileHelper);
    }
    private static LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();
    static {
        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }
    @Override
    protected void registerModels() {
        simpleItem(ModItems.GOOSE_EGG);
        simpleItem(ModItems.GOOSE_FEATHER);
        simpleItem(ModItems.METAL_DETECTOR);
        simpleItem(ModItems.RHODONITE);
        simpleItem(ModItems.RHODONITE_HEART);
        simpleItem(ModItems.RAW_RHODONITE);
        simpleItem(ModItems.SASKATOON_BERRY);
        simpleItem(ModItems.SNOWBERRY);
        simpleItem(ModItems.JADE);

        //Tools
        handheldItem(ModItems.JADE_AXE);
        handheldItem(ModItems.JADE_SWORD);
        handheldItem(ModItems.JADE_SHOVEL);
        handheldItem(ModItems.JADE_HOE);
        handheldItem(ModItems.JADE_PICKAXE);

        //Cedar
        simpleBlockItem(CedarWood.CEDAR_DOOR);
        fenceItem(CedarWood.CEDAR_FENCE, CedarWood.CEDAR_PLANKS);
        buttonItem(CedarWood.CEDAR_BUTTON, CedarWood.CEDAR_PLANKS);
        trapdoorItem(CedarWood.CEDAR_TRAPDOOR);
        evenSimplerBlockItem(CedarWood.CEDAR_STAIRS);
        evenSimplerBlockItem(CedarWood.CEDAR_SLAB);
        evenSimplerBlockItem(CedarWood.CEDAR_PRESSURE_PLATE);
        evenSimplerBlockItem(CedarWood.CEDAR_FENCE_GATE);

        //Yellow Cedar
        simpleBlockItem(YellowCedarWood.YELLOW_CEDAR_DOOR);
        fenceItem(YellowCedarWood.YELLOW_CEDAR_FENCE, YellowCedarWood.YELLOW_CEDAR_PLANKS);
        buttonItem(YellowCedarWood.YELLOW_CEDAR_BUTTON, YellowCedarWood.YELLOW_CEDAR_PLANKS);
        trapdoorItem(YellowCedarWood.YELLOW_CEDAR_TRAPDOOR);
        evenSimplerBlockItem(YellowCedarWood.YELLOW_CEDAR_STAIRS);
        evenSimplerBlockItem(YellowCedarWood.YELLOW_CEDAR_SLAB);
        evenSimplerBlockItem(YellowCedarWood.YELLOW_CEDAR_PRESSURE_PLATE);
        evenSimplerBlockItem(YellowCedarWood.YELLOW_CEDAR_FENCE_GATE);

        //Arbutus
        simpleBlockItem(ArbutusWood.ARBUTUS_DOOR);
        fenceItem(ArbutusWood.ARBUTUS_FENCE, ArbutusWood.ARBUTUS_PLANKS);
        buttonItem(ArbutusWood.ARBUTUS_BUTTON, ArbutusWood.ARBUTUS_PLANKS);
        trapdoorItem(ArbutusWood.ARBUTUS_TRAPDOOR);
        evenSimplerBlockItem(ArbutusWood.ARBUTUS_STAIRS);
        evenSimplerBlockItem(ArbutusWood.ARBUTUS_SLAB);
        evenSimplerBlockItem(ArbutusWood.ARBUTUS_PRESSURE_PLATE);
        evenSimplerBlockItem(ArbutusWood.ARBUTUS_FENCE_GATE);

        //Armour
        trimmedArmorItem(ModItems.JADE_HELMET);
        trimmedArmorItem(ModItems.JADE_LEGGINGS);
        trimmedArmorItem(ModItems.JADE_CHESTPLATE);
        trimmedArmorItem(ModItems.JADE_BOOTS);

    }

    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = BCMod.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.entrySet().forEach(entry -> {

                ResourceKey<TrimMaterial> trimMaterial = entry.getKey();
                float trimValue = entry.getValue();

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = "item/" + armorItem;
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = new ResourceLocation(MOD_ID, armorItemPath);
                ResourceLocation trimResLoc = new ResourceLocation(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = new ResourceLocation(MOD_ID, currentTrimName);

                // This is used for making the ExistingFileHelper acknowledge that this texture exist, so this will
                // avoid an IllegalArgumentException
                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");

                // Trimmed armorItem files
                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc)
                        .texture("layer1", trimResLoc);

                // Non-trimmed armorItem file (normal variant)
                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                new ResourceLocation(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }
    }


    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BCMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(BCMod.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }

    public void trapdoorItem(RegistryObject<Block> block) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath() + "_bottom"));
    }

    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture",  new ResourceLocation(BCMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture",  new ResourceLocation(BCMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall",  new ResourceLocation(BCMod.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(BCMod.MOD_ID,"item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BCMod.MOD_ID,"item/" + item.getId().getPath()));
    }
}
