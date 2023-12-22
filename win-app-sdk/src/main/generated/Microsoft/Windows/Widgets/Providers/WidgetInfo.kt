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

@ABIMarker(WidgetInfo.ABI::class)
@Signature("rc(Microsoft.Windows.Widgets.Providers.WidgetInfo;{cea11f42-a020-5db5-89e2-b7dece4ae5cb})")
@WinRTByReference(brClass = WidgetInfo.ByReference::class)
public class WidgetInfo(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWidgetInfo.WithDefault, IWinRTObject {
  private val __943576253_Interface: IWidgetInfo.WithDefault by lazy {
    as_943576253()
  }


  public override val __943576253_Ptr: JNAPointer? by lazy {
    __943576253_Interface.__943576253_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__943576253_Interface)

  private fun as_943576253(): IWidgetInfo.WithDefault {
    if(pointer == NULL) {
      return(IWidgetInfo.ABI.makeIWidgetInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWidgetInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWidgetInfo.ABI.makeIWidgetInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<WidgetInfo> {
    public override fun getValue() = WidgetInfo(pointer.getPointer(0))

    public fun setValue(value: WidgetInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WidgetInfo, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WidgetInfo {
      val address = segment.toRawLongValue()
      return WidgetInfo(Pointer(address))
    }

    public override fun toNative(obj: WidgetInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
