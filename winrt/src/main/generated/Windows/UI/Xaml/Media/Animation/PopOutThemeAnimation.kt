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

@ABIMarker(PopOutThemeAnimation.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.PopOutThemeAnimation;{4786ab49-0e48-4e81-a2e5-cc5aa19e48d3})")
@WinRTByReference(brClass = PopOutThemeAnimation.ByReference::class)
public class PopOutThemeAnimation(
  ptr: JNAPointer? = NULL
) : Timeline(ptr), IPopOutThemeAnimation.WithDefault, IWinRTObject {
  private val __2054533982_Interface: IPopOutThemeAnimation.WithDefault by lazy {
    as_2054533982()
  }


  public override val __2054533982_Ptr: JNAPointer? by lazy {
    __2054533982_Interface.__2054533982_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2054533982_Interface)

  public constructor() : this(ABI.activate())

  private fun as_2054533982(): IPopOutThemeAnimation.WithDefault {
    if(pointer == NULL) {
      return(IPopOutThemeAnimation.ABI.makeIPopOutThemeAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPopOutThemeAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPopOutThemeAnimation.ABI.makeIPopOutThemeAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PopOutThemeAnimation> {
    public override fun getValue() = PopOutThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: PopOutThemeAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PopOutThemeAnimation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IPopOutThemeAnimationStatics_Instance: IPopOutThemeAnimationStatics by lazy {
      createIPopOutThemeAnimationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.PopOutThemeAnimation".toHandle(),
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

    public fun createIPopOutThemeAnimationStatics(): IPopOutThemeAnimationStatics {
      val refiid = Guid.REFIID(IPopOutThemeAnimationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.PopOutThemeAnimation".toHandle(),refiid,interfacePtr)
      val result =
          IPopOutThemeAnimationStatics.ABI.makeIPopOutThemeAnimationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PopOutThemeAnimation {
      val address = segment.toRawLongValue()
      return PopOutThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: PopOutThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TargetNameProperty() =
        ABI.IPopOutThemeAnimationStatics_Instance.get_TargetNameProperty()
  }
}
