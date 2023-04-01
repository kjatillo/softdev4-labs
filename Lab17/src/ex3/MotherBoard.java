package ex3;

/**
 * Created by: Ken
 * Created on: 30/03/2023
 * Student no: X00190944
 * Year/Group: 2A
 */

public class MotherBoard {
    private String manufacturer;
    private int memoryCapacity;
    private MemoryModule[] memoryModulesArray;

    public MotherBoard(String manufacturer, int memoryCapacity, int numMemoryModules) {
        this.manufacturer = manufacturer;
        this.memoryCapacity = memoryCapacity;
        this.memoryModulesArray = new MemoryModule[numMemoryModules];
    }// Constructor - Motherboard

    public String toString() {
        String str = "";
        str += "Manufacturer: "  + manufacturer + "\nMemory Capacity: " + memoryCapacity + " MB";

        return str;
    }// Method - toString

    class MemoryModule {
        private int memoryModuleCapacity;

        public MemoryModule(int memoryModuleCapacity) {
            this.memoryModuleCapacity = memoryModuleCapacity;
        }// Constructor - MemoryModule

        public String toString() {
            String str = "[Memory Modules]\n";

            for (int i = 0; i < memoryModulesArray.length; i++) {
                str += ("Module " + (i + 1) + " Size: " + memoryModuleCapacity + " MB\n");
            }// for

            return str;
        }// Method - toString
    }// Inner Class - MemoryModule
}// Class - Motherboard
