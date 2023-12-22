package Microsoft.UI.Input.Experimental

import Microsoft.UI.Input.InputObject
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

@ABIMarker(ExpFocusController.ABI::class)
@Signature("rc(Microsoft.UI.Input.Experimental.ExpFocusController;{fd86e2d9-1550-59ba-8b4a-973c7251cd2c})")
@WinRTByReference(brClass = ExpFocusController.ByReference::class)
public class ExpFocusController(
  ptr: JNAPointer? = NULL
) : InputObject(ptr), IExpFocusController.WithDefault, IWinRTObject {
  private val __2011985882_Interface: IExpFocusController.WithDefault by lazy {
    as_2011985882()
  }


  public override val __2011985882_Ptr: JNAPointer? by lazy {
    __2011985882_Interface.__2011985882_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2011985882_Interface)

  private fun as_2011985882(): IExpFocusController.WithDefault {
    if(pointer == NULL) {
      return(IExpFocusController.ABI.makeIExpFocusController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExpFocusController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExpFocusController.ABI.makeIExpFocusController(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ExpFocusController> {
    public override fun getValue() = ExpFocusController(pointer.getPointer(0))

    public fun setValue(value: ExpFocusController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ExpFocusController, MemoryAddress> {
    public val IExpFocusControllerStatics_Instance: IExpFocusControllerStatics by lazy {
      createIExpFocusControllerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIExpFocusControllerStatics(): IExpFocusControllerStatics {
      val refiid = Guid.REFIID(IExpFocusControllerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Input.Experimental.ExpFocusController".toHandle(),refiid,interfacePtr)
      val result = IExpFocusControllerStatics.ABI.makeIExpFocusControllerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ExpFocusController {
      val address = segment.toRawLongValue()
      return ExpFocusController(Pointer(address))
    }

    public override fun toNative(obj: ExpFocusController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForInputSite(inputSite: ExpInputSite) =
        ABI.IExpFocusControllerStatics_Instance.GetForInputSite(inputSite)
  }
}
