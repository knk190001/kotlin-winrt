package Windows.Services.Maps

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

@ABIMarker(MapAddress.ABI::class)
@Signature("rc(Windows.Services.Maps.MapAddress;{cfa7a973-a3b4-4494-b3ff-cba94db69699})")
@WinRTByReference(brClass = MapAddress.ByReference::class)
public class MapAddress(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMapAddress.WithDefault, IMapAddress2.WithDefault, IWinRTObject {
  private val __1827211067_Interface: IMapAddress.WithDefault by lazy {
    as_1827211067()
  }


  private val __808968179_Interface: IMapAddress2.WithDefault by lazy {
    as_808968179()
  }


  public override val __1827211067_Ptr: JNAPointer? by lazy {
    __1827211067_Interface.__1827211067_Ptr
  }


  public override val __808968179_Ptr: JNAPointer? by lazy {
    __808968179_Interface.__808968179_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1827211067_Interface, __808968179_Interface)

  private fun as_1827211067(): IMapAddress.WithDefault {
    if(pointer == NULL) {
      return(IMapAddress.ABI.makeIMapAddress(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapAddress>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapAddress.ABI.makeIMapAddress(ref.value))
  }

  private fun as_808968179(): IMapAddress2.WithDefault {
    if(pointer == NULL) {
      return(IMapAddress2.ABI.makeIMapAddress2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapAddress2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapAddress2.ABI.makeIMapAddress2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MapAddress> {
    public override fun getValue() = MapAddress(pointer.getPointer(0))

    public fun setValue(value: MapAddress): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapAddress, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MapAddress {
      val address = segment.toRawLongValue()
      return MapAddress(Pointer(address))
    }

    public override fun toNative(obj: MapAddress): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
