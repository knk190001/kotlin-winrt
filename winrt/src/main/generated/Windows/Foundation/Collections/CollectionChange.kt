package Windows.Foundation.Collections

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

@ABIMarker(CollectionChange.ABI::class)
@Signature("enum(Windows.Foundation.Collections.CollectionChange;i4)")
@WinRTByReference(brClass = CollectionChange.ByReference::class)
public enum class CollectionChange(
  public val value: Int
) : NativeMapped {
  Reset(0),
  ItemInserted(1),
  ItemRemoved(2),
  ItemChanged(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CollectionChange {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Reset
      1 -> ItemInserted
      2 -> ItemRemoved
      3 -> ItemChanged
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CollectionChange> {
    public fun setValue(newValue: CollectionChange): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CollectionChange =
        CollectionChange.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CollectionChange, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CollectionChange =
        CollectionChange.values()[0].fromNative(value, null)

    public override fun toNative(obj: CollectionChange): Int = obj.value
  }
}
