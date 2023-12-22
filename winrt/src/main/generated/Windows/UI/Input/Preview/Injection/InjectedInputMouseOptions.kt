package Windows.UI.Input.Preview.Injection

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

@ABIMarker(InjectedInputMouseOptions.ABI::class)
@Signature("enum(Windows.UI.Input.Preview.Injection.InjectedInputMouseOptions;u4)")
@WinRTByReference(brClass = InjectedInputMouseOptions.ByReference::class)
public enum class InjectedInputMouseOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  Move(1),
  LeftDown(2),
  LeftUp(4),
  RightDown(8),
  RightUp(16),
  MiddleDown(32),
  MiddleUp(64),
  XDown(128),
  XUp(256),
  Wheel(2048),
  HWheel(4096),
  MoveNoCoalesce(8192),
  VirtualDesk(16384),
  Absolute(32768),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      InjectedInputMouseOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Move
      2 -> LeftDown
      4 -> LeftUp
      8 -> RightDown
      16 -> RightUp
      32 -> MiddleDown
      64 -> MiddleUp
      128 -> XDown
      256 -> XUp
      2048 -> Wheel
      4096 -> HWheel
      8192 -> MoveNoCoalesce
      16384 -> VirtualDesk
      32768 -> Absolute
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<InjectedInputMouseOptions>
      {
    public fun setValue(newValue: InjectedInputMouseOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): InjectedInputMouseOptions =
        InjectedInputMouseOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<InjectedInputMouseOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): InjectedInputMouseOptions =
        InjectedInputMouseOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: InjectedInputMouseOptions): Int = obj.value
  }
}
