package hello;
import java.util.*;
class Attendance
{
void markAttendance(String...s)
{
if(s.length==0)
{
System.out.println("Mass Bunk");
}
System.out.println(s.length+" "+"Students Present");
for(String name:s)
{
System.out.println(name);
}
}
public static void main(String args[])
{
Attendance a=new Attendance();
a.markAttendance("hari","rags","vibes","cooker","shalz");
a.markAttendance();
}
}
