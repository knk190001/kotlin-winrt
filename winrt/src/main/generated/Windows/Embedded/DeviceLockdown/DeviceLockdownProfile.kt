package Windows.Embedded.DeviceLockdown

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DeviceLockdownProfile.ABI::class)
@WinRTByReference(brClass = DeviceLockdownProfile.ByReference::class)
public class DeviceLockdownProfile(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DeviceLockdownProfile> {
    public override fun getValue() = DeviceLockdownProfile(pointer.getPointer(0))

    public fun setValue(value: DeviceLockdownProfile): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeviceLockdownProfile, MemoryAddress> {
    public val IDeviceLockdownProfileStatics_Instance: IDeviceLockdownProfileStatics by lazy {
      createIDeviceLockdownProfileStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDeviceLockdownProfileStatics(): IDeviceLockdownProfileStatics {
      val refiid = Guid.REFIID(IDeviceLockdownProfileStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Embedded.DeviceLockdown.DeviceLockdownProfile".toHandle(),refiid,interfacePtr)
      val result =
          IDeviceLockdownProfileStatics.ABI.makeIDeviceLockdownProfileStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DeviceLockdownProfile {
      val address = segment.toRawLongValue()
      return DeviceLockdownProfile(Pointer(address))
    }

    public override fun toNative(obj: DeviceLockdownProfile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetSupportedLockdownProfiles() =
        ABI.IDeviceLockdownProfileStatics_Instance.GetSupportedLockdownProfiles()

    public fun GetCurrentLockdownProfile() =
        ABI.IDeviceLockdownProfileStatics_Instance.GetCurrentLockdownProfile()

    public fun ApplyLockdownProfileAsync(profileID: Guid.GUID) =
        ABI.IDeviceLockdownProfileStatics_Instance.ApplyLockdownProfileAsync(profileID)

    public fun GetLockdownProfileInformation(profileID: Guid.GUID) =
        ABI.IDeviceLockdownProfileStatics_Instance.GetLockdownProfileInformation(profileID)
  }
}
