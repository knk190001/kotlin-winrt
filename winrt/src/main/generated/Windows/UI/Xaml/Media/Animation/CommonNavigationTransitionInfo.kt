package Windows.UI.Xaml.Media.Animation

import Windows.UI.Xaml.UIElement
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

@ABIMarker(CommonNavigationTransitionInfo.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.CommonNavigationTransitionInfo;{50345692-a555-4624-a361-0a91c1706473})")
@WinRTByReference(brClass = CommonNavigationTransitionInfo.ByReference::class)
public class CommonNavigationTransitionInfo(
  ptr: JNAPointer? = NULL
) : NavigationTransitionInfo(ptr), ICommonNavigationTransitionInfo.WithDefault, IWinRTObject {
  private val __165817192_Interface: ICommonNavigationTransitionInfo.WithDefault by lazy {
    as_165817192()
  }


  public override val __165817192_Ptr: JNAPointer? by lazy {
    __165817192_Interface.__165817192_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__165817192_Interface)

  public constructor() : this(ABI.activate())

  private fun as_165817192(): ICommonNavigationTransitionInfo.WithDefault {
    if(pointer == NULL) {
      return(ICommonNavigationTransitionInfo.ABI.makeICommonNavigationTransitionInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommonNavigationTransitionInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommonNavigationTransitionInfo.ABI.makeICommonNavigationTransitionInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CommonNavigationTransitionInfo> {
    public override fun getValue() = CommonNavigationTransitionInfo(pointer.getPointer(0))

    public fun setValue(value: CommonNavigationTransitionInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CommonNavigationTransitionInfo, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ICommonNavigationTransitionInfoStatics_Instance:
        ICommonNavigationTransitionInfoStatics by lazy {
      createICommonNavigationTransitionInfoStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.CommonNavigationTransitionInfo".toHandle(),
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

    public fun createICommonNavigationTransitionInfoStatics():
        ICommonNavigationTransitionInfoStatics {
      val refiid = Guid.REFIID(ICommonNavigationTransitionInfoStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.CommonNavigationTransitionInfo".toHandle(),refiid,interfacePtr)
      val result =
          ICommonNavigationTransitionInfoStatics.ABI.makeICommonNavigationTransitionInfoStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CommonNavigationTransitionInfo {
      val address = segment.toRawLongValue()
      return CommonNavigationTransitionInfo(Pointer(address))
    }

    public override fun toNative(obj: CommonNavigationTransitionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_IsStaggeringEnabledProperty() =
        ABI.ICommonNavigationTransitionInfoStatics_Instance.get_IsStaggeringEnabledProperty()

    public fun get_IsStaggerElementProperty() =
        ABI.ICommonNavigationTransitionInfoStatics_Instance.get_IsStaggerElementProperty()

    public fun GetIsStaggerElement(element: UIElement) =
        ABI.ICommonNavigationTransitionInfoStatics_Instance.GetIsStaggerElement(element)

    public fun SetIsStaggerElement(element: UIElement, value: Boolean) =
        ABI.ICommonNavigationTransitionInfoStatics_Instance.SetIsStaggerElement(element, value)
  }
}
