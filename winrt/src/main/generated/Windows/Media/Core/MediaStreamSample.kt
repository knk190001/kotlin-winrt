package Windows.Media.Core

import Windows.Foundation.TimeSpan
import Windows.Graphics.DirectX.Direct3D11.IDirect3DSurface
import Windows.Storage.Streams.IBuffer
import Windows.Storage.Streams.IInputStream
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(MediaStreamSample.ABI::class)
@Signature("rc(Windows.Media.Core.MediaStreamSample;{5c8db627-4b80-4361-9837-6cb7481ad9d6})")
@WinRTByReference(brClass = MediaStreamSample.ByReference::class)
public class MediaStreamSample(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaStreamSample.WithDefault, IMediaStreamSample2.WithDefault, IWinRTObject
    {
  private val __2131438873_Interface: IMediaStreamSample.WithDefault by lazy {
    as_2131438873()
  }


  private val __1650095673_Interface: IMediaStreamSample2.WithDefault by lazy {
    as_1650095673()
  }


  public override val __2131438873_Ptr: JNAPointer? by lazy {
    __2131438873_Interface.__2131438873_Ptr
  }


  public override val __1650095673_Ptr: JNAPointer? by lazy {
    __1650095673_Interface.__1650095673_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2131438873_Interface, __1650095673_Interface)

  private fun as_2131438873(): IMediaStreamSample.WithDefault {
    if(pointer == NULL) {
      return(IMediaStreamSample.ABI.makeIMediaStreamSample(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaStreamSample>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaStreamSample.ABI.makeIMediaStreamSample(ref.value))
  }

  private fun as_1650095673(): IMediaStreamSample2.WithDefault {
    if(pointer == NULL) {
      return(IMediaStreamSample2.ABI.makeIMediaStreamSample2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaStreamSample2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaStreamSample2.ABI.makeIMediaStreamSample2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaStreamSample> {
    public override fun getValue() = MediaStreamSample(pointer.getPointer(0))

    public fun setValue(value: MediaStreamSample): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaStreamSample, MemoryAddress> {
    public val IMediaStreamSampleStatics_Instance: IMediaStreamSampleStatics by lazy {
      createIMediaStreamSampleStatics()
    }


    public val IMediaStreamSampleStatics2_Instance: IMediaStreamSampleStatics2 by lazy {
      createIMediaStreamSampleStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIMediaStreamSampleStatics(): IMediaStreamSampleStatics {
      val refiid = Guid.REFIID(IMediaStreamSampleStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Core.MediaStreamSample".toHandle(),refiid,interfacePtr)
      val result = IMediaStreamSampleStatics.ABI.makeIMediaStreamSampleStatics(interfacePtr.value)
      return result
    }

    public fun createIMediaStreamSampleStatics2(): IMediaStreamSampleStatics2 {
      val refiid = Guid.REFIID(IMediaStreamSampleStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Core.MediaStreamSample".toHandle(),refiid,interfacePtr)
      val result = IMediaStreamSampleStatics2.ABI.makeIMediaStreamSampleStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): MediaStreamSample {
      val address = segment.toRawLongValue()
      return MediaStreamSample(Pointer(address))
    }

    public override fun toNative(obj: MediaStreamSample): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromBuffer(buffer: IBuffer, timestamp: TimeSpan) =
        ABI.IMediaStreamSampleStatics_Instance.CreateFromBuffer(buffer, timestamp)

    public fun CreateFromStreamAsync(
      stream: IInputStream,
      count: WinDef.UINT,
      timestamp: TimeSpan
    ) = ABI.IMediaStreamSampleStatics_Instance.CreateFromStreamAsync(stream, count, timestamp)

    public fun CreateFromDirect3D11Surface(surface: IDirect3DSurface, timestamp: TimeSpan) =
        ABI.IMediaStreamSampleStatics2_Instance.CreateFromDirect3D11Surface(surface, timestamp)
  }
}
