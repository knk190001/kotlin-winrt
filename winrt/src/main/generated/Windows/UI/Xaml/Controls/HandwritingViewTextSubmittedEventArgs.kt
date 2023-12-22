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

@ABIMarker(HandwritingViewTextSubmittedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.HandwritingViewTextSubmittedEventArgs;{55ac0f47-f5e4-55da-b8a3-d418b7564291})")
@WinRTByReference(brClass = HandwritingViewTextSubmittedEventArgs.ByReference::class)
public class HandwritingViewTextSubmittedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHandwritingViewTextSubmittedEventArgs.WithDefault, IWinRTObject {
  private val __453697089_Interface: IHandwritingViewTextSubmittedEventArgs.WithDefault by lazy {
    as_453697089()
  }


  public override val __453697089_Ptr: JNAPointer? by lazy {
    __453697089_Interface.__453697089_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__453697089_Interface)

  private fun as_453697089(): IHandwritingViewTextSubmittedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IHandwritingViewTextSubmittedEventArgs.ABI.makeIHandwritingViewTextSubmittedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHandwritingViewTextSubmittedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHandwritingViewTextSubmittedEventArgs.ABI.makeIHandwritingViewTextSubmittedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HandwritingViewTextSubmittedEventArgs> {
    public override fun getValue() = HandwritingViewTextSubmittedEventArgs(pointer.getPointer(0))

    public fun setValue(value: HandwritingViewTextSubmittedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HandwritingViewTextSubmittedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HandwritingViewTextSubmittedEventArgs {
      val address = segment.toRawLongValue()
      return HandwritingViewTextSubmittedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: HandwritingViewTextSubmittedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
