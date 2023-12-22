package Windows.Media.Playback

import Windows.Foundation.TimeSpan
import Windows.Media.Playback.IPlaybackMediaMarkerFactory.ABI.IID
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PlaybackMediaMarker.ABI::class)
@Signature("rc(Windows.Media.Playback.PlaybackMediaMarker;{c4d22f5c-3c1c-4444-b6b9-778b0422d41a})")
@WinRTByReference(brClass = PlaybackMediaMarker.ByReference::class)
public class PlaybackMediaMarker(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlaybackMediaMarker.WithDefault, IWinRTObject {
  private val __1212140842_Interface: IPlaybackMediaMarker.WithDefault by lazy {
    as_1212140842()
  }


  public override val __1212140842_Ptr: JNAPointer? by lazy {
    __1212140842_Interface.__1212140842_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1212140842_Interface)

  public constructor(value: TimeSpan) : this(ABI.activate(value))

  public constructor(
    value: TimeSpan,
    mediaMarketType: String,
    text: String
  ) : this(ABI.activate(value, mediaMarketType, text))

  private fun as_1212140842(): IPlaybackMediaMarker.WithDefault {
    if(pointer == NULL) {
      return(IPlaybackMediaMarker.ABI.makeIPlaybackMediaMarker(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlaybackMediaMarker>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlaybackMediaMarker.ABI.makeIPlaybackMediaMarker(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlaybackMediaMarker> {
    public override fun getValue() = PlaybackMediaMarker(pointer.getPointer(0))

    public fun setValue(value: PlaybackMediaMarker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlaybackMediaMarker, MemoryAddress> {
    public val IPlaybackMediaMarkerFactory_Instance: IPlaybackMediaMarkerFactory by lazy {
      createIPlaybackMediaMarkerFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPlaybackMediaMarkerFactory(): IPlaybackMediaMarkerFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Playback.PlaybackMediaMarker".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPlaybackMediaMarkerFactory.ABI.makeIPlaybackMediaMarkerFactory(factoryActivatorPtr.value))
    }

    public fun activate(value: TimeSpan): JNAPointer? =
        IPlaybackMediaMarkerFactory_Instance.CreateFromTime(value)?.pointer

    public fun activate(
      value: TimeSpan,
      mediaMarketType: String,
      text: String
    ): JNAPointer? = IPlaybackMediaMarkerFactory_Instance.Create(value, mediaMarketType,
        text)?.pointer

    public override fun fromNative(segment: MemoryAddress): PlaybackMediaMarker {
      val address = segment.toRawLongValue()
      return PlaybackMediaMarker(Pointer(address))
    }

    public override fun toNative(obj: PlaybackMediaMarker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
