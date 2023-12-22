package Windows.Media.Import

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

@ABIMarker(PhotoImportSelectionChangedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Import.PhotoImportSelectionChangedEventArgs;{10461782-fa9d-4c30-8bc9-4d64911572d5})")
@WinRTByReference(brClass = PhotoImportSelectionChangedEventArgs.ByReference::class)
public class PhotoImportSelectionChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhotoImportSelectionChangedEventArgs.WithDefault, IWinRTObject {
  private val __1410954105_Interface: IPhotoImportSelectionChangedEventArgs.WithDefault by lazy {
    as_1410954105()
  }


  public override val __1410954105_Ptr: JNAPointer? by lazy {
    __1410954105_Interface.__1410954105_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1410954105_Interface)

  private fun as_1410954105(): IPhotoImportSelectionChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPhotoImportSelectionChangedEventArgs.ABI.makeIPhotoImportSelectionChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhotoImportSelectionChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhotoImportSelectionChangedEventArgs.ABI.makeIPhotoImportSelectionChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhotoImportSelectionChangedEventArgs> {
    public override fun getValue() = PhotoImportSelectionChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PhotoImportSelectionChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhotoImportSelectionChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhotoImportSelectionChangedEventArgs {
      val address = segment.toRawLongValue()
      return PhotoImportSelectionChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PhotoImportSelectionChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
