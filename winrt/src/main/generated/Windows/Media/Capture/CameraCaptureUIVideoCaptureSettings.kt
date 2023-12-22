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

@ABIMarker(CameraCaptureUIVideoCaptureSettings.ABI::class)
@Signature("rc(Windows.Media.Capture.CameraCaptureUIVideoCaptureSettings;{64e92d1f-a28d-425a-b84f-e568335ff24e})")
@WinRTByReference(brClass = CameraCaptureUIVideoCaptureSettings.ByReference::class)
public class CameraCaptureUIVideoCaptureSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICameraCaptureUIVideoCaptureSettings.WithDefault, IWinRTObject {
  private val __113032437_Interface: ICameraCaptureUIVideoCaptureSettings.WithDefault by lazy {
    as_113032437()
  }


  public override val __113032437_Ptr: JNAPointer? by lazy {
    __113032437_Interface.__113032437_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__113032437_Interface)

  private fun as_113032437(): ICameraCaptureUIVideoCaptureSettings.WithDefault {
    if(pointer == NULL) {
      return(ICameraCaptureUIVideoCaptureSettings.ABI.makeICameraCaptureUIVideoCaptureSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICameraCaptureUIVideoCaptureSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICameraCaptureUIVideoCaptureSettings.ABI.makeICameraCaptureUIVideoCaptureSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CameraCaptureUIVideoCaptureSettings> {
    public override fun getValue() = CameraCaptureUIVideoCaptureSettings(pointer.getPointer(0))

    public fun setValue(value: CameraCaptureUIVideoCaptureSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CameraCaptureUIVideoCaptureSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CameraCaptureUIVideoCaptureSettings {
      val address = segment.toRawLongValue()
      return CameraCaptureUIVideoCaptureSettings(Pointer(address))
    }

    public override fun toNative(obj: CameraCaptureUIVideoCaptureSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
