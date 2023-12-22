package Windows.Devices.WiFiDirect

import Windows.Devices.Enumeration.IDevicePairingSettings
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

@ABIMarker(WiFiDirectConnectionParameters.ABI::class)
@Signature("rc(Windows.Devices.WiFiDirect.WiFiDirectConnectionParameters;{b2e55405-5702-4b16-a02c-bbcd21ef6098})")
@WinRTByReference(brClass = WiFiDirectConnectionParameters.ByReference::class)
public class WiFiDirectConnectionParameters(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWiFiDirectConnectionParameters.WithDefault,
    IWiFiDirectConnectionParameters2.WithDefault, IDevicePairingSettings.WithDefault, IWinRTObject {
  private val __827304085_Interface: IWiFiDirectConnectionParameters.WithDefault by lazy {
    as_827304085()
  }


  private val __123377091_Interface: IWiFiDirectConnectionParameters2.WithDefault by lazy {
    as_123377091()
  }


  private val __936867529_Interface: IDevicePairingSettings.WithDefault by lazy {
    as_936867529()
  }


  public override val __827304085_Ptr: JNAPointer? by lazy {
    __827304085_Interface.__827304085_Ptr
  }


  public override val __123377091_Ptr: JNAPointer? by lazy {
    __123377091_Interface.__123377091_Ptr
  }


  public override val __936867529_Ptr: JNAPointer? by lazy {
    __936867529_Interface.__936867529_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__827304085_Interface, __123377091_Interface, __936867529_Interface)

  public constructor() : this(ABI.activate())

  private fun as_827304085(): IWiFiDirectConnectionParameters.WithDefault {
    if(pointer == NULL) {
      return(IWiFiDirectConnectionParameters.ABI.makeIWiFiDirectConnectionParameters(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiDirectConnectionParameters>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiDirectConnectionParameters.ABI.makeIWiFiDirectConnectionParameters(ref.value))
  }

  private fun as_123377091(): IWiFiDirectConnectionParameters2.WithDefault {
    if(pointer == NULL) {
      return(IWiFiDirectConnectionParameters2.ABI.makeIWiFiDirectConnectionParameters2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiDirectConnectionParameters2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiDirectConnectionParameters2.ABI.makeIWiFiDirectConnectionParameters2(ref.value))
  }

  private fun as_936867529(): IDevicePairingSettings.WithDefault {
    if(pointer == NULL) {
      return(IDevicePairingSettings.ABI.makeIDevicePairingSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDevicePairingSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDevicePairingSettings.ABI.makeIDevicePairingSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WiFiDirectConnectionParameters> {
    public override fun getValue() = WiFiDirectConnectionParameters(pointer.getPointer(0))

    public fun setValue(value: WiFiDirectConnectionParameters): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WiFiDirectConnectionParameters, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IWiFiDirectConnectionParametersStatics_Instance:
        IWiFiDirectConnectionParametersStatics by lazy {
      createIWiFiDirectConnectionParametersStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.WiFiDirect.WiFiDirectConnectionParameters".toHandle(),
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

    public fun createIWiFiDirectConnectionParametersStatics():
        IWiFiDirectConnectionParametersStatics {
      val refiid = Guid.REFIID(IWiFiDirectConnectionParametersStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.WiFiDirect.WiFiDirectConnectionParameters".toHandle(),refiid,interfacePtr)
      val result =
          IWiFiDirectConnectionParametersStatics.ABI.makeIWiFiDirectConnectionParametersStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): WiFiDirectConnectionParameters {
      val address = segment.toRawLongValue()
      return WiFiDirectConnectionParameters(Pointer(address))
    }

    public override fun toNative(obj: WiFiDirectConnectionParameters): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDevicePairingKinds(configurationMethod: WiFiDirectConfigurationMethod) =
        ABI.IWiFiDirectConnectionParametersStatics_Instance.GetDevicePairingKinds(configurationMethod)
  }
}
