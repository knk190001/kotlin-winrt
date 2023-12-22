package Windows.Devices.WiFiDirect.Services

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

@ABIMarker(WiFiDirectServiceSessionRequest.ABI::class)
@Signature("rc(Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSessionRequest;{a0e27c8b-50cb-4a58-9bcf-e472b99fba04})")
@WinRTByReference(brClass = WiFiDirectServiceSessionRequest.ByReference::class)
public class WiFiDirectServiceSessionRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWiFiDirectServiceSessionRequest.WithDefault, IClosable.WithDefault,
    IWinRTObject {
  private val __1155299289_Interface: IWiFiDirectServiceSessionRequest.WithDefault by lazy {
    as_1155299289()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1155299289_Ptr: JNAPointer? by lazy {
    __1155299289_Interface.__1155299289_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1155299289_Interface, __1260617006_Interface)

  private fun as_1155299289(): IWiFiDirectServiceSessionRequest.WithDefault {
    if(pointer == NULL) {
      return(IWiFiDirectServiceSessionRequest.ABI.makeIWiFiDirectServiceSessionRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiDirectServiceSessionRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiDirectServiceSessionRequest.ABI.makeIWiFiDirectServiceSessionRequest(ref.value))
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
      IByReference<WiFiDirectServiceSessionRequest> {
    public override fun getValue() = WiFiDirectServiceSessionRequest(pointer.getPointer(0))

    public fun setValue(value: WiFiDirectServiceSessionRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WiFiDirectServiceSessionRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WiFiDirectServiceSessionRequest {
      val address = segment.toRawLongValue()
      return WiFiDirectServiceSessionRequest(Pointer(address))
    }

    public override fun toNative(obj: WiFiDirectServiceSessionRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
