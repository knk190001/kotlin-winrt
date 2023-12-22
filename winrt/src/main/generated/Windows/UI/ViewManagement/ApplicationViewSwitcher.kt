package Windows.UI.ViewManagement

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
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ApplicationViewSwitcher.ABI::class)
@WinRTByReference(brClass = ApplicationViewSwitcher.ByReference::class)
public class ApplicationViewSwitcher(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ApplicationViewSwitcher> {
    public override fun getValue() = ApplicationViewSwitcher(pointer.getPointer(0))

    public fun setValue(value: ApplicationViewSwitcher): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ApplicationViewSwitcher, MemoryAddress> {
    public val IApplicationViewSwitcherStatics2_Instance: IApplicationViewSwitcherStatics2 by lazy {
      createIApplicationViewSwitcherStatics2()
    }


    public val IApplicationViewSwitcherStatics3_Instance: IApplicationViewSwitcherStatics3 by lazy {
      createIApplicationViewSwitcherStatics3()
    }


    public val IApplicationViewSwitcherStatics_Instance: IApplicationViewSwitcherStatics by lazy {
      createIApplicationViewSwitcherStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIApplicationViewSwitcherStatics2(): IApplicationViewSwitcherStatics2 {
      val refiid = Guid.REFIID(IApplicationViewSwitcherStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.ApplicationViewSwitcher".toHandle(),refiid,interfacePtr)
      val result =
          IApplicationViewSwitcherStatics2.ABI.makeIApplicationViewSwitcherStatics2(interfacePtr.value)
      return result
    }

    public fun createIApplicationViewSwitcherStatics3(): IApplicationViewSwitcherStatics3 {
      val refiid = Guid.REFIID(IApplicationViewSwitcherStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.ApplicationViewSwitcher".toHandle(),refiid,interfacePtr)
      val result =
          IApplicationViewSwitcherStatics3.ABI.makeIApplicationViewSwitcherStatics3(interfacePtr.value)
      return result
    }

    public fun createIApplicationViewSwitcherStatics(): IApplicationViewSwitcherStatics {
      val refiid = Guid.REFIID(IApplicationViewSwitcherStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.ApplicationViewSwitcher".toHandle(),refiid,interfacePtr)
      val result =
          IApplicationViewSwitcherStatics.ABI.makeIApplicationViewSwitcherStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ApplicationViewSwitcher {
      val address = segment.toRawLongValue()
      return ApplicationViewSwitcher(Pointer(address))
    }

    public override fun toNative(obj: ApplicationViewSwitcher): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun DisableSystemViewActivationPolicy() =
        ABI.IApplicationViewSwitcherStatics2_Instance.DisableSystemViewActivationPolicy()

    public fun TryShowAsViewModeAsync(viewId: Int, viewMode: ApplicationViewMode) =
        ABI.IApplicationViewSwitcherStatics3_Instance.TryShowAsViewModeAsync(viewId, viewMode)

    public fun TryShowAsViewModeAsync(
      viewId: Int,
      viewMode: ApplicationViewMode,
      viewModePreferences: ViewModePreferences
    ) = ABI.IApplicationViewSwitcherStatics3_Instance.TryShowAsViewModeAsync(viewId, viewMode,
        viewModePreferences)

    public fun DisableShowingMainViewOnActivation() =
        ABI.IApplicationViewSwitcherStatics_Instance.DisableShowingMainViewOnActivation()

    public fun TryShowAsStandaloneAsync(viewId: Int) =
        ABI.IApplicationViewSwitcherStatics_Instance.TryShowAsStandaloneAsync(viewId)

    public fun TryShowAsStandaloneAsync(viewId: Int, sizePreference: ViewSizePreference) =
        ABI.IApplicationViewSwitcherStatics_Instance.TryShowAsStandaloneAsync(viewId,
        sizePreference)

    public fun TryShowAsStandaloneAsync(
      viewId: Int,
      sizePreference: ViewSizePreference,
      anchorViewId: Int,
      anchorSizePreference: ViewSizePreference
    ) = ABI.IApplicationViewSwitcherStatics_Instance.TryShowAsStandaloneAsync(viewId,
        sizePreference, anchorViewId, anchorSizePreference)

    public fun SwitchAsync(viewId: Int) =
        ABI.IApplicationViewSwitcherStatics_Instance.SwitchAsync(viewId)

    public fun SwitchAsync(toViewId: Int, fromViewId: Int) =
        ABI.IApplicationViewSwitcherStatics_Instance.SwitchAsync(toViewId, fromViewId)

    public fun SwitchAsync(
      toViewId: Int,
      fromViewId: Int,
      options: ApplicationViewSwitchingOptions
    ) = ABI.IApplicationViewSwitcherStatics_Instance.SwitchAsync(toViewId, fromViewId, options)

    public fun PrepareForCustomAnimatedSwitchAsync(
      toViewId: Int,
      fromViewId: Int,
      options: ApplicationViewSwitchingOptions
    ) = ABI.IApplicationViewSwitcherStatics_Instance.PrepareForCustomAnimatedSwitchAsync(toViewId,
        fromViewId, options)
  }
}
