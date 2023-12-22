package Windows.UI.ViewManagement

import Windows.Devices.Enumeration.DeviceInformation
import Windows.Foundation.EventHandler
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.Rect
import Windows.UI.Popups.Placement
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ProjectionManager.ABI::class)
@WinRTByReference(brClass = ProjectionManager.ByReference::class)
public class ProjectionManager(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProjectionManager> {
    public override fun getValue() = ProjectionManager(pointer.getPointer(0))

    public fun setValue(value: ProjectionManager): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProjectionManager, MemoryAddress> {
    public val IProjectionManagerStatics_Instance: IProjectionManagerStatics by lazy {
      createIProjectionManagerStatics()
    }


    public val IProjectionManagerStatics2_Instance: IProjectionManagerStatics2 by lazy {
      createIProjectionManagerStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIProjectionManagerStatics(): IProjectionManagerStatics {
      val refiid = Guid.REFIID(IProjectionManagerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.ProjectionManager".toHandle(),refiid,interfacePtr)
      val result = IProjectionManagerStatics.ABI.makeIProjectionManagerStatics(interfacePtr.value)
      return result
    }

    public fun createIProjectionManagerStatics2(): IProjectionManagerStatics2 {
      val refiid = Guid.REFIID(IProjectionManagerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.ProjectionManager".toHandle(),refiid,interfacePtr)
      val result = IProjectionManagerStatics2.ABI.makeIProjectionManagerStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ProjectionManager {
      val address = segment.toRawLongValue()
      return ProjectionManager(Pointer(address))
    }

    public override fun toNative(obj: ProjectionManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun StartProjectingAsync(projectionViewId: Int, anchorViewId: Int) =
        ABI.IProjectionManagerStatics_Instance.StartProjectingAsync(projectionViewId, anchorViewId)

    public fun SwapDisplaysForViewsAsync(projectionViewId: Int, anchorViewId: Int) =
        ABI.IProjectionManagerStatics_Instance.SwapDisplaysForViewsAsync(projectionViewId,
        anchorViewId)

    public fun StopProjectingAsync(projectionViewId: Int, anchorViewId: Int) =
        ABI.IProjectionManagerStatics_Instance.StopProjectingAsync(projectionViewId, anchorViewId)

    public fun get_ProjectionDisplayAvailable() =
        ABI.IProjectionManagerStatics_Instance.get_ProjectionDisplayAvailable()

    public fun add_ProjectionDisplayAvailableChanged(handler: EventHandler<IUnknown?>) =
        ABI.IProjectionManagerStatics_Instance.add_ProjectionDisplayAvailableChanged(handler)

    public fun remove_ProjectionDisplayAvailableChanged(token: EventRegistrationToken) =
        ABI.IProjectionManagerStatics_Instance.remove_ProjectionDisplayAvailableChanged(token)

    public fun StartProjectingAsync(
      projectionViewId: Int,
      anchorViewId: Int,
      displayDeviceInfo: DeviceInformation
    ) = ABI.IProjectionManagerStatics2_Instance.StartProjectingAsync(projectionViewId, anchorViewId,
        displayDeviceInfo)

    public fun RequestStartProjectingAsync(
      projectionViewId: Int,
      anchorViewId: Int,
      selection: Rect
    ) = ABI.IProjectionManagerStatics2_Instance.RequestStartProjectingAsync(projectionViewId,
        anchorViewId, selection)

    public fun RequestStartProjectingAsync(
      projectionViewId: Int,
      anchorViewId: Int,
      selection: Rect,
      prefferedPlacement: Placement
    ) = ABI.IProjectionManagerStatics2_Instance.RequestStartProjectingAsync(projectionViewId,
        anchorViewId, selection, prefferedPlacement)

    public fun GetDeviceSelector() = ABI.IProjectionManagerStatics2_Instance.GetDeviceSelector()
  }
}
