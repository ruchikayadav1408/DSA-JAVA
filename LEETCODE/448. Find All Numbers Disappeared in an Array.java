class Solution {
    public List<Integer> findDisappearedNumbers(int[] a) {
        Set<Integer> set = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i : a) set.add(i); // removing duplicate elements

       for(int i = 1; i <= a.length; i++){
           if(!set.contains(i)) result.add(i);
       }
        return result;
    }
}
