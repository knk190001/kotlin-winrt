package Windows.Devices.WiFiDirect.Services

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

@ABIMarker(WiFiDirectServiceSessionDeferredEventArgs.ABI::class)
@Signature("rc(Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionDeferredEventArgs;{8dfc197f-1201-4f1f-b6f4-5df1b7b9fb2e})")
@WinRTByReference(brClass = WiFiDirectServiceSessionDeferredEventArgs.ByReference::class)
public class WiFiDirectServiceSessionDeferredEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWiFiDirectServiceSessionDeferredEventArgs.WithDefault, IWinRTObject {
  private val __1153650242_Interface: IWiFiDirectServiceSessionDeferredEventArgs.WithDefault by
      lazy {
    as_1153650242()
  }


  public override val __1153650242_Ptr: JNAPointer? by lazy {
    __1153650242_Interface.__1153650242_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1153650242_Interface)

  private fun as_1153650242(): IWiFiDirectServiceSessionDeferredEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWiFiDirectServiceSessionDeferredEventArgs.ABI.makeIWiFiDirectServiceSessionDeferredEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiDirectServiceSessionDeferredEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiDirectServiceSessionDeferredEventArgs.ABI.makeIWiFiDirectServiceSessionDeferredEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WiFiDirectServiceSessionDeferredEventArgs> {
    public override fun getValue() =
        WiFiDirectServiceSessionDeferredEventArgs(pointer.getPointer(0))

    public fun setValue(value: WiFiDirectServiceSessionDeferredEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WiFiDirectServiceSessionDeferredEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WiFiDirectServiceSessionDeferredEventArgs {
      val address = segment.toRawLongValue()
      return WiFiDirectServiceSessionDeferredEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WiFiDirectServiceSessionDeferredEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
