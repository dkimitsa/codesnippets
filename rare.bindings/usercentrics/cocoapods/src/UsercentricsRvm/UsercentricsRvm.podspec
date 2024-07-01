
Pod::Spec.new do |s|
  s.name             = 'UsercentricsRvm'
  s.version          = '2.15.2'
  s.summary          = 'Usercentrics for RoboVM'
  s.description      = 'RoboVM objc wrapper for Usercentrics/UsercentricsUI swift code'

  s.homepage         = 'https://github.com/dkimitsa/codesnippets/tree/rare.bindings/rare.bindings/usercentrics'
  s.license          = { :type => 'MIT' }
  s.author           = { 'dkimitsa' => 'demyan.kimitsa@gmail.com' }
  s.source           = { :git => 'https://github.com/dkimitsa/codesnippets.git' }

  s.ios.deployment_target = '12.0'
  s.source_files = 'Classes/**/*'
  
  s.public_header_files = 'Pod/Classes/**/*.h'
  s.dependency 'UsercentricsUI', s.version.to_s

end
