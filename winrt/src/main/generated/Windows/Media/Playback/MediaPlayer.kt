package Windows.Media.Playback

import Windows.Foundation.IClosable
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

@ABIMarker(MediaPlayer.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaPlayer;{381a83cb-6fff-499b-8d64-2885dfc1249e})")
@WinRTByReference(brClass = MediaPlayer.ByReference::class)
public class MediaPlayer(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaPlayer.WithDefault, IMediaPlayerSource.WithDefault,
    IMediaPlayerSource2.WithDefault, IMediaPlayer2.WithDefault, IMediaPlayerEffects.WithDefault,
    IClosable.WithDefault, IMediaPlayer3.WithDefault, IMediaPlayer4.WithDefault,
    IMediaPlayerEffects2.WithDefault, IMediaPlayer5.WithDefault, IMediaPlayer6.WithDefault,
    IMediaPlayer7.WithDefault, IWinRTObject {
  private val __1982052372_Interface: IMediaPlayer.WithDefault by lazy {
    as_1982052372()
  }


  private val __411108569_Interface: IMediaPlayerSource.WithDefault by lazy {
    as_411108569()
  }


  private val __140536299_Interface: IMediaPlayerSource2.WithDefault by lazy {
    as_140536299()
  }


  private val __1314081338_Interface: IMediaPlayer2.WithDefault by lazy {
    as_1314081338()
  }


  private val __328484726_Interface: IMediaPlayerEffects.WithDefault by lazy {
    as_328484726()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __1314081337_Interface: IMediaPlayer3.WithDefault by lazy {
    as_1314081337()
  }


  private val __1314081336_Interface: IMediaPlayer4.WithDefault by lazy {
    as_1314081336()
  }


  private val __1593091964_Interface: IMediaPlayerEffects2.WithDefault by lazy {
    as_1593091964()
  }


  private val __1314081335_Interface: IMediaPlayer5.WithDefault by lazy {
    as_1314081335()
  }


  private val __1314081334_Interface: IMediaPlayer6.WithDefault by lazy {
    as_1314081334()
  }


  private val __1314081333_Interface: IMediaPlayer7.WithDefault by lazy {
    as_1314081333()
  }


  public override val __1982052372_Ptr: JNAPointer? by lazy {
    __1982052372_Interface.__1982052372_Ptr
  }


  public override val __411108569_Ptr: JNAPointer? by lazy {
    __411108569_Interface.__411108569_Ptr
  }


  public override val __140536299_Ptr: JNAPointer? by lazy {
    __140536299_Interface.__140536299_Ptr
  }


  public override val __1314081338_Ptr: JNAPointer? by lazy {
    __1314081338_Interface.__1314081338_Ptr
  }


  public override val __328484726_Ptr: JNAPointer? by lazy {
    __328484726_Interface.__328484726_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __1314081337_Ptr: JNAPointer? by lazy {
    __1314081337_Interface.__1314081337_Ptr
  }


  public override val __1314081336_Ptr: JNAPointer? by lazy {
    __1314081336_Interface.__1314081336_Ptr
  }


  public override val __1593091964_Ptr: JNAPointer? by lazy {
    __1593091964_Interface.__1593091964_Ptr
  }


  public override val __1314081335_Ptr: JNAPointer? by lazy {
    __1314081335_Interface.__1314081335_Ptr
  }


  public override val __1314081334_Ptr: JNAPointer? by lazy {
    __1314081334_Interface.__1314081334_Ptr
  }


  public override val __1314081333_Ptr: JNAPointer? by lazy {
    __1314081333_Interface.__1314081333_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1982052372_Interface, __411108569_Interface, __140536299_Interface,
        __1314081338_Interface, __328484726_Interface, __1260617006_Interface,
        __1314081337_Interface, __1314081336_Interface, __1593091964_Interface,
        __1314081335_Interface, __1314081334_Interface, __1314081333_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1982052372(): IMediaPlayer.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlayer.ABI.makeIMediaPlayer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlayer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlayer.ABI.makeIMediaPlayer(ref.value))
  }

  private fun as_411108569(): IMediaPlayerSource.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlayerSource.ABI.makeIMediaPlayerSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlayerSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlayerSource.ABI.makeIMediaPlayerSource(ref.value))
  }

  private fun as_140536299(): IMediaPlayerSource2.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlayerSource2.ABI.makeIMediaPlayerSource2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlayerSource2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlayerSource2.ABI.makeIMediaPlayerSource2(ref.value))
  }

  private fun as_1314081338(): IMediaPlayer2.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlayer2.ABI.makeIMediaPlayer2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlayer2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlayer2.ABI.makeIMediaPlayer2(ref.value))
  }

  private fun as_328484726(): IMediaPlayerEffects.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlayerEffects.ABI.makeIMediaPlayerEffects(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlayerEffects>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlayerEffects.ABI.makeIMediaPlayerEffects(ref.value))
  }

  private fun as_1260617006(): IClosable.WithDefault {
    if(pointer == NULL) {
      return(IClosable.ABI.makeIClosable(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClosable>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClosable.ABI.makeIClosable(ref.value))
  }

  private fun as_1314081337(): IMediaPlayer3.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlayer3.ABI.makeIMediaPlayer3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlayer3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlayer3.ABI.makeIMediaPlayer3(ref.value))
  }

  private fun as_1314081336(): IMediaPlayer4.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlayer4.ABI.makeIMediaPlayer4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlayer4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlayer4.ABI.makeIMediaPlayer4(ref.value))
  }

  private fun as_1593091964(): IMediaPlayerEffects2.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlayerEffects2.ABI.makeIMediaPlayerEffects2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlayerEffects2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlayerEffects2.ABI.makeIMediaPlayerEffects2(ref.value))
  }

  private fun as_1314081335(): IMediaPlayer5.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlayer5.ABI.makeIMediaPlayer5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlayer5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlayer5.ABI.makeIMediaPlayer5(ref.value))
  }

  private fun as_1314081334(): IMediaPlayer6.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlayer6.ABI.makeIMediaPlayer6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlayer6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlayer6.ABI.makeIMediaPlayer6(ref.value))
  }

  private fun as_1314081333(): IMediaPlayer7.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlayer7.ABI.makeIMediaPlayer7(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlayer7>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlayer7.ABI.makeIMediaPlayer7(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MediaPlayer> {
    public override fun getValue() = MediaPlayer(pointer.getPointer(0))

    public fun setValue(value: MediaPlayer): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaPlayer, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Media.Playback.MediaPlayer".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): MediaPlayer {
      val address = segment.toRawLongValue()
      return MediaPlayer(Pointer(address))
    }

    public override fun toNative(obj: MediaPlayer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
