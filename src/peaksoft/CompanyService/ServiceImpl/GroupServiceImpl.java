package peaksoft.CompanyService.ServiceImpl;

import peaksoft.CompanyService.GroupService;
import peaksoft.model.Company;
import peaksoft.model.Group;

import java.util.Objects;

public class GroupServiceImpl implements GroupService {
    private CompanyServiceImpl companyService;

    public GroupServiceImpl(CompanyServiceImpl companyService) {
        this.companyService = companyService;
    }
    Group [] groups;
Company []companies;
    @Override
    public Group[] saveGroup(Long id, Group... groups) {
       Company company = companyService.getCompanyById(id);
        company.setGroups(groups);
        return company.getGroups();
    }

    @Override
    public String getById(Long id,Group []groups) {
            for (Group g : groups) {
                if (id == g.getId()) {
                    return g.toString();
                }
            }
            return null;
    }


    @Override
    public Group [] getAllGroupByCompanyId(Long companyId) {
        for (int i = 0; i < ; i++) {
            
        }
         null;
    }
    @Override
    public Group upDateGroupByName(String name, Group group) {
        group.setName(name);
        return null;
    }

    @Override
    public String deleteGroupByCompanyId(Long companyId, Long groupId) {
        return null;
    }
}
