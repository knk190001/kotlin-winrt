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

@ABIMarker(FadeOutThemeAnimation.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.FadeOutThemeAnimation;{89276ba9-ffd4-45b6-9b9a-ced48951e712})")
@WinRTByReference(brClass = FadeOutThemeAnimation.ByReference::class)
public class FadeOutThemeAnimation(
  ptr: JNAPointer? = NULL
) : Timeline(ptr), IFadeOutThemeAnimation.WithDefault, IWinRTObject {
  private val __823975239_Interface: IFadeOutThemeAnimation.WithDefault by lazy {
    as_823975239()
  }


  public override val __823975239_Ptr: JNAPointer? by lazy {
    __823975239_Interface.__823975239_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__823975239_Interface)

  public constructor() : this(ABI.activate())

  private fun as_823975239(): IFadeOutThemeAnimation.WithDefault {
    if(pointer == NULL) {
      return(IFadeOutThemeAnimation.ABI.makeIFadeOutThemeAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFadeOutThemeAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFadeOutThemeAnimation.ABI.makeIFadeOutThemeAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FadeOutThemeAnimation> {
    public override fun getValue() = FadeOutThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: FadeOutThemeAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FadeOutThemeAnimation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IFadeOutThemeAnimationStatics_Instance: IFadeOutThemeAnimationStatics by lazy {
      createIFadeOutThemeAnimationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.FadeOutThemeAnimation".toHandle(),
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

    public fun createIFadeOutThemeAnimationStatics(): IFadeOutThemeAnimationStatics {
      val refiid = Guid.REFIID(IFadeOutThemeAnimationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.FadeOutThemeAnimation".toHandle(),refiid,interfacePtr)
      val result =
          IFadeOutThemeAnimationStatics.ABI.makeIFadeOutThemeAnimationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): FadeOutThemeAnimation {
      val address = segment.toRawLongValue()
      return FadeOutThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: FadeOutThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TargetNameProperty() =
        ABI.IFadeOutThemeAnimationStatics_Instance.get_TargetNameProperty()
  }
}
