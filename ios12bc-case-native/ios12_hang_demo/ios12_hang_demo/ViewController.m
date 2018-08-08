//
//  ViewController.m
//  ios12_hang_demo
//

#import "ViewController.h"
#import "darwin.h"

@interface ViewController ()

@end

@implementation ViewController {
    UILabel *label;
    int clickCount;
    CADisplayLink *displayLink;
    NSTimeInterval ts;
}

- (void)viewDidLoad {
    [super viewDidLoad];
    
    displayLink = [CADisplayLink displayLinkWithTarget:self selector:@selector(onUpdate)];
    [displayLink addToRunLoop:[NSRunLoop mainRunLoop] forMode:NSDefaultRunLoopMode];
    
    label = [[UILabel alloc] initWithFrame:CGRectMake(20, 350, 280, 44)];
    [[self view] addSubview:label];

    [self performSelectorInBackground:@selector(armageddon) withObject:nil];
}

-(void)armageddon {
    while (true) {
        GC_stop_world();
        GC_start_world();
    }
}

-(void)onUpdate{
    if ([[NSDate date] timeIntervalSince1970] - ts > 1) {
        ts = [[NSDate date] timeIntervalSince1970];
        [label setText:[NSString stringWithFormat:@"onUpdate %d", ++clickCount]];
    }
}

@end
