package org.example.persistence.models.views;

import jakarta.persistence.*;
import lombok.ToString;
import org.hibernate.annotations.Immutable;

import java.math.BigDecimal;

/**
 * Mapping for DB view
 */
@ToString
@Entity
@Immutable
@Table(name = "sales_by_store")
public class SalesByStore {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "store", length = 101)
	private String store;

	@Column(name = "manager", length = 91)
	private String manager;

	@Column(name = "total_sales", precision = 27, scale = 2)
	private BigDecimal totalSales;

	public String getStore() {
		return store;
	}

	public String getManager() {
		return manager;
	}

	public BigDecimal getTotalSales() {
		return totalSales;
	}

	protected SalesByStore() {
	}
}