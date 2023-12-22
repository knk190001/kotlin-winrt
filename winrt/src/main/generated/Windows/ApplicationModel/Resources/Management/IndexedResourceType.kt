package Windows.ApplicationModel.Resources.Management

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

@ABIMarker(IndexedResourceType.ABI::class)
@Signature("enum(Windows.ApplicationModel.Resources.Management.IndexedResourceType;i4)")
@WinRTByReference(brClass = IndexedResourceType.ByReference::class)
public enum class IndexedResourceType(
  public val value: Int
) : NativeMapped {
  String(0),
  Path(1),
  EmbeddedData(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      IndexedResourceType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> String
      1 -> Path
      2 -> EmbeddedData
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<IndexedResourceType> {
    public fun setValue(newValue: IndexedResourceType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): IndexedResourceType =
        IndexedResourceType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<IndexedResourceType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): IndexedResourceType =
        IndexedResourceType.values()[0].fromNative(value, null)

    public override fun toNative(obj: IndexedResourceType): Int = obj.value
  }
}
