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

@ABIMarker(WidgetContext.ABI::class)
@Signature("rc(Microsoft.Windows.Widgets.Providers.WidgetContext;{903c518b-40bc-5bc6-88f7-af9d81c0cdc1})")
@WinRTByReference(brClass = WidgetContext.ByReference::class)
public class WidgetContext(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWidgetContext.WithDefault, IWinRTObject {
  private val __512988422_Interface: IWidgetContext.WithDefault by lazy {
    as_512988422()
  }


  public override val __512988422_Ptr: JNAPointer? by lazy {
    __512988422_Interface.__512988422_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__512988422_Interface)

  private fun as_512988422(): IWidgetContext.WithDefault {
    if(pointer == NULL) {
      return(IWidgetContext.ABI.makeIWidgetContext(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWidgetContext>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWidgetContext.ABI.makeIWidgetContext(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<WidgetContext>
      {
    public override fun getValue() = WidgetContext(pointer.getPointer(0))

    public fun setValue(value: WidgetContext): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WidgetContext, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WidgetContext {
      val address = segment.toRawLongValue()
      return WidgetContext(Pointer(address))
    }

    public override fun toNative(obj: WidgetContext): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
