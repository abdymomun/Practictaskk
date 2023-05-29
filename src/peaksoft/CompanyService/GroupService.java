package peaksoft.CompanyService;

import peaksoft.model.Group;

public interface GroupService {
    Group[]saveGroup(Long id,Group...groups);
    String getById(Long id,Group[]groups);
    Group[] getAllGroupByCompanyId(Long companyId);
    Group upDateGroupByName(String name,Group group);
    String deleteGroupByCompanyId(Long companyId,Long groupId);

}
