package Windows.Devices.Geolocation

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

@ABIMarker(GeovisitStateChangedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Geolocation.GeovisitStateChangedEventArgs;{ceb4d1ff-8b53-4968-beed-4cecd029ce15})")
@WinRTByReference(brClass = GeovisitStateChangedEventArgs.ByReference::class)
public class GeovisitStateChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGeovisitStateChangedEventArgs.WithDefault, IWinRTObject {
  private val __918961499_Interface: IGeovisitStateChangedEventArgs.WithDefault by lazy {
    as_918961499()
  }


  public override val __918961499_Ptr: JNAPointer? by lazy {
    __918961499_Interface.__918961499_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__918961499_Interface)

  private fun as_918961499(): IGeovisitStateChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IGeovisitStateChangedEventArgs.ABI.makeIGeovisitStateChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeovisitStateChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeovisitStateChangedEventArgs.ABI.makeIGeovisitStateChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<GeovisitStateChangedEventArgs> {
    public override fun getValue() = GeovisitStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: GeovisitStateChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GeovisitStateChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): GeovisitStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return GeovisitStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: GeovisitStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
