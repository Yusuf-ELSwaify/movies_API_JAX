package org.example.persistence.models;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.ToString;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;
@ToString
@Embeddable
public class FilmCategoryId implements Serializable {
	private static final long serialVersionUID = -221541095876586910L;
	@Column(name = "film_id", columnDefinition = "smallint UNSIGNED not null")
	private Integer filmId;

	@Column(name = "category_id", columnDefinition = "tinyint UNSIGNED not null")
	private Short categoryId;

	public Integer getFilmId() {
		return filmId;
	}

	public void setFilmId(Integer filmId) {
		this.filmId = filmId;
	}

	public Short getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Short categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
		FilmCategoryId entity = (FilmCategoryId) o;
		return Objects.equals(this.filmId, entity.filmId) &&
				Objects.equals(this.categoryId, entity.categoryId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(filmId, categoryId);
	}

}