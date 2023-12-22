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

@ABIMarker(FadeInThemeAnimation.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.FadeInThemeAnimation;{0dca074a-31cc-5e70-8b6b-8dbd7fff01f6})")
@WinRTByReference(brClass = FadeInThemeAnimation.ByReference::class)
public class FadeInThemeAnimation(
  ptr: JNAPointer? = NULL
) : Timeline(ptr), IFadeInThemeAnimation.WithDefault, IWinRTObject {
  private val __718647639_Interface: IFadeInThemeAnimation.WithDefault by lazy {
    as_718647639()
  }


  public override val __718647639_Ptr: JNAPointer? by lazy {
    __718647639_Interface.__718647639_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__718647639_Interface)

  public constructor() : this(ABI.activate())

  private fun as_718647639(): IFadeInThemeAnimation.WithDefault {
    if(pointer == NULL) {
      return(IFadeInThemeAnimation.ABI.makeIFadeInThemeAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFadeInThemeAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFadeInThemeAnimation.ABI.makeIFadeInThemeAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FadeInThemeAnimation> {
    public override fun getValue() = FadeInThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: FadeInThemeAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FadeInThemeAnimation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IFadeInThemeAnimationStatics_Instance: IFadeInThemeAnimationStatics by lazy {
      createIFadeInThemeAnimationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.FadeInThemeAnimation".toHandle(),
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

    public fun createIFadeInThemeAnimationStatics(): IFadeInThemeAnimationStatics {
      val refiid = Guid.REFIID(IFadeInThemeAnimationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.FadeInThemeAnimation".toHandle(),refiid,interfacePtr)
      val result =
          IFadeInThemeAnimationStatics.ABI.makeIFadeInThemeAnimationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): FadeInThemeAnimation {
      val address = segment.toRawLongValue()
      return FadeInThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: FadeInThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TargetNameProperty() =
        ABI.IFadeInThemeAnimationStatics_Instance.get_TargetNameProperty()
  }
}
