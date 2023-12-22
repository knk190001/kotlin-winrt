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

@ABIMarker(PhotoConfirmationCapturedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Capture.PhotoConfirmationCapturedEventArgs;{ab473672-c28a-4827-8f8d-3636d3beb51e})")
@WinRTByReference(brClass = PhotoConfirmationCapturedEventArgs.ByReference::class)
public class PhotoConfirmationCapturedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhotoConfirmationCapturedEventArgs.WithDefault, IWinRTObject {
  private val __1260583786_Interface: IPhotoConfirmationCapturedEventArgs.WithDefault by lazy {
    as_1260583786()
  }


  public override val __1260583786_Ptr: JNAPointer? by lazy {
    __1260583786_Interface.__1260583786_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1260583786_Interface)

  private fun as_1260583786(): IPhotoConfirmationCapturedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPhotoConfirmationCapturedEventArgs.ABI.makeIPhotoConfirmationCapturedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhotoConfirmationCapturedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhotoConfirmationCapturedEventArgs.ABI.makeIPhotoConfirmationCapturedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhotoConfirmationCapturedEventArgs> {
    public override fun getValue() = PhotoConfirmationCapturedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PhotoConfirmationCapturedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhotoConfirmationCapturedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhotoConfirmationCapturedEventArgs {
      val address = segment.toRawLongValue()
      return PhotoConfirmationCapturedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PhotoConfirmationCapturedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
