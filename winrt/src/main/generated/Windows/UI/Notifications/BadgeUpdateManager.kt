package Windows.UI.Notifications

import Windows.System.User
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(BadgeUpdateManager.ABI::class)
@WinRTByReference(brClass = BadgeUpdateManager.ByReference::class)
public class BadgeUpdateManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BadgeUpdateManager> {
    public override fun getValue() = BadgeUpdateManager(pointer.getPointer(0))

    public fun setValue(value: BadgeUpdateManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BadgeUpdateManager, MemoryAddress> {
    public val IBadgeUpdateManagerStatics2_Instance: IBadgeUpdateManagerStatics2 by lazy {
      createIBadgeUpdateManagerStatics2()
    }


    public val IBadgeUpdateManagerStatics_Instance: IBadgeUpdateManagerStatics by lazy {
      createIBadgeUpdateManagerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIBadgeUpdateManagerStatics2(): IBadgeUpdateManagerStatics2 {
      val refiid = Guid.REFIID(IBadgeUpdateManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.BadgeUpdateManager".toHandle(),refiid,interfacePtr)
      val result =
          IBadgeUpdateManagerStatics2.ABI.makeIBadgeUpdateManagerStatics2(interfacePtr.value)
      return result
    }

    public fun createIBadgeUpdateManagerStatics(): IBadgeUpdateManagerStatics {
      val refiid = Guid.REFIID(IBadgeUpdateManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Notifications.BadgeUpdateManager".toHandle(),refiid,interfacePtr)
      val result = IBadgeUpdateManagerStatics.ABI.makeIBadgeUpdateManagerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): BadgeUpdateManager {
      val address = segment.toRawLongValue()
      return BadgeUpdateManager(Pointer(address))
    }

    public override fun toNative(obj: BadgeUpdateManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForUser(user: User) = ABI.IBadgeUpdateManagerStatics2_Instance.GetForUser(user)

    public fun CreateBadgeUpdaterForApplication() =
        ABI.IBadgeUpdateManagerStatics_Instance.CreateBadgeUpdaterForApplication()

    public fun CreateBadgeUpdaterForApplication(applicationId: String) =
        ABI.IBadgeUpdateManagerStatics_Instance.CreateBadgeUpdaterForApplication(applicationId)

    public fun CreateBadgeUpdaterForSecondaryTile(tileId: String) =
        ABI.IBadgeUpdateManagerStatics_Instance.CreateBadgeUpdaterForSecondaryTile(tileId)

    public fun GetTemplateContent(type: BadgeTemplateType) =
        ABI.IBadgeUpdateManagerStatics_Instance.GetTemplateContent(type)
  }
}
