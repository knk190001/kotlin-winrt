package Windows.Media.Protection

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

@ABIMarker(MediaProtectionServiceCompletion.ABI::class)
@Signature("rc(Windows.Media.Protection.MediaProtectionServiceCompletion;{8b5cca18-cfd5-44ee-a2ed-df76010c14b5})")
@WinRTByReference(brClass = MediaProtectionServiceCompletion.ByReference::class)
public class MediaProtectionServiceCompletion(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaProtectionServiceCompletion.WithDefault, IWinRTObject {
  private val __587153071_Interface: IMediaProtectionServiceCompletion.WithDefault by lazy {
    as_587153071()
  }


  public override val __587153071_Ptr: JNAPointer? by lazy {
    __587153071_Interface.__587153071_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__587153071_Interface)

  private fun as_587153071(): IMediaProtectionServiceCompletion.WithDefault {
    if(pointer == NULL) {
      return(IMediaProtectionServiceCompletion.ABI.makeIMediaProtectionServiceCompletion(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaProtectionServiceCompletion>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaProtectionServiceCompletion.ABI.makeIMediaProtectionServiceCompletion(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaProtectionServiceCompletion> {
    public override fun getValue() = MediaProtectionServiceCompletion(pointer.getPointer(0))

    public fun setValue(value: MediaProtectionServiceCompletion): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaProtectionServiceCompletion, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaProtectionServiceCompletion {
      val address = segment.toRawLongValue()
      return MediaProtectionServiceCompletion(Pointer(address))
    }

    public override fun toNative(obj: MediaProtectionServiceCompletion): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
