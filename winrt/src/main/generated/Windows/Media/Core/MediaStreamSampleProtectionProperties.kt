package Windows.Media.Core

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

@ABIMarker(MediaStreamSampleProtectionProperties.ABI::class)
@Signature("rc(Windows.Media.Core.MediaStreamSampleProtectionProperties;{4eb88292-ecdf-493e-841d-dd4add7caca2})")
@WinRTByReference(brClass = MediaStreamSampleProtectionProperties.ByReference::class)
public class MediaStreamSampleProtectionProperties(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaStreamSampleProtectionProperties.WithDefault, IWinRTObject {
  private val __455253083_Interface: IMediaStreamSampleProtectionProperties.WithDefault by lazy {
    as_455253083()
  }


  public override val __455253083_Ptr: JNAPointer? by lazy {
    __455253083_Interface.__455253083_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__455253083_Interface)

  private fun as_455253083(): IMediaStreamSampleProtectionProperties.WithDefault {
    if(pointer == NULL) {
      return(IMediaStreamSampleProtectionProperties.ABI.makeIMediaStreamSampleProtectionProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaStreamSampleProtectionProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaStreamSampleProtectionProperties.ABI.makeIMediaStreamSampleProtectionProperties(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaStreamSampleProtectionProperties> {
    public override fun getValue() = MediaStreamSampleProtectionProperties(pointer.getPointer(0))

    public fun setValue(value: MediaStreamSampleProtectionProperties): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaStreamSampleProtectionProperties, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaStreamSampleProtectionProperties {
      val address = segment.toRawLongValue()
      return MediaStreamSampleProtectionProperties(Pointer(address))
    }

    public override fun toNative(obj: MediaStreamSampleProtectionProperties): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
