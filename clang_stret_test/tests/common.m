
@interface test
+(struct PascalString) test2;
@end


int main() {
 struct PascalString t = [test test2];
 return sizeof(t);
}
