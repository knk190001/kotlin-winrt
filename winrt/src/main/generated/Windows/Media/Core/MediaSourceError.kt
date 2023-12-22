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

@ABIMarker(MediaSourceError.ABI::class)
@Signature("rc(Windows.Media.Core.MediaSourceError;{5c0a8965-37c5-4e9d-8d21-1cdee90cecc6})")
@WinRTByReference(brClass = MediaSourceError.ByReference::class)
public class MediaSourceError(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaSourceError.WithDefault, IWinRTObject {
  private val __1115160830_Interface: IMediaSourceError.WithDefault by lazy {
    as_1115160830()
  }


  public override val __1115160830_Ptr: JNAPointer? by lazy {
    __1115160830_Interface.__1115160830_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1115160830_Interface)

  private fun as_1115160830(): IMediaSourceError.WithDefault {
    if(pointer == NULL) {
      return(IMediaSourceError.ABI.makeIMediaSourceError(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaSourceError>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaSourceError.ABI.makeIMediaSourceError(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaSourceError> {
    public override fun getValue() = MediaSourceError(pointer.getPointer(0))

    public fun setValue(value: MediaSourceError): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaSourceError, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaSourceError {
      val address = segment.toRawLongValue()
      return MediaSourceError(Pointer(address))
    }

    public override fun toNative(obj: MediaSourceError): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
