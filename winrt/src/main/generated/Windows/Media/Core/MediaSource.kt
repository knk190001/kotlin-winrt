package Windows.Media.Core

import Windows.Foundation.IClosable
import Windows.Foundation.Uri
import Windows.Media.Capture.Frames.MediaFrameSource
import Windows.Media.Playback.IMediaPlaybackSource
import Windows.Media.Streaming.Adaptive.AdaptiveMediaSource
import Windows.Networking.BackgroundTransfer.DownloadOperation
import Windows.Storage.IStorageFile
import Windows.Storage.Streams.IRandomAccessStream
import Windows.Storage.Streams.IRandomAccessStreamReference
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MediaSource.ABI::class)
@Signature("rc(Windows.Media.Core.MediaSource;{2eb61048-655f-4c37-b813-b4e45dfa0abe})")
@WinRTByReference(brClass = MediaSource.ByReference::class)
public class MediaSource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaSource2.WithDefault, IClosable.WithDefault,
    IMediaPlaybackSource.WithDefault, IMediaSource3.WithDefault, IMediaSource4.WithDefault,
    IMediaSource5.WithDefault, IWinRTObject {
  private val __983754168_Interface: IMediaSource2.WithDefault by lazy {
    as_983754168()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  private val __1097311199_Interface: IMediaPlaybackSource.WithDefault by lazy {
    as_1097311199()
  }


  private val __983754167_Interface: IMediaSource3.WithDefault by lazy {
    as_983754167()
  }


  private val __983754166_Interface: IMediaSource4.WithDefault by lazy {
    as_983754166()
  }


  private val __983754165_Interface: IMediaSource5.WithDefault by lazy {
    as_983754165()
  }


  public override val __983754168_Ptr: JNAPointer? by lazy {
    __983754168_Interface.__983754168_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val __1097311199_Ptr: JNAPointer? by lazy {
    __1097311199_Interface.__1097311199_Ptr
  }


  public override val __983754167_Ptr: JNAPointer? by lazy {
    __983754167_Interface.__983754167_Ptr
  }


  public override val __983754166_Ptr: JNAPointer? by lazy {
    __983754166_Interface.__983754166_Ptr
  }


  public override val __983754165_Ptr: JNAPointer? by lazy {
    __983754165_Interface.__983754165_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__983754168_Interface, __1260617006_Interface, __1097311199_Interface,
        __983754167_Interface, __983754166_Interface, __983754165_Interface)

  private fun as_983754168(): IMediaSource2.WithDefault {
    if(pointer == NULL) {
      return(IMediaSource2.ABI.makeIMediaSource2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaSource2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaSource2.ABI.makeIMediaSource2(ref.value))
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

  private fun as_1097311199(): IMediaPlaybackSource.WithDefault {
    if(pointer == NULL) {
      return(IMediaPlaybackSource.ABI.makeIMediaPlaybackSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaPlaybackSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaPlaybackSource.ABI.makeIMediaPlaybackSource(ref.value))
  }

  private fun as_983754167(): IMediaSource3.WithDefault {
    if(pointer == NULL) {
      return(IMediaSource3.ABI.makeIMediaSource3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaSource3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaSource3.ABI.makeIMediaSource3(ref.value))
  }

  private fun as_983754166(): IMediaSource4.WithDefault {
    if(pointer == NULL) {
      return(IMediaSource4.ABI.makeIMediaSource4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaSource4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaSource4.ABI.makeIMediaSource4(ref.value))
  }

  private fun as_983754165(): IMediaSource5.WithDefault {
    if(pointer == NULL) {
      return(IMediaSource5.ABI.makeIMediaSource5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaSource5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaSource5.ABI.makeIMediaSource5(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<MediaSource> {
    public override fun getValue() = MediaSource(pointer.getPointer(0))

    public fun setValue(value: MediaSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaSource, MemoryAddress> {
    public val IMediaSourceStatics4_Instance: IMediaSourceStatics4 by lazy {
      createIMediaSourceStatics4()
    }


    public val IMediaSourceStatics_Instance: IMediaSourceStatics by lazy {
      createIMediaSourceStatics()
    }


    public val IMediaSourceStatics3_Instance: IMediaSourceStatics3 by lazy {
      createIMediaSourceStatics3()
    }


    public val IMediaSourceStatics2_Instance: IMediaSourceStatics2 by lazy {
      createIMediaSourceStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMediaSourceStatics4(): IMediaSourceStatics4 {
      val refiid = Guid.REFIID(IMediaSourceStatics4.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Core.MediaSource".toHandle(),refiid,interfacePtr)
      val result = IMediaSourceStatics4.ABI.makeIMediaSourceStatics4(interfacePtr.value)
      return result
    }

    public fun createIMediaSourceStatics(): IMediaSourceStatics {
      val refiid = Guid.REFIID(IMediaSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Core.MediaSource".toHandle(),refiid,interfacePtr)
      val result = IMediaSourceStatics.ABI.makeIMediaSourceStatics(interfacePtr.value)
      return result
    }

    public fun createIMediaSourceStatics3(): IMediaSourceStatics3 {
      val refiid = Guid.REFIID(IMediaSourceStatics3.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Core.MediaSource".toHandle(),refiid,interfacePtr)
      val result = IMediaSourceStatics3.ABI.makeIMediaSourceStatics3(interfacePtr.value)
      return result
    }

    public fun createIMediaSourceStatics2(): IMediaSourceStatics2 {
      val refiid = Guid.REFIID(IMediaSourceStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Core.MediaSource".toHandle(),refiid,interfacePtr)
      val result = IMediaSourceStatics2.ABI.makeIMediaSourceStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MediaSource {
      val address = segment.toRawLongValue()
      return MediaSource(Pointer(address))
    }

    public override fun toNative(obj: MediaSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromDownloadOperation(downloadOperation: DownloadOperation) =
        ABI.IMediaSourceStatics4_Instance.CreateFromDownloadOperation(downloadOperation)

    public fun CreateFromAdaptiveMediaSource(mediaSource: AdaptiveMediaSource) =
        ABI.IMediaSourceStatics_Instance.CreateFromAdaptiveMediaSource(mediaSource)

    public fun CreateFromMediaStreamSource(mediaSource: MediaStreamSource) =
        ABI.IMediaSourceStatics_Instance.CreateFromMediaStreamSource(mediaSource)

    public fun CreateFromMseStreamSource(mediaSource: MseStreamSource) =
        ABI.IMediaSourceStatics_Instance.CreateFromMseStreamSource(mediaSource)

    public fun CreateFromIMediaSource(mediaSource: IMediaSource) =
        ABI.IMediaSourceStatics_Instance.CreateFromIMediaSource(mediaSource)

    public fun CreateFromStorageFile(`file`: IStorageFile) =
        ABI.IMediaSourceStatics_Instance.CreateFromStorageFile(file)

    public fun CreateFromStream(stream: IRandomAccessStream, contentType: String) =
        ABI.IMediaSourceStatics_Instance.CreateFromStream(stream, contentType)

    public fun CreateFromStreamReference(stream: IRandomAccessStreamReference, contentType: String)
        = ABI.IMediaSourceStatics_Instance.CreateFromStreamReference(stream, contentType)

    public fun CreateFromUri(uri: Uri) = ABI.IMediaSourceStatics_Instance.CreateFromUri(uri)

    public fun CreateFromMediaFrameSource(frameSource: MediaFrameSource) =
        ABI.IMediaSourceStatics3_Instance.CreateFromMediaFrameSource(frameSource)

    public fun CreateFromMediaBinder(binder: MediaBinder) =
        ABI.IMediaSourceStatics2_Instance.CreateFromMediaBinder(binder)
  }
}
