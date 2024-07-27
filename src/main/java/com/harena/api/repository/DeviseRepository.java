package com.harena.api.repository;

import com.harena.api.dto.json.DeviseDataJsonFile;
import com.harena.api.repository.utils.LoadDataFromJsonFileInterface;
import org.springframework.stereotype.Repository;

@Repository
public interface DeviseRepository extends LoadDataFromJsonFileInterface<DeviseDataJsonFile> {
}
