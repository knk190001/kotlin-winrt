package Windows.Media.Transcoding

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

@ABIMarker(MediaTranscoder.ABI::class)
@Signature("rc(Windows.Media.Transcoding.MediaTranscoder;{190c99d2-a0aa-4d34-86bc-eed1b12c2f5b})")
@WinRTByReference(brClass = MediaTranscoder.ByReference::class)
public class MediaTranscoder(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaTranscoder.WithDefault, IMediaTranscoder2.WithDefault, IWinRTObject {
  private val __1869644277_Interface: IMediaTranscoder.WithDefault by lazy {
    as_1869644277()
  }


  private val __2124397789_Interface: IMediaTranscoder2.WithDefault by lazy {
    as_2124397789()
  }


  public override val __1869644277_Ptr: JNAPointer? by lazy {
    __1869644277_Interface.__1869644277_Ptr
  }


  public override val __2124397789_Ptr: JNAPointer? by lazy {
    __2124397789_Interface.__2124397789_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1869644277_Interface, __2124397789_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1869644277(): IMediaTranscoder.WithDefault {
    if(pointer == NULL) {
      return(IMediaTranscoder.ABI.makeIMediaTranscoder(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaTranscoder>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaTranscoder.ABI.makeIMediaTranscoder(ref.value))
  }

  private fun as_2124397789(): IMediaTranscoder2.WithDefault {
    if(pointer == NULL) {
      return(IMediaTranscoder2.ABI.makeIMediaTranscoder2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaTranscoder2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaTranscoder2.ABI.makeIMediaTranscoder2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaTranscoder> {
    public override fun getValue() = MediaTranscoder(pointer.getPointer(0))

    public fun setValue(value: MediaTranscoder): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaTranscoder, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Transcoding.MediaTranscoder".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): MediaTranscoder {
      val address = segment.toRawLongValue()
      return MediaTranscoder(Pointer(address))
    }

    public override fun toNative(obj: MediaTranscoder): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
