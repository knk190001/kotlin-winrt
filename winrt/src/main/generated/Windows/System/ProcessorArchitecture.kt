package Windows.System

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

@ABIMarker(ProcessorArchitecture.ABI::class)
@Signature("enum(Windows.System.ProcessorArchitecture;i4)")
@WinRTByReference(brClass = ProcessorArchitecture.ByReference::class)
public enum class ProcessorArchitecture(
  public val value: Int
) : NativeMapped {
  X86(0),
  Arm(5),
  X64(9),
  Neutral(11),
  Arm64(12),
  X86OnArm64(14),
  Unknown(65535),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ProcessorArchitecture {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> X86
      5 -> Arm
      9 -> X64
      11 -> Neutral
      12 -> Arm64
      14 -> X86OnArm64
      65535 -> Unknown
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ProcessorArchitecture> {
    public fun setValue(newValue: ProcessorArchitecture): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ProcessorArchitecture =
        ProcessorArchitecture.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ProcessorArchitecture, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ProcessorArchitecture =
        ProcessorArchitecture.values()[0].fromNative(value, null)

    public override fun toNative(obj: ProcessorArchitecture): Int = obj.value
  }
}
