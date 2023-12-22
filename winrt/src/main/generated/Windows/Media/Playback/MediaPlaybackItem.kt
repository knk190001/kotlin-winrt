package Windows.Media.Playback

import Windows.Foundation.TimeSpan
import Windows.Media.Core.MediaSource
import Windows.Media.Playback.IMediaPlaybackItemFactory2.ABI.IID
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MediaPlaybackItem.ABI::class)
@Signature("rc(Windows.Media.Playback.MediaPlaybackItem;{047097d2-e4af-48ab-b283-6929e674ece2})")
@WinRTByReference(brClass = MediaPlaybackItem.ByReference::class)
public class MediaPlaybackItem(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaPlaybackItem.WithDefault, IMediaPlaybackSource.WithDefault,
    IMediaPlaybackItem2.WithDefault, IMediaPlaybackItem3.WithDefault, IWinRTObject {
  private val __1200797849_Interface: IMediaPlaybackItem.WithDefault by lazy {
    as_1200797849()
  }


  private val __1097311199_Interface: IMediaPlaybackSource.WithDefault by lazy {
    as_1097311199()
  }


  private val __1429972295_Interface: IMediaPlaybackItem2.WithDefault by lazy {
    as_1429972295()
  }


  private val __1429972294_Interface: IMediaPlaybackItem3.WithDefault by lazy {
    as_1429972294()
  }


  public override val __1200797849_Ptr: JNAPointer? by lazy {
    __1200797849_Interface.__1200797849_Ptr
  }


  public override val __1097311199_Ptr: JNAPointer? by lazy {
    __1097311199_Interface.__1097311199_Ptr
  }


  public override val __1429972295_Ptr: JNAPointer? by lazy {
    __1429972295_Interface.__1429972295_Ptr
  }


  public override val __1429972294_Ptr: JNAPointer? by lazy {
    __1429972294_Interface.__1429972294_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1200797849_Interface, __1097311199_Interface, __1429972295_Interface,
        __1429972294_Interface)

  public constructor(source: MediaSource, startTime: TimeSpan) : this(ABI.activate(source,
      startTime))

  public constructor(
    source: MediaSource,
    startTime: TimeSpan,
    durationLimit: TimeSpan
  ) : this(ABI.activate(source, startTime, durationLimit))

  public constructor(source: MediaSource) : this(ABI.activate(source))

  private fun as_1200797849(): IMediaPlaybackItem.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackItem.ABI.makeIMediaPlaybackItem(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackItem>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackItem.ABI.makeIMediaPlaybackItem(ref.value))
  }

  private fun as_1097311199(): IMediaPlaybackSource.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackSource.ABI.makeIMediaPlaybackSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackSource.ABI.makeIMediaPlaybackSource(ref.value))
  }

  private fun as_1429972295(): IMediaPlaybackItem2.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackItem2.ABI.makeIMediaPlaybackItem2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackItem2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackItem2.ABI.makeIMediaPlaybackItem2(ref.value))
  }

  private fun as_1429972294(): IMediaPlaybackItem3.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackItem3.ABI.makeIMediaPlaybackItem3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackItem3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackItem3.ABI.makeIMediaPlaybackItem3(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaPlaybackItem> {
    public override fun getValue() = MediaPlaybackItem(pointer.getPointer(0))

    public fun setValue(value: MediaPlaybackItem): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaPlaybackItem, MemoryAddress> {
    public val IMediaPlaybackItemStatics_Instance: IMediaPlaybackItemStatics by lazy {
      createIMediaPlaybackItemStatics()
    }


    public val IMediaPlaybackItemFactory2_Instance: IMediaPlaybackItemFactory2 by lazy {
      createIMediaPlaybackItemFactory2()
    }


    public val IMediaPlaybackItemFactory_Instance: IMediaPlaybackItemFactory by lazy {
      createIMediaPlaybackItemFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMediaPlaybackItemStatics(): IMediaPlaybackItemStatics {
      val refiid = Guid.REFIID(IMediaPlaybackItemStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Playback.MediaPlaybackItem".toHandle(),refiid,interfacePtr)
      val result = IMediaPlaybackItemStatics.ABI.makeIMediaPlaybackItemStatics(interfacePtr.value)
      return result
    }

    public fun createIMediaPlaybackItemFactory2(): IMediaPlaybackItemFactory2 {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Playback.MediaPlaybackItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMediaPlaybackItemFactory2.ABI.makeIMediaPlaybackItemFactory2(factoryActivatorPtr.value))
    }

    public fun createIMediaPlaybackItemFactory(): IMediaPlaybackItemFactory {
      val refiid = Guid.REFIID(IMediaPlaybackItemFactory.ABI.IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Playback.MediaPlaybackItem".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IMediaPlaybackItemFactory.ABI.makeIMediaPlaybackItemFactory(factoryActivatorPtr.value))
    }

    public fun activate(source: MediaSource, startTime: TimeSpan): JNAPointer? =
        IMediaPlaybackItemFactory2_Instance.CreateWithStartTime(source, startTime)?.pointer

    public fun activate(
      source: MediaSource,
      startTime: TimeSpan,
      durationLimit: TimeSpan
    ): JNAPointer? = IMediaPlaybackItemFactory2_Instance.CreateWithStartTimeAndDurationLimit(source,
        startTime, durationLimit)?.pointer

    public fun activate(source: MediaSource): JNAPointer? =
        IMediaPlaybackItemFactory_Instance.Create(source)?.pointer

    public override fun fromNative(segment: MemoryAddress): MediaPlaybackItem {
      val address = segment.toRawLongValue()
      return MediaPlaybackItem(Pointer(address))
    }

    public override fun toNative(obj: MediaPlaybackItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun FindFromMediaSource(source: MediaSource) =
        ABI.IMediaPlaybackItemStatics_Instance.FindFromMediaSource(source)
  }
}
