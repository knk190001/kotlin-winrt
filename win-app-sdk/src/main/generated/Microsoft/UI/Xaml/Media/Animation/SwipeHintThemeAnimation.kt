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

@ABIMarker(SwipeHintThemeAnimation.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Media.Animation.SwipeHintThemeAnimation;{09de03d7-4b8a-55e1-afad-5f60598733ea})")
@WinRTByReference(brClass = SwipeHintThemeAnimation.ByReference::class)
public class SwipeHintThemeAnimation(
  ptr: JNAPointer? = NULL
) : Timeline(ptr), ISwipeHintThemeAnimation.WithDefault, IWinRTObject {
  private val __1283976543_Interface: ISwipeHintThemeAnimation.WithDefault by lazy {
    as_1283976543()
  }


  public override val __1283976543_Ptr: JNAPointer? by lazy {
    __1283976543_Interface.__1283976543_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1283976543_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1283976543(): ISwipeHintThemeAnimation.WithDefault {
    if(pointer == NULL) {
      return(ISwipeHintThemeAnimation.ABI.makeISwipeHintThemeAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISwipeHintThemeAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISwipeHintThemeAnimation.ABI.makeISwipeHintThemeAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SwipeHintThemeAnimation> {
    public override fun getValue() = SwipeHintThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: SwipeHintThemeAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SwipeHintThemeAnimation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISwipeHintThemeAnimationStatics_Instance: ISwipeHintThemeAnimationStatics by lazy {
      createISwipeHintThemeAnimationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.SwipeHintThemeAnimation".toHandle(),
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

    public fun createISwipeHintThemeAnimationStatics(): ISwipeHintThemeAnimationStatics {
      val refiid = Guid.REFIID(ISwipeHintThemeAnimationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Media.Animation.SwipeHintThemeAnimation".toHandle(),refiid,interfacePtr)
      val result =
          ISwipeHintThemeAnimationStatics.ABI.makeISwipeHintThemeAnimationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SwipeHintThemeAnimation {
      val address = segment.toRawLongValue()
      return SwipeHintThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: SwipeHintThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TargetNameProperty() =
        ABI.ISwipeHintThemeAnimationStatics_Instance.get_TargetNameProperty()

    public fun get_ToHorizontalOffsetProperty() =
        ABI.ISwipeHintThemeAnimationStatics_Instance.get_ToHorizontalOffsetProperty()

    public fun get_ToVerticalOffsetProperty() =
        ABI.ISwipeHintThemeAnimationStatics_Instance.get_ToVerticalOffsetProperty()
  }
}
