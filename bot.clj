(defn run2 [] (println "run 2"))

(defn run
  [arena saved-state my-id]
  (println "run 1")
  {:type "MOVE"
   :metadata {:direction (rand-nth [0 1 2 3 4])}
   :saved-state {}})

(defn run3
  [arena saved-state my-id]
  (println "run 3")
  {:type "MOVE"
   :metadata {:direction (rand-nth [0 1 2 3 4])}
   :saved-state {}})
