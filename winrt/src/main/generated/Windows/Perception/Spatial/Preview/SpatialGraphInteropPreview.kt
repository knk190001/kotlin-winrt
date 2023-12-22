package Windows.Perception.Spatial.Preview

import Windows.Foundation.Numerics.Quaternion
import Windows.Foundation.Numerics.Vector3
import Windows.Perception.Spatial.SpatialCoordinateSystem
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(SpatialGraphInteropPreview.ABI::class)
@WinRTByReference(brClass = SpatialGraphInteropPreview.ByReference::class)
public class SpatialGraphInteropPreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SpatialGraphInteropPreview> {
    public override fun getValue() = SpatialGraphInteropPreview(pointer.getPointer(0))

    public fun setValue(value: SpatialGraphInteropPreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpatialGraphInteropPreview, MemoryAddress> {
    public val ISpatialGraphInteropPreviewStatics2_Instance: ISpatialGraphInteropPreviewStatics2 by
        lazy {
      createISpatialGraphInteropPreviewStatics2()
    }


    public val ISpatialGraphInteropPreviewStatics_Instance: ISpatialGraphInteropPreviewStatics by
        lazy {
      createISpatialGraphInteropPreviewStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISpatialGraphInteropPreviewStatics2(): ISpatialGraphInteropPreviewStatics2 {
      val refiid = Guid.REFIID(ISpatialGraphInteropPreviewStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Perception.Spatial.Preview.SpatialGraphInteropPreview".toHandle(),refiid,interfacePtr)
      val result =
          ISpatialGraphInteropPreviewStatics2.ABI.makeISpatialGraphInteropPreviewStatics2(interfacePtr.value)
      return result
    }

    public fun createISpatialGraphInteropPreviewStatics(): ISpatialGraphInteropPreviewStatics {
      val refiid = Guid.REFIID(ISpatialGraphInteropPreviewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Perception.Spatial.Preview.SpatialGraphInteropPreview".toHandle(),refiid,interfacePtr)
      val result =
          ISpatialGraphInteropPreviewStatics.ABI.makeISpatialGraphInteropPreviewStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SpatialGraphInteropPreview {
      val address = segment.toRawLongValue()
      return SpatialGraphInteropPreview(Pointer(address))
    }

    public override fun toNative(obj: SpatialGraphInteropPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun TryCreateFrameOfReference(coordinateSystem: SpatialCoordinateSystem) =
        ABI.ISpatialGraphInteropPreviewStatics2_Instance.TryCreateFrameOfReference(coordinateSystem)

    public fun TryCreateFrameOfReference(coordinateSystem: SpatialCoordinateSystem,
        relativePosition: Vector3) =
        ABI.ISpatialGraphInteropPreviewStatics2_Instance.TryCreateFrameOfReference(coordinateSystem,
        relativePosition)

    public fun TryCreateFrameOfReference(
      coordinateSystem: SpatialCoordinateSystem,
      relativePosition: Vector3,
      relativeOrientation: Quaternion
    ) = ABI.ISpatialGraphInteropPreviewStatics2_Instance.TryCreateFrameOfReference(coordinateSystem,
        relativePosition, relativeOrientation)

    public fun CreateCoordinateSystemForNode(nodeId: Guid.GUID) =
        ABI.ISpatialGraphInteropPreviewStatics_Instance.CreateCoordinateSystemForNode(nodeId)

    public fun CreateCoordinateSystemForNode(nodeId: Guid.GUID, relativePosition: Vector3) =
        ABI.ISpatialGraphInteropPreviewStatics_Instance.CreateCoordinateSystemForNode(nodeId,
        relativePosition)

    public fun CreateCoordinateSystemForNode(
      nodeId: Guid.GUID,
      relativePosition: Vector3,
      relativeOrientation: Quaternion
    ) = ABI.ISpatialGraphInteropPreviewStatics_Instance.CreateCoordinateSystemForNode(nodeId,
        relativePosition, relativeOrientation)

    public fun CreateLocatorForNode(nodeId: Guid.GUID) =
        ABI.ISpatialGraphInteropPreviewStatics_Instance.CreateLocatorForNode(nodeId)
  }
}
