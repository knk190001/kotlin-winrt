package Windows.Data.Text

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

@ABIMarker(SelectableWordSegment.ABI::class)
@Signature("rc(Windows.Data.Text.SelectableWordSegment;{916a4cb7-8aa7-4c78-b374-5dedb752e60b})")
@WinRTByReference(brClass = SelectableWordSegment.ByReference::class)
public class SelectableWordSegment(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISelectableWordSegment.WithDefault, IWinRTObject {
  private val __1580641392_Interface: ISelectableWordSegment.WithDefault by lazy {
    as_1580641392()
  }


  public override val __1580641392_Ptr: JNAPointer? by lazy {
    __1580641392_Interface.__1580641392_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1580641392_Interface)

  private fun as_1580641392(): ISelectableWordSegment.WithDefault {
    if(pointer == NULL) {
      return(ISelectableWordSegment.ABI.makeISelectableWordSegment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISelectableWordSegment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISelectableWordSegment.ABI.makeISelectableWordSegment(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SelectableWordSegment> {
    public override fun getValue() = SelectableWordSegment(pointer.getPointer(0))

    public fun setValue(value: SelectableWordSegment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SelectableWordSegment, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SelectableWordSegment {
      val address = segment.toRawLongValue()
      return SelectableWordSegment(Pointer(address))
    }

    public override fun toNative(obj: SelectableWordSegment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
