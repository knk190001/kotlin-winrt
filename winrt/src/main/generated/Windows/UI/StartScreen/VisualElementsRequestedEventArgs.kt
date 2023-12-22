package Windows.UI.StartScreen

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

@ABIMarker(VisualElementsRequestedEventArgs.ABI::class)
@Signature("rc(Windows.UI.StartScreen.VisualElementsRequestedEventArgs;{7b6fc982-3a0d-4ece-af96-cd17e1b00b2d})")
@WinRTByReference(brClass = VisualElementsRequestedEventArgs.ByReference::class)
public class VisualElementsRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVisualElementsRequestedEventArgs.WithDefault, IWinRTObject {
  private val __829709846_Interface: IVisualElementsRequestedEventArgs.WithDefault by lazy {
    as_829709846()
  }


  public override val __829709846_Ptr: JNAPointer? by lazy {
    __829709846_Interface.__829709846_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__829709846_Interface)

  private fun as_829709846(): IVisualElementsRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IVisualElementsRequestedEventArgs.ABI.makeIVisualElementsRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisualElementsRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisualElementsRequestedEventArgs.ABI.makeIVisualElementsRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VisualElementsRequestedEventArgs> {
    public override fun getValue() = VisualElementsRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: VisualElementsRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VisualElementsRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VisualElementsRequestedEventArgs {
      val address = segment.toRawLongValue()
      return VisualElementsRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: VisualElementsRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
