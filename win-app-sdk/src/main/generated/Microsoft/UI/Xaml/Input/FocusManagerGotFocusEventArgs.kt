package Microsoft.UI.Xaml.Input

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

@ABIMarker(FocusManagerGotFocusEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Input.FocusManagerGotFocusEventArgs;{50aca341-4519-59cf-83b1-c9c45cfdb816})")
@WinRTByReference(brClass = FocusManagerGotFocusEventArgs.ByReference::class)
public class FocusManagerGotFocusEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFocusManagerGotFocusEventArgs.WithDefault, IWinRTObject {
  private val __1107088363_Interface: IFocusManagerGotFocusEventArgs.WithDefault by lazy {
    as_1107088363()
  }


  public override val __1107088363_Ptr: JNAPointer? by lazy {
    __1107088363_Interface.__1107088363_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1107088363_Interface)

  private fun as_1107088363(): IFocusManagerGotFocusEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IFocusManagerGotFocusEventArgs.ABI.makeIFocusManagerGotFocusEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFocusManagerGotFocusEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFocusManagerGotFocusEventArgs.ABI.makeIFocusManagerGotFocusEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FocusManagerGotFocusEventArgs> {
    public override fun getValue() = FocusManagerGotFocusEventArgs(pointer.getPointer(0))

    public fun setValue(value: FocusManagerGotFocusEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FocusManagerGotFocusEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FocusManagerGotFocusEventArgs {
      val address = segment.toRawLongValue()
      return FocusManagerGotFocusEventArgs(Pointer(address))
    }

    public override fun toNative(obj: FocusManagerGotFocusEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
