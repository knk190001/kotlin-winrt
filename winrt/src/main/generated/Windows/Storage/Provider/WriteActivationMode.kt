package Windows.Storage.Provider

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

@ABIMarker(WriteActivationMode.ABI::class)
@Signature("enum(Windows.Storage.Provider.WriteActivationMode;i4)")
@WinRTByReference(brClass = WriteActivationMode.ByReference::class)
public enum class WriteActivationMode(
  public val value: Int
) : NativeMapped {
  ReadOnly(0),
  NotNeeded(1),
  AfterWrite(2),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      WriteActivationMode {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> ReadOnly
      1 -> NotNeeded
      2 -> AfterWrite
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<WriteActivationMode> {
    public fun setValue(newValue: WriteActivationMode): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): WriteActivationMode =
        WriteActivationMode.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<WriteActivationMode, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): WriteActivationMode =
        WriteActivationMode.values()[0].fromNative(value, null)

    public override fun toNative(obj: WriteActivationMode): Int = obj.value
  }
}
