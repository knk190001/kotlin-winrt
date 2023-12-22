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

@ABIMarker(WiFiDirectServiceAutoAcceptSessionConnectedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.WiFiDirect.Services.WiFiDirectServiceAutoAcceptSessionConnectedEventArgs;{dcd9e01e-83df-43e5-8f43-cbe8479e84eb})")
@WinRTByReference(brClass = WiFiDirectServiceAutoAcceptSessionConnectedEventArgs.ByReference::class)
public class WiFiDirectServiceAutoAcceptSessionConnectedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs.WithDefault,
    IWinRTObject {
  private val __1561428525_Interface:
      IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs.WithDefault by lazy {
    as_1561428525()
  }


  public override val __1561428525_Ptr: JNAPointer? by lazy {
    __1561428525_Interface.__1561428525_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1561428525_Interface)

  private fun as_1561428525(): IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs.ABI.makeIWiFiDirectServiceAutoAcceptSessionConnectedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiDirectServiceAutoAcceptSessionConnectedEventArgs.ABI.makeIWiFiDirectServiceAutoAcceptSessionConnectedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WiFiDirectServiceAutoAcceptSessionConnectedEventArgs> {
    public override fun getValue() =
        WiFiDirectServiceAutoAcceptSessionConnectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WiFiDirectServiceAutoAcceptSessionConnectedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WiFiDirectServiceAutoAcceptSessionConnectedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WiFiDirectServiceAutoAcceptSessionConnectedEventArgs {
      val address = segment.toRawLongValue()
      return WiFiDirectServiceAutoAcceptSessionConnectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WiFiDirectServiceAutoAcceptSessionConnectedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
