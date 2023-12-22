package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.ICustomSystemEventTriggerFactory.ABI.IID
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

@ABIMarker(CustomSystemEventTrigger.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.CustomSystemEventTrigger;{f3596798-cf6b-4ef4-a0ca-29cf4a278c87})")
@WinRTByReference(brClass = CustomSystemEventTrigger.ByReference::class)
public class CustomSystemEventTrigger(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICustomSystemEventTrigger.WithDefault, IBackgroundTrigger.WithDefault,
    IWinRTObject {
  private val __1886462415_Interface: ICustomSystemEventTrigger.WithDefault by lazy {
    as_1886462415()
  }


  private val __54213927_Interface: IBackgroundTrigger.WithDefault by lazy {
    as_54213927()
  }


  public override val __1886462415_Ptr: JNAPointer? by lazy {
    __1886462415_Interface.__1886462415_Ptr
  }


  public override val __54213927_Ptr: JNAPointer? by lazy {
    __54213927_Interface.__54213927_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1886462415_Interface, __54213927_Interface)

  public constructor(triggerId: String, recurrence: CustomSystemEventTriggerRecurrence) :
      this(ABI.activate(triggerId, recurrence))

  private fun as_1886462415(): ICustomSystemEventTrigger.WithDefault {
    if(pointer == NULL) {
      return(ICustomSystemEventTrigger.ABI.makeICustomSystemEventTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICustomSystemEventTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICustomSystemEventTrigger.ABI.makeICustomSystemEventTrigger(ref.value))
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
      IByReference<CustomSystemEventTrigger> {
    public override fun getValue() = CustomSystemEventTrigger(pointer.getPointer(0))

    public fun setValue(value: CustomSystemEventTrigger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CustomSystemEventTrigger, MemoryAddress> {
    public val ICustomSystemEventTriggerFactory_Instance: ICustomSystemEventTriggerFactory by lazy {
      createICustomSystemEventTriggerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICustomSystemEventTriggerFactory(): ICustomSystemEventTriggerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.CustomSystemEventTrigger".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(ICustomSystemEventTriggerFactory.ABI.makeICustomSystemEventTriggerFactory(factoryActivatorPtr.value))
    }

    public fun activate(triggerId: String, recurrence: CustomSystemEventTriggerRecurrence):
        JNAPointer? = ICustomSystemEventTriggerFactory_Instance.Create(triggerId,
        recurrence)?.pointer

    public override fun fromNative(segment: MemoryAddress): CustomSystemEventTrigger {
      val address = segment.toRawLongValue()
      return CustomSystemEventTrigger(Pointer(address))
    }

    public override fun toNative(obj: CustomSystemEventTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
