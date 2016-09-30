;; gorilla-repl.fileformat = 1

;; **
;;; # Gorilla REPL
;;;
;;; Welcome to gorilla :-)
;;;
;;; Shift + enter evaluates code. Hit ctrl+g twice in quick succession or click the menu icon (upper-right corner) for more commands ...
;;;
;;; It's a good habit to run each worksheet in its own namespace: feel free to use the declaration we've provided below if you'd like.
;; **

;; @@
(ns charming-canopy
  (:require [gorilla-plot.core :as plot]))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-nil'>nil</span>","value":"nil"}
;; <=

;; @@
(import '(java.util Random))
(defn normals
  [s]
  (let [r (Random.)]
    (take s (repeatedly #(-> r .nextGaussian (* 0.5) (+ 1.0))))))
;; @@
;; =>
;;; {"type":"html","content":"<span class='clj-var'>#&#x27;charming-canopy/normals</span>","value":"#'charming-canopy/normals"}
;; <=

;; @@
(plot/histogram (normals 10) :normalize :probability)
;; @@
;; =>
;;; {"type":"vega","content":{"axes":[{"scale":"x","type":"x"},{"scale":"y","type":"y"}],"scales":[{"name":"x","type":"linear","range":"width","zero":false,"domain":{"data":"82ed3600-63c0-4f5d-afa9-7782cea76245","field":"data.x"}},{"name":"y","type":"linear","range":"height","nice":true,"zero":false,"domain":{"data":"82ed3600-63c0-4f5d-afa9-7782cea76245","field":"data.y"}}],"marks":[{"type":"line","from":{"data":"82ed3600-63c0-4f5d-afa9-7782cea76245"},"properties":{"enter":{"x":{"scale":"x","field":"data.x"},"y":{"scale":"y","field":"data.y"},"interpolate":{"value":"step-before"},"fill":{"value":"steelblue"},"fillOpacity":{"value":0.4},"stroke":{"value":"steelblue"},"strokeWidth":{"value":2},"strokeOpacity":{"value":1}}}}],"data":[{"name":"82ed3600-63c0-4f5d-afa9-7782cea76245","values":[{"x":0.10010735930104864,"y":0},{"x":0.3708578911657459,"y":0.2},{"x":0.6416084230304432,"y":0.3},{"x":0.9123589548951405,"y":0.2},{"x":1.1831094867598377,"y":0.0},{"x":1.453860018624535,"y":0.3},{"x":1.7246105504892322,"y":0}]}],"width":400,"height":247.2187957763672,"padding":{"bottom":40,"top":10,"right":10,"left":55}},"value":"#gorilla_repl.vega.VegaView{:content {:axes [{:scale \"x\", :type \"x\"} {:scale \"y\", :type \"y\"}], :scales [{:name \"x\", :type \"linear\", :range \"width\", :zero false, :domain {:data \"82ed3600-63c0-4f5d-afa9-7782cea76245\", :field \"data.x\"}} {:name \"y\", :type \"linear\", :range \"height\", :nice true, :zero false, :domain {:data \"82ed3600-63c0-4f5d-afa9-7782cea76245\", :field \"data.y\"}}], :marks [{:type \"line\", :from {:data \"82ed3600-63c0-4f5d-afa9-7782cea76245\"}, :properties {:enter {:x {:scale \"x\", :field \"data.x\"}, :y {:scale \"y\", :field \"data.y\"}, :interpolate {:value \"step-before\"}, :fill {:value \"steelblue\"}, :fillOpacity {:value 0.4}, :stroke {:value \"steelblue\"}, :strokeWidth {:value 2}, :strokeOpacity {:value 1}}}}], :data [{:name \"82ed3600-63c0-4f5d-afa9-7782cea76245\", :values ({:x 0.10010735930104864, :y 0} {:x 0.3708578911657459, :y 0.2} {:x 0.6416084230304432, :y 0.3} {:x 0.9123589548951405, :y 0.2} {:x 1.1831094867598377, :y 0.0} {:x 1.453860018624535, :y 0.3} {:x 1.7246105504892322, :y 0})}], :width 400, :height 247.2188, :padding {:bottom 40, :top 10, :right 10, :left 55}}}"}
;; <=

;; @@
(plot/histogram (normals 100) :normalize :probability)
;; @@
;; =>
;;; {"type":"vega","content":{"axes":[{"scale":"x","type":"x"},{"scale":"y","type":"y"}],"scales":[{"name":"x","type":"linear","range":"width","zero":false,"domain":{"data":"efdcb0c7-a6c8-4de8-842f-3d09b1ea0852","field":"data.x"}},{"name":"y","type":"linear","range":"height","nice":true,"zero":false,"domain":{"data":"efdcb0c7-a6c8-4de8-842f-3d09b1ea0852","field":"data.y"}}],"marks":[{"type":"line","from":{"data":"efdcb0c7-a6c8-4de8-842f-3d09b1ea0852"},"properties":{"enter":{"x":{"scale":"x","field":"data.x"},"y":{"scale":"y","field":"data.y"},"interpolate":{"value":"step-before"},"fill":{"value":"steelblue"},"fillOpacity":{"value":0.4},"stroke":{"value":"steelblue"},"strokeWidth":{"value":2},"strokeOpacity":{"value":1}}}}],"data":[{"name":"efdcb0c7-a6c8-4de8-842f-3d09b1ea0852","values":[{"x":-0.10903406901644508,"y":0},{"x":0.19124217752166583,"y":0.04},{"x":0.49151842405977675,"y":0.06},{"x":0.7917946705978877,"y":0.24},{"x":1.0920709171359986,"y":0.28},{"x":1.3923471636741094,"y":0.15},{"x":1.6926234102122204,"y":0.1},{"x":1.9928996567503314,"y":0.08},{"x":2.2931759032884425,"y":0.05},{"x":2.5934521498265535,"y":0}]}],"width":400,"height":247.2187957763672,"padding":{"bottom":40,"top":10,"right":10,"left":55}},"value":"#gorilla_repl.vega.VegaView{:content {:axes [{:scale \"x\", :type \"x\"} {:scale \"y\", :type \"y\"}], :scales [{:name \"x\", :type \"linear\", :range \"width\", :zero false, :domain {:data \"efdcb0c7-a6c8-4de8-842f-3d09b1ea0852\", :field \"data.x\"}} {:name \"y\", :type \"linear\", :range \"height\", :nice true, :zero false, :domain {:data \"efdcb0c7-a6c8-4de8-842f-3d09b1ea0852\", :field \"data.y\"}}], :marks [{:type \"line\", :from {:data \"efdcb0c7-a6c8-4de8-842f-3d09b1ea0852\"}, :properties {:enter {:x {:scale \"x\", :field \"data.x\"}, :y {:scale \"y\", :field \"data.y\"}, :interpolate {:value \"step-before\"}, :fill {:value \"steelblue\"}, :fillOpacity {:value 0.4}, :stroke {:value \"steelblue\"}, :strokeWidth {:value 2}, :strokeOpacity {:value 1}}}}], :data [{:name \"efdcb0c7-a6c8-4de8-842f-3d09b1ea0852\", :values ({:x -0.10903406901644508, :y 0} {:x 0.19124217752166583, :y 0.04} {:x 0.49151842405977675, :y 0.06} {:x 0.7917946705978877, :y 0.24} {:x 1.0920709171359986, :y 0.28} {:x 1.3923471636741094, :y 0.15} {:x 1.6926234102122204, :y 0.1} {:x 1.9928996567503314, :y 0.08} {:x 2.2931759032884425, :y 0.05} {:x 2.5934521498265535, :y 0})}], :width 400, :height 247.2188, :padding {:bottom 40, :top 10, :right 10, :left 55}}}"}
;; <=

;; @@
(plot/histogram (normals 1000) :normalize :probability)
;; @@
;; =>
;;; {"type":"vega","content":{"axes":[{"scale":"x","type":"x"},{"scale":"y","type":"y"}],"scales":[{"name":"x","type":"linear","range":"width","zero":false,"domain":{"data":"28d3cb93-fe13-4421-9a09-d46ebd3bddf5","field":"data.x"}},{"name":"y","type":"linear","range":"height","nice":true,"zero":false,"domain":{"data":"28d3cb93-fe13-4421-9a09-d46ebd3bddf5","field":"data.y"}}],"marks":[{"type":"line","from":{"data":"28d3cb93-fe13-4421-9a09-d46ebd3bddf5"},"properties":{"enter":{"x":{"scale":"x","field":"data.x"},"y":{"scale":"y","field":"data.y"},"interpolate":{"value":"step-before"},"fill":{"value":"steelblue"},"fillOpacity":{"value":0.4},"stroke":{"value":"steelblue"},"strokeWidth":{"value":2},"strokeOpacity":{"value":1}}}}],"data":[{"name":"28d3cb93-fe13-4421-9a09-d46ebd3bddf5","values":[{"x":-0.46766569933603575,"y":0},{"x":-0.16593689948240786,"y":0.01},{"x":0.13579190037122002,"y":0.028},{"x":0.4375207002248479,"y":0.081},{"x":0.7392495000784758,"y":0.186},{"x":1.0409782999321036,"y":0.224},{"x":1.3427070997857316,"y":0.22},{"x":1.6444358996393595,"y":0.14},{"x":1.9461646994929875,"y":0.077},{"x":2.2478934993466155,"y":0.026},{"x":2.5496222992002435,"y":0.007},{"x":2.8513510990538715,"y":0.001},{"x":3.1530798989074995,"y":0}]}],"width":400,"height":247.2187957763672,"padding":{"bottom":40,"top":10,"right":10,"left":55}},"value":"#gorilla_repl.vega.VegaView{:content {:axes [{:scale \"x\", :type \"x\"} {:scale \"y\", :type \"y\"}], :scales [{:name \"x\", :type \"linear\", :range \"width\", :zero false, :domain {:data \"28d3cb93-fe13-4421-9a09-d46ebd3bddf5\", :field \"data.x\"}} {:name \"y\", :type \"linear\", :range \"height\", :nice true, :zero false, :domain {:data \"28d3cb93-fe13-4421-9a09-d46ebd3bddf5\", :field \"data.y\"}}], :marks [{:type \"line\", :from {:data \"28d3cb93-fe13-4421-9a09-d46ebd3bddf5\"}, :properties {:enter {:x {:scale \"x\", :field \"data.x\"}, :y {:scale \"y\", :field \"data.y\"}, :interpolate {:value \"step-before\"}, :fill {:value \"steelblue\"}, :fillOpacity {:value 0.4}, :stroke {:value \"steelblue\"}, :strokeWidth {:value 2}, :strokeOpacity {:value 1}}}}], :data [{:name \"28d3cb93-fe13-4421-9a09-d46ebd3bddf5\", :values ({:x -0.46766569933603575, :y 0} {:x -0.16593689948240786, :y 0.01} {:x 0.13579190037122002, :y 0.028} {:x 0.4375207002248479, :y 0.081} {:x 0.7392495000784758, :y 0.186} {:x 1.0409782999321036, :y 0.224} {:x 1.3427070997857316, :y 0.22} {:x 1.6444358996393595, :y 0.14} {:x 1.9461646994929875, :y 0.077} {:x 2.2478934993466155, :y 0.026} {:x 2.5496222992002435, :y 0.007} {:x 2.8513510990538715, :y 0.001} {:x 3.1530798989074995, :y 0})}], :width 400, :height 247.2188, :padding {:bottom 40, :top 10, :right 10, :left 55}}}"}
;; <=

;; @@
(plot/histogram (normals 10000) :normalize :probability)
;; @@
;; =>
;;; {"type":"vega","content":{"axes":[{"scale":"x","type":"x"},{"scale":"y","type":"y"}],"scales":[{"name":"x","type":"linear","range":"width","zero":false,"domain":{"data":"b7f8367a-d1ee-4bd8-91d9-a1cd5ffbd25e","field":"data.x"}},{"name":"y","type":"linear","range":"height","nice":true,"zero":false,"domain":{"data":"b7f8367a-d1ee-4bd8-91d9-a1cd5ffbd25e","field":"data.y"}}],"marks":[{"type":"line","from":{"data":"b7f8367a-d1ee-4bd8-91d9-a1cd5ffbd25e"},"properties":{"enter":{"x":{"scale":"x","field":"data.x"},"y":{"scale":"y","field":"data.y"},"interpolate":{"value":"step-before"},"fill":{"value":"steelblue"},"fillOpacity":{"value":0.4},"stroke":{"value":"steelblue"},"strokeWidth":{"value":2},"strokeOpacity":{"value":1}}}}],"data":[{"name":"b7f8367a-d1ee-4bd8-91d9-a1cd5ffbd25e","values":[{"x":-0.7881163079483795,"y":0},{"x":-0.546407708715996,"y":7.0E-4},{"x":-0.30469910948361245,"y":0.0035},{"x":-0.06299051025122895,"y":0.0111},{"x":0.17871808898115454,"y":0.0312},{"x":0.420426688213538,"y":0.0706},{"x":0.6621352874459215,"y":0.1249},{"x":0.9038438866783051,"y":0.1719},{"x":1.1455524859106885,"y":0.2006},{"x":1.387261085143072,"y":0.1684},{"x":1.6289696843754555,"y":0.1157},{"x":1.870678283607839,"y":0.0621},{"x":2.1123868828402226,"y":0.0261},{"x":2.354095482072606,"y":0.0101},{"x":2.595804081304989,"y":0.0027},{"x":2.8375126805373725,"y":3.0E-4},{"x":3.079221279769756,"y":1.0E-4},{"x":3.320929879002139,"y":0}]}],"width":400,"height":247.2187957763672,"padding":{"bottom":40,"top":10,"right":10,"left":55}},"value":"#gorilla_repl.vega.VegaView{:content {:axes [{:scale \"x\", :type \"x\"} {:scale \"y\", :type \"y\"}], :scales [{:name \"x\", :type \"linear\", :range \"width\", :zero false, :domain {:data \"b7f8367a-d1ee-4bd8-91d9-a1cd5ffbd25e\", :field \"data.x\"}} {:name \"y\", :type \"linear\", :range \"height\", :nice true, :zero false, :domain {:data \"b7f8367a-d1ee-4bd8-91d9-a1cd5ffbd25e\", :field \"data.y\"}}], :marks [{:type \"line\", :from {:data \"b7f8367a-d1ee-4bd8-91d9-a1cd5ffbd25e\"}, :properties {:enter {:x {:scale \"x\", :field \"data.x\"}, :y {:scale \"y\", :field \"data.y\"}, :interpolate {:value \"step-before\"}, :fill {:value \"steelblue\"}, :fillOpacity {:value 0.4}, :stroke {:value \"steelblue\"}, :strokeWidth {:value 2}, :strokeOpacity {:value 1}}}}], :data [{:name \"b7f8367a-d1ee-4bd8-91d9-a1cd5ffbd25e\", :values ({:x -0.7881163079483795, :y 0} {:x -0.546407708715996, :y 7.0E-4} {:x -0.30469910948361245, :y 0.0035} {:x -0.06299051025122895, :y 0.0111} {:x 0.17871808898115454, :y 0.0312} {:x 0.420426688213538, :y 0.0706} {:x 0.6621352874459215, :y 0.1249} {:x 0.9038438866783051, :y 0.1719} {:x 1.1455524859106885, :y 0.2006} {:x 1.387261085143072, :y 0.1684} {:x 1.6289696843754555, :y 0.1157} {:x 1.870678283607839, :y 0.0621} {:x 2.1123868828402226, :y 0.0261} {:x 2.354095482072606, :y 0.0101} {:x 2.595804081304989, :y 0.0027} {:x 2.8375126805373725, :y 3.0E-4} {:x 3.079221279769756, :y 1.0E-4} {:x 3.320929879002139, :y 0})}], :width 400, :height 247.2188, :padding {:bottom 40, :top 10, :right 10, :left 55}}}"}
;; <=

;; @@

;; @@
