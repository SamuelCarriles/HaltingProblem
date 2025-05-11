(ns halting-problem.core)

(defn user-gen [name id school]
  [name id school])

(user-gen "Ernesto Laffita" "05042165523" "UCI")

(def usuarios '({:name "Ernesto Laffita"
                 :id "05042165523"
                 :school "UCI"}
                {:name "Samuel Carriles"
                 :id "05111662667"
                 :school "UCI"}
                {:name "Kevin"
                 :id "-------"
                 :school "Humbolt"}))
  
