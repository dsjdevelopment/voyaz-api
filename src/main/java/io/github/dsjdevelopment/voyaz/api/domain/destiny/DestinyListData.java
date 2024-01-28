package io.github.dsjdevelopment.voyaz.api.domain.destiny;

import java.math.BigDecimal;

public record DestinyListData(Long id, String photo1, String photo2, String name, BigDecimal price, String goal, String descriptiveText) {

    public DestinyListData(Destiny destiny) {
        this(destiny.getId(), destiny.getPhoto1(), destiny.getPhoto2(), destiny.getName(), destiny.getPrice(), destiny.getGoal(), destiny.getDescriptiveText());
    }
}