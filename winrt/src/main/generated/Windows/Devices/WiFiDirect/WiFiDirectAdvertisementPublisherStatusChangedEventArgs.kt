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

@ABIMarker(WiFiDirectAdvertisementPublisherStatusChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisherStatusChangedEventArgs;{aafde53c-5481-46e6-90dd-32116518f192})")
@WinRTByReference(brClass =
    WiFiDirectAdvertisementPublisherStatusChangedEventArgs.ByReference::class)
public class WiFiDirectAdvertisementPublisherStatusChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWiFiDirectAdvertisementPublisherStatusChangedEventArgs.WithDefault,
    IWinRTObject {
  private val __1707111129_Interface:
      IWiFiDirectAdvertisementPublisherStatusChangedEventArgs.WithDefault by lazy {
    as_1707111129()
  }


  public override val __1707111129_Ptr: JNAPointer? by lazy {
    __1707111129_Interface.__1707111129_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1707111129_Interface)

  private fun as_1707111129(): IWiFiDirectAdvertisementPublisherStatusChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWiFiDirectAdvertisementPublisherStatusChangedEventArgs.ABI.makeIWiFiDirectAdvertisementPublisherStatusChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiDirectAdvertisementPublisherStatusChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiDirectAdvertisementPublisherStatusChangedEventArgs.ABI.makeIWiFiDirectAdvertisementPublisherStatusChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WiFiDirectAdvertisementPublisherStatusChangedEventArgs> {
    public override fun getValue() =
        WiFiDirectAdvertisementPublisherStatusChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WiFiDirectAdvertisementPublisherStatusChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WiFiDirectAdvertisementPublisherStatusChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        WiFiDirectAdvertisementPublisherStatusChangedEventArgs {
      val address = segment.toRawLongValue()
      return WiFiDirectAdvertisementPublisherStatusChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WiFiDirectAdvertisementPublisherStatusChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
