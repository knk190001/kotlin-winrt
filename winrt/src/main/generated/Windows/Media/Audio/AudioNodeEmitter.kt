package Windows.Media.Audio

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
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(AudioNodeEmitter.ABI::class)
@Signature("rc(Windows.Media.Audio.AudioNodeEmitter;{3676971d-880a-47b8-adf7-1323a9d965be})")
@WinRTByReference(brClass = AudioNodeEmitter.ByReference::class)
public class AudioNodeEmitter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAudioNodeEmitter.WithDefault, IAudioNodeEmitter2.WithDefault, IWinRTObject {
  private val __1391440862_Interface: IAudioNodeEmitter.WithDefault by lazy {
    as_1391440862()
  }


  private val __184993812_Interface: IAudioNodeEmitter2.WithDefault by lazy {
    as_184993812()
  }


  public override val __1391440862_Ptr: JNAPointer? by lazy {
    __1391440862_Interface.__1391440862_Ptr
  }


  public override val __184993812_Ptr: JNAPointer? by lazy {
    __184993812_Interface.__184993812_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1391440862_Interface, __184993812_Interface)

  public constructor() : this(ABI.activate())

  public constructor(
    shape: AudioNodeEmitterShape,
    decayModel: AudioNodeEmitterDecayModel,
    settings: AudioNodeEmitterSettings
  ) : this(ABI.activate(shape, decayModel, settings))

  private fun as_1391440862(): IAudioNodeEmitter.WithDefault {
    if(pointer == NULL) {
      return(IAudioNodeEmitter.ABI.makeIAudioNodeEmitter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioNodeEmitter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioNodeEmitter.ABI.makeIAudioNodeEmitter(ref.value))
  }

  private fun as_184993812(): IAudioNodeEmitter2.WithDefault {
    if(pointer == NULL) {
      return(IAudioNodeEmitter2.ABI.makeIAudioNodeEmitter2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAudioNodeEmitter2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAudioNodeEmitter2.ABI.makeIAudioNodeEmitter2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AudioNodeEmitter> {
    public override fun getValue() = AudioNodeEmitter(pointer.getPointer(0))

    public fun setValue(value: AudioNodeEmitter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AudioNodeEmitter, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IAudioNodeEmitterFactory_Instance: IAudioNodeEmitterFactory by lazy {
      createIAudioNodeEmitterFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Media.Audio.AudioNodeEmitter".toHandle(),
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

    public fun createIAudioNodeEmitterFactory(): IAudioNodeEmitterFactory {
      val refiid = Guid.REFIID(IAudioNodeEmitterFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Audio.AudioNodeEmitter".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IAudioNodeEmitterFactory.ABI.makeIAudioNodeEmitterFactory(factoryActivatorPtr.value))
    }

    public fun activate(
      shape: AudioNodeEmitterShape,
      decayModel: AudioNodeEmitterDecayModel,
      settings: AudioNodeEmitterSettings
    ): JNAPointer? = IAudioNodeEmitterFactory_Instance.CreateAudioNodeEmitter(shape, decayModel,
        settings)?.pointer

    public override fun fromNative(segment: MemoryAddress): AudioNodeEmitter {
      val address = segment.toRawLongValue()
      return AudioNodeEmitter(Pointer(address))
    }

    public override fun toNative(obj: AudioNodeEmitter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
