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

@ABIMarker(DoubleAnimation.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.DoubleAnimation;{7e9f3d59-0f07-4bc9-977d-03763ff8154f})")
@WinRTByReference(brClass = DoubleAnimation.ByReference::class)
public class DoubleAnimation(
  ptr: JNAPointer? = NULL
) : Timeline(ptr), IDoubleAnimation.WithDefault, IWinRTObject {
  private val __724686867_Interface: IDoubleAnimation.WithDefault by lazy {
    as_724686867()
  }


  public override val __724686867_Ptr: JNAPointer? by lazy {
    __724686867_Interface.__724686867_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__724686867_Interface)

  public constructor() : this(ABI.activate())

  private fun as_724686867(): IDoubleAnimation.WithDefault {
    if(pointer == NULL) {
      return(IDoubleAnimation.ABI.makeIDoubleAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDoubleAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDoubleAnimation.ABI.makeIDoubleAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DoubleAnimation> {
    public override fun getValue() = DoubleAnimation(pointer.getPointer(0))

    public fun setValue(value: DoubleAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DoubleAnimation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IDoubleAnimationStatics_Instance: IDoubleAnimationStatics by lazy {
      createIDoubleAnimationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.DoubleAnimation".toHandle(),
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

    public fun createIDoubleAnimationStatics(): IDoubleAnimationStatics {
      val refiid = Guid.REFIID(IDoubleAnimationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.DoubleAnimation".toHandle(),refiid,interfacePtr)
      val result = IDoubleAnimationStatics.ABI.makeIDoubleAnimationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): DoubleAnimation {
      val address = segment.toRawLongValue()
      return DoubleAnimation(Pointer(address))
    }

    public override fun toNative(obj: DoubleAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_FromProperty() = ABI.IDoubleAnimationStatics_Instance.get_FromProperty()

    public fun get_ToProperty() = ABI.IDoubleAnimationStatics_Instance.get_ToProperty()

    public fun get_ByProperty() = ABI.IDoubleAnimationStatics_Instance.get_ByProperty()

    public fun get_EasingFunctionProperty() =
        ABI.IDoubleAnimationStatics_Instance.get_EasingFunctionProperty()

    public fun get_EnableDependentAnimationProperty() =
        ABI.IDoubleAnimationStatics_Instance.get_EnableDependentAnimationProperty()
  }
}
