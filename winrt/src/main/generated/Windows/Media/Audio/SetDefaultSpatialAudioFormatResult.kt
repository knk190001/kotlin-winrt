package Windows.Media.Audio

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

@ABIMarker(SetDefaultSpatialAudioFormatResult.ABI::class)
@Signature("rc(Windows.Media.Audio.SetDefaultSpatialAudioFormatResult;{1c2aa511-1400-5e70-9ea9-ae151241e8ea})")
@WinRTByReference(brClass = SetDefaultSpatialAudioFormatResult.ByReference::class)
public class SetDefaultSpatialAudioFormatResult(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISetDefaultSpatialAudioFormatResult.WithDefault, IWinRTObject {
  private val __685281171_Interface: ISetDefaultSpatialAudioFormatResult.WithDefault by lazy {
    as_685281171()
  }


  public override val __685281171_Ptr: JNAPointer? by lazy {
    __685281171_Interface.__685281171_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__685281171_Interface)

  private fun as_685281171(): ISetDefaultSpatialAudioFormatResult.WithDefault {
    if(pointer == NULL) {
      return(ISetDefaultSpatialAudioFormatResult.ABI.makeISetDefaultSpatialAudioFormatResult(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISetDefaultSpatialAudioFormatResult>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISetDefaultSpatialAudioFormatResult.ABI.makeISetDefaultSpatialAudioFormatResult(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SetDefaultSpatialAudioFormatResult> {
    public override fun getValue() = SetDefaultSpatialAudioFormatResult(pointer.getPointer(0))

    public fun setValue(value: SetDefaultSpatialAudioFormatResult): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SetDefaultSpatialAudioFormatResult, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SetDefaultSpatialAudioFormatResult {
      val address = segment.toRawLongValue()
      return SetDefaultSpatialAudioFormatResult(Pointer(address))
    }

    public override fun toNative(obj: SetDefaultSpatialAudioFormatResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
