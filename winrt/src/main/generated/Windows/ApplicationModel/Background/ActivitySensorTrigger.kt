package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IActivitySensorTriggerFactory.ABI.IID
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ActivitySensorTrigger.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.ActivitySensorTrigger;{d0dd4342-e37b-4823-a5fe-6b31dfefdeb0})")
@WinRTByReference(brClass = ActivitySensorTrigger.ByReference::class)
public class ActivitySensorTrigger(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IActivitySensorTrigger.WithDefault, IBackgroundTrigger.WithDefault,
    IWinRTObject {
  private val __1218065282_Interface: IActivitySensorTrigger.WithDefault by lazy {
    as_1218065282()
  }


  private val __54213927_Interface: IBackgroundTrigger.WithDefault by lazy {
    as_54213927()
  }


  public override val __1218065282_Ptr: JNAPointer? by lazy {
    __1218065282_Interface.__1218065282_Ptr
  }


  public override val __54213927_Ptr: JNAPointer? by lazy {
    __54213927_Interface.__54213927_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1218065282_Interface, __54213927_Interface)

  public constructor(reportIntervalInMilliseconds: WinDef.UINT) :
      this(ABI.activate(reportIntervalInMilliseconds))

  private fun as_1218065282(): IActivitySensorTrigger.WithDefault {
    if(pointer == NULL) {
      return(IActivitySensorTrigger.ABI.makeIActivitySensorTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IActivitySensorTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IActivitySensorTrigger.ABI.makeIActivitySensorTrigger(ref.value))
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
      IByReference<ActivitySensorTrigger> {
    public override fun getValue() = ActivitySensorTrigger(pointer.getPointer(0))

    public fun setValue(value: ActivitySensorTrigger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ActivitySensorTrigger, MemoryAddress> {
    public val IActivitySensorTriggerFactory_Instance: IActivitySensorTriggerFactory by lazy {
      createIActivitySensorTriggerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIActivitySensorTriggerFactory(): IActivitySensorTriggerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.ActivitySensorTrigger".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IActivitySensorTriggerFactory.ABI.makeIActivitySensorTriggerFactory(factoryActivatorPtr.value))
    }

    public fun activate(reportIntervalInMilliseconds: WinDef.UINT): JNAPointer? =
        IActivitySensorTriggerFactory_Instance.Create(reportIntervalInMilliseconds)?.pointer

    public override fun fromNative(segment: MemoryAddress): ActivitySensorTrigger {
      val address = segment.toRawLongValue()
      return ActivitySensorTrigger(Pointer(address))
    }

    public override fun toNative(obj: ActivitySensorTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
