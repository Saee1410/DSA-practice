import java.util.HashMap;

public class TwoSumMap {
    public int[] solveTwoSum(int[] nums, int target) {
        // १. एक रिकामा नकाशा (HashMap) तयार करा
        HashMap<Integer, Integer> map = new HashMap<>();

        // २. पूर्ण Array मधून एक-एक करून फिरा
        for (int i = 0; i < nums.length; i++) {
            // ३. सध्याच्या नंबरला जोडीदार (Complement) किती हवाय ते काढा
            int complement = target - nums[i];

            // ४. तपासा की तो जोडीदार आधी Map मध्ये आला आहे का?
            if (map.containsKey(complement)) {
                // जर सापडला, तर जोडीदाराचा इंडेक्स आणि आपला इंडेक्स रिटर्न करा
                return new int[] { map.get(complement), i };
            }

            // ५. जर सापडला नाही, तर स्वतःला Map मध्ये साठवा (Number -> Index)
            map.put(nums[i], i);
        }

        // ६. काहीच सापडलं नाही तर रिकामा अरे द्या
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 6, 4};
        int target = 5;

        TwoSumMap obj = new TwoSumMap();
        int[] result = obj.solveTwoSum(nums, target);

        if (result.length == 2) {
            System.out.println("मूळ इंडेक्स आहेत: " + result[0] + ", " + result[1]);
        }
    }
}

