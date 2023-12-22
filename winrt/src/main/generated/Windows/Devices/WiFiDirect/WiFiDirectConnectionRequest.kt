package Windows.Devices.WiFiDirect

import Windows.Foundation.IClosable
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

@ABIMarker(WiFiDirectConnectionRequest.ABI::class)
@Signature("rc(Windows.Devices.WiFiDirect.WiFiDirectConnectionRequest;{8eb99605-914f-49c3-a614-d18dc5b19b43})")
@WinRTByReference(brClass = WiFiDirectConnectionRequest.ByReference::class)
public class WiFiDirectConnectionRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWiFiDirectConnectionRequest.WithDefault, IClosable.WithDefault, IWinRTObject
    {
  private val __518421564_Interface: IWiFiDirectConnectionRequest.WithDefault by lazy {
    as_518421564()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __518421564_Ptr: JNAPointer? by lazy {
    __518421564_Interface.__518421564_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__518421564_Interface, __1260617006_Interface)

  private fun as_518421564(): IWiFiDirectConnectionRequest.WithDefault {
    if(pointer == NULL) {
      return(IWiFiDirectConnectionRequest.ABI.makeIWiFiDirectConnectionRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiDirectConnectionRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiDirectConnectionRequest.ABI.makeIWiFiDirectConnectionRequest(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WiFiDirectConnectionRequest> {
    public override fun getValue() = WiFiDirectConnectionRequest(pointer.getPointer(0))

    public fun setValue(value: WiFiDirectConnectionRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WiFiDirectConnectionRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WiFiDirectConnectionRequest {
      val address = segment.toRawLongValue()
      return WiFiDirectConnectionRequest(Pointer(address))
    }

    public override fun toNative(obj: WiFiDirectConnectionRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
