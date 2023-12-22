package Windows.Storage.Provider

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

@ABIMarker(FileUpdateRequestDeferral.ABI::class)
@Signature("rc(Windows.Storage.Provider.FileUpdateRequestDeferral;{ffcedb2b-8ade-44a5-bb00-164c4e72f13a})")
@WinRTByReference(brClass = FileUpdateRequestDeferral.ByReference::class)
public class FileUpdateRequestDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFileUpdateRequestDeferral.WithDefault, IWinRTObject {
  private val __709976485_Interface: IFileUpdateRequestDeferral.WithDefault by lazy {
    as_709976485()
  }


  public override val __709976485_Ptr: JNAPointer? by lazy {
    __709976485_Interface.__709976485_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__709976485_Interface)

  private fun as_709976485(): IFileUpdateRequestDeferral.WithDefault {
    if(pointer == NULL) {
      return(IFileUpdateRequestDeferral.ABI.makeIFileUpdateRequestDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileUpdateRequestDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileUpdateRequestDeferral.ABI.makeIFileUpdateRequestDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FileUpdateRequestDeferral> {
    public override fun getValue() = FileUpdateRequestDeferral(pointer.getPointer(0))

    public fun setValue(value: FileUpdateRequestDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FileUpdateRequestDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FileUpdateRequestDeferral {
      val address = segment.toRawLongValue()
      return FileUpdateRequestDeferral(Pointer(address))
    }

    public override fun toNative(obj: FileUpdateRequestDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
