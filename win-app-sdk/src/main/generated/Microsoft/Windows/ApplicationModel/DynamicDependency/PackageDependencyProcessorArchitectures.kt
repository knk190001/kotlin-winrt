package Microsoft.Windows.ApplicationModel.DynamicDependency

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

@ABIMarker(PackageDependencyProcessorArchitectures.ABI::class)
@Signature("enum(Microsoft.Windows.ApplicationModel.DynamicDependency.PackageDependencyProcessorArchitectures;u4)")
@WinRTByReference(brClass = PackageDependencyProcessorArchitectures.ByReference::class)
public enum class PackageDependencyProcessorArchitectures(
  public val value: Int
) : NativeMapped {
  None(0),
  Neutral(1),
  X86(2),
  X64(4),
  Arm(8),
  Arm64(16),
  X86OnArm64(32),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PackageDependencyProcessorArchitectures {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Neutral
      2 -> X86
      4 -> X64
      8 -> Arm
      16 -> Arm64
      32 -> X86OnArm64
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4),
      IByReference<PackageDependencyProcessorArchitectures> {
    public fun setValue(newValue: PackageDependencyProcessorArchitectures): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PackageDependencyProcessorArchitectures =
        PackageDependencyProcessorArchitectures.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PackageDependencyProcessorArchitectures, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PackageDependencyProcessorArchitectures =
        PackageDependencyProcessorArchitectures.values()[0].fromNative(value, null)

    public override fun toNative(obj: PackageDependencyProcessorArchitectures): Int = obj.value
  }
}
