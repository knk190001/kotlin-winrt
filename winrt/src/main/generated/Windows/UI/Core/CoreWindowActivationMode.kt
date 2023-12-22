package Windows.UI.Core

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

@ABIMarker(CoreWindowActivationMode.ABI::class)
@Signature("enum(Windows.UI.Core.CoreWindowActivationMode;i4)")
@WinRTByReference(brClass = CoreWindowActivationMode.ByReference::class)
public enum class CoreWindowActivationMode(
  public val value: Int
) : NativeMapped {
  None(0),
  Deactivated(1),
  ActivatedNotForeground(2),
  ActivatedInForeground(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreWindowActivationMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Deactivated
      2 -> ActivatedNotForeground
      3 -> ActivatedInForeground
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CoreWindowActivationMode>
      {
    public fun setValue(newValue: CoreWindowActivationMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreWindowActivationMode =
        CoreWindowActivationMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreWindowActivationMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreWindowActivationMode =
        CoreWindowActivationMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreWindowActivationMode): Int = obj.value
  }
}
