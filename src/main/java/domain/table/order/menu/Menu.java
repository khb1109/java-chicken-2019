package domain.table.order.menu;

import java.util.Objects;

import domain.table.order.OrderCount;

public class Menu {
	private final int number;
	private final String name;
	private final Category category;
	private final int price;

	public Menu(final int number, final String name, final Category category, final int price) {
		this.number = number;
		this.name = name;
		this.category = category;
		this.price = price;
	}

	public long calculatePrice(OrderCount orderCount) {
		return orderCount.multiply(price);
	}

	@Override
	public String toString() {
		return category + " " + number + " - " + name + " : " + price + "원";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Menu menu = (Menu)o;
		return number == menu.number &&
			price == menu.price &&
			Objects.equals(name, menu.name) &&
			category == menu.category;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number, name, category, price);
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public Category getCategory() {
		return category;
	}

	public int getPrice() {
		return price;
	}

	public boolean isChicken() {
		return this.category == Category.CHICKEN;
	}
}