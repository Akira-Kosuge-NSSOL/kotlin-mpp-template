//
//  ViewController.swift
//  kotlin-mpp-template
//
//  Created by akosuge on 2018/11/29.
//  Copyright © 2018年 akosuge. All rights reserved.
//

import UIKit
import common

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        
        let label = UILabel(frame: CGRect(x: 0, y: 0, width: 300, height: 21))
        label.center = CGPoint(x: 160, y: 285)
        label.textAlignment = .center
        label.font = label.font.withSize(16)
        label.text = PlatformKt.createApplicationScreenMessage()
        view.addSubview(label)

        let label2 = UILabel(frame: CGRect(x: 0, y: 0, width: 300, height: 21))
        label2.center = CGPoint(x: 160, y: 315)
        label2.textAlignment = .center
        label2.font = label.font.withSize(16)
        label2.text = Platform().name()
        view.addSubview(label2)
    }
}

