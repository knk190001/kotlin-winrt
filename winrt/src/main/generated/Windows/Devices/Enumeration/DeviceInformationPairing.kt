package Windows.Devices.Enumeration

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(DeviceInformationPairing.ABI::class)
@Signature("rc(Windows.Devices.Enumeration.DeviceInformationPairing;{2c4769f5-f684-40d5-8469-e8dbaab70485})")
@WinRTByReference(brClass = DeviceInformationPairing.ByReference::class)
public class DeviceInformationPairing(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDeviceInformationPairing.WithDefault, IDeviceInformationPairing2.WithDefault,
    IWinRTObject {
  private val __316119472_Interface: IDeviceInformationPairing.WithDefault by lazy {
    as_316119472()
  }


  private val __1209768990_Interface: IDeviceInformationPairing2.WithDefault by lazy {
    as_1209768990()
  }


  public override val __316119472_Ptr: JNAPointer? by lazy {
    __316119472_Interface.__316119472_Ptr
  }


  public override val __1209768990_Ptr: JNAPointer? by lazy {
    __1209768990_Interface.__1209768990_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__316119472_Interface, __1209768990_Interface)

  private fun as_316119472(): IDeviceInformationPairing.WithDefault {
    if(pointer == NULL) {
      return(IDeviceInformationPairing.ABI.makeIDeviceInformationPairing(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeviceInformationPairing>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeviceInformationPairing.ABI.makeIDeviceInformationPairing(ref.value))
  }

  private fun as_1209768990(): IDeviceInformationPairing2.WithDefault {
    if(pointer == NULL) {
      return(IDeviceInformationPairing2.ABI.makeIDeviceInformationPairing2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeviceInformationPairing2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeviceInformationPairing2.ABI.makeIDeviceInformationPairing2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DeviceInformationPairing> {
    public override fun getValue() = DeviceInformationPairing(pointer.getPointer(0))

    public fun setValue(value: DeviceInformationPairing): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeviceInformationPairing, MemoryAddress> {
    public val IDeviceInformationPairingStatics_Instance: IDeviceInformationPairingStatics by lazy {
      createIDeviceInformationPairingStatics()
    }


    public val IDeviceInformationPairingStatics2_Instance: IDeviceInformationPairingStatics2 by
        lazy {
      createIDeviceInformationPairingStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDeviceInformationPairingStatics(): IDeviceInformationPairingStatics {
      val refiid = Guid.REFIID(IDeviceInformationPairingStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Enumeration.DeviceInformationPairing".toHandle(),refiid,interfacePtr)
      val result =
          IDeviceInformationPairingStatics.ABI.makeIDeviceInformationPairingStatics(interfacePtr.value)
      return result
    }

    public fun createIDeviceInformationPairingStatics2(): IDeviceInformationPairingStatics2 {
      val refiid = Guid.REFIID(IDeviceInformationPairingStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Enumeration.DeviceInformationPairing".toHandle(),refiid,interfacePtr)
      val result =
          IDeviceInformationPairingStatics2.ABI.makeIDeviceInformationPairingStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DeviceInformationPairing {
      val address = segment.toRawLongValue()
      return DeviceInformationPairing(Pointer(address))
    }

    public override fun toNative(obj: DeviceInformationPairing): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun TryRegisterForAllInboundPairingRequests(pairingKindsSupported: DevicePairingKinds) =
        ABI.IDeviceInformationPairingStatics_Instance.TryRegisterForAllInboundPairingRequests(pairingKindsSupported)

    public
        fun TryRegisterForAllInboundPairingRequestsWithProtectionLevel(pairingKindsSupported: DevicePairingKinds,
        minProtectionLevel: DevicePairingProtectionLevel) =
        ABI.IDeviceInformationPairingStatics2_Instance.TryRegisterForAllInboundPairingRequestsWithProtectionLevel(pairingKindsSupported,
        minProtectionLevel)
  }
}
