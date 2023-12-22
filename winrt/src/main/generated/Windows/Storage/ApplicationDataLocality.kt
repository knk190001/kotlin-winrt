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

@ABIMarker(ApplicationDataLocality.ABI::class)
@Signature("enum(Windows.Storage.ApplicationDataLocality;i4)")
@WinRTByReference(brClass = ApplicationDataLocality.ByReference::class)
public enum class ApplicationDataLocality(
  public val value: Int
) : NativeMapped {
  Local(0),
  Roaming(1),
  Temporary(2),
  LocalCache(3),
  SharedLocal(4),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      ApplicationDataLocality {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> Local
      1 -> Roaming
      2 -> Temporary
      3 -> LocalCache
      4 -> SharedLocal
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<ApplicationDataLocality> {
    public fun setValue(newValue: ApplicationDataLocality): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): ApplicationDataLocality =
        ApplicationDataLocality.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<ApplicationDataLocality, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): ApplicationDataLocality =
        ApplicationDataLocality.values()[0].fromNative(value, null)

    public override fun toNative(obj: ApplicationDataLocality): Int = obj.value
  }
}
