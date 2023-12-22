package Windows.Media

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

@ABIMarker(MediaProcessingTriggerDetails.ABI::class)
@Signature("rc(Windows.Media.MediaProcessingTriggerDetails;{eb8564ac-a351-4f4e-b4f0-9bf2408993db})")
@WinRTByReference(brClass = MediaProcessingTriggerDetails.ByReference::class)
public class MediaProcessingTriggerDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMediaProcessingTriggerDetails.WithDefault, IWinRTObject {
  private val __976113071_Interface: IMediaProcessingTriggerDetails.WithDefault by lazy {
    as_976113071()
  }


  public override val __976113071_Ptr: JNAPointer? by lazy {
    __976113071_Interface.__976113071_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__976113071_Interface)

  private fun as_976113071(): IMediaProcessingTriggerDetails.WithDefault {
    if(pointer == NULL) {
      return(IMediaProcessingTriggerDetails.ABI.makeIMediaProcessingTriggerDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMediaProcessingTriggerDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMediaProcessingTriggerDetails.ABI.makeIMediaProcessingTriggerDetails(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MediaProcessingTriggerDetails> {
    public override fun getValue() = MediaProcessingTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: MediaProcessingTriggerDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MediaProcessingTriggerDetails, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MediaProcessingTriggerDetails {
      val address = segment.toRawLongValue()
      return MediaProcessingTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: MediaProcessingTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
