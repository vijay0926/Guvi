package pr;

public class password {

public static void main(String[] args) {
Scanner s=new Scanner(System.in);
String n1= s.nextLine();
String n2= s.nextLine();
String pin="630056";int i=0;
int N=4;
String t="",r="",p="", h="";
if(n1.length()>n2.length()){
t=n1;
n1=n2;
n2=t;}
else
if(n1.length()==n2.length()){
if(n1.compareTo(ln)>0)
{
t=n2;
n2=n1;
n1=t;}}
System.out.println("larger name:"+ln);
System.out.println("smaller name:"+n1);
System.out.println("pin:"+pin);
r=n2.charAt(0)+n1;
for(i=0;i<r.length();i++)
{
  h= Character.toString(r.charAt(i));
if(Character.isUpperCase(r.charAt(i)))
{
p+=h.toLowerCase();}
else{
p+=h.toUpperCase();}}
System.out.println(p+pin.charAt(N-1)+pin.charAt(pin.length()-N));}}
    
