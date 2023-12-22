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

@ABIMarker(PhotoCapturedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Capture.PhotoCapturedEventArgs;{373bfbc1-984e-4ff0-bf85-1c00aabc5a45})")
@WinRTByReference(brClass = PhotoCapturedEventArgs.ByReference::class)
public class PhotoCapturedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhotoCapturedEventArgs.WithDefault, IWinRTObject {
  private val __61632543_Interface: IPhotoCapturedEventArgs.WithDefault by lazy {
    as_61632543()
  }


  public override val __61632543_Ptr: JNAPointer? by lazy {
    __61632543_Interface.__61632543_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__61632543_Interface)

  private fun as_61632543(): IPhotoCapturedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPhotoCapturedEventArgs.ABI.makeIPhotoCapturedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhotoCapturedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhotoCapturedEventArgs.ABI.makeIPhotoCapturedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhotoCapturedEventArgs> {
    public override fun getValue() = PhotoCapturedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PhotoCapturedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhotoCapturedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhotoCapturedEventArgs {
      val address = segment.toRawLongValue()
      return PhotoCapturedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PhotoCapturedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
