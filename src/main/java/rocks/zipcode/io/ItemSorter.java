package rocks.zipcode.io;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 *
 */
public class ItemSorter  {
    private Item[] items;

    public ItemSorter(Item[] items) {

        //To get an array of the Item objects we initizialed the field items
        this.items = items;


    }

    public Item[] sort(Comparator<Item> comparator) {
        //cloned the original item array which will keep the original array unchanged
        Item[] sortedItems = items.clone();

        //Sorting the cloned item array based on the comparator parameter
        Arrays.sort(sortedItems,comparator);

        return sortedItems;
    }
}
