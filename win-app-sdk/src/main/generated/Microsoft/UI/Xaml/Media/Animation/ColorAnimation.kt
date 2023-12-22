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

@ABIMarker(ColorAnimation.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.ColorAnimation;{6df862d2-65f2-53a8-8b1b-1b6c1763c175})")
@WinRTByReference(brClass = ColorAnimation.ByReference::class)
public class ColorAnimation(
  ptr: JNAPointer? = NULL
) : Timeline(ptr), IColorAnimation.WithDefault, IWinRTObject {
  private val __2089567772_Interface: IColorAnimation.WithDefault by lazy {
    as_2089567772()
  }


  public override val __2089567772_Ptr: JNAPointer? by lazy {
    __2089567772_Interface.__2089567772_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2089567772_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2089567772(): IColorAnimation.WithDefault {
    if(pointer == NULL) {
      return(IColorAnimation.ABI.makeIColorAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IColorAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IColorAnimation.ABI.makeIColorAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ColorAnimation>
      {
    public override fun getValue() = ColorAnimation(pointer.getPointer(0))

    public fun setValue(value: ColorAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ColorAnimation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IColorAnimationStatics_Instance: IColorAnimationStatics by lazy {
      createIColorAnimationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.ColorAnimation".toHandle(),
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

    public fun createIColorAnimationStatics(): IColorAnimationStatics {
      val refiid = Guid.REFIID(IColorAnimationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.ColorAnimation".toHandle(),refiid,interfacePtr)
      val result = IColorAnimationStatics.ABI.makeIColorAnimationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ColorAnimation {
      val address = segment.toRawLongValue()
      return ColorAnimation(Pointer(address))
    }

    public override fun toNative(obj: ColorAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_FromProperty() = ABI.IColorAnimationStatics_Instance.get_FromProperty()

    public fun get_ToProperty() = ABI.IColorAnimationStatics_Instance.get_ToProperty()

    public fun get_ByProperty() = ABI.IColorAnimationStatics_Instance.get_ByProperty()

    public fun get_EasingFunctionProperty() =
        ABI.IColorAnimationStatics_Instance.get_EasingFunctionProperty()

    public fun get_EnableDependentAnimationProperty() =
        ABI.IColorAnimationStatics_Instance.get_EnableDependentAnimationProperty()
  }
}
