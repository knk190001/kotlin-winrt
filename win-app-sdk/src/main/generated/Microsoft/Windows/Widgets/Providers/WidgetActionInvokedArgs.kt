package Microsoft.Windows.Widgets.Providers

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

@ABIMarker(WidgetActionInvokedArgs.ABI::class)
@Signature("rc(Microsoft.Windows.Widgets.Providers.WidgetActionInvokedArgs;{c593cc57-04b9-52ca-88ad-46fea21ea340})")
@WinRTByReference(brClass = WidgetActionInvokedArgs.ByReference::class)
public class WidgetActionInvokedArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWidgetActionInvokedArgs.WithDefault, IWinRTObject {
  private val __2146294110_Interface: IWidgetActionInvokedArgs.WithDefault by lazy {
    as_2146294110()
  }


  public override val __2146294110_Ptr: JNAPointer? by lazy {
    __2146294110_Interface.__2146294110_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2146294110_Interface)

  private fun as_2146294110(): IWidgetActionInvokedArgs.WithDefault {
    if(pointer == NULL) {
      return(IWidgetActionInvokedArgs.ABI.makeIWidgetActionInvokedArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWidgetActionInvokedArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWidgetActionInvokedArgs.ABI.makeIWidgetActionInvokedArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WidgetActionInvokedArgs> {
    public override fun getValue() = WidgetActionInvokedArgs(pointer.getPointer(0))

    public fun setValue(value: WidgetActionInvokedArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WidgetActionInvokedArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WidgetActionInvokedArgs {
      val address = segment.toRawLongValue()
      return WidgetActionInvokedArgs(Pointer(address))
    }

    public override fun toNative(obj: WidgetActionInvokedArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
