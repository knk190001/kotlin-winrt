package Windows.Networking.XboxLive

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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Boolean
import kotlin.Byte
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(XboxLiveQualityOfServiceMeasurement.ABI::class)
@Signature("rc(Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement;{4d682bce-a5d6-47e6-a236-cfde5fbdf2ed})")
@WinRTByReference(brClass = XboxLiveQualityOfServiceMeasurement.ByReference::class)
public class XboxLiveQualityOfServiceMeasurement(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXboxLiveQualityOfServiceMeasurement.WithDefault, IWinRTObject {
  private val __2129307075_Interface: IXboxLiveQualityOfServiceMeasurement.WithDefault by lazy {
    as_2129307075()
  }


  public override val __2129307075_Ptr: JNAPointer? by lazy {
    __2129307075_Interface.__2129307075_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2129307075_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2129307075(): IXboxLiveQualityOfServiceMeasurement.WithDefault {
    if(pointer == NULL) {
      return(IXboxLiveQualityOfServiceMeasurement.ABI.makeIXboxLiveQualityOfServiceMeasurement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXboxLiveQualityOfServiceMeasurement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXboxLiveQualityOfServiceMeasurement.ABI.makeIXboxLiveQualityOfServiceMeasurement(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<XboxLiveQualityOfServiceMeasurement> {
    public override fun getValue() = XboxLiveQualityOfServiceMeasurement(pointer.getPointer(0))

    public fun setValue(value: XboxLiveQualityOfServiceMeasurement): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XboxLiveQualityOfServiceMeasurement, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IXboxLiveQualityOfServiceMeasurementStatics_Instance:
        IXboxLiveQualityOfServiceMeasurementStatics by lazy {
      createIXboxLiveQualityOfServiceMeasurementStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement".toHandle(),
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

    public fun createIXboxLiveQualityOfServiceMeasurementStatics():
        IXboxLiveQualityOfServiceMeasurementStatics {
      val refiid = Guid.REFIID(IXboxLiveQualityOfServiceMeasurementStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Networking.XboxLive.XboxLiveQualityOfServiceMeasurement".toHandle(),refiid,interfacePtr)
      val result =
          IXboxLiveQualityOfServiceMeasurementStatics.ABI.makeIXboxLiveQualityOfServiceMeasurementStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): XboxLiveQualityOfServiceMeasurement {
      val address = segment.toRawLongValue()
      return XboxLiveQualityOfServiceMeasurement(Pointer(address))
    }

    public override fun toNative(obj: XboxLiveQualityOfServiceMeasurement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun PublishPrivatePayloadBytes(payload: Array<Byte>) =
        ABI.IXboxLiveQualityOfServiceMeasurementStatics_Instance.PublishPrivatePayloadBytes(payload)

    public fun ClearPrivatePayload() =
        ABI.IXboxLiveQualityOfServiceMeasurementStatics_Instance.ClearPrivatePayload()

    public fun get_MaxSimultaneousProbeConnections() =
        ABI.IXboxLiveQualityOfServiceMeasurementStatics_Instance.get_MaxSimultaneousProbeConnections()

    public fun put_MaxSimultaneousProbeConnections(value: WinDef.UINT) =
        ABI.IXboxLiveQualityOfServiceMeasurementStatics_Instance.put_MaxSimultaneousProbeConnections(value)

    public fun get_IsSystemOutboundBandwidthConstrained() =
        ABI.IXboxLiveQualityOfServiceMeasurementStatics_Instance.get_IsSystemOutboundBandwidthConstrained()

    public fun put_IsSystemOutboundBandwidthConstrained(value: Boolean) =
        ABI.IXboxLiveQualityOfServiceMeasurementStatics_Instance.put_IsSystemOutboundBandwidthConstrained(value)

    public fun get_IsSystemInboundBandwidthConstrained() =
        ABI.IXboxLiveQualityOfServiceMeasurementStatics_Instance.get_IsSystemInboundBandwidthConstrained()

    public fun put_IsSystemInboundBandwidthConstrained(value: Boolean) =
        ABI.IXboxLiveQualityOfServiceMeasurementStatics_Instance.put_IsSystemInboundBandwidthConstrained(value)

    public fun get_PublishedPrivatePayload() =
        ABI.IXboxLiveQualityOfServiceMeasurementStatics_Instance.get_PublishedPrivatePayload()

    public fun put_PublishedPrivatePayload(value: IBuffer) =
        ABI.IXboxLiveQualityOfServiceMeasurementStatics_Instance.put_PublishedPrivatePayload(value)

    public fun get_MaxPrivatePayloadSize() =
        ABI.IXboxLiveQualityOfServiceMeasurementStatics_Instance.get_MaxPrivatePayloadSize()
  }
}
