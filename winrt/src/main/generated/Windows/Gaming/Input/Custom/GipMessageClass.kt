package Windows.Gaming.Input.Custom

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

@ABIMarker(GipMessageClass.ABI::class)
@Signature("enum(Windows.Gaming.Input.Custom.GipMessageClass;i4)")
@WinRTByReference(brClass = GipMessageClass.ByReference::class)
public enum class GipMessageClass(
  public val value: Int
) : NativeMapped {
  Command(0),
  LowLatency(1),
  StandardLatency(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      GipMessageClass {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Command
      1 -> LowLatency
      2 -> StandardLatency
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<GipMessageClass> {
    public fun setValue(newValue: GipMessageClass): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): GipMessageClass =
        GipMessageClass.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<GipMessageClass, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): GipMessageClass =
        GipMessageClass.values()[0].fromNative(value, null)

    public override fun toNative(obj: GipMessageClass): Int = obj.value
  }
}
