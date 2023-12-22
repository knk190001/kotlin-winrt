package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.ITimeTriggerFactory.ABI.IID
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
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(TimeTrigger.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.TimeTrigger;{656e5556-0b2a-4377-ba70-3b45a935547f})")
@WinRTByReference(brClass = TimeTrigger.ByReference::class)
public class TimeTrigger(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITimeTrigger.WithDefault, IBackgroundTrigger.WithDefault, IWinRTObject {
  private val __1130228838_Interface: ITimeTrigger.WithDefault by lazy {
    as_1130228838()
  }


  private val __54213927_Interface: IBackgroundTrigger.WithDefault by lazy {
    as_54213927()
  }


  public override val __1130228838_Ptr: JNAPointer? by lazy {
    __1130228838_Interface.__1130228838_Ptr
  }


  public override val __54213927_Ptr: JNAPointer? by lazy {
    __54213927_Interface.__54213927_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1130228838_Interface, __54213927_Interface)

  public constructor(freshnessTime: WinDef.UINT, oneShot: Boolean) :
      this(ABI.activate(freshnessTime, oneShot))

  private fun as_1130228838(): ITimeTrigger.WithDefault {
    if(pointer == NULL) {
      return(ITimeTrigger.ABI.makeITimeTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimeTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimeTrigger.ABI.makeITimeTrigger(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<TimeTrigger> {
    public override fun getValue() = TimeTrigger(pointer.getPointer(0))

    public fun setValue(value: TimeTrigger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimeTrigger, MemoryAddress> {
    public val ITimeTriggerFactory_Instance: ITimeTriggerFactory by lazy {
      createITimeTriggerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITimeTriggerFactory(): ITimeTriggerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.TimeTrigger".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ITimeTriggerFactory.ABI.makeITimeTriggerFactory(factoryActivatorPtr.value))
    }

    public fun activate(freshnessTime: WinDef.UINT, oneShot: Boolean): JNAPointer? =
        ITimeTriggerFactory_Instance.Create(freshnessTime, oneShot)?.pointer

    public override fun fromNative(segment: MemoryAddress): TimeTrigger {
      val address = segment.toRawLongValue()
      return TimeTrigger(Pointer(address))
    }

    public override fun toNative(obj: TimeTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
