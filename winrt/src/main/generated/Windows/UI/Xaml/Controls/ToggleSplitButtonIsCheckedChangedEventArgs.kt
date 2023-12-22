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

@ABIMarker(ToggleSplitButtonIsCheckedChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.ToggleSplitButtonIsCheckedChangedEventArgs;{2138f0cf-5fcd-5dbb-99ae-359483070f6b})")
@WinRTByReference(brClass = ToggleSplitButtonIsCheckedChangedEventArgs.ByReference::class)
public class ToggleSplitButtonIsCheckedChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IToggleSplitButtonIsCheckedChangedEventArgs.WithDefault, IWinRTObject {
  private val __945832068_Interface: IToggleSplitButtonIsCheckedChangedEventArgs.WithDefault by
      lazy {
    as_945832068()
  }


  public override val __945832068_Ptr: JNAPointer? by lazy {
    __945832068_Interface.__945832068_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__945832068_Interface)

  private fun as_945832068(): IToggleSplitButtonIsCheckedChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IToggleSplitButtonIsCheckedChangedEventArgs.ABI.makeIToggleSplitButtonIsCheckedChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IToggleSplitButtonIsCheckedChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IToggleSplitButtonIsCheckedChangedEventArgs.ABI.makeIToggleSplitButtonIsCheckedChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ToggleSplitButtonIsCheckedChangedEventArgs> {
    public override fun getValue() =
        ToggleSplitButtonIsCheckedChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ToggleSplitButtonIsCheckedChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ToggleSplitButtonIsCheckedChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        ToggleSplitButtonIsCheckedChangedEventArgs {
      val address = segment.toRawLongValue()
      return ToggleSplitButtonIsCheckedChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ToggleSplitButtonIsCheckedChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
