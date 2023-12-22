package Windows.Media.Devices

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

@ABIMarker(PhotoConfirmationControl.ABI::class)
@Signature("rc(Windows.Media.Devices.PhotoConfirmationControl;{c8f3f363-ff5e-4582-a9a8-0550f85a4a76})")
@WinRTByReference(brClass = PhotoConfirmationControl.ByReference::class)
public class PhotoConfirmationControl(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhotoConfirmationControl.WithDefault, IWinRTObject {
  private val __60554761_Interface: IPhotoConfirmationControl.WithDefault by lazy {
    as_60554761()
  }


  public override val __60554761_Ptr: JNAPointer? by lazy {
    __60554761_Interface.__60554761_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__60554761_Interface)

  private fun as_60554761(): IPhotoConfirmationControl.WithDefault {
    if(pointer == NULL) {
      return(IPhotoConfirmationControl.ABI.makeIPhotoConfirmationControl(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhotoConfirmationControl>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhotoConfirmationControl.ABI.makeIPhotoConfirmationControl(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhotoConfirmationControl> {
    public override fun getValue() = PhotoConfirmationControl(pointer.getPointer(0))

    public fun setValue(value: PhotoConfirmationControl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhotoConfirmationControl, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhotoConfirmationControl {
      val address = segment.toRawLongValue()
      return PhotoConfirmationControl(Pointer(address))
    }

    public override fun toNative(obj: PhotoConfirmationControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
