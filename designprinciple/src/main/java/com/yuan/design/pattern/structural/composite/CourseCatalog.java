package com.yuan.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CourseCatalog
 * @Author Administrator
 * @Date 2020/4/20 22:33
 */
public class CourseCatalog extends CatalogComponent {
    private List<CatalogComponent> items = new ArrayList<CatalogComponent>();
    private String name;
    private Integer level;

    public CourseCatalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent item : items) {
            if (this.level != null) {
                for (Integer integer = 0; integer < this.level; integer++) {
                    System.out.print("   ");
                }
            }
            item.print();
        }
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }
}
