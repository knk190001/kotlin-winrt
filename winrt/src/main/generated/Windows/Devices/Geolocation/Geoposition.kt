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

@ABIMarker(Geoposition.ABI::class)
@Signature("rc(Windows.Devices.Geolocation.Geoposition;{c18d0454-7d41-4ff7-a957-9dffb4ef7f5b})")
@WinRTByReference(brClass = Geoposition.ByReference::class)
public class Geoposition(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGeoposition.WithDefault, IGeoposition2.WithDefault, IWinRTObject {
  private val __1332701541_Interface: IGeoposition.WithDefault by lazy {
    as_1332701541()
  }


  private val __1635925239_Interface: IGeoposition2.WithDefault by lazy {
    as_1635925239()
  }


  public override val __1332701541_Ptr: JNAPointer? by lazy {
    __1332701541_Interface.__1332701541_Ptr
  }


  public override val __1635925239_Ptr: JNAPointer? by lazy {
    __1635925239_Interface.__1635925239_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1332701541_Interface, __1635925239_Interface)

  private fun as_1332701541(): IGeoposition.WithDefault {
    if(pointer == NULL) {
      return(IGeoposition.ABI.makeIGeoposition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeoposition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeoposition.ABI.makeIGeoposition(ref.value))
  }

  private fun as_1635925239(): IGeoposition2.WithDefault {
    if(pointer == NULL) {
      return(IGeoposition2.ABI.makeIGeoposition2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGeoposition2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGeoposition2.ABI.makeIGeoposition2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<Geoposition> {
    public override fun getValue() = Geoposition(pointer.getPointer(0))

    public fun setValue(value: Geoposition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<Geoposition, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): Geoposition {
      val address = segment.toRawLongValue()
      return Geoposition(Pointer(address))
    }

    public override fun toNative(obj: Geoposition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
