package Windows.UI.Xaml.Data

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

@ABIMarker(UpdateSourceTrigger.ABI::class)
@Signature("enum(Windows.UI.Xaml.Data.UpdateSourceTrigger;i4)")
@WinRTByReference(brClass = UpdateSourceTrigger.ByReference::class)
public enum class UpdateSourceTrigger(
  public val value: Int
) : NativeMapped {
  Default(0),
  PropertyChanged(1),
  Explicit(2),
  LostFocus(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      UpdateSourceTrigger {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Default
      1 -> PropertyChanged
      2 -> Explicit
      3 -> LostFocus
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<UpdateSourceTrigger> {
    public fun setValue(newValue: UpdateSourceTrigger): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): UpdateSourceTrigger =
        UpdateSourceTrigger.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<UpdateSourceTrigger, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): UpdateSourceTrigger =
        UpdateSourceTrigger.values()[0].fromNative(value, null)

    public override fun toNative(obj: UpdateSourceTrigger): Int = obj.value
  }
}
