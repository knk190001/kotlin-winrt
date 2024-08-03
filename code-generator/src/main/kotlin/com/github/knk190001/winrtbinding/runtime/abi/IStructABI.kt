import com.github.knk190001.winrtbinding.runtime.abi.IABI
import java.lang.foreign.MemorySegment

interface IStructABI<Managed: Any> : IABI<Managed, MemorySegment> {
    fun byValue(struct: Managed): Managed
}