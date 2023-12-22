package Windows.Storage.Pickers.Provider

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

@ABIMarker(SetFileNameResult.ABI::class)
@Signature("enum(Windows.Storage.Pickers.Provider.SetFileNameResult;i4)")
@WinRTByReference(brClass = SetFileNameResult.ByReference::class)
public enum class SetFileNameResult(
  public val value: Int
) : NativeMapped {
  Succeeded(0),
  NotAllowed(1),
  Unavailable(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      SetFileNameResult {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Succeeded
      1 -> NotAllowed
      2 -> Unavailable
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<SetFileNameResult> {
    public fun setValue(newValue: SetFileNameResult): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): SetFileNameResult =
        SetFileNameResult.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<SetFileNameResult, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): SetFileNameResult =
        SetFileNameResult.values()[0].fromNative(value, null)

    public override fun toNative(obj: SetFileNameResult): Int = obj.value
  }
}
