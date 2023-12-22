package Microsoft.UI.Input

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

@ABIMarker(FocusChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Input.FocusChangedEventArgs;{a039b115-dbdf-594c-9b86-da6aa05c9fa2})")
@WinRTByReference(brClass = FocusChangedEventArgs.ByReference::class)
public class FocusChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFocusChangedEventArgs.WithDefault, IWinRTObject {
  private val __65386654_Interface: IFocusChangedEventArgs.WithDefault by lazy {
    as_65386654()
  }


  public override val __65386654_Ptr: JNAPointer? by lazy {
    __65386654_Interface.__65386654_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__65386654_Interface)

  private fun as_65386654(): IFocusChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IFocusChangedEventArgs.ABI.makeIFocusChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFocusChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFocusChangedEventArgs.ABI.makeIFocusChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FocusChangedEventArgs> {
    public override fun getValue() = FocusChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: FocusChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FocusChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FocusChangedEventArgs {
      val address = segment.toRawLongValue()
      return FocusChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: FocusChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
