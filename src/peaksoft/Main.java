package peaksoft;

import peaksoft.CompanyService.CompanyService;
import peaksoft.CompanyService.ServiceImpl.CompanyServiceImpl;
import peaksoft.CompanyService.ServiceImpl.GroupServiceImpl;
import peaksoft.model.Company;
import peaksoft.model.Group;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        CompanyServiceImpl companyService = new CompanyServiceImpl();
//        System.out.println(companyService.createCompany(new Company(1L,"Peaksoft","Kyrgyzstan","grajdanskaya 119")));
//        System.out.println(Arrays.toString(companyService.getAllCompanaies()));

//        System.out.println(companyService.updateCompany(1L, new Company(1L, "codWise", "USA", "Chicago")));
//        System.out.println(Arrays.toString(companyService.deleteCompany(1L)));
//
        GroupServiceImpl groupService = new GroupServiceImpl(companyService);
      //  System.out.println(Arrays.toString(groupService.saveGroup(1L, new Group(1L, "Java10", LocalDate.of(2023, 4, 3)))));
       // System.out.println(Arrays.toString(groupService.saveGroup((long) 1L)));

        Group group = new Group(2L, "Java10", LocalDate.of(2023, 4, 3));
        Group []groups ={group};
        Company company= new Company(1L,"Peaksoft","Kyrgyzstan","grajdanskaya 119",groups);
        Company []companies = {company};
      //  System.out.println(groupService.getById(1L,groups));
      //  System.out.println(companyService.getCompanyById(1L));
        System.out.println(groupService.getAllGroupByCompanyId(1L));
    }
}