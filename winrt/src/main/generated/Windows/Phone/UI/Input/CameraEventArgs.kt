package Windows.Phone.UI.Input

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

@ABIMarker(CameraEventArgs.ABI::class)
@Signature("rc(Windows.Phone.UI.Input.CameraEventArgs;{b4063bda-201f-473d-bc69-e9e4ac57c9d0})")
@WinRTByReference(brClass = CameraEventArgs.ByReference::class)
public class CameraEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICameraEventArgs.WithDefault, IWinRTObject {
  private val __1887035708_Interface: ICameraEventArgs.WithDefault by lazy {
    as_1887035708()
  }


  public override val __1887035708_Ptr: JNAPointer? by lazy {
    __1887035708_Interface.__1887035708_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1887035708_Interface)

  private fun as_1887035708(): ICameraEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICameraEventArgs.ABI.makeICameraEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICameraEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICameraEventArgs.ABI.makeICameraEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CameraEventArgs> {
    public override fun getValue() = CameraEventArgs(pointer.getPointer(0))

    public fun setValue(value: CameraEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CameraEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CameraEventArgs {
      val address = segment.toRawLongValue()
      return CameraEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CameraEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
