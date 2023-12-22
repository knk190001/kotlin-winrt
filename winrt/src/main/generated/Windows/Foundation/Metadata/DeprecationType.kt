package Windows.Foundation.Metadata

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

@ABIMarker(DeprecationType.ABI::class)
@Signature("enum(Windows.Foundation.Metadata.DeprecationType;i4)")
@WinRTByReference(brClass = DeprecationType.ByReference::class)
public enum class DeprecationType(
  public val value: Int
) : NativeMapped {
  Deprecate(0),
  Remove(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DeprecationType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Deprecate
      1 -> Remove
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DeprecationType> {
    public fun setValue(newValue: DeprecationType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DeprecationType =
        DeprecationType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DeprecationType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DeprecationType =
        DeprecationType.values()[0].fromNative(value, null)

    public override fun toNative(obj: DeprecationType): Int = obj.value
  }
}
