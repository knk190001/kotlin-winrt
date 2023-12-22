package Windows.Devices.WiFi

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

@ABIMarker(WiFiWpsConfigurationResult.ABI::class)
@Signature("rc(Windows.Devices.WiFi.WiFiWpsConfigurationResult;{67b49871-17ee-42d1-b14f-5a11f1226fb5})")
@WinRTByReference(brClass = WiFiWpsConfigurationResult.ByReference::class)
public class WiFiWpsConfigurationResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWiFiWpsConfigurationResult.WithDefault, IWinRTObject {
  private val __228840410_Interface: IWiFiWpsConfigurationResult.WithDefault by lazy {
    as_228840410()
  }


  public override val __228840410_Ptr: JNAPointer? by lazy {
    __228840410_Interface.__228840410_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__228840410_Interface)

  private fun as_228840410(): IWiFiWpsConfigurationResult.WithDefault {
    if(pointer == NULL) {
      return(IWiFiWpsConfigurationResult.ABI.makeIWiFiWpsConfigurationResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiWpsConfigurationResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiWpsConfigurationResult.ABI.makeIWiFiWpsConfigurationResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WiFiWpsConfigurationResult> {
    public override fun getValue() = WiFiWpsConfigurationResult(pointer.getPointer(0))

    public fun setValue(value: WiFiWpsConfigurationResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WiFiWpsConfigurationResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WiFiWpsConfigurationResult {
      val address = segment.toRawLongValue()
      return WiFiWpsConfigurationResult(Pointer(address))
    }

    public override fun toNative(obj: WiFiWpsConfigurationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
