package Microsoft.UI.Xaml.Media.Animation

import Microsoft.UI.Xaml.Controls.ListViewBase
import Microsoft.UI.Xaml.UIElement
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Boolean
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ContinuumNavigationTransitionInfo.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.ContinuumNavigationTransitionInfo;{c55da70f-ff2a-5fc3-81c5-9670f4d78752})")
@WinRTByReference(brClass = ContinuumNavigationTransitionInfo.ByReference::class)
public class ContinuumNavigationTransitionInfo(
  ptr: JNAPointer? = NULL
) : NavigationTransitionInfo(ptr), IContinuumNavigationTransitionInfo.WithDefault, IWinRTObject {
  private val __1450811634_Interface: IContinuumNavigationTransitionInfo.WithDefault by lazy {
    as_1450811634()
  }


  public override val __1450811634_Ptr: JNAPointer? by lazy {
    __1450811634_Interface.__1450811634_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1450811634_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1450811634(): IContinuumNavigationTransitionInfo.WithDefault {
    if(pointer == NULL) {
      return(IContinuumNavigationTransitionInfo.ABI.makeIContinuumNavigationTransitionInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IContinuumNavigationTransitionInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IContinuumNavigationTransitionInfo.ABI.makeIContinuumNavigationTransitionInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ContinuumNavigationTransitionInfo> {
    public override fun getValue() = ContinuumNavigationTransitionInfo(pointer.getPointer(0))

    public fun setValue(value: ContinuumNavigationTransitionInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ContinuumNavigationTransitionInfo, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IContinuumNavigationTransitionInfoStatics_Instance:
        IContinuumNavigationTransitionInfoStatics by lazy {
      createIContinuumNavigationTransitionInfoStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.ContinuumNavigationTransitionInfo".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIContinuumNavigationTransitionInfoStatics():
        IContinuumNavigationTransitionInfoStatics {
      val refiid = Guid.REFIID(IContinuumNavigationTransitionInfoStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.ContinuumNavigationTransitionInfo".toHandle(),refiid,interfacePtr)
      val result =
          IContinuumNavigationTransitionInfoStatics.ABI.makeIContinuumNavigationTransitionInfoStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ContinuumNavigationTransitionInfo {
      val address = segment.toRawLongValue()
      return ContinuumNavigationTransitionInfo(Pointer(address))
    }

    public override fun toNative(obj: ContinuumNavigationTransitionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_ExitElementProperty() =
        ABI.IContinuumNavigationTransitionInfoStatics_Instance.get_ExitElementProperty()

    public fun get_IsEntranceElementProperty() =
        ABI.IContinuumNavigationTransitionInfoStatics_Instance.get_IsEntranceElementProperty()

    public fun GetIsEntranceElement(element: UIElement) =
        ABI.IContinuumNavigationTransitionInfoStatics_Instance.GetIsEntranceElement(element)

    public fun SetIsEntranceElement(element: UIElement, value: Boolean) =
        ABI.IContinuumNavigationTransitionInfoStatics_Instance.SetIsEntranceElement(element, value)

    public fun get_IsExitElementProperty() =
        ABI.IContinuumNavigationTransitionInfoStatics_Instance.get_IsExitElementProperty()

    public fun GetIsExitElement(element: UIElement) =
        ABI.IContinuumNavigationTransitionInfoStatics_Instance.GetIsExitElement(element)

    public fun SetIsExitElement(element: UIElement, value: Boolean) =
        ABI.IContinuumNavigationTransitionInfoStatics_Instance.SetIsExitElement(element, value)

    public fun get_ExitElementContainerProperty() =
        ABI.IContinuumNavigationTransitionInfoStatics_Instance.get_ExitElementContainerProperty()

    public fun GetExitElementContainer(element: ListViewBase) =
        ABI.IContinuumNavigationTransitionInfoStatics_Instance.GetExitElementContainer(element)

    public fun SetExitElementContainer(element: ListViewBase, value: Boolean) =
        ABI.IContinuumNavigationTransitionInfoStatics_Instance.SetExitElementContainer(element,
        value)
  }
}
