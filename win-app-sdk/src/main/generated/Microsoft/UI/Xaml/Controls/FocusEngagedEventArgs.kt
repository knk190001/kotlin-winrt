package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.RoutedEventArgs
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

@ABIMarker(FocusEngagedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.FocusEngagedEventArgs;{1e71e8e4-74b2-50a1-8f2b-42c0118ab0ea})")
@WinRTByReference(brClass = FocusEngagedEventArgs.ByReference::class)
public class FocusEngagedEventArgs(
  ptr: JNAPointer? = NULL
) : RoutedEventArgs(ptr), IFocusEngagedEventArgs.WithDefault, IWinRTObject {
  private val __681725509_Interface: IFocusEngagedEventArgs.WithDefault by lazy {
    as_681725509()
  }


  public override val __681725509_Ptr: JNAPointer? by lazy {
    __681725509_Interface.__681725509_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__681725509_Interface)

  private fun as_681725509(): IFocusEngagedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IFocusEngagedEventArgs.ABI.makeIFocusEngagedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFocusEngagedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFocusEngagedEventArgs.ABI.makeIFocusEngagedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FocusEngagedEventArgs> {
    public override fun getValue() = FocusEngagedEventArgs(pointer.getPointer(0))

    public fun setValue(value: FocusEngagedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FocusEngagedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FocusEngagedEventArgs {
      val address = segment.toRawLongValue()
      return FocusEngagedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: FocusEngagedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
