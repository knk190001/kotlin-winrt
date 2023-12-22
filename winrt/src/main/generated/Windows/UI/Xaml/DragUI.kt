package Windows.UI.Xaml

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

@ABIMarker(DragUI.ABI::class)
@Signature("rc(Windows.UI.Xaml.DragUI;{2d9bd838-7c60-4842-9170-346fe10a226a})")
@WinRTByReference(brClass = DragUI.ByReference::class)
public class DragUI(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDragUI.WithDefault, IWinRTObject {
  private val __1692992614_Interface: IDragUI.WithDefault by lazy {
    as_1692992614()
  }


  public override val __1692992614_Ptr: JNAPointer? by lazy {
    __1692992614_Interface.__1692992614_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1692992614_Interface)

  private fun as_1692992614(): IDragUI.WithDefault {
    if(pointer == NULL) {
      return(IDragUI.ABI.makeIDragUI(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDragUI>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDragUI.ABI.makeIDragUI(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DragUI> {
    public override fun getValue() = DragUI(pointer.getPointer(0))

    public fun setValue(value: DragUI): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DragUI, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DragUI {
      val address = segment.toRawLongValue()
      return DragUI(Pointer(address))
    }

    public override fun toNative(obj: DragUI): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
