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

@ABIMarker(Geovisit.ABI::class)
@Signature("rc(Windows.Devices.Geolocation.Geovisit;{b1877a76-9ef6-41ab-a0dd-793ece76e2de})")
@WinRTByReference(brClass = Geovisit.ByReference::class)
public class Geovisit(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGeovisit.WithDefault, IWinRTObject {
  private val __241789671_Interface: IGeovisit.WithDefault by lazy {
    as_241789671()
  }


  public override val __241789671_Ptr: JNAPointer? by lazy {
    __241789671_Interface.__241789671_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__241789671_Interface)

  private fun as_241789671(): IGeovisit.WithDefault {
    if(pointer == NULL) {
      return(IGeovisit.ABI.makeIGeovisit(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeovisit>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeovisit.ABI.makeIGeovisit(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Geovisit> {
    public override fun getValue() = Geovisit(pointer.getPointer(0))

    public fun setValue(value: Geovisit): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Geovisit, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Geovisit {
      val address = segment.toRawLongValue()
      return Geovisit(Pointer(address))
    }

    public override fun toNative(obj: Geovisit): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
