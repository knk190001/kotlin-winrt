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

@ABIMarker(WidgetAnalyticsInfoReportedArgs.ABI::class)
@Signature("rc(Microsoft.Windows.Widgets.Providers.WidgetAnalyticsInfoReportedArgs;{1d9e5fb5-2bce-5350-87b1-d63199526639})")
@WinRTByReference(brClass = WidgetAnalyticsInfoReportedArgs.ByReference::class)
public class WidgetAnalyticsInfoReportedArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWidgetAnalyticsInfoReportedArgs.WithDefault, IWinRTObject {
  private val __1315481521_Interface: IWidgetAnalyticsInfoReportedArgs.WithDefault by lazy {
    as_1315481521()
  }


  public override val __1315481521_Ptr: JNAPointer? by lazy {
    __1315481521_Interface.__1315481521_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1315481521_Interface)

  private fun as_1315481521(): IWidgetAnalyticsInfoReportedArgs.WithDefault {
    if(pointer == NULL) {
      return(IWidgetAnalyticsInfoReportedArgs.ABI.makeIWidgetAnalyticsInfoReportedArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWidgetAnalyticsInfoReportedArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWidgetAnalyticsInfoReportedArgs.ABI.makeIWidgetAnalyticsInfoReportedArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WidgetAnalyticsInfoReportedArgs> {
    public override fun getValue() = WidgetAnalyticsInfoReportedArgs(pointer.getPointer(0))

    public fun setValue(value: WidgetAnalyticsInfoReportedArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WidgetAnalyticsInfoReportedArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WidgetAnalyticsInfoReportedArgs {
      val address = segment.toRawLongValue()
      return WidgetAnalyticsInfoReportedArgs(Pointer(address))
    }

    public override fun toNative(obj: WidgetAnalyticsInfoReportedArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
