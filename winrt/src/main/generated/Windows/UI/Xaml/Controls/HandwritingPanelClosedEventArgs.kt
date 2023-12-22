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

@ABIMarker(HandwritingPanelClosedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.HandwritingPanelClosedEventArgs;{4fb91c73-192d-4dd2-a1a2-80ed01125876})")
@WinRTByReference(brClass = HandwritingPanelClosedEventArgs.ByReference::class)
public class HandwritingPanelClosedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHandwritingPanelClosedEventArgs.WithDefault, IWinRTObject {
  private val __277376648_Interface: IHandwritingPanelClosedEventArgs.WithDefault by lazy {
    as_277376648()
  }


  public override val __277376648_Ptr: JNAPointer? by lazy {
    __277376648_Interface.__277376648_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__277376648_Interface)

  private fun as_277376648(): IHandwritingPanelClosedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IHandwritingPanelClosedEventArgs.ABI.makeIHandwritingPanelClosedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHandwritingPanelClosedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHandwritingPanelClosedEventArgs.ABI.makeIHandwritingPanelClosedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HandwritingPanelClosedEventArgs> {
    public override fun getValue() = HandwritingPanelClosedEventArgs(pointer.getPointer(0))

    public fun setValue(value: HandwritingPanelClosedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HandwritingPanelClosedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HandwritingPanelClosedEventArgs {
      val address = segment.toRawLongValue()
      return HandwritingPanelClosedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: HandwritingPanelClosedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
