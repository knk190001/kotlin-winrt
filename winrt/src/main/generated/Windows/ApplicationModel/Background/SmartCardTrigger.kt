package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.ISmartCardTriggerFactory.ABI.IID
import Windows.Devices.SmartCards.SmartCardTriggerType
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

@ABIMarker(SmartCardTrigger.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.SmartCardTrigger;{f53bc5ac-84ca-4972-8ce9-e58f97b37a50})")
@WinRTByReference(brClass = SmartCardTrigger.ByReference::class)
public class SmartCardTrigger(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISmartCardTrigger.WithDefault, IBackgroundTrigger.WithDefault, IWinRTObject {
  private val __8294672_Interface: ISmartCardTrigger.WithDefault by lazy {
    as_8294672()
  }


  private val __54213927_Interface: IBackgroundTrigger.WithDefault by lazy {
    as_54213927()
  }


  public override val __8294672_Ptr: JNAPointer? by lazy {
    __8294672_Interface.__8294672_Ptr
  }


  public override val __54213927_Ptr: JNAPointer? by lazy {
    __54213927_Interface.__54213927_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__8294672_Interface, __54213927_Interface)

  public constructor(triggerType: SmartCardTriggerType) : this(ABI.activate(triggerType))

  private fun as_8294672(): ISmartCardTrigger.WithDefault {
    if(pointer == NULL) {
      return(ISmartCardTrigger.ABI.makeISmartCardTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISmartCardTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISmartCardTrigger.ABI.makeISmartCardTrigger(ref.value))
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
      IByReference<SmartCardTrigger> {
    public override fun getValue() = SmartCardTrigger(pointer.getPointer(0))

    public fun setValue(value: SmartCardTrigger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SmartCardTrigger, MemoryAddress> {
    public val ISmartCardTriggerFactory_Instance: ISmartCardTriggerFactory by lazy {
      createISmartCardTriggerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISmartCardTriggerFactory(): ISmartCardTriggerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.SmartCardTrigger".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ISmartCardTriggerFactory.ABI.makeISmartCardTriggerFactory(factoryActivatorPtr.value))
    }

    public fun activate(triggerType: SmartCardTriggerType): JNAPointer? =
        ISmartCardTriggerFactory_Instance.Create(triggerType)?.pointer

    public override fun fromNative(segment: MemoryAddress): SmartCardTrigger {
      val address = segment.toRawLongValue()
      return SmartCardTrigger(Pointer(address))
    }

    public override fun toNative(obj: SmartCardTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
