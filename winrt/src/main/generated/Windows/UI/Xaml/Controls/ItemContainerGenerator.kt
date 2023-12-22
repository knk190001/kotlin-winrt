package Windows.UI.Xaml.Controls

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

@ABIMarker(ItemContainerGenerator.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ItemContainerGenerator;{40765f00-83f0-4d7f-b1b8-f19de4f1d5da})")
@WinRTByReference(brClass = ItemContainerGenerator.ByReference::class)
public class ItemContainerGenerator(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IItemContainerGenerator.WithDefault, IWinRTObject {
  private val __1131231519_Interface: IItemContainerGenerator.WithDefault by lazy {
    as_1131231519()
  }


  public override val __1131231519_Ptr: JNAPointer? by lazy {
    __1131231519_Interface.__1131231519_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1131231519_Interface)

  private fun as_1131231519(): IItemContainerGenerator.WithDefault {
    if(pointer == NULL) {
      return(IItemContainerGenerator.ABI.makeIItemContainerGenerator(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IItemContainerGenerator>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IItemContainerGenerator.ABI.makeIItemContainerGenerator(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ItemContainerGenerator> {
    public override fun getValue() = ItemContainerGenerator(pointer.getPointer(0))

    public fun setValue(value: ItemContainerGenerator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ItemContainerGenerator, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ItemContainerGenerator {
      val address = segment.toRawLongValue()
      return ItemContainerGenerator(Pointer(address))
    }

    public override fun toNative(obj: ItemContainerGenerator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
