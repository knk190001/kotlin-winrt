package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.ISensorDataThresholdTriggerFactory.ABI.IID
import Windows.Devices.Sensors.ISensorDataThreshold
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

@ABIMarker(SensorDataThresholdTrigger.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.SensorDataThresholdTrigger;{5bc0f372-d48b-4b7f-abec-15f9bacc12e2})")
@WinRTByReference(brClass = SensorDataThresholdTrigger.ByReference::class)
public class SensorDataThresholdTrigger(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISensorDataThresholdTrigger.WithDefault, IBackgroundTrigger.WithDefault,
    IWinRTObject {
  private val __668638242_Interface: ISensorDataThresholdTrigger.WithDefault by lazy {
    as_668638242()
  }


  private val __54213927_Interface: IBackgroundTrigger.WithDefault by lazy {
    as_54213927()
  }


  public override val __668638242_Ptr: JNAPointer? by lazy {
    __668638242_Interface.__668638242_Ptr
  }


  public override val __54213927_Ptr: JNAPointer? by lazy {
    __54213927_Interface.__54213927_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__668638242_Interface, __54213927_Interface)

  public constructor(threshold: ISensorDataThreshold) : this(ABI.activate(threshold))

  private fun as_668638242(): ISensorDataThresholdTrigger.WithDefault {
    if(pointer == NULL) {
      return(ISensorDataThresholdTrigger.ABI.makeISensorDataThresholdTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISensorDataThresholdTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISensorDataThresholdTrigger.ABI.makeISensorDataThresholdTrigger(ref.value))
  }

  private fun as_54213927(): IBackgroundTrigger.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTrigger.ABI.makeIBackgroundTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTrigger.ABI.makeIBackgroundTrigger(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SensorDataThresholdTrigger> {
    public override fun getValue() = SensorDataThresholdTrigger(pointer.getPointer(0))

    public fun setValue(value: SensorDataThresholdTrigger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SensorDataThresholdTrigger, MemoryAddress> {
    public val ISensorDataThresholdTriggerFactory_Instance: ISensorDataThresholdTriggerFactory by
        lazy {
      createISensorDataThresholdTriggerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISensorDataThresholdTriggerFactory(): ISensorDataThresholdTriggerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.SensorDataThresholdTrigger".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISensorDataThresholdTriggerFactory.ABI.makeISensorDataThresholdTriggerFactory(factoryActivatorPtr.value))
    }

    public fun activate(threshold: ISensorDataThreshold): JNAPointer? =
        ISensorDataThresholdTriggerFactory_Instance.Create(threshold)?.pointer

    public override fun fromNative(segment: MemoryAddress): SensorDataThresholdTrigger {
      val address = segment.toRawLongValue()
      return SensorDataThresholdTrigger(Pointer(address))
    }

    public override fun toNative(obj: SensorDataThresholdTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
