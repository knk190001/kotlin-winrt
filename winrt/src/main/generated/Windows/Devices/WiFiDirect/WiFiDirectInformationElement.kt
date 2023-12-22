package Windows.Devices.WiFiDirect

import Windows.Devices.Enumeration.DeviceInformation
import Windows.Storage.Streams.IBuffer
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(WiFiDirectInformationElement.ABI::class)
@Signature("rc(Windows.Devices.WiFiDirect.WiFiDirectInformationElement;{affb72d6-76bb-497e-ac8b-dc72838bc309})")
@WinRTByReference(brClass = WiFiDirectInformationElement.ByReference::class)
public class WiFiDirectInformationElement(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWiFiDirectInformationElement.WithDefault, IWinRTObject {
  private val __136956061_Interface: IWiFiDirectInformationElement.WithDefault by lazy {
    as_136956061()
  }


  public override val __136956061_Ptr: JNAPointer? by lazy {
    __136956061_Interface.__136956061_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__136956061_Interface)

  public constructor() : this(ABI.activate())

  private fun as_136956061(): IWiFiDirectInformationElement.WithDefault {
    if(pointer == NULL) {
      return(IWiFiDirectInformationElement.ABI.makeIWiFiDirectInformationElement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiDirectInformationElement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiDirectInformationElement.ABI.makeIWiFiDirectInformationElement(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WiFiDirectInformationElement> {
    public override fun getValue() = WiFiDirectInformationElement(pointer.getPointer(0))

    public fun setValue(value: WiFiDirectInformationElement): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WiFiDirectInformationElement, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IWiFiDirectInformationElementStatics_Instance: IWiFiDirectInformationElementStatics
        by lazy {
      createIWiFiDirectInformationElementStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.WiFiDirect.WiFiDirectInformationElement".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIWiFiDirectInformationElementStatics(): IWiFiDirectInformationElementStatics {
      val refiid = Guid.REFIID(IWiFiDirectInformationElementStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.WiFiDirect.WiFiDirectInformationElement".toHandle(),refiid,interfacePtr)
      val result =
          IWiFiDirectInformationElementStatics.ABI.makeIWiFiDirectInformationElementStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): WiFiDirectInformationElement {
      val address = segment.toRawLongValue()
      return WiFiDirectInformationElement(Pointer(address))
    }

    public override fun toNative(obj: WiFiDirectInformationElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromBuffer(buffer: IBuffer) =
        ABI.IWiFiDirectInformationElementStatics_Instance.CreateFromBuffer(buffer)

    public fun CreateFromDeviceInformation(deviceInformation: DeviceInformation) =
        ABI.IWiFiDirectInformationElementStatics_Instance.CreateFromDeviceInformation(deviceInformation)
  }
}
