package com.gmail.apachdima.fa.file.storage.repository;

import com.gmail.apachdima.fa.file.storage.model.StoredFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface FileStorageRepository extends JpaRepository<StoredFile, String> {
}
