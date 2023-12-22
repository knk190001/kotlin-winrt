package Windows.UI.Input

import Windows.System.DispatcherQueue
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SystemButtonEventController.ABI::class)
@Signature("rc(Windows.UI.Input.SystemButtonEventController;{59b893a9-73bc-52b5-ba41-82511b2cb46c})")
@WinRTByReference(brClass = SystemButtonEventController.ByReference::class)
public class SystemButtonEventController(
  ptr: JNAPointer? = NULL
) : AttachableInputObject(ptr), ISystemButtonEventController.WithDefault, IWinRTObject {
  private val __1425341497_Interface: ISystemButtonEventController.WithDefault by lazy {
    as_1425341497()
  }


  public override val __1425341497_Ptr: JNAPointer? by lazy {
    __1425341497_Interface.__1425341497_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1425341497_Interface)

  private fun as_1425341497(): ISystemButtonEventController.WithDefault {
    if(pointer == NULL) {
      return(ISystemButtonEventController.ABI.makeISystemButtonEventController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISystemButtonEventController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISystemButtonEventController.ABI.makeISystemButtonEventController(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SystemButtonEventController> {
    public override fun getValue() = SystemButtonEventController(pointer.getPointer(0))

    public fun setValue(value: SystemButtonEventController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SystemButtonEventController, MemoryAddress> {
    public val ISystemButtonEventControllerStatics_Instance: ISystemButtonEventControllerStatics by
        lazy {
      createISystemButtonEventControllerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISystemButtonEventControllerStatics(): ISystemButtonEventControllerStatics {
      val refiid = Guid.REFIID(ISystemButtonEventControllerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.SystemButtonEventController".toHandle(),refiid,interfacePtr)
      val result =
          ISystemButtonEventControllerStatics.ABI.makeISystemButtonEventControllerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SystemButtonEventController {
      val address = segment.toRawLongValue()
      return SystemButtonEventController(Pointer(address))
    }

    public override fun toNative(obj: SystemButtonEventController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateForDispatcherQueue(queue: DispatcherQueue) =
        ABI.ISystemButtonEventControllerStatics_Instance.CreateForDispatcherQueue(queue)
  }
}
