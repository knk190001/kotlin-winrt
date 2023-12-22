package Microsoft.UI.Dispatching

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

@ABIMarker(DispatcherRunOptions.ABI::class)
@Signature("enum(Microsoft.UI.Dispatching.DispatcherRunOptions;u4)")
@WinRTByReference(brClass = DispatcherRunOptions.ByReference::class)
public enum class DispatcherRunOptions(
  public val value: Int
) : NativeMapped {
  None(0),
  ContinueOnQuit(1),
  QuitOnlyLocalLoop(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      DispatcherRunOptions {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> ContinueOnQuit
      2 -> QuitOnlyLocalLoop
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<DispatcherRunOptions> {
    public fun setValue(newValue: DispatcherRunOptions): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): DispatcherRunOptions =
        DispatcherRunOptions.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<DispatcherRunOptions, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): DispatcherRunOptions =
        DispatcherRunOptions.values()[0].fromNative(value, null)

    public override fun toNative(obj: DispatcherRunOptions): Int = obj.value
  }
}
