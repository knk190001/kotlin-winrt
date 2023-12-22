package Windows.Media.Streaming.Adaptive

import Windows.Foundation.IClosable
import Windows.Foundation.Uri
import Windows.Media.Core.IMediaSource
import Windows.Storage.Streams.IInputStream
import Windows.Web.Http.HttpClient
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

@ABIMarker(AdaptiveMediaSource.ABI::class)
@Signature("rc(Windows.Media.Streaming.Adaptive.AdaptiveMediaSource;{4c7332ef-d39f-4396-b4d9-043957a7c964})")
@WinRTByReference(brClass = AdaptiveMediaSource.ByReference::class)
public class AdaptiveMediaSource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IAdaptiveMediaSource.WithDefault, IMediaSource.WithDefault,
    IAdaptiveMediaSource2.WithDefault, IAdaptiveMediaSource3.WithDefault, IClosable.WithDefault,
    IWinRTObject {
  private val __754966167_Interface: IAdaptiveMediaSource.WithDefault by lazy {
    as_754966167()
  }


  private val __1076644650_Interface: IMediaSource.WithDefault by lazy {
    as_1076644650()
  }


  private val __1929114747_Interface: IAdaptiveMediaSource2.WithDefault by lazy {
    as_1929114747()
  }


  private val __1929114748_Interface: IAdaptiveMediaSource3.WithDefault by lazy {
    as_1929114748()
  }


  private val __1260617006_Interface: IClosable.WithDefault by lazy {
    as_1260617006()
  }


  public override val __754966167_Ptr: JNAPointer? by lazy {
    __754966167_Interface.__754966167_Ptr
  }


  public override val __1076644650_Ptr: JNAPointer? by lazy {
    __1076644650_Interface.__1076644650_Ptr
  }


  public override val __1929114747_Ptr: JNAPointer? by lazy {
    __1929114747_Interface.__1929114747_Ptr
  }


  public override val __1929114748_Ptr: JNAPointer? by lazy {
    __1929114748_Interface.__1929114748_Ptr
  }


  public override val __1260617006_Ptr: JNAPointer? by lazy {
    __1260617006_Interface.__1260617006_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__754966167_Interface, __1076644650_Interface, __1929114747_Interface,
        __1929114748_Interface, __1260617006_Interface)

  private fun as_754966167(): IAdaptiveMediaSource.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSource.ABI.makeIAdaptiveMediaSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSource.ABI.makeIAdaptiveMediaSource(ref.value))
  }

  private fun as_1076644650(): IMediaSource.WithDefault {
    if(pointer == NULL) {
      return(IMediaSource.ABI.makeIMediaSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaSource.ABI.makeIMediaSource(ref.value))
  }

  private fun as_1929114747(): IAdaptiveMediaSource2.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSource2.ABI.makeIAdaptiveMediaSource2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSource2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSource2.ABI.makeIAdaptiveMediaSource2(ref.value))
  }

  private fun as_1929114748(): IAdaptiveMediaSource3.WithDefault {
    if(pointer == NULL) {
      return(IAdaptiveMediaSource3.ABI.makeIAdaptiveMediaSource3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IAdaptiveMediaSource3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IAdaptiveMediaSource3.ABI.makeIAdaptiveMediaSource3(ref.value))
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

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<AdaptiveMediaSource> {
    public override fun getValue() = AdaptiveMediaSource(pointer.getPointer(0))

    public fun setValue(value: AdaptiveMediaSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<AdaptiveMediaSource, MemoryAddress> {
    public val IAdaptiveMediaSourceStatics_Instance: IAdaptiveMediaSourceStatics by lazy {
      createIAdaptiveMediaSourceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIAdaptiveMediaSourceStatics(): IAdaptiveMediaSourceStatics {
      val refiid = Guid.REFIID(IAdaptiveMediaSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Streaming.Adaptive.AdaptiveMediaSource".toHandle(),refiid,interfacePtr)
      val result =
          IAdaptiveMediaSourceStatics.ABI.makeIAdaptiveMediaSourceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): AdaptiveMediaSource {
      val address = segment.toRawLongValue()
      return AdaptiveMediaSource(Pointer(address))
    }

    public override fun toNative(obj: AdaptiveMediaSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun IsContentTypeSupported(contentType: String) =
        ABI.IAdaptiveMediaSourceStatics_Instance.IsContentTypeSupported(contentType)

    public fun CreateFromUriAsync(uri: Uri) =
        ABI.IAdaptiveMediaSourceStatics_Instance.CreateFromUriAsync(uri)

    public fun CreateFromUriAsync(uri: Uri, httpClient: HttpClient) =
        ABI.IAdaptiveMediaSourceStatics_Instance.CreateFromUriAsync(uri, httpClient)

    public fun CreateFromStreamAsync(
      stream: IInputStream,
      uri: Uri,
      contentType: String
    ) = ABI.IAdaptiveMediaSourceStatics_Instance.CreateFromStreamAsync(stream, uri, contentType)

    public fun CreateFromStreamAsync(
      stream: IInputStream,
      uri: Uri,
      contentType: String,
      httpClient: HttpClient
    ) = ABI.IAdaptiveMediaSourceStatics_Instance.CreateFromStreamAsync(stream, uri, contentType,
        httpClient)
  }
}
