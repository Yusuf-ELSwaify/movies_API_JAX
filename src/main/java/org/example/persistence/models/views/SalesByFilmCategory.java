package org.example.persistence.models.views;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;

/**
 * Mapping for DB view
 */
@Entity
@Immutable
@Table(name = "sales_by_film_category")
public class SalesByFilmCategory {
	@Column(name = "category", nullable = false, length = 25)
	private String category;

	@Column(name = "total_sales", precision = 27, scale = 2)
	private BigDecimal totalSales;

	public String getCategory() {
		return category;
	}

	public BigDecimal getTotalSales() {
		return totalSales;
	}

	protected SalesByFilmCategory() {
	}
}