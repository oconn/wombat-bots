(defn run
  [arena saved-state my-id]
  {:type "MOVE"
   :metadata {:direction (rand-nth [0 1 2 3 4])}
   :saved-state {}})
