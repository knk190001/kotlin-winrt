package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ComboBoxTextSubmittedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ComboBoxTextSubmittedEventArgs;{0d7a9794-73b5-585e-bfbb-de6df7eb9fcf})")
@WinRTByReference(brClass = ComboBoxTextSubmittedEventArgs.ByReference::class)
public class ComboBoxTextSubmittedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IComboBoxTextSubmittedEventArgs.WithDefault, IWinRTObject {
  private val __1930724051_Interface: IComboBoxTextSubmittedEventArgs.WithDefault by lazy {
    as_1930724051()
  }


  public override val __1930724051_Ptr: JNAPointer? by lazy {
    __1930724051_Interface.__1930724051_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1930724051_Interface)

  private fun as_1930724051(): IComboBoxTextSubmittedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IComboBoxTextSubmittedEventArgs.ABI.makeIComboBoxTextSubmittedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IComboBoxTextSubmittedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IComboBoxTextSubmittedEventArgs.ABI.makeIComboBoxTextSubmittedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ComboBoxTextSubmittedEventArgs> {
    public override fun getValue() = ComboBoxTextSubmittedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ComboBoxTextSubmittedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ComboBoxTextSubmittedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ComboBoxTextSubmittedEventArgs {
      val address = segment.toRawLongValue()
      return ComboBoxTextSubmittedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ComboBoxTextSubmittedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
