package org.bs.x1.service;

import org.bs.x1.dto.PageResponseDTO;
import org.bs.x1.dto.ReplyDTO;
import org.bs.x1.dto.ReplyRequestDTO;

public interface ReplyService {
    
    // 리턴 타입은 PageResponseDTO
    PageResponseDTO<ReplyDTO> list (ReplyRequestDTO requestDTO);
}