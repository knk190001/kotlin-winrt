package Windows.Media.Core

import Windows.Foundation.Uri
import Windows.Storage.Streams.IRandomAccessStream
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

@ABIMarker(TimedTextSource.ABI::class)
@Signature("rc(Windows.Media.Core.TimedTextSource;{c4ed9ba6-101f-404d-a949-82f33fcd93b7})")
@WinRTByReference(brClass = TimedTextSource.ByReference::class)
public class TimedTextSource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITimedTextSource.WithDefault, IWinRTObject {
  private val __484168394_Interface: ITimedTextSource.WithDefault by lazy {
    as_484168394()
  }


  public override val __484168394_Ptr: JNAPointer? by lazy {
    __484168394_Interface.__484168394_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__484168394_Interface)

  private fun as_484168394(): ITimedTextSource.WithDefault {
    if(pointer == NULL) {
      return(ITimedTextSource.ABI.makeITimedTextSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITimedTextSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITimedTextSource.ABI.makeITimedTextSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TimedTextSource> {
    public override fun getValue() = TimedTextSource(pointer.getPointer(0))

    public fun setValue(value: TimedTextSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TimedTextSource, MemoryAddress> {
    public val ITimedTextSourceStatics2_Instance: ITimedTextSourceStatics2 by lazy {
      createITimedTextSourceStatics2()
    }


    public val ITimedTextSourceStatics_Instance: ITimedTextSourceStatics by lazy {
      createITimedTextSourceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createITimedTextSourceStatics2(): ITimedTextSourceStatics2 {
      val refiid = Guid.REFIID(ITimedTextSourceStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Core.TimedTextSource".toHandle(),refiid,interfacePtr)
      val result = ITimedTextSourceStatics2.ABI.makeITimedTextSourceStatics2(interfacePtr.value)
      return result
    }

    public fun createITimedTextSourceStatics(): ITimedTextSourceStatics {
      val refiid = Guid.REFIID(ITimedTextSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Core.TimedTextSource".toHandle(),refiid,interfacePtr)
      val result = ITimedTextSourceStatics.ABI.makeITimedTextSourceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): TimedTextSource {
      val address = segment.toRawLongValue()
      return TimedTextSource(Pointer(address))
    }

    public override fun toNative(obj: TimedTextSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromStreamWithIndex(stream: IRandomAccessStream,
        indexStream: IRandomAccessStream) =
        ABI.ITimedTextSourceStatics2_Instance.CreateFromStreamWithIndex(stream, indexStream)

    public fun CreateFromUriWithIndex(uri: Uri, indexUri: Uri) =
        ABI.ITimedTextSourceStatics2_Instance.CreateFromUriWithIndex(uri, indexUri)

    public fun CreateFromStreamWithIndex(
      stream: IRandomAccessStream,
      indexStream: IRandomAccessStream,
      defaultLanguage: String
    ) = ABI.ITimedTextSourceStatics2_Instance.CreateFromStreamWithIndex(stream, indexStream,
        defaultLanguage)

    public fun CreateFromUriWithIndex(
      uri: Uri,
      indexUri: Uri,
      defaultLanguage: String
    ) = ABI.ITimedTextSourceStatics2_Instance.CreateFromUriWithIndex(uri, indexUri, defaultLanguage)

    public fun CreateFromStream(stream: IRandomAccessStream) =
        ABI.ITimedTextSourceStatics_Instance.CreateFromStream(stream)

    public fun CreateFromUri(uri: Uri) = ABI.ITimedTextSourceStatics_Instance.CreateFromUri(uri)

    public fun CreateFromStream(stream: IRandomAccessStream, defaultLanguage: String) =
        ABI.ITimedTextSourceStatics_Instance.CreateFromStream(stream, defaultLanguage)

    public fun CreateFromUri(uri: Uri, defaultLanguage: String) =
        ABI.ITimedTextSourceStatics_Instance.CreateFromUri(uri, defaultLanguage)
  }
}
