package Windows.Media.Audio

import Windows.Media.Audio.IAudioGraphSettingsFactory.ABI.IID
import Windows.Media.Render.AudioRenderCategory
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AudioGraphSettings.ABI::class)
@Signature("rc(Windows.Media.Audio.AudioGraphSettings;{1d59647f-e6fe-4628-84f8-9d8bdba25785})")
@WinRTByReference(brClass = AudioGraphSettings.ByReference::class)
public class AudioGraphSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioGraphSettings.WithDefault, IAudioGraphSettings2.WithDefault,
    IWinRTObject {
  private val __1934541853_Interface: IAudioGraphSettings.WithDefault by lazy {
    as_1934541853()
  }


  private val __158744751_Interface: IAudioGraphSettings2.WithDefault by lazy {
    as_158744751()
  }


  public override val __1934541853_Ptr: JNAPointer? by lazy {
    __1934541853_Interface.__1934541853_Ptr
  }


  public override val __158744751_Ptr: JNAPointer? by lazy {
    __158744751_Interface.__158744751_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1934541853_Interface, __158744751_Interface)

  public constructor(audioRenderCategory: AudioRenderCategory) :
      this(ABI.activate(audioRenderCategory))

  private fun as_1934541853(): IAudioGraphSettings.WithDefault {
    if(pointer == NULL) {
      return(IAudioGraphSettings.ABI.makeIAudioGraphSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioGraphSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioGraphSettings.ABI.makeIAudioGraphSettings(ref.value))
  }

  private fun as_158744751(): IAudioGraphSettings2.WithDefault {
    if(pointer == NULL) {
      return(IAudioGraphSettings2.ABI.makeIAudioGraphSettings2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioGraphSettings2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioGraphSettings2.ABI.makeIAudioGraphSettings2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioGraphSettings> {
    public override fun getValue() = AudioGraphSettings(pointer.getPointer(0))

    public fun setValue(value: AudioGraphSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioGraphSettings, MemoryAddress> {
    public val IAudioGraphSettingsFactory_Instance: IAudioGraphSettingsFactory by lazy {
      createIAudioGraphSettingsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAudioGraphSettingsFactory(): IAudioGraphSettingsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Audio.AudioGraphSettings".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAudioGraphSettingsFactory.ABI.makeIAudioGraphSettingsFactory(factoryActivatorPtr.value))
    }

    public fun activate(audioRenderCategory: AudioRenderCategory): JNAPointer? =
        IAudioGraphSettingsFactory_Instance.Create(audioRenderCategory)?.pointer

    public override fun fromNative(segment: MemoryAddress): AudioGraphSettings {
      val address = segment.toRawLongValue()
      return AudioGraphSettings(Pointer(address))
    }

    public override fun toNative(obj: AudioGraphSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
