package Windows.System.Profile.SystemManufacturers

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SystemSupportInfo.ABI::class)
@WinRTByReference(brClass = SystemSupportInfo.ByReference::class)
public class SystemSupportInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemSupportInfo> {
    public override fun getValue() = SystemSupportInfo(pointer.getPointer(0))

    public fun setValue(value: SystemSupportInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemSupportInfo, MemoryAddress> {
    public val ISystemSupportInfoStatics_Instance: ISystemSupportInfoStatics by lazy {
      createISystemSupportInfoStatics()
    }


    public val ISystemSupportInfoStatics2_Instance: ISystemSupportInfoStatics2 by lazy {
      createISystemSupportInfoStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISystemSupportInfoStatics(): ISystemSupportInfoStatics {
      val refiid = Guid.REFIID(ISystemSupportInfoStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Profile.SystemManufacturers.SystemSupportInfo".toHandle(),refiid,interfacePtr)
      val result = ISystemSupportInfoStatics.ABI.makeISystemSupportInfoStatics(interfacePtr.value)
      return result
    }

    public fun createISystemSupportInfoStatics2(): ISystemSupportInfoStatics2 {
      val refiid = Guid.REFIID(ISystemSupportInfoStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.System.Profile.SystemManufacturers.SystemSupportInfo".toHandle(),refiid,interfacePtr)
      val result = ISystemSupportInfoStatics2.ABI.makeISystemSupportInfoStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SystemSupportInfo {
      val address = segment.toRawLongValue()
      return SystemSupportInfo(Pointer(address))
    }

    public override fun toNative(obj: SystemSupportInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_LocalSystemEdition() =
        ABI.ISystemSupportInfoStatics_Instance.get_LocalSystemEdition()

    public fun get_OemSupportInfo() = ABI.ISystemSupportInfoStatics_Instance.get_OemSupportInfo()

    public fun get_LocalDeviceInfo() = ABI.ISystemSupportInfoStatics2_Instance.get_LocalDeviceInfo()
  }
}
