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

@ABIMarker(WiFiDirectServiceSession.ABI::class)
@Signature("rc(Windows.Devices.WiFiDirect.Services.WiFiDirectServiceSession;{81142163-e426-47cb-8640-e1b3588bf26f})")
@WinRTByReference(brClass = WiFiDirectServiceSession.ByReference::class)
public class WiFiDirectServiceSession(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWiFiDirectServiceSession.WithDefault, IClosable.WithDefault, IWinRTObject {
  private val __1389950422_Interface: IWiFiDirectServiceSession.WithDefault by lazy {
    as_1389950422()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __1389950422_Ptr: JNAPointer? by lazy {
    __1389950422_Interface.__1389950422_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1389950422_Interface, __1260617006_Interface)

  private fun as_1389950422(): IWiFiDirectServiceSession.WithDefault {
    if(pointer == NULL) {
      return(IWiFiDirectServiceSession.ABI.makeIWiFiDirectServiceSession(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiDirectServiceSession>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiDirectServiceSession.ABI.makeIWiFiDirectServiceSession(ref.value))
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
      IByReference<WiFiDirectServiceSession> {
    public override fun getValue() = WiFiDirectServiceSession(pointer.getPointer(0))

    public fun setValue(value: WiFiDirectServiceSession): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WiFiDirectServiceSession, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WiFiDirectServiceSession {
      val address = segment.toRawLongValue()
      return WiFiDirectServiceSession(Pointer(address))
    }

    public override fun toNative(obj: WiFiDirectServiceSession): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
