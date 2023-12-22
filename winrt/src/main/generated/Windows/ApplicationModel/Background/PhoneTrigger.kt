package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IPhoneTriggerFactory.ABI.IID
import Windows.ApplicationModel.Calls.Background.PhoneTriggerType
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
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PhoneTrigger.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.PhoneTrigger;{8dcfe99b-d4c5-49f1-b7d3-82e87a0e9dde})")
@WinRTByReference(brClass = PhoneTrigger.ByReference::class)
public class PhoneTrigger(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneTrigger.WithDefault, IBackgroundTrigger.WithDefault, IWinRTObject {
  private val __90225883_Interface: IPhoneTrigger.WithDefault by lazy {
    as_90225883()
  }


  private val __54213927_Interface: IBackgroundTrigger.WithDefault by lazy {
    as_54213927()
  }


  public override val __90225883_Ptr: JNAPointer? by lazy {
    __90225883_Interface.__90225883_Ptr
  }


  public override val __54213927_Ptr: JNAPointer? by lazy {
    __54213927_Interface.__54213927_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__90225883_Interface, __54213927_Interface)

  public constructor(type: PhoneTriggerType, oneShot: Boolean) : this(ABI.activate(type, oneShot))

  private fun as_90225883(): IPhoneTrigger.WithDefault {
    if(pointer == NULL) {
      return(IPhoneTrigger.ABI.makeIPhoneTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneTrigger.ABI.makeIPhoneTrigger(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PhoneTrigger> {
    public override fun getValue() = PhoneTrigger(pointer.getPointer(0))

    public fun setValue(value: PhoneTrigger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneTrigger, MemoryAddress> {
    public val IPhoneTriggerFactory_Instance: IPhoneTriggerFactory by lazy {
      createIPhoneTriggerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPhoneTriggerFactory(): IPhoneTriggerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.PhoneTrigger".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPhoneTriggerFactory.ABI.makeIPhoneTriggerFactory(factoryActivatorPtr.value))
    }

    public fun activate(type: PhoneTriggerType, oneShot: Boolean): JNAPointer? =
        IPhoneTriggerFactory_Instance.Create(type, oneShot)?.pointer

    public override fun fromNative(segment: MemoryAddress): PhoneTrigger {
      val address = segment.toRawLongValue()
      return PhoneTrigger(Pointer(address))
    }

    public override fun toNative(obj: PhoneTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
