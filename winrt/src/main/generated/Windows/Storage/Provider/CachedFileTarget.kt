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

@ABIMarker(CachedFileTarget.ABI::class)
@Signature("enum(Windows.Storage.Provider.CachedFileTarget;i4)")
@WinRTByReference(brClass = CachedFileTarget.ByReference::class)
public enum class CachedFileTarget(
  public val value: Int
) : NativeMapped {
  Local(0),
  Remote(1),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CachedFileTarget {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Local
      1 -> Remote
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CachedFileTarget> {
    public fun setValue(newValue: CachedFileTarget): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CachedFileTarget =
        CachedFileTarget.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CachedFileTarget, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CachedFileTarget =
        CachedFileTarget.values()[0].fromNative(value, null)

    public override fun toNative(obj: CachedFileTarget): Int = obj.value
  }
}
