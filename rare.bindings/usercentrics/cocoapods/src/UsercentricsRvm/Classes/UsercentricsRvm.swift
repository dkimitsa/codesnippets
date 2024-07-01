
import Foundation
import Usercentrics
import UsercentricsUI
import UIKit


@objc(UsercentricsUserInteractionRvm)
public enum UsercentricsUserInteractionRvm: Int {
    case acceptAll
    case denyAll
    case granular
    case noInteraction
}

extension UsercentricsUI.UsercentricsUserInteraction {
    func toRvm() -> UsercentricsUserInteractionRvm {
        switch self {
        case .acceptAll: return UsercentricsUserInteractionRvm.acceptAll
        case .denyAll: return UsercentricsUserInteractionRvm.denyAll
        case .granular: return UsercentricsUserInteractionRvm.granular
        case .noInteraction: return UsercentricsUserInteractionRvm.noInteraction
        }
    }
}

@objc(UsercentricsConsentUserResponseRvm)
public class UsercentricsConsentUserResponseRvm: NSObject {
    private let origin: UsercentricsUI.UsercentricsConsentUserResponse
    
    @objc public var consents: [UsercentricsServiceConsent] { return origin.consents }
    @objc public var controllerId: String { return origin.controllerId }
    @objc public var userInteraction: UsercentricsUserInteractionRvm { return origin.userInteraction.toRvm() }

    init(origin: UsercentricsUI.UsercentricsConsentUserResponse) {
        self.origin = origin
    }
}


@objc(UsercentricsRvm)
public class UsercentricsRvm: NSObject {

    @objc public static func showFirstLayer(hostView: UIViewController, completion: @escaping (UsercentricsConsentUserResponseRvm) -> Void) {
        let banner = UsercentricsBanner()
        banner.showFirstLayer(hostView: hostView) { response in
            let rvmResponse = UsercentricsConsentUserResponseRvm(origin: response)
            completion(rvmResponse)
        }
    }

    @objc public static func showSecondLayer(hostView: UIViewController, completion: @escaping (UsercentricsConsentUserResponseRvm) -> Void) {
        let banner = UsercentricsBanner()
        banner.showSecondLayer(hostView: hostView) { response in
            let rvmResponse = UsercentricsConsentUserResponseRvm(origin: response)
            completion(rvmResponse)
        }
    }
    
    private override init() {
    }
}
