package Microsoft.UI.Xaml

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

@ABIMarker(DragOperationDeferral.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.DragOperationDeferral;{462c1880-fc6a-5035-8abf-564bacb78158})")
@WinRTByReference(brClass = DragOperationDeferral.ByReference::class)
public class DragOperationDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDragOperationDeferral.WithDefault, IWinRTObject {
  private val __1868338487_Interface: IDragOperationDeferral.WithDefault by lazy {
    as_1868338487()
  }


  public override val __1868338487_Ptr: JNAPointer? by lazy {
    __1868338487_Interface.__1868338487_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1868338487_Interface)

  private fun as_1868338487(): IDragOperationDeferral.WithDefault {
    if(pointer == NULL) {
      return(IDragOperationDeferral.ABI.makeIDragOperationDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDragOperationDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDragOperationDeferral.ABI.makeIDragOperationDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DragOperationDeferral> {
    public override fun getValue() = DragOperationDeferral(pointer.getPointer(0))

    public fun setValue(value: DragOperationDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DragOperationDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DragOperationDeferral {
      val address = segment.toRawLongValue()
      return DragOperationDeferral(Pointer(address))
    }

    public override fun toNative(obj: DragOperationDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
