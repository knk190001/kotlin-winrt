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

@ABIMarker(MapRoute.ABI::class)
@Signature("rc(Windows.Services.Maps.MapRoute;{fb07b732-584d-4583-9c60-641fea274349})")
@WinRTByReference(brClass = MapRoute.ByReference::class)
public class MapRoute(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMapRoute.WithDefault, IMapRoute2.WithDefault, IMapRoute3.WithDefault,
    IMapRoute4.WithDefault, IWinRTObject {
  private val __48427174_Interface: IMapRoute.WithDefault by lazy {
    as_48427174()
  }


  private val __1501242344_Interface: IMapRoute2.WithDefault by lazy {
    as_1501242344()
  }


  private val __1501242343_Interface: IMapRoute3.WithDefault by lazy {
    as_1501242343()
  }


  private val __1501242342_Interface: IMapRoute4.WithDefault by lazy {
    as_1501242342()
  }


  public override val __48427174_Ptr: JNAPointer? by lazy {
    __48427174_Interface.__48427174_Ptr
  }


  public override val __1501242344_Ptr: JNAPointer? by lazy {
    __1501242344_Interface.__1501242344_Ptr
  }


  public override val __1501242343_Ptr: JNAPointer? by lazy {
    __1501242343_Interface.__1501242343_Ptr
  }


  public override val __1501242342_Ptr: JNAPointer? by lazy {
    __1501242342_Interface.__1501242342_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__48427174_Interface, __1501242344_Interface, __1501242343_Interface,
        __1501242342_Interface)

  private fun as_48427174(): IMapRoute.WithDefault {
    if(pointer == NULL) {
      return(IMapRoute.ABI.makeIMapRoute(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapRoute>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapRoute.ABI.makeIMapRoute(ref.value))
  }

  private fun as_1501242344(): IMapRoute2.WithDefault {
    if(pointer == NULL) {
      return(IMapRoute2.ABI.makeIMapRoute2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapRoute2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapRoute2.ABI.makeIMapRoute2(ref.value))
  }

  private fun as_1501242343(): IMapRoute3.WithDefault {
    if(pointer == NULL) {
      return(IMapRoute3.ABI.makeIMapRoute3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapRoute3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapRoute3.ABI.makeIMapRoute3(ref.value))
  }

  private fun as_1501242342(): IMapRoute4.WithDefault {
    if(pointer == NULL) {
      return(IMapRoute4.ABI.makeIMapRoute4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMapRoute4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMapRoute4.ABI.makeIMapRoute4(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MapRoute> {
    public override fun getValue() = MapRoute(pointer.getPointer(0))

    public fun setValue(value: MapRoute): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MapRoute, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MapRoute {
      val address = segment.toRawLongValue()
      return MapRoute(Pointer(address))
    }

    public override fun toNative(obj: MapRoute): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
