package Windows.Media.Transcoding

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

@ABIMarker(PrepareTranscodeResult.ABI::class)
@Signature("rc(Windows.Media.Transcoding.PrepareTranscodeResult;{05f25dce-994f-4a34-9d68-97ccce1730d6})")
@WinRTByReference(brClass = PrepareTranscodeResult.ByReference::class)
public class PrepareTranscodeResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrepareTranscodeResult.WithDefault, IWinRTObject {
  private val __1706553879_Interface: IPrepareTranscodeResult.WithDefault by lazy {
    as_1706553879()
  }


  public override val __1706553879_Ptr: JNAPointer? by lazy {
    __1706553879_Interface.__1706553879_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1706553879_Interface)

  private fun as_1706553879(): IPrepareTranscodeResult.WithDefault {
    if(pointer == NULL) {
      return(IPrepareTranscodeResult.ABI.makeIPrepareTranscodeResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrepareTranscodeResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrepareTranscodeResult.ABI.makeIPrepareTranscodeResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrepareTranscodeResult> {
    public override fun getValue() = PrepareTranscodeResult(pointer.getPointer(0))

    public fun setValue(value: PrepareTranscodeResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrepareTranscodeResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrepareTranscodeResult {
      val address = segment.toRawLongValue()
      return PrepareTranscodeResult(Pointer(address))
    }

    public override fun toNative(obj: PrepareTranscodeResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
