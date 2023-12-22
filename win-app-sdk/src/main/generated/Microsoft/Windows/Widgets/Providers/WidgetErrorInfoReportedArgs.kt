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

@ABIMarker(WidgetErrorInfoReportedArgs.ABI::class)
@Signature("rc(Microsoft.Windows.Widgets.Providers.WidgetErrorInfoReportedArgs;{30efa627-b21f-55d5-b91a-b23b4aa13645})")
@WinRTByReference(brClass = WidgetErrorInfoReportedArgs.ByReference::class)
public class WidgetErrorInfoReportedArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWidgetErrorInfoReportedArgs.WithDefault, IWinRTObject {
  private val __117196881_Interface: IWidgetErrorInfoReportedArgs.WithDefault by lazy {
    as_117196881()
  }


  public override val __117196881_Ptr: JNAPointer? by lazy {
    __117196881_Interface.__117196881_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__117196881_Interface)

  private fun as_117196881(): IWidgetErrorInfoReportedArgs.WithDefault {
    if(pointer == NULL) {
      return(IWidgetErrorInfoReportedArgs.ABI.makeIWidgetErrorInfoReportedArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWidgetErrorInfoReportedArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWidgetErrorInfoReportedArgs.ABI.makeIWidgetErrorInfoReportedArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WidgetErrorInfoReportedArgs> {
    public override fun getValue() = WidgetErrorInfoReportedArgs(pointer.getPointer(0))

    public fun setValue(value: WidgetErrorInfoReportedArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WidgetErrorInfoReportedArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WidgetErrorInfoReportedArgs {
      val address = segment.toRawLongValue()
      return WidgetErrorInfoReportedArgs(Pointer(address))
    }

    public override fun toNative(obj: WidgetErrorInfoReportedArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
