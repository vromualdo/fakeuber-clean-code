package br.com.vsromualdo.fakeuber.infrastructure.inbound.listener.bankinvoice;

import java.util.List;

import br.com.vsromualdo.fakeuber.application.usecase.bankInvoice.FileBankInvoiceUseCase;
import br.com.vsromualdo.fakeuber.infrastructure.inbound.listener.bankinvoice.dto.SegmentADTO;
import br.com.vsromualdo.fakeuber.infrastructure.mapper.SegmentMapper;

public class FileBankInvoiceListener {

	private final FileBankInvoiceUseCase bankInvoiceUseCase;

	public FileBankInvoiceListener(FileBankInvoiceUseCase bankInvoiceUseCase){
		this.bankInvoiceUseCase = bankInvoiceUseCase;
	}
	
	public void listenerFile(List<SegmentADTO> segments) {
		this.bankInvoiceUseCase.execute(SegmentMapper.segmentRequestToSegmentInput(segments));
	}
}
