
Pod::Spec.new do |s|
  s.name             = 'DonkeyAdsSDKKitRvm'
  s.version          = '1.0.0.0'
  s.summary          = 'DonkeyAdsSDKKitRvm for RoboVM'
  s.description      = 'RoboVM objc wrapper for DonkeyAdsSDKKit swift code'

  s.homepage         = 'https://github.com/dkimitsa/codesnippets/tree/rare.bindings/rare.bindings/donkeyads'
  s.license          = { :type => 'MIT' }
  s.author           = { 'dkimitsa' => 'demyan.kimitsa@gmail.com' }
  s.source           = { :git => 'https://github.com/dkimitsa/codesnippets.git' }

  s.ios.deployment_target = '13.0'
  s.source_files = 'Classes/**/*'
  
  s.public_header_files = 'Pod/Classes/**/*.h'
  s.vendored_frameworks = 'DonkeyAdsSDKKit.xcframework'
end
