package by.bntu.fitr.povt.ChermeninES.lab8.model.entity.collection;

import java.util.Collection;


/**
 * Created by Dell on 02/03/2017.
 */
public interface ICollection<item> extends Collection<item> {

    item pop();

    void push(item item);

    item peek();

}
