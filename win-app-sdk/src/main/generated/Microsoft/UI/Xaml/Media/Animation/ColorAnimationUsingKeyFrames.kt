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

@ABIMarker(ColorAnimationUsingKeyFrames.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.ColorAnimationUsingKeyFrames;{96f28c97-67eb-5393-8e37-a81d8fda18b3})")
@WinRTByReference(brClass = ColorAnimationUsingKeyFrames.ByReference::class)
public class ColorAnimationUsingKeyFrames(
  ptr: JNAPointer? = NULL
) : Timeline(ptr), IColorAnimationUsingKeyFrames.WithDefault, IWinRTObject {
  private val __463203075_Interface: IColorAnimationUsingKeyFrames.WithDefault by lazy {
    as_463203075()
  }


  public override val __463203075_Ptr: JNAPointer? by lazy {
    __463203075_Interface.__463203075_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__463203075_Interface)

  public constructor() : this(ABI.activate())

  private fun as_463203075(): IColorAnimationUsingKeyFrames.WithDefault {
    if(pointer == NULL) {
      return(IColorAnimationUsingKeyFrames.ABI.makeIColorAnimationUsingKeyFrames(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IColorAnimationUsingKeyFrames>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IColorAnimationUsingKeyFrames.ABI.makeIColorAnimationUsingKeyFrames(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ColorAnimationUsingKeyFrames> {
    public override fun getValue() = ColorAnimationUsingKeyFrames(pointer.getPointer(0))

    public fun setValue(value: ColorAnimationUsingKeyFrames): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ColorAnimationUsingKeyFrames, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IColorAnimationUsingKeyFramesStatics_Instance: IColorAnimationUsingKeyFramesStatics
        by lazy {
      createIColorAnimationUsingKeyFramesStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.ColorAnimationUsingKeyFrames".toHandle(),
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

    public fun createIColorAnimationUsingKeyFramesStatics(): IColorAnimationUsingKeyFramesStatics {
      val refiid = Guid.REFIID(IColorAnimationUsingKeyFramesStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.ColorAnimationUsingKeyFrames".toHandle(),refiid,interfacePtr)
      val result =
          IColorAnimationUsingKeyFramesStatics.ABI.makeIColorAnimationUsingKeyFramesStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ColorAnimationUsingKeyFrames {
      val address = segment.toRawLongValue()
      return ColorAnimationUsingKeyFrames(Pointer(address))
    }

    public override fun toNative(obj: ColorAnimationUsingKeyFrames): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_EnableDependentAnimationProperty() =
        ABI.IColorAnimationUsingKeyFramesStatics_Instance.get_EnableDependentAnimationProperty()
  }
}
