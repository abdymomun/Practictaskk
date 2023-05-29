package peaksoft.CompanyService;

import peaksoft.model.Company;

public interface CompanyService {
    //crud
    // Create - comapny
    String createCompany(Company...companies);
    // Read - getAllCompanies
    Company[]getAllCompanaies();
    Company getCompanyById(Long id);
    //U- update
    Company updateCompany(Long OldCompanyId,Company Newcompany);
    //D - delete
    Company[] deleteCompany(Long id);

}
