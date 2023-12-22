package Windows.Management.Deployment

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

@ABIMarker(PackageTypes.ABI::class)
@Signature("enum(Windows.Management.Deployment.PackageTypes;u4)")
@WinRTByReference(brClass = PackageTypes.ByReference::class)
public enum class PackageTypes(
  public val value: Int
) : NativeMapped {
  None(0),
  Main(1),
  Framework(2),
  Resource(4),
  Bundle(8),
  Xap(16),
  Optional(32),
  All(-1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      PackageTypes {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> None
      1 -> Main
      2 -> Framework
      4 -> Resource
      8 -> Bundle
      16 -> Xap
      32 -> Optional
      -1 -> All
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<PackageTypes> {
    public fun setValue(newValue: PackageTypes): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): PackageTypes =
        PackageTypes.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<PackageTypes, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): PackageTypes =
        PackageTypes.values()[0].fromNative(value, null)

    public override fun toNative(obj: PackageTypes): Int = obj.value
  }
}
