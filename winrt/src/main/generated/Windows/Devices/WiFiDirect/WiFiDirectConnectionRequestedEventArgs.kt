package Windows.Devices.WiFiDirect

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

@ABIMarker(WiFiDirectConnectionRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.WiFiDirect.WiFiDirectConnectionRequestedEventArgs;{f99d20be-d38d-484f-8215-e7b65abf244c})")
@WinRTByReference(brClass = WiFiDirectConnectionRequestedEventArgs.ByReference::class)
public class WiFiDirectConnectionRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWiFiDirectConnectionRequestedEventArgs.WithDefault, IWinRTObject {
  private val __354216564_Interface: IWiFiDirectConnectionRequestedEventArgs.WithDefault by lazy {
    as_354216564()
  }


  public override val __354216564_Ptr: JNAPointer? by lazy {
    __354216564_Interface.__354216564_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__354216564_Interface)

  private fun as_354216564(): IWiFiDirectConnectionRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWiFiDirectConnectionRequestedEventArgs.ABI.makeIWiFiDirectConnectionRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiDirectConnectionRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiDirectConnectionRequestedEventArgs.ABI.makeIWiFiDirectConnectionRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WiFiDirectConnectionRequestedEventArgs> {
    public override fun getValue() = WiFiDirectConnectionRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WiFiDirectConnectionRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WiFiDirectConnectionRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WiFiDirectConnectionRequestedEventArgs {
      val address = segment.toRawLongValue()
      return WiFiDirectConnectionRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WiFiDirectConnectionRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
