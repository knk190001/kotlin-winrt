package Windows.Media.Devices

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

@ABIMarker(MediaDeviceControlCapabilities.ABI::class)
@Signature("rc(Windows.Media.Devices.MediaDeviceControlCapabilities;{23005816-eb85-43e2-b92b-8240d5ee70ec})")
@WinRTByReference(brClass = MediaDeviceControlCapabilities.ByReference::class)
public class MediaDeviceControlCapabilities(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaDeviceControlCapabilities.WithDefault, IWinRTObject {
  private val __1810935130_Interface: IMediaDeviceControlCapabilities.WithDefault by lazy {
    as_1810935130()
  }


  public override val __1810935130_Ptr: JNAPointer? by lazy {
    __1810935130_Interface.__1810935130_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1810935130_Interface)

  private fun as_1810935130(): IMediaDeviceControlCapabilities.WithDefault {
    if(pointer == NULL) {
      return(IMediaDeviceControlCapabilities.ABI.makeIMediaDeviceControlCapabilities(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaDeviceControlCapabilities>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaDeviceControlCapabilities.ABI.makeIMediaDeviceControlCapabilities(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaDeviceControlCapabilities> {
    public override fun getValue() = MediaDeviceControlCapabilities(pointer.getPointer(0))

    public fun setValue(value: MediaDeviceControlCapabilities): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaDeviceControlCapabilities, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaDeviceControlCapabilities {
      val address = segment.toRawLongValue()
      return MediaDeviceControlCapabilities(Pointer(address))
    }

    public override fun toNative(obj: MediaDeviceControlCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
