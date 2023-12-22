package Windows.ApplicationModel.Background

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

@ABIMarker(CustomSystemEventTriggerRecurrence.ABI::class)
@Signature("enum(Windows.ApplicationModel.Background.CustomSystemEventTriggerRecurrence;i4)")
@WinRTByReference(brClass = CustomSystemEventTriggerRecurrence.ByReference::class)
public enum class CustomSystemEventTriggerRecurrence(
  public val value: Int
) : NativeMapped {
  Once(0),
  Always(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CustomSystemEventTriggerRecurrence {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Once
      1 -> Always
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CustomSystemEventTriggerRecurrence> {
    public fun setValue(newValue: CustomSystemEventTriggerRecurrence): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CustomSystemEventTriggerRecurrence =
        CustomSystemEventTriggerRecurrence.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CustomSystemEventTriggerRecurrence, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CustomSystemEventTriggerRecurrence =
        CustomSystemEventTriggerRecurrence.values()[0].fromNative(value, null)

    public override fun toNative(obj: CustomSystemEventTriggerRecurrence): Int = obj.value
  }
}
