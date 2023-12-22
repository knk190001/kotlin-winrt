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

@ABIMarker(CoreAcceleratorKeyEventType.ABI::class)
@Signature("enum(Windows.UI.Core.CoreAcceleratorKeyEventType;i4)")
@WinRTByReference(brClass = CoreAcceleratorKeyEventType.ByReference::class)
public enum class CoreAcceleratorKeyEventType(
  public val value: Int
) : NativeMapped {
  Character(2),
  DeadCharacter(3),
  KeyDown(0),
  KeyUp(1),
  SystemCharacter(6),
  SystemDeadCharacter(7),
  SystemKeyDown(4),
  SystemKeyUp(5),
  UnicodeCharacter(8),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CoreAcceleratorKeyEventType {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      2 -> Character
      3 -> DeadCharacter
      0 -> KeyDown
      1 -> KeyUp
      6 -> SystemCharacter
      7 -> SystemDeadCharacter
      4 -> SystemKeyDown
      5 -> SystemKeyUp
      8 -> UnicodeCharacter
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<CoreAcceleratorKeyEventType> {
    public fun setValue(newValue: CoreAcceleratorKeyEventType): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CoreAcceleratorKeyEventType =
        CoreAcceleratorKeyEventType.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CoreAcceleratorKeyEventType, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CoreAcceleratorKeyEventType =
        CoreAcceleratorKeyEventType.values()[0].fromNative(value, null)

    public override fun toNative(obj: CoreAcceleratorKeyEventType): Int = obj.value
  }
}
