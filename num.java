class tech
{
      String name,college,address,bloodgroup;
      int rollno,age;
      long pincode;

      public void details(String name,String college,String address,String bloodgroup,int rollno,int age,long pincode)
      {
            System.out.println("Name = "+name);
            System.out.println("College = "+college);
            System.out.println("Address = "+address);
            System.out.println("Bloodgroup = "+bloodgroup);
            System.out.println("Rollno = "+rollno);
            System.out.println("Age = "+age);
            System.out.println("Pincode = "+pincode);
      }
      public void data()
      {
            this.name=name;
            this.college=college;
            this.address=address;
            this.bloodgroup=bloodgroup;
            this.rollno=rollno;
            this.age=age;
            this.pincode=pincode;
      }
}


class num
{
      static public void main(String asd[])
      {
            tech obj = new tech();
            obj.details("Giri","HICET","Pollachi main road","A+",38,22,641032);
            obj.data();
      }
}           