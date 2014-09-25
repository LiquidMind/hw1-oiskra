package SharedResources;

import java.util.Set;

public interface IGoldenSampleMap {
        /**
         * Get the set of annotations from the file with golden samples
         * @param sentenceId The ID of the sentence that golden sample annotation comes from
         * @return Set of pure strings with golden samples without preceding and trailing spaces
         * @author Oleg Iskra <oleg.iskra@gmail.com>
         */
        Set<String> getSentenceAnnotations(String sentenceId);
}