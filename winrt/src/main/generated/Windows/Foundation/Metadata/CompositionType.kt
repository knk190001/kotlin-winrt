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

@ABIMarker(CompositionType.ABI::class)
@Signature("enum(Windows.Foundation.Metadata.CompositionType;i4)")
@WinRTByReference(brClass = CompositionType.ByReference::class)
public enum class CompositionType(
  public val value: Int
) : NativeMapped {
  Protected(1),
  Public(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CompositionType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      1 -> Protected
      2 -> Public
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CompositionType> {
    public fun setValue(newValue: CompositionType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CompositionType =
        CompositionType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CompositionType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CompositionType =
        CompositionType.values()[0].fromNative(value, null)

    public override fun toNative(obj: CompositionType): Int = obj.value
  }
}
