package Windows.UI.Input.Inking

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

@ABIMarker(InkDrawingAttributesPencilProperties.ABI::class)
@Signature("rc(Windows.UI.Input.Inking.InkDrawingAttributesPencilProperties;{4f2534cb-2d86-41bb-b0e8-e4c2a0253c52})")
@WinRTByReference(brClass = InkDrawingAttributesPencilProperties.ByReference::class)
public class InkDrawingAttributesPencilProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInkDrawingAttributesPencilProperties.WithDefault, IWinRTObject {
  private val __1758979671_Interface: IInkDrawingAttributesPencilProperties.WithDefault by lazy {
    as_1758979671()
  }


  public override val __1758979671_Ptr: JNAPointer? by lazy {
    __1758979671_Interface.__1758979671_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1758979671_Interface)

  private fun as_1758979671(): IInkDrawingAttributesPencilProperties.WithDefault {
    if(pointer == NULL) {
      return(IInkDrawingAttributesPencilProperties.ABI.makeIInkDrawingAttributesPencilProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInkDrawingAttributesPencilProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInkDrawingAttributesPencilProperties.ABI.makeIInkDrawingAttributesPencilProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InkDrawingAttributesPencilProperties> {
    public override fun getValue() = InkDrawingAttributesPencilProperties(pointer.getPointer(0))

    public fun setValue(value: InkDrawingAttributesPencilProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InkDrawingAttributesPencilProperties, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InkDrawingAttributesPencilProperties {
      val address = segment.toRawLongValue()
      return InkDrawingAttributesPencilProperties(Pointer(address))
    }

    public override fun toNative(obj: InkDrawingAttributesPencilProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
