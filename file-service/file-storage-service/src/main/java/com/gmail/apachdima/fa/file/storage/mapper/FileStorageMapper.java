package com.gmail.apachdima.fa.file.storage.mapper;

import com.gmail.apachdima.fa.common.dto.file.FileResponseDTO;
import com.gmail.apachdima.fa.file.storage.model.StoredFile;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface FileStorageMapper {

    FileResponseDTO toFileResponseDTO(StoredFile storedFile);
}
