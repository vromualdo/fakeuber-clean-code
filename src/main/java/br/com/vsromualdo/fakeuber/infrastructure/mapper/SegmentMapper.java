package br.com.vsromualdo.fakeuber.infrastructure.mapper;

import java.util.List;

import br.com.vsromualdo.fakeuber.application.usecase.bankInvoice.dto.SegmentAInputDTO;
import br.com.vsromualdo.fakeuber.infrastructure.inbound.listener.bankinvoice.dto.SegmentADTO;

public final class SegmentMapper {
    
	private SegmentMapper() {
    }

    public static List<SegmentAInputDTO> segmentRequestToSegmentInput(List<SegmentADTO> segments){
        if(segments == null){
            return null;
        }
        return segments.stream().map(s -> 
        		new SegmentAInputDTO(
        				s.getBank(),
        				s.getAccount(),
        				s.getAccount()
        				)).toList();
    }
}
