package Windows.UI.Xaml.Controls.Primitives

import Windows.UI.Xaml.Controls.ContentControl
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

@ABIMarker(LoopingSelectorItem.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.Primitives.LoopingSelectorItem;{c69714b9-27c6-4433-9d7c-0dbfb2f4344f})")
@WinRTByReference(brClass = LoopingSelectorItem.ByReference::class)
public class LoopingSelectorItem(
  ptr: JNAPointer? = NULL
) : ContentControl(ptr), ILoopingSelectorItem.WithDefault, IWinRTObject {
  private val __1639764244_Interface: ILoopingSelectorItem.WithDefault by lazy {
    as_1639764244()
  }


  public override val __1639764244_Ptr: JNAPointer? by lazy {
    __1639764244_Interface.__1639764244_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1639764244_Interface)

  private fun as_1639764244(): ILoopingSelectorItem.WithDefault {
    if(pointer == NULL) {
      return(ILoopingSelectorItem.ABI.makeILoopingSelectorItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILoopingSelectorItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILoopingSelectorItem.ABI.makeILoopingSelectorItem(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LoopingSelectorItem> {
    public override fun getValue() = LoopingSelectorItem(pointer.getPointer(0))

    public fun setValue(value: LoopingSelectorItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LoopingSelectorItem, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LoopingSelectorItem {
      val address = segment.toRawLongValue()
      return LoopingSelectorItem(Pointer(address))
    }

    public override fun toNative(obj: LoopingSelectorItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
