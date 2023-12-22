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

@ABIMarker(SwipeBackThemeAnimation.ABI::class)
@Signature("rc(Windows.UI.Xaml.Media.Animation.SwipeBackThemeAnimation;{a38a4214-0bca-4d2d-95f7-ceba57fbaf60})")
@WinRTByReference(brClass = SwipeBackThemeAnimation.ByReference::class)
public class SwipeBackThemeAnimation(
  ptr: JNAPointer? = NULL
) : Timeline(ptr), ISwipeBackThemeAnimation.WithDefault, IWinRTObject {
  private val __522773354_Interface: ISwipeBackThemeAnimation.WithDefault by lazy {
    as_522773354()
  }


  public override val __522773354_Ptr: JNAPointer? by lazy {
    __522773354_Interface.__522773354_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__522773354_Interface)

  public constructor() : this(ABI.activate())

  private fun as_522773354(): ISwipeBackThemeAnimation.WithDefault {
    if(pointer == NULL) {
      return(ISwipeBackThemeAnimation.ABI.makeISwipeBackThemeAnimation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISwipeBackThemeAnimation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISwipeBackThemeAnimation.ABI.makeISwipeBackThemeAnimation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SwipeBackThemeAnimation> {
    public override fun getValue() = SwipeBackThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: SwipeBackThemeAnimation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SwipeBackThemeAnimation, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val ISwipeBackThemeAnimationStatics_Instance: ISwipeBackThemeAnimationStatics by lazy {
      createISwipeBackThemeAnimationStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.SwipeBackThemeAnimation".toHandle(),
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

    public fun createISwipeBackThemeAnimationStatics(): ISwipeBackThemeAnimationStatics {
      val refiid = Guid.REFIID(ISwipeBackThemeAnimationStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Media.Animation.SwipeBackThemeAnimation".toHandle(),refiid,interfacePtr)
      val result =
          ISwipeBackThemeAnimationStatics.ABI.makeISwipeBackThemeAnimationStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SwipeBackThemeAnimation {
      val address = segment.toRawLongValue()
      return SwipeBackThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: SwipeBackThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_TargetNameProperty() =
        ABI.ISwipeBackThemeAnimationStatics_Instance.get_TargetNameProperty()

    public fun get_FromHorizontalOffsetProperty() =
        ABI.ISwipeBackThemeAnimationStatics_Instance.get_FromHorizontalOffsetProperty()

    public fun get_FromVerticalOffsetProperty() =
        ABI.ISwipeBackThemeAnimationStatics_Instance.get_FromVerticalOffsetProperty()
  }
}
