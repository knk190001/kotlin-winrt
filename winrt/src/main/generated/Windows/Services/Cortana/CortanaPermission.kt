package Windows.Services.Cortana

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

@ABIMarker(CortanaPermission.ABI::class)
@Signature("enum(Windows.Services.Cortana.CortanaPermission;i4)")
@WinRTByReference(brClass = CortanaPermission.ByReference::class)
public enum class CortanaPermission(
  public val value: Int
) : NativeMapped {
  BrowsingHistory(0),
  Calendar(1),
  CallHistory(2),
  Contacts(3),
  Email(4),
  InputPersonalization(5),
  Location(6),
  Messaging(7),
  Microphone(8),
  Personalization(9),
  PhoneCall(10),
  ;

  public override fun fromNative(nativeValue: kotlin.Any?, context: FromNativeContext?):
      CortanaPermission {
    if (nativeValue !is Int) throw IllegalArgumentException()
    return when(nativeValue)  {
      0 -> BrowsingHistory
      1 -> Calendar
      2 -> CallHistory
      3 -> Contacts
      4 -> Email
      5 -> InputPersonalization
      6 -> Location
      7 -> Messaging
      8 -> Microphone
      9 -> Personalization
      10 -> PhoneCall
      else -> throw IllegalArgumentException()
    }
  }

  public override fun toNative(): Int = this.value

  public override fun nativeType(): java.lang.Class<*> = Integer::class.java

  public class ByReference : com.sun.jna.ptr.ByReference(4), IByReference<CortanaPermission> {
    public fun setValue(newValue: CortanaPermission): Unit {
      pointer.setInt(0, newValue.value)
    }

    public override fun getValue(): CortanaPermission =
        CortanaPermission.values()[0].fromNative(this.pointer.getInt(0), null)
  }

  public object ABI : IABI<CortanaPermission, Int> {
    public override val layout: ValueLayout = JAVA_INT

    public override fun fromNative(value: Int): CortanaPermission =
        CortanaPermission.values()[0].fromNative(value, null)

    public override fun toNative(obj: CortanaPermission): Int = obj.value
  }
}
