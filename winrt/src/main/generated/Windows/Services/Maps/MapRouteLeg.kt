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

@ABIMarker(MapRouteLeg.ABI::class)
@Signature("rc(Windows.Services.Maps.MapRouteLeg;{96f8b2f6-5bba-4d17-9db6-1a263fec7471})")
@WinRTByReference(brClass = MapRouteLeg.ByReference::class)
public class MapRouteLeg(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMapRouteLeg.WithDefault, IMapRouteLeg2.WithDefault, IWinRTObject {
  private val __415147092_Interface: IMapRouteLeg.WithDefault by lazy {
    as_415147092()
  }


  private val __15341986_Interface: IMapRouteLeg2.WithDefault by lazy {
    as_15341986()
  }


  public override val __415147092_Ptr: JNAPointer? by lazy {
    __415147092_Interface.__415147092_Ptr
  }


  public override val __15341986_Ptr: JNAPointer? by lazy {
    __15341986_Interface.__15341986_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__415147092_Interface, __15341986_Interface)

  private fun as_415147092(): IMapRouteLeg.WithDefault {
    if(pointer == NULL) {
      return(IMapRouteLeg.ABI.makeIMapRouteLeg(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapRouteLeg>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapRouteLeg.ABI.makeIMapRouteLeg(ref.value))
  }

  private fun as_15341986(): IMapRouteLeg2.WithDefault {
    if(pointer == NULL) {
      return(IMapRouteLeg2.ABI.makeIMapRouteLeg2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapRouteLeg2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapRouteLeg2.ABI.makeIMapRouteLeg2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MapRouteLeg> {
    public override fun getValue() = MapRouteLeg(pointer.getPointer(0))

    public fun setValue(value: MapRouteLeg): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapRouteLeg, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MapRouteLeg {
      val address = segment.toRawLongValue()
      return MapRouteLeg(Pointer(address))
    }

    public override fun toNative(obj: MapRouteLeg): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
