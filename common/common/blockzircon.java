package common;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;

public class blockzircon extends Block {

 String blockzircon;
 
 public blockzircon(int par1, String blockzircon) {
  super(par1, Material.rock);
  setCreativeTab(CreativeTabs.tabBlock);
  this.blockzircon = blockzircon;
 }


 public void registerIcons(IconRegister iconRegister) {
  this.blockIcon = iconRegister.registerIcon("fancyblocks:" + blockzircon);
 }
}