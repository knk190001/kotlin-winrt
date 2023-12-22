package Windows.UI.Notifications

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(BadgeUpdateManagerForUser.ABI::class)
@Signature("rc(Windows.UI.Notifications.BadgeUpdateManagerForUser;{996b21bc-0386-44e5-ba8d-0c1077a62e92})")
@WinRTByReference(brClass = BadgeUpdateManagerForUser.ByReference::class)
public class BadgeUpdateManagerForUser(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBadgeUpdateManagerForUser.WithDefault, IWinRTObject {
  private val __2026391869_Interface: IBadgeUpdateManagerForUser.WithDefault by lazy {
    as_2026391869()
  }


  public override val __2026391869_Ptr: JNAPointer? by lazy {
    __2026391869_Interface.__2026391869_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2026391869_Interface)

  private fun as_2026391869(): IBadgeUpdateManagerForUser.WithDefault {
    if(pointer == NULL) {
      return(IBadgeUpdateManagerForUser.ABI.makeIBadgeUpdateManagerForUser(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBadgeUpdateManagerForUser>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBadgeUpdateManagerForUser.ABI.makeIBadgeUpdateManagerForUser(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BadgeUpdateManagerForUser> {
    public override fun getValue() = BadgeUpdateManagerForUser(pointer.getPointer(0))

    public fun setValue(value: BadgeUpdateManagerForUser): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BadgeUpdateManagerForUser, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): BadgeUpdateManagerForUser {
      val address = segment.toRawLongValue()
      return BadgeUpdateManagerForUser(Pointer(address))
    }

    public override fun toNative(obj: BadgeUpdateManagerForUser): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
