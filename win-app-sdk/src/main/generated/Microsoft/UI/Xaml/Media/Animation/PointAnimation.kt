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

@ABIMarker(PointAnimation.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.PointAnimation;{a0737cc4-2eab-5c13-a5d7-78361df1000e})")
@WinRTByReference(brClass = PointAnimation.ByReference::class)
public class PointAnimation(
  ptr: JNAPointer? = NULL
) : Timeline(ptr), IPointAnimation.WithDefault, IWinRTObject {
  private val __828949135_Interface: IPointAnimation.WithDefault by lazy {
    as_828949135()
  }


  public override val __828949135_Ptr: JNAPointer? by lazy {
    __828949135_Interface.__828949135_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__828949135_Interface)

  public constructor() : this(ABI.activate())

  private fun as_828949135(): IPointAnimation.WithDefault {
    if(pointer == NULL) {
      return(IPointAnimation.ABI.makeIPointAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPointAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPointAnimation.ABI.makeIPointAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PointAnimation>
      {
    public override fun getValue() = PointAnimation(pointer.getPointer(0))

    public fun setValue(value: PointAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PointAnimation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPointAnimationStatics_Instance: IPointAnimationStatics by lazy {
      createIPointAnimationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.PointAnimation".toHandle(),
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

    public fun createIPointAnimationStatics(): IPointAnimationStatics {
      val refiid = Guid.REFIID(IPointAnimationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.PointAnimation".toHandle(),refiid,interfacePtr)
      val result = IPointAnimationStatics.ABI.makeIPointAnimationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PointAnimation {
      val address = segment.toRawLongValue()
      return PointAnimation(Pointer(address))
    }

    public override fun toNative(obj: PointAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_FromProperty() = ABI.IPointAnimationStatics_Instance.get_FromProperty()

    public fun get_ToProperty() = ABI.IPointAnimationStatics_Instance.get_ToProperty()

    public fun get_ByProperty() = ABI.IPointAnimationStatics_Instance.get_ByProperty()

    public fun get_EasingFunctionProperty() =
        ABI.IPointAnimationStatics_Instance.get_EasingFunctionProperty()

    public fun get_EnableDependentAnimationProperty() =
        ABI.IPointAnimationStatics_Instance.get_EnableDependentAnimationProperty()
  }
}
