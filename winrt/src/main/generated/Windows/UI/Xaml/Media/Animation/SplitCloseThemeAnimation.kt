package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(SplitCloseThemeAnimation.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.SplitCloseThemeAnimation;{4f799518-ff39-4e90-bb74-2abd56027402})")
@WinRTByReference(brClass = SplitCloseThemeAnimation.ByReference::class)
public class SplitCloseThemeAnimation(
  ptr: JNAPointer? = NULL
) : Timeline(ptr), ISplitCloseThemeAnimation.WithDefault, IWinRTObject {
  private val __770717279_Interface: ISplitCloseThemeAnimation.WithDefault by lazy {
    as_770717279()
  }


  public override val __770717279_Ptr: JNAPointer? by lazy {
    __770717279_Interface.__770717279_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__770717279_Interface)

  public constructor() : this(ABI.activate())

  private fun as_770717279(): ISplitCloseThemeAnimation.WithDefault {
    if(pointer == NULL) {
      return(ISplitCloseThemeAnimation.ABI.makeISplitCloseThemeAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISplitCloseThemeAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISplitCloseThemeAnimation.ABI.makeISplitCloseThemeAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SplitCloseThemeAnimation> {
    public override fun getValue() = SplitCloseThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: SplitCloseThemeAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SplitCloseThemeAnimation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISplitCloseThemeAnimationStatics_Instance: ISplitCloseThemeAnimationStatics by lazy {
      createISplitCloseThemeAnimationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.SplitCloseThemeAnimation".toHandle(),
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

    public fun createISplitCloseThemeAnimationStatics(): ISplitCloseThemeAnimationStatics {
      val refiid = Guid.REFIID(ISplitCloseThemeAnimationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.SplitCloseThemeAnimation".toHandle(),refiid,interfacePtr)
      val result =
          ISplitCloseThemeAnimationStatics.ABI.makeISplitCloseThemeAnimationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SplitCloseThemeAnimation {
      val address = segment.toRawLongValue()
      return SplitCloseThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: SplitCloseThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_OpenedTargetNameProperty() =
        ABI.ISplitCloseThemeAnimationStatics_Instance.get_OpenedTargetNameProperty()

    public fun get_OpenedTargetProperty() =
        ABI.ISplitCloseThemeAnimationStatics_Instance.get_OpenedTargetProperty()

    public fun get_ClosedTargetNameProperty() =
        ABI.ISplitCloseThemeAnimationStatics_Instance.get_ClosedTargetNameProperty()

    public fun get_ClosedTargetProperty() =
        ABI.ISplitCloseThemeAnimationStatics_Instance.get_ClosedTargetProperty()

    public fun get_ContentTargetNameProperty() =
        ABI.ISplitCloseThemeAnimationStatics_Instance.get_ContentTargetNameProperty()

    public fun get_ContentTargetProperty() =
        ABI.ISplitCloseThemeAnimationStatics_Instance.get_ContentTargetProperty()

    public fun get_OpenedLengthProperty() =
        ABI.ISplitCloseThemeAnimationStatics_Instance.get_OpenedLengthProperty()

    public fun get_ClosedLengthProperty() =
        ABI.ISplitCloseThemeAnimationStatics_Instance.get_ClosedLengthProperty()

    public fun get_OffsetFromCenterProperty() =
        ABI.ISplitCloseThemeAnimationStatics_Instance.get_OffsetFromCenterProperty()

    public fun get_ContentTranslationDirectionProperty() =
        ABI.ISplitCloseThemeAnimationStatics_Instance.get_ContentTranslationDirectionProperty()

    public fun get_ContentTranslationOffsetProperty() =
        ABI.ISplitCloseThemeAnimationStatics_Instance.get_ContentTranslationOffsetProperty()
  }
}
