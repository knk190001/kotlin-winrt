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

@ABIMarker(PhotoImportItemImportedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Import.PhotoImportItemImportedEventArgs;{42cb2fdd-7d68-47b5-bc7c-ceb73e0c77dc})")
@WinRTByReference(brClass = PhotoImportItemImportedEventArgs.ByReference::class)
public class PhotoImportItemImportedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhotoImportItemImportedEventArgs.WithDefault, IWinRTObject {
  private val __905119304_Interface: IPhotoImportItemImportedEventArgs.WithDefault by lazy {
    as_905119304()
  }


  public override val __905119304_Ptr: JNAPointer? by lazy {
    __905119304_Interface.__905119304_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__905119304_Interface)

  private fun as_905119304(): IPhotoImportItemImportedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPhotoImportItemImportedEventArgs.ABI.makeIPhotoImportItemImportedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhotoImportItemImportedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhotoImportItemImportedEventArgs.ABI.makeIPhotoImportItemImportedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhotoImportItemImportedEventArgs> {
    public override fun getValue() = PhotoImportItemImportedEventArgs(pointer.getPointer(0))

    public fun setValue(value: PhotoImportItemImportedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhotoImportItemImportedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhotoImportItemImportedEventArgs {
      val address = segment.toRawLongValue()
      return PhotoImportItemImportedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PhotoImportItemImportedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
