package Windows.Media.Capture

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

@ABIMarker(LowLagPhotoSequenceCapture.ABI::class)
@Signature("rc(Windows.Media.Capture.LowLagPhotoSequenceCapture;{7cc346bb-b9a9-4c91-8ffa-287e9c668669})")
@WinRTByReference(brClass = LowLagPhotoSequenceCapture.ByReference::class)
public class LowLagPhotoSequenceCapture(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILowLagPhotoSequenceCapture.WithDefault, IWinRTObject {
  private val __1330200503_Interface: ILowLagPhotoSequenceCapture.WithDefault by lazy {
    as_1330200503()
  }


  public override val __1330200503_Ptr: JNAPointer? by lazy {
    __1330200503_Interface.__1330200503_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1330200503_Interface)

  private fun as_1330200503(): ILowLagPhotoSequenceCapture.WithDefault {
    if(pointer == NULL) {
      return(ILowLagPhotoSequenceCapture.ABI.makeILowLagPhotoSequenceCapture(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILowLagPhotoSequenceCapture>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILowLagPhotoSequenceCapture.ABI.makeILowLagPhotoSequenceCapture(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LowLagPhotoSequenceCapture> {
    public override fun getValue() = LowLagPhotoSequenceCapture(pointer.getPointer(0))

    public fun setValue(value: LowLagPhotoSequenceCapture): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LowLagPhotoSequenceCapture, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LowLagPhotoSequenceCapture {
      val address = segment.toRawLongValue()
      return LowLagPhotoSequenceCapture(Pointer(address))
    }

    public override fun toNative(obj: LowLagPhotoSequenceCapture): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
