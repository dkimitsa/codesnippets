file=$1
clang --target=x86_64-apple-darwin10 -S -emit-llvm tests/$file -o out/${file}.x86_64
clang --target=i386-apple-darwin10   -S -emit-llvm tests/$file -o out/${file}.x86
clang --target=armv7-apple-darwin10  -S -emit-llvm tests/$file -o out/${file}.armv7

echo                                             >> log.txt
echo                                             >> log.txt
echo                                             >> log.txt
echo $file                                       >> log.txt
echo __________________________                  >> log.txt
grep -B 10 'struct PascalString {' tests/$file   >> log.txt
grep '\%struct\.PascalString =' out/${file}.x86_64   >> log.txt
grep -H -o 'ret i32 .*'           out/${file}.x86_64   >> log.txt
grep -H -o 'ret i32 .*'           out/${file}.x86   >> log.txt
grep -H -o 'ret i32 .*'           out/${file}.armv7   >> log.txt
echo                                                 >> log.txt
grep -H 'declare .* \@objc_msgSend' out/${file}.x86_64     >> log.txt
grep -H 'declare .* \@objc_msgSend' out/${file}.x86        >> log.txt
grep -H 'declare .* \@objc_msgSend' out/${file}.armv7      >> log.txt


