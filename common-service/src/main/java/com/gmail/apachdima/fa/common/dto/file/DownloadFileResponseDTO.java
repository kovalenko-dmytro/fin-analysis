package com.gmail.apachdima.fa.common.dto.file;

import lombok.Builder;

@Builder
public record DownloadFileResponseDTO(
    String fileName,
    byte[] resource
) {


}
