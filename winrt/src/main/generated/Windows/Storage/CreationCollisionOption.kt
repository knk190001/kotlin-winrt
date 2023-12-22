package Windows.Storage

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

@ABIMarker(CreationCollisionOption.ABI::class)
@Signature("enum(Windows.Storage.CreationCollisionOption;i4)")
@WinRTByReference(brClass = CreationCollisionOption.ByReference::class)
public enum class CreationCollisionOption(
  public val value: Int
) : NativeMapped {
  GenerateUniqueName(0),
  ReplaceExisting(1),
  FailIfExists(2),
  OpenIfExists(3),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CreationCollisionOption {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> GenerateUniqueName
      1 -> ReplaceExisting
      2 -> FailIfExists
      3 -> OpenIfExists
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CreationCollisionOption> {
    public fun setValue(newValue: CreationCollisionOption): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CreationCollisionOption =
        CreationCollisionOption.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CreationCollisionOption, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CreationCollisionOption =
        CreationCollisionOption.values()[0].fromNative(value, null)

    public override fun toNative(obj: CreationCollisionOption): Int = obj.value
  }
}
