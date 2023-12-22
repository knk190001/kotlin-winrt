package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.IAnimatedVisualPlayerFactory.ABI.IID
import Microsoft.UI.Xaml.FrameworkElement
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(AnimatedVisualPlayer.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.AnimatedVisualPlayer;{17f024f0-1692-51dd-a4da-f4ed648d614c})")
@WinRTByReference(brClass = AnimatedVisualPlayer.ByReference::class)
public open class AnimatedVisualPlayer(
  ptr: JNAPointer? = NULL
) : FrameworkElement(ptr), IAnimatedVisualPlayer.WithDefault, IAnimatedVisualPlayer2.WithDefault,
    IWinRTObject {
  private val __332536885_Interface: IAnimatedVisualPlayer.WithDefault by lazy {
    as_332536885()
  }


  private val __1718708793_Interface: IAnimatedVisualPlayer2.WithDefault by lazy {
    as_1718708793()
  }


  public override val __332536885_Ptr: JNAPointer? by lazy {
    __332536885_Interface.__332536885_Ptr
  }


  public override val __1718708793_Ptr: JNAPointer? by lazy {
    __1718708793_Interface.__1718708793_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__332536885_Interface, __1718708793_Interface)

  public constructor() : this(ABI.activate())

  private fun as_332536885(): IAnimatedVisualPlayer.WithDefault {
    if(pointer == NULL) {
      return(IAnimatedVisualPlayer.ABI.makeIAnimatedVisualPlayer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAnimatedVisualPlayer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAnimatedVisualPlayer.ABI.makeIAnimatedVisualPlayer(ref.value))
  }

  private fun as_1718708793(): IAnimatedVisualPlayer2.WithDefault {
    if(pointer == NULL) {
      return(IAnimatedVisualPlayer2.ABI.makeIAnimatedVisualPlayer2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAnimatedVisualPlayer2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAnimatedVisualPlayer2.ABI.makeIAnimatedVisualPlayer2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AnimatedVisualPlayer> {
    public override fun getValue() = AnimatedVisualPlayer(pointer.getPointer(0))

    public fun setValue(value: AnimatedVisualPlayer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AnimatedVisualPlayer, MemoryAddress> {
    public val IAnimatedVisualPlayerStatics2_Instance: IAnimatedVisualPlayerStatics2 by lazy {
      createIAnimatedVisualPlayerStatics2()
    }


    public val IAnimatedVisualPlayerStatics_Instance: IAnimatedVisualPlayerStatics by lazy {
      createIAnimatedVisualPlayerStatics()
    }


    public val IAnimatedVisualPlayerFactory_Instance: IAnimatedVisualPlayerFactory by lazy {
      createIAnimatedVisualPlayerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAnimatedVisualPlayerStatics2(): IAnimatedVisualPlayerStatics2 {
      val refiid = Guid.REFIID(IAnimatedVisualPlayerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AnimatedVisualPlayer".toHandle(),refiid,interfacePtr)
      val result =
          IAnimatedVisualPlayerStatics2.ABI.makeIAnimatedVisualPlayerStatics2(interfacePtr.value)
      return result
    }

    public fun createIAnimatedVisualPlayerStatics(): IAnimatedVisualPlayerStatics {
      val refiid = Guid.REFIID(IAnimatedVisualPlayerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AnimatedVisualPlayer".toHandle(),refiid,interfacePtr)
      val result =
          IAnimatedVisualPlayerStatics.ABI.makeIAnimatedVisualPlayerStatics(interfacePtr.value)
      return result
    }

    public fun createIAnimatedVisualPlayerFactory(): IAnimatedVisualPlayerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Xaml.Controls.AnimatedVisualPlayer".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAnimatedVisualPlayerFactory.ABI.makeIAnimatedVisualPlayerFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IAnimatedVisualPlayerFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): AnimatedVisualPlayer {
      val address = segment.toRawLongValue()
      return AnimatedVisualPlayer(Pointer(address))
    }

    public override fun toNative(obj: AnimatedVisualPlayer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_AnimationOptimizationProperty() =
        ABI.IAnimatedVisualPlayerStatics2_Instance.get_AnimationOptimizationProperty()

    public fun get_AutoPlayProperty() =
        ABI.IAnimatedVisualPlayerStatics_Instance.get_AutoPlayProperty()

    public fun get_DiagnosticsProperty() =
        ABI.IAnimatedVisualPlayerStatics_Instance.get_DiagnosticsProperty()

    public fun get_DurationProperty() =
        ABI.IAnimatedVisualPlayerStatics_Instance.get_DurationProperty()

    public fun get_FallbackContentProperty() =
        ABI.IAnimatedVisualPlayerStatics_Instance.get_FallbackContentProperty()

    public fun get_IsAnimatedVisualLoadedProperty() =
        ABI.IAnimatedVisualPlayerStatics_Instance.get_IsAnimatedVisualLoadedProperty()

    public fun get_IsPlayingProperty() =
        ABI.IAnimatedVisualPlayerStatics_Instance.get_IsPlayingProperty()

    public fun get_PlaybackRateProperty() =
        ABI.IAnimatedVisualPlayerStatics_Instance.get_PlaybackRateProperty()

    public fun get_SourceProperty() = ABI.IAnimatedVisualPlayerStatics_Instance.get_SourceProperty()

    public fun get_StretchProperty() =
        ABI.IAnimatedVisualPlayerStatics_Instance.get_StretchProperty()
  }
}
