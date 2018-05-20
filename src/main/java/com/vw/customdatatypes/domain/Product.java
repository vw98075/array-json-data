package com.vw.customdatatypes.domain;

import com.vw.customdatatypes.usertype.JsonDataUserType;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import javax.validation.constraints.*;

import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;

/**
 * A Product.
 */
@Entity
@Table(name = "product")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "product")
@TypeDef(name = "JsonDataUserType", typeClass = JsonDataUserType.class)
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    private Long id;

    @NotNull
    @Size(max = 80)
    @Column(name = "brand", length = 80, nullable = false)
    private String brand;

    @NotNull
    @Size(max = 80)
    @Column(name = "name", length = 80, nullable = false)
    private String name;

    @Column(name = "keywords")
    private String keywords;

    @Column(name = "specs")
    @Type(type = "JsonDataUserType")
    private Map<String, String> specs;

    @Column(name = "season")
    private String season;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public Product brand(String brand) {
        this.brand = brand;
        return this;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public Product name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeywords() {
        return keywords;
    }

    public Product keywords(String keywords) {
        this.keywords = keywords;
        return this;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public Map<String, String> getSpecs() {
        return specs;
    }

    public Product specs(Map<String, String> specs) {
        this.specs = specs;
        return this;
    }

    public void setSpecs(Map<String, String> specs) {
        this.specs = specs;
    }

    public String getSeason() {
        return season;
    }

    public Product season(String season) {
        this.season = season;
        return this;
    }

    public void setSeason(String season) {
        this.season = season;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        if (product.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), product.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Product{" +
            "id=" + getId() +
            ", brand='" + getBrand() + "'" +
            ", name='" + getName() + "'" +
            ", keywords='" + getKeywords() + "'" +
            ", specs='" + getSpecs() + "'" +
            ", season='" + getSeason() + "'" +
            "}";
    }
}
