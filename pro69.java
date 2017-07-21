class Hello
{
public static void main(String[] args)
{

String fn=args[0];
String ln=args[1];
String pin=args[2];int i=0;
int N=Integer.parseInt(args[3]);
String t="",r="",p="";
if(fn.length()>ln.length()){
t=fn;
fn=ln;
ln=t;}
else
if(fn.length()==ln.length()){
if(fn.compareTo(ln)>0)
{
t=ln;
ln=fn;
fn=t;}}
System.out.println("larger name:"+ln);
System.out.println("smaller name:"+fn);
System.out.println("pin:"+pin);
r=ln.charAt(0)+fn+pin.charAt(N-1)+pin.charAt(pin.length()-N);
for(i=0;i<r.length()-3;i++)
{
if(character.isUpperCase(r.charAt(i)))
{
p+=r.toLowerCase(i);}
else{
p+=r.toUpperCase(i);}}
System.out.println(r);}}
