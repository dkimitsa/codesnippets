#pragma pack(push, 1)
struct padding { short p1; };
struct PascalString { char v1; struct padding v2; char v3;};
#pragma pack(pop)

#include "common.m"
