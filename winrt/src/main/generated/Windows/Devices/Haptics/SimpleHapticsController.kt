package Windows.Devices.Haptics

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

@ABIMarker(SimpleHapticsController.ABI::class)
@Signature("rc(Windows.Devices.Haptics.SimpleHapticsController;{3d577ef9-4cee-11e6-b535-001bdc06ab3b})")
@WinRTByReference(brClass = SimpleHapticsController.ByReference::class)
public class SimpleHapticsController(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISimpleHapticsController.WithDefault, IWinRTObject {
  private val __744671683_Interface: ISimpleHapticsController.WithDefault by lazy {
    as_744671683()
  }


  public override val __744671683_Ptr: JNAPointer? by lazy {
    __744671683_Interface.__744671683_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__744671683_Interface)

  private fun as_744671683(): ISimpleHapticsController.WithDefault {
    if(pointer == NULL) {
      return(ISimpleHapticsController.ABI.makeISimpleHapticsController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISimpleHapticsController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISimpleHapticsController.ABI.makeISimpleHapticsController(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SimpleHapticsController> {
    public override fun getValue() = SimpleHapticsController(pointer.getPointer(0))

    public fun setValue(value: SimpleHapticsController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SimpleHapticsController, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SimpleHapticsController {
      val address = segment.toRawLongValue()
      return SimpleHapticsController(Pointer(address))
    }

    public override fun toNative(obj: SimpleHapticsController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
