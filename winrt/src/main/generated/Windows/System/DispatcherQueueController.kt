package Windows.System

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
@Signature("rc(Windows.System.DispatcherQueueController;{22f34e66-50db-4e36-a98d-61c01b384d20})")
@WinRTByReference(brClass = DispatcherQueueController.ByReference::class)
public class DispatcherQueueController(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDispatcherQueueController.WithDefault, IWinRTObject {
  private val __2086939305_Interface: IDispatcherQueueController.WithDefault by lazy {
    as_2086939305()
  }


  public override val __2086939305_Ptr: JNAPointer? by lazy {
    __2086939305_Interface.__2086939305_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2086939305_Interface)

  private fun as_2086939305(): IDispatcherQueueController.WithDefault {
    if(pointer == NULL) {
      return(IDispatcherQueueController.ABI.makeIDispatcherQueueController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDispatcherQueueController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDispatcherQueueController.ABI.makeIDispatcherQueueController(ref.value))
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
          INSTANCE.RoGetActivationFactory("Windows.System.DispatcherQueueController".toHandle(),refiid,interfacePtr)
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
  }
}
