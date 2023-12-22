package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.ILocationTriggerFactory.ABI.IID
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

@ABIMarker(LocationTrigger.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.LocationTrigger;{47666a1c-6877-481e-8026-ff7e14a811a0})")
@WinRTByReference(brClass = LocationTrigger.ByReference::class)
public class LocationTrigger(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILocationTrigger.WithDefault, IBackgroundTrigger.WithDefault, IWinRTObject {
  private val __1004249650_Interface: ILocationTrigger.WithDefault by lazy {
    as_1004249650()
  }


  private val __54213927_Interface: IBackgroundTrigger.WithDefault by lazy {
    as_54213927()
  }


  public override val __1004249650_Ptr: JNAPointer? by lazy {
    __1004249650_Interface.__1004249650_Ptr
  }


  public override val __54213927_Ptr: JNAPointer? by lazy {
    __54213927_Interface.__54213927_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1004249650_Interface, __54213927_Interface)

  public constructor(triggerType: LocationTriggerType) : this(ABI.activate(triggerType))

  private fun as_1004249650(): ILocationTrigger.WithDefault {
    if(pointer == NULL) {
      return(ILocationTrigger.ABI.makeILocationTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILocationTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILocationTrigger.ABI.makeILocationTrigger(ref.value))
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
      IByReference<LocationTrigger> {
    public override fun getValue() = LocationTrigger(pointer.getPointer(0))

    public fun setValue(value: LocationTrigger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LocationTrigger, MemoryAddress> {
    public val ILocationTriggerFactory_Instance: ILocationTriggerFactory by lazy {
      createILocationTriggerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createILocationTriggerFactory(): ILocationTriggerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.LocationTrigger".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ILocationTriggerFactory.ABI.makeILocationTriggerFactory(factoryActivatorPtr.value))
    }

    public fun activate(triggerType: LocationTriggerType): JNAPointer? =
        ILocationTriggerFactory_Instance.Create(triggerType)?.pointer

    public override fun fromNative(segment: MemoryAddress): LocationTrigger {
      val address = segment.toRawLongValue()
      return LocationTrigger(Pointer(address))
    }

    public override fun toNative(obj: LocationTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
