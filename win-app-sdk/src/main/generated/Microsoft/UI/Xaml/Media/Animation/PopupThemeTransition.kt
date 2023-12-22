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

@ABIMarker(PopupThemeTransition.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.PopupThemeTransition;{e1fa6b8a-add3-5299-a000-121d6dbacc80})")
@WinRTByReference(brClass = PopupThemeTransition.ByReference::class)
public class PopupThemeTransition(
  ptr: JNAPointer? = NULL
) : Transition(ptr), IPopupThemeTransition.WithDefault, IWinRTObject {
  private val __1510380589_Interface: IPopupThemeTransition.WithDefault by lazy {
    as_1510380589()
  }


  public override val __1510380589_Ptr: JNAPointer? by lazy {
    __1510380589_Interface.__1510380589_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1510380589_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1510380589(): IPopupThemeTransition.WithDefault {
    if(pointer == NULL) {
      return(IPopupThemeTransition.ABI.makeIPopupThemeTransition(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPopupThemeTransition>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPopupThemeTransition.ABI.makeIPopupThemeTransition(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PopupThemeTransition> {
    public override fun getValue() = PopupThemeTransition(pointer.getPointer(0))

    public fun setValue(value: PopupThemeTransition): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PopupThemeTransition, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPopupThemeTransitionStatics_Instance: IPopupThemeTransitionStatics by lazy {
      createIPopupThemeTransitionStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.PopupThemeTransition".toHandle(),
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

    public fun createIPopupThemeTransitionStatics(): IPopupThemeTransitionStatics {
      val refiid = Guid.REFIID(IPopupThemeTransitionStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.PopupThemeTransition".toHandle(),refiid,interfacePtr)
      val result =
          IPopupThemeTransitionStatics.ABI.makeIPopupThemeTransitionStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PopupThemeTransition {
      val address = segment.toRawLongValue()
      return PopupThemeTransition(Pointer(address))
    }

    public override fun toNative(obj: PopupThemeTransition): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_FromHorizontalOffsetProperty() =
        ABI.IPopupThemeTransitionStatics_Instance.get_FromHorizontalOffsetProperty()

    public fun get_FromVerticalOffsetProperty() =
        ABI.IPopupThemeTransitionStatics_Instance.get_FromVerticalOffsetProperty()
  }
}
