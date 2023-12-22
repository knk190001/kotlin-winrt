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

@ABIMarker(WiFiDirectAdvertisement.ABI::class)
@Signature("rc(Windows.Devices.WiFiDirect.WiFiDirectAdvertisement;{ab511a2d-2a06-49a1-a584-61435c7905a6})")
@WinRTByReference(brClass = WiFiDirectAdvertisement.ByReference::class)
public class WiFiDirectAdvertisement(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWiFiDirectAdvertisement.WithDefault, IWiFiDirectAdvertisement2.WithDefault,
    IWinRTObject {
  private val __1027862152_Interface: IWiFiDirectAdvertisement.WithDefault by lazy {
    as_1027862152()
  }


  private val __1798955590_Interface: IWiFiDirectAdvertisement2.WithDefault by lazy {
    as_1798955590()
  }


  public override val __1027862152_Ptr: JNAPointer? by lazy {
    __1027862152_Interface.__1027862152_Ptr
  }


  public override val __1798955590_Ptr: JNAPointer? by lazy {
    __1798955590_Interface.__1798955590_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1027862152_Interface, __1798955590_Interface)

  private fun as_1027862152(): IWiFiDirectAdvertisement.WithDefault {
    if(pointer == NULL) {
      return(IWiFiDirectAdvertisement.ABI.makeIWiFiDirectAdvertisement(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiDirectAdvertisement>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiDirectAdvertisement.ABI.makeIWiFiDirectAdvertisement(ref.value))
  }

  private fun as_1798955590(): IWiFiDirectAdvertisement2.WithDefault {
    if(pointer == NULL) {
      return(IWiFiDirectAdvertisement2.ABI.makeIWiFiDirectAdvertisement2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWiFiDirectAdvertisement2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWiFiDirectAdvertisement2.ABI.makeIWiFiDirectAdvertisement2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WiFiDirectAdvertisement> {
    public override fun getValue() = WiFiDirectAdvertisement(pointer.getPointer(0))

    public fun setValue(value: WiFiDirectAdvertisement): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WiFiDirectAdvertisement, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WiFiDirectAdvertisement {
      val address = segment.toRawLongValue()
      return WiFiDirectAdvertisement(Pointer(address))
    }

    public override fun toNative(obj: WiFiDirectAdvertisement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
