public class CollegeInheritance {
    static class College {
        String collegeName, principalName;
        College(String c, String p) { collegeName=c; principalName=p; }
        void displayCollegeDetails() {
            System.out.println("CollegeName:" + collegeName);
            System.out.println("PrincipalName:" + principalName);
        }
    }
    static class Department extends College {
        String departmentName, hodName;
        Department(String c, String p, String d, String h) {
            super(c,p); departmentName=d; hodName=h;
        }
        void displayDepartmentDetails() {
            System.out.println("DepartmentName:" + departmentName);
            System.out.println("HODName:" + hodName);
        }
    }
    public static void main(String[] args) {
        Department obj = new Department("NIT","B.K.Sinha","Electronics","B.C.Rai");
        obj.displayCollegeDetails(); obj.displayDepartmentDetails();
    }
}
