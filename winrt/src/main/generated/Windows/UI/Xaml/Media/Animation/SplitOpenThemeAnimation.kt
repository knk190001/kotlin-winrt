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

@ABIMarker(SplitOpenThemeAnimation.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.SplitOpenThemeAnimation;{785fd7aa-5456-4639-8fd2-26bae6a5ffe4})")
@WinRTByReference(brClass = SplitOpenThemeAnimation.ByReference::class)
public class SplitOpenThemeAnimation(
  ptr: JNAPointer? = NULL
) : Timeline(ptr), ISplitOpenThemeAnimation.WithDefault, IWinRTObject {
  private val __1768212327_Interface: ISplitOpenThemeAnimation.WithDefault by lazy {
    as_1768212327()
  }


  public override val __1768212327_Ptr: JNAPointer? by lazy {
    __1768212327_Interface.__1768212327_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1768212327_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1768212327(): ISplitOpenThemeAnimation.WithDefault {
    if(pointer == NULL) {
      return(ISplitOpenThemeAnimation.ABI.makeISplitOpenThemeAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISplitOpenThemeAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISplitOpenThemeAnimation.ABI.makeISplitOpenThemeAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SplitOpenThemeAnimation> {
    public override fun getValue() = SplitOpenThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: SplitOpenThemeAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SplitOpenThemeAnimation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISplitOpenThemeAnimationStatics_Instance: ISplitOpenThemeAnimationStatics by lazy {
      createISplitOpenThemeAnimationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.SplitOpenThemeAnimation".toHandle(),
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

    public fun createISplitOpenThemeAnimationStatics(): ISplitOpenThemeAnimationStatics {
      val refiid = Guid.REFIID(ISplitOpenThemeAnimationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.SplitOpenThemeAnimation".toHandle(),refiid,interfacePtr)
      val result =
          ISplitOpenThemeAnimationStatics.ABI.makeISplitOpenThemeAnimationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SplitOpenThemeAnimation {
      val address = segment.toRawLongValue()
      return SplitOpenThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: SplitOpenThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_OpenedTargetNameProperty() =
        ABI.ISplitOpenThemeAnimationStatics_Instance.get_OpenedTargetNameProperty()

    public fun get_OpenedTargetProperty() =
        ABI.ISplitOpenThemeAnimationStatics_Instance.get_OpenedTargetProperty()

    public fun get_ClosedTargetNameProperty() =
        ABI.ISplitOpenThemeAnimationStatics_Instance.get_ClosedTargetNameProperty()

    public fun get_ClosedTargetProperty() =
        ABI.ISplitOpenThemeAnimationStatics_Instance.get_ClosedTargetProperty()

    public fun get_ContentTargetNameProperty() =
        ABI.ISplitOpenThemeAnimationStatics_Instance.get_ContentTargetNameProperty()

    public fun get_ContentTargetProperty() =
        ABI.ISplitOpenThemeAnimationStatics_Instance.get_ContentTargetProperty()

    public fun get_OpenedLengthProperty() =
        ABI.ISplitOpenThemeAnimationStatics_Instance.get_OpenedLengthProperty()

    public fun get_ClosedLengthProperty() =
        ABI.ISplitOpenThemeAnimationStatics_Instance.get_ClosedLengthProperty()

    public fun get_OffsetFromCenterProperty() =
        ABI.ISplitOpenThemeAnimationStatics_Instance.get_OffsetFromCenterProperty()

    public fun get_ContentTranslationDirectionProperty() =
        ABI.ISplitOpenThemeAnimationStatics_Instance.get_ContentTranslationDirectionProperty()

    public fun get_ContentTranslationOffsetProperty() =
        ABI.ISplitOpenThemeAnimationStatics_Instance.get_ContentTranslationOffsetProperty()
  }
}
