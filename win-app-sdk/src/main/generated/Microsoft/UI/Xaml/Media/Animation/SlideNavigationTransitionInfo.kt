package Microsoft.UI.Xaml.Media.Animation

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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(SlideNavigationTransitionInfo.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.SlideNavigationTransitionInfo;{53eade0e-6b01-511f-a563-6f5724a6c1c1})")
@WinRTByReference(brClass = SlideNavigationTransitionInfo.ByReference::class)
public class SlideNavigationTransitionInfo(
  ptr: JNAPointer? = NULL
) : NavigationTransitionInfo(ptr), ISlideNavigationTransitionInfo.WithDefault, IWinRTObject {
  private val __1634995597_Interface: ISlideNavigationTransitionInfo.WithDefault by lazy {
    as_1634995597()
  }


  public override val __1634995597_Ptr: JNAPointer? by lazy {
    __1634995597_Interface.__1634995597_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1634995597_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1634995597(): ISlideNavigationTransitionInfo.WithDefault {
    if(pointer == NULL) {
      return(ISlideNavigationTransitionInfo.ABI.makeISlideNavigationTransitionInfo(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISlideNavigationTransitionInfo>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISlideNavigationTransitionInfo.ABI.makeISlideNavigationTransitionInfo(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SlideNavigationTransitionInfo> {
    public override fun getValue() = SlideNavigationTransitionInfo(pointer.getPointer(0))

    public fun setValue(value: SlideNavigationTransitionInfo): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SlideNavigationTransitionInfo, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISlideNavigationTransitionInfoStatics_Instance: ISlideNavigationTransitionInfoStatics
        by lazy {
      createISlideNavigationTransitionInfoStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.SlideNavigationTransitionInfo".toHandle(),
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

    public fun createISlideNavigationTransitionInfoStatics():
        ISlideNavigationTransitionInfoStatics {
      val refiid = Guid.REFIID(ISlideNavigationTransitionInfoStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.SlideNavigationTransitionInfo".toHandle(),refiid,interfacePtr)
      val result =
          ISlideNavigationTransitionInfoStatics.ABI.makeISlideNavigationTransitionInfoStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SlideNavigationTransitionInfo {
      val address = segment.toRawLongValue()
      return SlideNavigationTransitionInfo(Pointer(address))
    }

    public override fun toNative(obj: SlideNavigationTransitionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_EffectProperty() =
        ABI.ISlideNavigationTransitionInfoStatics_Instance.get_EffectProperty()
  }
}
