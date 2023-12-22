package Windows.Services.Maps

import Windows.Devices.Geolocation.Geopoint
import Windows.Services.Maps.IEnhancedWaypointFactory.ABI.IID
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

@ABIMarker(EnhancedWaypoint.ABI::class)
@Signature("rc(Windows.Services.Maps.EnhancedWaypoint;{ed268c74-5913-11e6-8b77-86f30ca893d3})")
@WinRTByReference(brClass = EnhancedWaypoint.ByReference::class)
public class EnhancedWaypoint(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IEnhancedWaypoint.WithDefault, IWinRTObject {
  private val __364591708_Interface: IEnhancedWaypoint.WithDefault by lazy {
    as_364591708()
  }


  public override val __364591708_Ptr: JNAPointer? by lazy {
    __364591708_Interface.__364591708_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__364591708_Interface)

  public constructor(point: Geopoint, kind: WaypointKind) : this(ABI.activate(point, kind))

  private fun as_364591708(): IEnhancedWaypoint.WithDefault {
    if(pointer == NULL) {
      return(IEnhancedWaypoint.ABI.makeIEnhancedWaypoint(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IEnhancedWaypoint>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IEnhancedWaypoint.ABI.makeIEnhancedWaypoint(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<EnhancedWaypoint> {
    public override fun getValue() = EnhancedWaypoint(pointer.getPointer(0))

    public fun setValue(value: EnhancedWaypoint): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<EnhancedWaypoint, MemoryAddress> {
    public val IEnhancedWaypointFactory_Instance: IEnhancedWaypointFactory by lazy {
      createIEnhancedWaypointFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIEnhancedWaypointFactory(): IEnhancedWaypointFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Maps.EnhancedWaypoint".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IEnhancedWaypointFactory.ABI.makeIEnhancedWaypointFactory(factoryActivatorPtr.value))
    }

    public fun activate(point: Geopoint, kind: WaypointKind): JNAPointer? =
        IEnhancedWaypointFactory_Instance.Create(point, kind)?.pointer

    public override fun fromNative(segment: MemoryAddress): EnhancedWaypoint {
      val address = segment.toRawLongValue()
      return EnhancedWaypoint(Pointer(address))
    }

    public override fun toNative(obj: EnhancedWaypoint): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
