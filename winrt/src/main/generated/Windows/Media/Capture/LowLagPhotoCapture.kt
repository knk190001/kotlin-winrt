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

@ABIMarker(LowLagPhotoCapture.ABI::class)
@Signature("rc(Windows.Media.Capture.LowLagPhotoCapture;{a37251b7-6b44-473d-8f24-f703d6c0ec44})")
@WinRTByReference(brClass = LowLagPhotoCapture.ByReference::class)
public class LowLagPhotoCapture(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ILowLagPhotoCapture.WithDefault, IWinRTObject {
  private val __1390800714_Interface: ILowLagPhotoCapture.WithDefault by lazy {
    as_1390800714()
  }


  public override val __1390800714_Ptr: JNAPointer? by lazy {
    __1390800714_Interface.__1390800714_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1390800714_Interface)

  private fun as_1390800714(): ILowLagPhotoCapture.WithDefault {
    if(pointer == NULL) {
      return(ILowLagPhotoCapture.ABI.makeILowLagPhotoCapture(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ILowLagPhotoCapture>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ILowLagPhotoCapture.ABI.makeILowLagPhotoCapture(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<LowLagPhotoCapture> {
    public override fun getValue() = LowLagPhotoCapture(pointer.getPointer(0))

    public fun setValue(value: LowLagPhotoCapture): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<LowLagPhotoCapture, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): LowLagPhotoCapture {
      val address = segment.toRawLongValue()
      return LowLagPhotoCapture(Pointer(address))
    }

    public override fun toNative(obj: LowLagPhotoCapture): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
