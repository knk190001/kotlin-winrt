package Windows.Devices.Enumeration

import Windows.Foundation.Collections.IIterable
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(DeviceInformation.ABI::class)
@Signature("rc(Windows.Devices.Enumeration.DeviceInformation;{aba0fb95-4398-489d-8e44-e6130927011f})")
@WinRTByReference(brClass = DeviceInformation.ByReference::class)
public class DeviceInformation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDeviceInformation.WithDefault, IDeviceInformation2.WithDefault, IWinRTObject
    {
  private val __1199312216_Interface: IDeviceInformation.WithDefault by lazy {
    as_1199312216()
  }


  private val __1476026918_Interface: IDeviceInformation2.WithDefault by lazy {
    as_1476026918()
  }


  public override val __1199312216_Ptr: JNAPointer? by lazy {
    __1199312216_Interface.__1199312216_Ptr
  }


  public override val __1476026918_Ptr: JNAPointer? by lazy {
    __1476026918_Interface.__1476026918_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1199312216_Interface, __1476026918_Interface)

  private fun as_1199312216(): IDeviceInformation.WithDefault {
    if(pointer == NULL) {
      return(IDeviceInformation.ABI.makeIDeviceInformation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeviceInformation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeviceInformation.ABI.makeIDeviceInformation(ref.value))
  }

  private fun as_1476026918(): IDeviceInformation2.WithDefault {
    if(pointer == NULL) {
      return(IDeviceInformation2.ABI.makeIDeviceInformation2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDeviceInformation2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDeviceInformation2.ABI.makeIDeviceInformation2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DeviceInformation> {
    public override fun getValue() = DeviceInformation(pointer.getPointer(0))

    public fun setValue(value: DeviceInformation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DeviceInformation, MemoryAddress> {
    public val IDeviceInformationStatics2_Instance: IDeviceInformationStatics2 by lazy {
      createIDeviceInformationStatics2()
    }


    public val IDeviceInformationStatics_Instance: IDeviceInformationStatics by lazy {
      createIDeviceInformationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDeviceInformationStatics2(): IDeviceInformationStatics2 {
      val refiid = Guid.REFIID(IDeviceInformationStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Enumeration.DeviceInformation".toHandle(),refiid,interfacePtr)
      val result = IDeviceInformationStatics2.ABI.makeIDeviceInformationStatics2(interfacePtr.value)
      return result
    }

    public fun createIDeviceInformationStatics(): IDeviceInformationStatics {
      val refiid = Guid.REFIID(IDeviceInformationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Enumeration.DeviceInformation".toHandle(),refiid,interfacePtr)
      val result = IDeviceInformationStatics.ABI.makeIDeviceInformationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DeviceInformation {
      val address = segment.toRawLongValue()
      return DeviceInformation(Pointer(address))
    }

    public override fun toNative(obj: DeviceInformation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetAqsFilterFromDeviceClass(deviceClass: DeviceClass) =
        ABI.IDeviceInformationStatics2_Instance.GetAqsFilterFromDeviceClass(deviceClass)

    public fun CreateFromIdAsync(
      deviceId: String,
      additionalProperties: IIterable<String?>,
      kind: DeviceInformationKind
    ) = ABI.IDeviceInformationStatics2_Instance.CreateFromIdAsync(deviceId, additionalProperties,
        kind)

    public fun FindAllAsync(
      aqsFilter: String,
      additionalProperties: IIterable<String?>,
      kind: DeviceInformationKind
    ) = ABI.IDeviceInformationStatics2_Instance.FindAllAsync(aqsFilter, additionalProperties, kind)

    public fun CreateWatcher(
      aqsFilter: String,
      additionalProperties: IIterable<String?>,
      kind: DeviceInformationKind
    ) = ABI.IDeviceInformationStatics2_Instance.CreateWatcher(aqsFilter, additionalProperties, kind)

    public fun CreateFromIdAsync(deviceId: String) =
        ABI.IDeviceInformationStatics_Instance.CreateFromIdAsync(deviceId)

    public fun CreateFromIdAsync(deviceId: String, additionalProperties: IIterable<String?>) =
        ABI.IDeviceInformationStatics_Instance.CreateFromIdAsync(deviceId, additionalProperties)

    public fun FindAllAsync() = ABI.IDeviceInformationStatics_Instance.FindAllAsync()

    public fun FindAllAsync(deviceClass: DeviceClass) =
        ABI.IDeviceInformationStatics_Instance.FindAllAsync(deviceClass)

    public fun FindAllAsync(aqsFilter: String) =
        ABI.IDeviceInformationStatics_Instance.FindAllAsync(aqsFilter)

    public fun FindAllAsync(aqsFilter: String, additionalProperties: IIterable<String?>) =
        ABI.IDeviceInformationStatics_Instance.FindAllAsync(aqsFilter, additionalProperties)

    public fun CreateWatcher() = ABI.IDeviceInformationStatics_Instance.CreateWatcher()

    public fun CreateWatcher(deviceClass: DeviceClass) =
        ABI.IDeviceInformationStatics_Instance.CreateWatcher(deviceClass)

    public fun CreateWatcher(aqsFilter: String) =
        ABI.IDeviceInformationStatics_Instance.CreateWatcher(aqsFilter)

    public fun CreateWatcher(aqsFilter: String, additionalProperties: IIterable<String?>) =
        ABI.IDeviceInformationStatics_Instance.CreateWatcher(aqsFilter, additionalProperties)
  }
}
