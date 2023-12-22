package Microsoft.UI.Dispatching

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

@ABIMarker(DispatcherQueueController.ABI::class)
@Signature("rc(Microsoft.UI.Dispatching.DispatcherQueueController;{bce8178d-2183-584c-9e5b-f9366f6ae484})")
@WinRTByReference(brClass = DispatcherQueueController.ByReference::class)
public class DispatcherQueueController(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDispatcherQueueController.WithDefault,
    IDispatcherQueueController2.WithDefault, IWinRTObject {
  private val __1968560661_Interface: IDispatcherQueueController.WithDefault by lazy {
    as_1968560661()
  }


  private val __895838297_Interface: IDispatcherQueueController2.WithDefault by lazy {
    as_895838297()
  }


  public override val __1968560661_Ptr: JNAPointer? by lazy {
    __1968560661_Interface.__1968560661_Ptr
  }


  public override val __895838297_Ptr: JNAPointer? by lazy {
    __895838297_Interface.__895838297_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1968560661_Interface, __895838297_Interface)

  private fun as_1968560661(): IDispatcherQueueController.WithDefault {
    if(pointer == NULL) {
      return(IDispatcherQueueController.ABI.makeIDispatcherQueueController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDispatcherQueueController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDispatcherQueueController.ABI.makeIDispatcherQueueController(ref.value))
  }

  private fun as_895838297(): IDispatcherQueueController2.WithDefault {
    if(pointer == NULL) {
      return(IDispatcherQueueController2.ABI.makeIDispatcherQueueController2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDispatcherQueueController2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDispatcherQueueController2.ABI.makeIDispatcherQueueController2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DispatcherQueueController> {
    public override fun getValue() = DispatcherQueueController(pointer.getPointer(0))

    public fun setValue(value: DispatcherQueueController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DispatcherQueueController, MemoryAddress> {
    public val IDispatcherQueueControllerStatics_Instance: IDispatcherQueueControllerStatics by
        lazy {
      createIDispatcherQueueControllerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIDispatcherQueueControllerStatics(): IDispatcherQueueControllerStatics {
      val refiid = Guid.REFIID(IDispatcherQueueControllerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Dispatching.DispatcherQueueController".toHandle(),refiid,interfacePtr)
      val result =
          IDispatcherQueueControllerStatics.ABI.makeIDispatcherQueueControllerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DispatcherQueueController {
      val address = segment.toRawLongValue()
      return DispatcherQueueController(Pointer(address))
    }

    public override fun toNative(obj: DispatcherQueueController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateOnDedicatedThread() =
        ABI.IDispatcherQueueControllerStatics_Instance.CreateOnDedicatedThread()

    public fun CreateOnCurrentThread() =
        ABI.IDispatcherQueueControllerStatics_Instance.CreateOnCurrentThread()
  }
}
