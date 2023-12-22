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

@ABIMarker(PopInThemeAnimation.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.PopInThemeAnimation;{196938c1-1c07-4c28-8847-f9f055b32855})")
@WinRTByReference(brClass = PopInThemeAnimation.ByReference::class)
public class PopInThemeAnimation(
  ptr: JNAPointer? = NULL
) : Timeline(ptr), IPopInThemeAnimation.WithDefault, IWinRTObject {
  private val __1947623659_Interface: IPopInThemeAnimation.WithDefault by lazy {
    as_1947623659()
  }


  public override val __1947623659_Ptr: JNAPointer? by lazy {
    __1947623659_Interface.__1947623659_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1947623659_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1947623659(): IPopInThemeAnimation.WithDefault {
    if(pointer == NULL) {
      return(IPopInThemeAnimation.ABI.makeIPopInThemeAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPopInThemeAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPopInThemeAnimation.ABI.makeIPopInThemeAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PopInThemeAnimation> {
    public override fun getValue() = PopInThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: PopInThemeAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PopInThemeAnimation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPopInThemeAnimationStatics_Instance: IPopInThemeAnimationStatics by lazy {
      createIPopInThemeAnimationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.PopInThemeAnimation".toHandle(),
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

    public fun createIPopInThemeAnimationStatics(): IPopInThemeAnimationStatics {
      val refiid = Guid.REFIID(IPopInThemeAnimationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.PopInThemeAnimation".toHandle(),refiid,interfacePtr)
      val result =
          IPopInThemeAnimationStatics.ABI.makeIPopInThemeAnimationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PopInThemeAnimation {
      val address = segment.toRawLongValue()
      return PopInThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: PopInThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TargetNameProperty() =
        ABI.IPopInThemeAnimationStatics_Instance.get_TargetNameProperty()

    public fun get_FromHorizontalOffsetProperty() =
        ABI.IPopInThemeAnimationStatics_Instance.get_FromHorizontalOffsetProperty()

    public fun get_FromVerticalOffsetProperty() =
        ABI.IPopInThemeAnimationStatics_Instance.get_FromVerticalOffsetProperty()
  }
}
