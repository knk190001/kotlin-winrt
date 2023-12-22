package Windows.Perception.Spatial

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

@ABIMarker(SpatialBoundingVolume.ABI::class)
@Signature("rc(Windows.Perception.Spatial.SpatialBoundingVolume;{fb2065da-68c3-33df-b7af-4c787207999c})")
@WinRTByReference(brClass = SpatialBoundingVolume.ByReference::class)
public class SpatialBoundingVolume(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpatialBoundingVolume.WithDefault, IWinRTObject {
  private val __678301473_Interface: ISpatialBoundingVolume.WithDefault by lazy {
    as_678301473()
  }


  public override val __678301473_Ptr: JNAPointer? by lazy {
    __678301473_Interface.__678301473_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__678301473_Interface)

  private fun as_678301473(): ISpatialBoundingVolume.WithDefault {
    if(pointer == NULL) {
      return(ISpatialBoundingVolume.ABI.makeISpatialBoundingVolume(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpatialBoundingVolume>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpatialBoundingVolume.ABI.makeISpatialBoundingVolume(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialBoundingVolume> {
    public override fun getValue() = SpatialBoundingVolume(pointer.getPointer(0))

    public fun setValue(value: SpatialBoundingVolume): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialBoundingVolume, MemoryAddress> {
    public val ISpatialBoundingVolumeStatics_Instance: ISpatialBoundingVolumeStatics by lazy {
      createISpatialBoundingVolumeStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISpatialBoundingVolumeStatics(): ISpatialBoundingVolumeStatics {
      val refiid = Guid.REFIID(ISpatialBoundingVolumeStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Perception.Spatial.SpatialBoundingVolume".toHandle(),refiid,interfacePtr)
      val result =
          ISpatialBoundingVolumeStatics.ABI.makeISpatialBoundingVolumeStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SpatialBoundingVolume {
      val address = segment.toRawLongValue()
      return SpatialBoundingVolume(Pointer(address))
    }

    public override fun toNative(obj: SpatialBoundingVolume): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FromBox(coordinateSystem: SpatialCoordinateSystem, box: SpatialBoundingBox) =
        ABI.ISpatialBoundingVolumeStatics_Instance.FromBox(coordinateSystem, box)

    public fun FromOrientedBox(coordinateSystem: SpatialCoordinateSystem,
        box: SpatialBoundingOrientedBox) =
        ABI.ISpatialBoundingVolumeStatics_Instance.FromOrientedBox(coordinateSystem, box)

    public fun FromSphere(coordinateSystem: SpatialCoordinateSystem, sphere: SpatialBoundingSphere)
        = ABI.ISpatialBoundingVolumeStatics_Instance.FromSphere(coordinateSystem, sphere)

    public fun FromFrustum(coordinateSystem: SpatialCoordinateSystem,
        frustum: SpatialBoundingFrustum) =
        ABI.ISpatialBoundingVolumeStatics_Instance.FromFrustum(coordinateSystem, frustum)
  }
}
