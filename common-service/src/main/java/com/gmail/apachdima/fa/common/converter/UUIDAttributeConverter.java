package com.gmail.apachdima.fa.common.converter;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

/**
 * The UUIDAttributeConverter.
 */
@Converter(autoApply = true)
public class UUIDAttributeConverter implements AttributeConverter<UUID, String> {

    @Override
    public String convertToDatabaseColumn(UUID uuidId) {
        return Objects.isNull(uuidId) ? null : uuidId.toString();
    }

    @Override
    public UUID convertToEntityAttribute(String id) {
        return Objects.isNull(id) ? null : UUID.fromString(id);
    }
}
