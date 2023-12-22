package Windows.UI.Xaml

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Double
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(ElementSoundPlayer.ABI::class)
@Signature("rc(Windows.UI.Xaml.ElementSoundPlayer;{387773a5-f036-460c-9b81-f3d6ea43f6f2})")
@WinRTByReference(brClass = ElementSoundPlayer.ByReference::class)
public class ElementSoundPlayer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IElementSoundPlayer.WithDefault, IWinRTObject {
  private val __36647430_Interface: IElementSoundPlayer.WithDefault by lazy {
    as_36647430()
  }


  public override val __36647430_Ptr: JNAPointer? by lazy {
    __36647430_Interface.__36647430_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__36647430_Interface)

  private fun as_36647430(): IElementSoundPlayer.WithDefault {
    if(pointer == NULL) {
      return(IElementSoundPlayer.ABI.makeIElementSoundPlayer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IElementSoundPlayer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IElementSoundPlayer.ABI.makeIElementSoundPlayer(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ElementSoundPlayer> {
    public override fun getValue() = ElementSoundPlayer(pointer.getPointer(0))

    public fun setValue(value: ElementSoundPlayer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ElementSoundPlayer, MemoryAddress> {
    public val IElementSoundPlayerStatics2_Instance: IElementSoundPlayerStatics2 by lazy {
      createIElementSoundPlayerStatics2()
    }


    public val IElementSoundPlayerStatics_Instance: IElementSoundPlayerStatics by lazy {
      createIElementSoundPlayerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIElementSoundPlayerStatics2(): IElementSoundPlayerStatics2 {
      val refiid = Guid.REFIID(IElementSoundPlayerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.ElementSoundPlayer".toHandle(),refiid,interfacePtr)
      val result =
          IElementSoundPlayerStatics2.ABI.makeIElementSoundPlayerStatics2(interfacePtr.value)
      return result
    }

    public fun createIElementSoundPlayerStatics(): IElementSoundPlayerStatics {
      val refiid = Guid.REFIID(IElementSoundPlayerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.ElementSoundPlayer".toHandle(),refiid,interfacePtr)
      val result = IElementSoundPlayerStatics.ABI.makeIElementSoundPlayerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): ElementSoundPlayer {
      val address = segment.toRawLongValue()
      return ElementSoundPlayer(Pointer(address))
    }

    public override fun toNative(obj: ElementSoundPlayer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_SpatialAudioMode() =
        ABI.IElementSoundPlayerStatics2_Instance.get_SpatialAudioMode()

    public fun put_SpatialAudioMode(value: ElementSpatialAudioMode) =
        ABI.IElementSoundPlayerStatics2_Instance.put_SpatialAudioMode(value)

    public fun get_Volume() = ABI.IElementSoundPlayerStatics_Instance.get_Volume()

    public fun put_Volume(value: Double) = ABI.IElementSoundPlayerStatics_Instance.put_Volume(value)

    public fun get_State() = ABI.IElementSoundPlayerStatics_Instance.get_State()

    public fun put_State(value: ElementSoundPlayerState) =
        ABI.IElementSoundPlayerStatics_Instance.put_State(value)

    public fun Play(sound: ElementSoundKind) = ABI.IElementSoundPlayerStatics_Instance.Play(sound)
  }
}
