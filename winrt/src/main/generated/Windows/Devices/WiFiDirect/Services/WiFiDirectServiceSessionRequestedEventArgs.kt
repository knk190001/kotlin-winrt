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

@ABIMarker(WiFiDirectServiceSessionRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionRequestedEventArgs;{74bdcc11-53d6-4999-b4f8-6c8ecc1771e7})")
@WinRTByReference(brClass = WiFiDirectServiceSessionRequestedEventArgs.ByReference::class)
public class WiFiDirectServiceSessionRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWiFiDirectServiceSessionRequestedEventArgs.WithDefault, IWinRTObject {
  private val __390858559_Interface: IWiFiDirectServiceSessionRequestedEventArgs.WithDefault by
      lazy {
    as_390858559()
  }


  public override val __390858559_Ptr: JNAPointer? by lazy {
    __390858559_Interface.__390858559_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__390858559_Interface)

  private fun as_390858559(): IWiFiDirectServiceSessionRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWiFiDirectServiceSessionRequestedEventArgs.ABI.makeIWiFiDirectServiceSessionRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiDirectServiceSessionRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiDirectServiceSessionRequestedEventArgs.ABI.makeIWiFiDirectServiceSessionRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WiFiDirectServiceSessionRequestedEventArgs> {
    public override fun getValue() =
        WiFiDirectServiceSessionRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WiFiDirectServiceSessionRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WiFiDirectServiceSessionRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WiFiDirectServiceSessionRequestedEventArgs {
      val address = segment.toRawLongValue()
      return WiFiDirectServiceSessionRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WiFiDirectServiceSessionRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
