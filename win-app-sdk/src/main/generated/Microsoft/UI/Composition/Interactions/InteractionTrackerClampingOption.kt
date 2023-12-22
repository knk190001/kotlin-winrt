package Microsoft.UI.Composition.Interactions

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

@ABIMarker(InteractionTrackerClampingOption.ABI::class)
@Signature("enum(Microsoft.UI.Composition.Interactions.InteractionTrackerClampingOption;i4)")
@WinRTByReference(brClass = InteractionTrackerClampingOption.ByReference::class)
public enum class InteractionTrackerClampingOption(
  public val value: Int
) : NativeMapped {
  Auto(0),
  Disabled(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      InteractionTrackerClampingOption {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Auto
      1 -> Disabled
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<InteractionTrackerClampingOption> {
    public fun setValue(newValue: InteractionTrackerClampingOption): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): InteractionTrackerClampingOption =
        InteractionTrackerClampingOption.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<InteractionTrackerClampingOption, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): InteractionTrackerClampingOption =
        InteractionTrackerClampingOption.values()[0].fromNative(value, null)

    public override fun toNative(obj: InteractionTrackerClampingOption): Int = obj.value
  }
}
