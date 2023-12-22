package Windows.UI.ViewManagement

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

@ABIMarker(HandPreference.ABI::class)
@Signature("enum(Windows.UI.ViewManagement.HandPreference;i4)")
@WinRTByReference(brClass = HandPreference.ByReference::class)
public enum class HandPreference(
  public val value: Int
) : NativeMapped {
  LeftHanded(0),
  RightHanded(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      HandPreference {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> LeftHanded
      1 -> RightHanded
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<HandPreference> {
    public fun setValue(newValue: HandPreference): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): HandPreference =
        HandPreference.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<HandPreference, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): HandPreference =
        HandPreference.values()[0].fromNative(value, null)

    public override fun toNative(obj: HandPreference): Int = obj.value
  }
}
