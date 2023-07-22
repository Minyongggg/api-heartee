package paibridge.apiheartee.partner.service;

import java.util.List;
import java.util.stream.Collectors;
import javax.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import paibridge.apiheartee.counsel.entity.CounselCategory;
import paibridge.apiheartee.counsel.repository.CounselCategoryRepository;
import paibridge.apiheartee.partner.dto.PartnerDto;
import paibridge.apiheartee.partner.entity.Partner;
import paibridge.apiheartee.partner.repository.PartnerRepository;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PartnerService {

    private final PartnerRepository partnerRepository;
    private final CounselCategoryRepository counselCategoryRepository;

    public List<PartnerDto> findPartners(Long memberId, String dtype) {

        List<CounselCategory> categories = counselCategoryRepository.findAll();
        List<Partner> partners = partnerRepository.findAll(memberId, dtype);
        return partners.stream()
            .map(p -> PartnerDto.create(p, categories))
            .collect(Collectors.toList());
    }

    public PartnerDto findPartner(Long partnerId) throws EntityNotFoundException {

        List<CounselCategory> categories = counselCategoryRepository.findAll();
        Partner partner = partnerRepository.findById(partnerId).orElse(null);

        if (partner == null) {
            throw new EntityNotFoundException("Partner not found");
        }

        return PartnerDto.create(partner, categories);
    }
}
