package Windows.UI.Input.Spatial

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

@ABIMarker(SpatialInteractionController.ABI::class)
@Signature("rc(Windows.UI.Input.Spatial.SpatialInteractionController;{5f0e5ba3-0954-4e97-86c5-e7f30b114dfd})")
@WinRTByReference(brClass = SpatialInteractionController.ByReference::class)
public class SpatialInteractionController(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialInteractionController.WithDefault,
    ISpatialInteractionController2.WithDefault, ISpatialInteractionController3.WithDefault,
    IWinRTObject {
  private val __192723522_Interface: ISpatialInteractionController.WithDefault by lazy {
    as_192723522()
  }


  private val __1679461936_Interface: ISpatialInteractionController2.WithDefault by lazy {
    as_1679461936()
  }


  private val __1679461937_Interface: ISpatialInteractionController3.WithDefault by lazy {
    as_1679461937()
  }


  public override val __192723522_Ptr: JNAPointer? by lazy {
    __192723522_Interface.__192723522_Ptr
  }


  public override val __1679461936_Ptr: JNAPointer? by lazy {
    __1679461936_Interface.__1679461936_Ptr
  }


  public override val __1679461937_Ptr: JNAPointer? by lazy {
    __1679461937_Interface.__1679461937_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__192723522_Interface, __1679461936_Interface, __1679461937_Interface)

  private fun as_192723522(): ISpatialInteractionController.WithDefault {
    if(pointer == NULL) {
      return(ISpatialInteractionController.ABI.makeISpatialInteractionController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialInteractionController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialInteractionController.ABI.makeISpatialInteractionController(ref.value))
  }

  private fun as_1679461936(): ISpatialInteractionController2.WithDefault {
    if(pointer == NULL) {
      return(ISpatialInteractionController2.ABI.makeISpatialInteractionController2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialInteractionController2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialInteractionController2.ABI.makeISpatialInteractionController2(ref.value))
  }

  private fun as_1679461937(): ISpatialInteractionController3.WithDefault {
    if(pointer == NULL) {
      return(ISpatialInteractionController3.ABI.makeISpatialInteractionController3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialInteractionController3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialInteractionController3.ABI.makeISpatialInteractionController3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialInteractionController> {
    public override fun getValue() = SpatialInteractionController(pointer.getPointer(0))

    public fun setValue(value: SpatialInteractionController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialInteractionController, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SpatialInteractionController {
      val address = segment.toRawLongValue()
      return SpatialInteractionController(Pointer(address))
    }

    public override fun toNative(obj: SpatialInteractionController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
