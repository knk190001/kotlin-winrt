package Windows.Services.Maps.Guidance

import Windows.Services.Maps.MapRoute
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(GuidanceRoute.ABI::class)
@Signature("rc(Windows.Services.Maps.Guidance.GuidanceRoute;{3a14545d-801a-40bd-a286-afb2010cce6c})")
@WinRTByReference(brClass = GuidanceRoute.ByReference::class)
public class GuidanceRoute(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IGuidanceRoute.WithDefault, IWinRTObject {
  private val __1939571154_Interface: IGuidanceRoute.WithDefault by lazy {
    as_1939571154()
  }


  public override val __1939571154_Ptr: JNAPointer? by lazy {
    __1939571154_Interface.__1939571154_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1939571154_Interface)

  private fun as_1939571154(): IGuidanceRoute.WithDefault {
    if(pointer == NULL) {
      return(IGuidanceRoute.ABI.makeIGuidanceRoute(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IGuidanceRoute>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IGuidanceRoute.ABI.makeIGuidanceRoute(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<GuidanceRoute>
      {
    public override fun getValue() = GuidanceRoute(pointer.getPointer(0))

    public fun setValue(value: GuidanceRoute): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<GuidanceRoute, MemoryAddress> {
    public val IGuidanceRouteStatics_Instance: IGuidanceRouteStatics by lazy {
      createIGuidanceRouteStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIGuidanceRouteStatics(): IGuidanceRouteStatics {
      val refiid = Guid.REFIID(IGuidanceRouteStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Maps.Guidance.GuidanceRoute".toHandle(),refiid,interfacePtr)
      val result = IGuidanceRouteStatics.ABI.makeIGuidanceRouteStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): GuidanceRoute {
      val address = segment.toRawLongValue()
      return GuidanceRoute(Pointer(address))
    }

    public override fun toNative(obj: GuidanceRoute): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CanCreateFromMapRoute(mapRoute: MapRoute) =
        ABI.IGuidanceRouteStatics_Instance.CanCreateFromMapRoute(mapRoute)

    public fun TryCreateFromMapRoute(mapRoute: MapRoute) =
        ABI.IGuidanceRouteStatics_Instance.TryCreateFromMapRoute(mapRoute)
  }
}
