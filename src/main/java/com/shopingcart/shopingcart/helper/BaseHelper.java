/*
package com.shopingcart.shopingcart.helper;

public class BaseHelper<M,P> {

    public M toModel(P dto) {
        return toModel(blankModel(), dto);
    }

    public M toModel(M m, P p) {
        */
/*Common Code for P to M*//*



        FromToCopy.copy(p, m);

        m.getServiceForm().setAgree(p.isAgree());
        m.getServiceForm().setApplicantFirstName(p.getFirstName());
        m.getServiceForm().setApplicantLastName(p.getLastName());
        m.getServiceForm().setApplicantMiddleName(p.getMiddleName());
        m.getServiceForm().setApplicantName(p.getApplicantName());
        m.getServiceForm().setApplicantNameGuj(p.getApplicantNameGuj());
        m.getServiceForm().setApplicantEmail(p.getEmail());
        m.getServiceForm().setApplicantContactNo(p.getContactNo());
        m.getServiceForm().setApplicantMobileNo(p.getMobileNo());
        m.getServiceForm().setApplicantAadhaarNo(p.getAadhaarNo());
        return copyToModel(m, p);
    }

    @Override
    protected M blankModel(M m) {
        return createModel(m);
    }

    public M createModel(M m){
        return m;
    }

    @Override
    public P fromModel(M m) {
        */
/*Common Code for M to P*//*

        P p = createDTO();

        p.setServiceDetail(m.getCitizenServiceType().getFullDTO());

        p.setId(m.getId());
        p.setServiceFormId(m.getServiceFormId());
        p.setUpdatedDate(AllUtil.formatDate(m.getUpdatedDate()));
        p.setCreatedDate(AllUtil.formatDate(m.getCreatedDate()));
        p.setUniqueId(m.getUniqueId());
        p.setVersion(m.getVersion());
        p.setAgree(m.getServiceForm().getAgree());
        p.setFileNumber(m.getServiceForm().getFileNumber());
        FileStatus deptFileStatus = m.getServiceForm().getDeptFileStatus();
        p.setDeptFileStatus(Objects.isNull(deptFileStatus) ? null : deptFileStatus.getType());
        p.setFileStatus(m.getServiceForm().getFileStatus().getType());
        p.setServiceType(m.getCitizenServiceType().getType());
        p.setEmail(m.getServiceForm().getApplicantEmail());
        p.setContactNo(m.getServiceForm().getApplicantContactNo());
        p.setMobileNo(m.getServiceForm().getApplicantMobileNo());
        p.setAadhaarNo(m.getServiceForm().getApplicantAadhaarNo());

        p.setCanEdit(m.getServiceForm().canEdit());
        p.setCanDelete(m.getServiceForm().canDelete());
        p.setCanSubmit(m.getServiceForm().canSubmit());
        p.setServiceCode(m.getCitizenServiceType().getCode());

        FromToCopy.copy(m, p);
        p.setFirstName(m.getServiceForm().getApplicantFirstName());
        p.setLastName(m.getServiceForm().getApplicantLastName());
        p.setMiddleName(m.getServiceForm().getApplicantMiddleName());
        p.setApplicantName(m.getServiceForm().getApplicantName());
        p.setApplicantNameGuj(m.getServiceForm().getApplicantNameGuj());
        return copyToDTO(m, p);
    }

    protected boolean canEdit(M m) {
        return m.getServiceForm().getFileStatus() == FileStatus.DRAFT;
    }

    protected boolean canDelete(M m) {
        return m.getServiceForm().getFileStatus() == FileStatus.DRAFT;
    }

    protected boolean canSubmit(M m) {
        return m.getServiceForm().getFileStatus() == FileStatus.DRAFT;
    }

    public abstract M copyToModel(M m, P p);

    public abstract P copyToDTO(M m, P p);

    public abstract P createDTO();

    public PortalUser loadPortalUser(ModelContext context) {
        Optional contextUser = context.getUser();
        if (!contextUser.isPresent()) {
            throw AppException.unauthorisedUser();
        }

        if (contextUser.get() instanceof PortalUser) {
            return (PortalUser) contextUser.get();
        }
        if (contextUser.get() instanceof LoginUser) {
            return portalUserManager.get(((LoginUser) contextUser.get()).getUserId())
                    .orElseThrow(AppException::unauthorisedUser);
        }
        throw AppException.unauthorisedUser();
    }

    protected LookUpItem fromLookupItemDTO(String typeCode, LookupDataDTO lookup) {
        if (StringUtils.isEmpty(typeCode) || Objects.isNull(lookup) || StringUtils
                .isEmpty(lookup.getCode())) {
            return null;
        }
        return lookUpItemManager.find(typeCode, lookup.getCode());
    }

    protected List<LookUpItem> fromLookupItemDTO(String typeCode, List<LookupDataDTO> lookup) {
        if (StringUtils.isEmpty(typeCode) || Objects.isNull(lookup)) {
            return Collections.emptyList();
        }
        return lookup.stream().map(dto -> lookUpItemManager.find(typeCode, dto.getCode()))
                .collect(Collectors.toList());
    }

    public List<LookupDataDTO> toLookupItemDTO(List<LookUpItem> items) {
        return items.stream().map(this::toLookup).collect(Collectors.toList());
    }

    public List<DataDTO> toLevelDataDTO(List<LevelData> items) {
        return items.stream().map(this::toData).collect(Collectors.toList());
    }

    public LookUpItemDTO toLookupItemDTO(LookUpItem lookUpItem) {
        if (Objects.isNull(lookUpItem)) {
            return null;
        }
        LookUpItemDTO lookUpItemDTO = new LookUpItemDTO();
        lookUpItemDTO.setId(lookUpItem.getId());
        lookUpItemDTO.setCode(lookUpItem.getCode());
        lookUpItemDTO.setName(lookUpItem.getName());
        lookUpItemDTO.setGujName(lookUpItem.getGujName());
        return lookUpItemDTO;
    }

    protected NGBaseDTO toNGDTO(final M m){
        return null;
    }

    protected NGBaseDTO getNGDTO(M model, NGBaseDTO dto) {
        FromToCopy.copy(model, dto);
        dto.setId(model.getId());
        dto.setApplicationId(model.getUniqueId());
        dto.setApplicationName(model.getServiceForm().getServiceType().getName());
        dto.setType(model.getServiceForm().getServiceType().getType());
        dto.setFileNumber(model.getServiceForm().getFileNumber());
        dto.setIagree(model.getServiceForm().getAgree());
        dto.setStatus(model.getServiceForm().getFileStatus().getName());
        dto.setCreatedBy(model.getServiceForm().getUser().getUserType().toString());
        dto.setLoiNumber(model.getServiceForm().getLoiNumber());
        return dto;
    }
}
*/
