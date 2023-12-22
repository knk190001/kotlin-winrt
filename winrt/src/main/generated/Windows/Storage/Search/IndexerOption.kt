package Windows.Storage.Search

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.sun.jna.FromNativeContext
import com.sun.jna.NativeMapped
import java.lang.Class
import java.lang.IllegalArgumentException
import java.lang.Integer
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.JAVA_INT
import kotlin.Any
import kotlin.Int
import kotlin.Unit

@ABIMarker(IndexerOption.ABI::class)
@Signature("enum(Windows.Storage.Search.IndexerOption;i4)")
@WinRTByReference(brClass = IndexerOption.ByReference::class)
public enum class IndexerOption(
  public val value: Int
) : NativeMapped {
  UseIndexerWhenAvailable(0),
  OnlyUseIndexer(1),
  DoNotUseIndexer(2),
  OnlyUseIndexerAndOptimizeForIndexedProperties(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      IndexerOption {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> UseIndexerWhenAvailable
      1 -> OnlyUseIndexer
      2 -> DoNotUseIndexer
      3 -> OnlyUseIndexerAndOptimizeForIndexedProperties
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<IndexerOption> {
    public fun setValue(newValue: IndexerOption): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): IndexerOption =
        IndexerOption.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<IndexerOption, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): IndexerOption =
        IndexerOption.values()[0].fromNative(value, null)

    public override fun toNative(obj: IndexerOption): Int = obj.value
  }
}
