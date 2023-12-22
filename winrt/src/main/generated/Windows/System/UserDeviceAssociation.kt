package Windows.System

import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
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

@ABIMarker(UserDeviceAssociation.ABI::class)
@WinRTByReference(brClass = UserDeviceAssociation.ByReference::class)
public class UserDeviceAssociation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UserDeviceAssociation> {
    public override fun getValue() = UserDeviceAssociation(pointer.getPointer(0))

    public fun setValue(value: UserDeviceAssociation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UserDeviceAssociation, MemoryAddress> {
    public val IUserDeviceAssociationStatics_Instance: IUserDeviceAssociationStatics by lazy {
      createIUserDeviceAssociationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIUserDeviceAssociationStatics(): IUserDeviceAssociationStatics {
      val refiid = Guid.REFIID(IUserDeviceAssociationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.UserDeviceAssociation".toHandle(),refiid,interfacePtr)
      val result =
          IUserDeviceAssociationStatics.ABI.makeIUserDeviceAssociationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): UserDeviceAssociation {
      val address = segment.toRawLongValue()
      return UserDeviceAssociation(Pointer(address))
    }

    public override fun toNative(obj: UserDeviceAssociation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FindUserFromDeviceId(deviceId: String) =
        ABI.IUserDeviceAssociationStatics_Instance.FindUserFromDeviceId(deviceId)

    public
        fun add_UserDeviceAssociationChanged(handler: EventHandler<UserDeviceAssociationChangedEventArgs?>)
        = ABI.IUserDeviceAssociationStatics_Instance.add_UserDeviceAssociationChanged(handler)

    public fun remove_UserDeviceAssociationChanged(token: EventRegistrationToken) =
        ABI.IUserDeviceAssociationStatics_Instance.remove_UserDeviceAssociationChanged(token)
  }
}
