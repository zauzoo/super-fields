package org.vaadin.miki.superfields.itemgrid;

import com.vaadin.flow.component.Component;

import java.util.Objects;

/**
 * Information about a cell in an {@link ItemGrid}.
 * @param <T> Type of data associated with the cell.
 * @author miki
 * @since 2020-04-15
 */
public class CellInformation<T> {

    private final int row;
    private final int column;
    private final T value;
    private final Component component;

    /**
     * Constructs cell information.
     * @param row Row number.
     * @param column Column number.
     * @param value Value in the cell.
     * @param component Component in the cell.
     */
    public CellInformation(int row, int column, T value, Component component) {
        this.row = row;
        this.column = column;
        this.value = value;
        this.component = component;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public T getValue() {
        return value;
    }

    public Component getComponent() {
        return component;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CellInformation<?> that = (CellInformation<?>) o;
        return getRow() == that.getRow() &&
                getColumn() == that.getColumn() &&
                Objects.equals(getValue(), that.getValue()) &&
                Objects.equals(getComponent(), that.getComponent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRow(), getColumn(), getValue(), getComponent());
    }

    @Override
    public String toString() {
        return "CellInformation{" +
                "row=" + row +
                ", column=" + column +
                ", value=" + value +
                ", component=" + component +
                '}';
    }
}
