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

@ABIMarker(NavigationThemeTransition.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.NavigationThemeTransition;{d7cfbd3b-0d27-5ea1-beb7-f6b847520dc6})")
@WinRTByReference(brClass = NavigationThemeTransition.ByReference::class)
public class NavigationThemeTransition(
  ptr: JNAPointer? = NULL
) : Transition(ptr), INavigationThemeTransition.WithDefault, IWinRTObject {
  private val __754224559_Interface: INavigationThemeTransition.WithDefault by lazy {
    as_754224559()
  }


  public override val __754224559_Ptr: JNAPointer? by lazy {
    __754224559_Interface.__754224559_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__754224559_Interface)

  public constructor() : this(ABI.activate())

  private fun as_754224559(): INavigationThemeTransition.WithDefault {
    if(pointer == NULL) {
      return(INavigationThemeTransition.ABI.makeINavigationThemeTransition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<INavigationThemeTransition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(INavigationThemeTransition.ABI.makeINavigationThemeTransition(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<NavigationThemeTransition> {
    public override fun getValue() = NavigationThemeTransition(pointer.getPointer(0))

    public fun setValue(value: NavigationThemeTransition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<NavigationThemeTransition, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val INavigationThemeTransitionStatics_Instance: INavigationThemeTransitionStatics by
        lazy {
      createINavigationThemeTransitionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.NavigationThemeTransition".toHandle(),
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

    public fun createINavigationThemeTransitionStatics(): INavigationThemeTransitionStatics {
      val refiid = Guid.REFIID(INavigationThemeTransitionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.NavigationThemeTransition".toHandle(),refiid,interfacePtr)
      val result =
          INavigationThemeTransitionStatics.ABI.makeINavigationThemeTransitionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): NavigationThemeTransition {
      val address = segment.toRawLongValue()
      return NavigationThemeTransition(Pointer(address))
    }

    public override fun toNative(obj: NavigationThemeTransition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DefaultNavigationTransitionInfoProperty() =
        ABI.INavigationThemeTransitionStatics_Instance.get_DefaultNavigationTransitionInfoProperty()
  }
}
