package peaksoft.CompanyService.ServiceImpl;

import peaksoft.CompanyService.CompanyService;
import peaksoft.model.Company;

public class CompanyServiceImpl implements CompanyService {
private  Company[]companies;
    @Override
    public String createCompany(Company... company) {
        Company[]companies1;
         if (companies==null){
             companies=company;
         }else {
             companies1=new Company[companies.length+company.length];
             for (int i = 0; i < companies.length; i++) {
                 companies1[i]=companies[i];
             }
              companies=companies1;

         }
         return "Company Successfuly saved...";
    }

    @Override
    public Company[] getAllCompanaies() {
        return companies;
    }

    @Override
    public Company getCompanyById(Long id) {
        for (int i = 0; i <companies.length ; i++) {
            if (companies[i].getId()==id){
                return companies[i];
            }

        }
        return null;
    }

    @Override
    public Company updateCompany(Long OldCompanyId, Company Newcompany) {
      Company company1= getCompanyById(OldCompanyId);
      company1.setName(Newcompany.getName());
      company1.setCountry(Newcompany.getCountry());
      company1.setAddress(Newcompany.getAddress());
      company1.setGroups(Newcompany.getGroups());
      company1.setInstuctors(Newcompany.getInstuctors());
      company1.setStudents(Newcompany.getStudents());
      return company1;

    }

    @Override
    public Company[] deleteCompany(Long id) {
 Company company = getCompanyById(id);
        for (int i = 0; i <companies.length ; i++) {
            if (companies[i].equals(company)){
                companies[i]=null;
            }
        }
        return companies;
    }
}
