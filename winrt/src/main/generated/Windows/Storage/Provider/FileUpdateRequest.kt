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

@ABIMarker(FileUpdateRequest.ABI::class)
@Signature("rc(Windows.Storage.Provider.FileUpdateRequest;{40c82536-c1fe-4d93-a792-1e736bc70837})")
@WinRTByReference(brClass = FileUpdateRequest.ByReference::class)
public class FileUpdateRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IFileUpdateRequest.WithDefault, IFileUpdateRequest2.WithDefault, IWinRTObject
    {
  private val __1220412112_Interface: IFileUpdateRequest.WithDefault by lazy {
    as_1220412112()
  }


  private val __821930142_Interface: IFileUpdateRequest2.WithDefault by lazy {
    as_821930142()
  }


  public override val __1220412112_Ptr: JNAPointer? by lazy {
    __1220412112_Interface.__1220412112_Ptr
  }


  public override val __821930142_Ptr: JNAPointer? by lazy {
    __821930142_Interface.__821930142_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1220412112_Interface, __821930142_Interface)

  private fun as_1220412112(): IFileUpdateRequest.WithDefault {
    if(pointer == NULL) {
      return(IFileUpdateRequest.ABI.makeIFileUpdateRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileUpdateRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileUpdateRequest.ABI.makeIFileUpdateRequest(ref.value))
  }

  private fun as_821930142(): IFileUpdateRequest2.WithDefault {
    if(pointer == NULL) {
      return(IFileUpdateRequest2.ABI.makeIFileUpdateRequest2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IFileUpdateRequest2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IFileUpdateRequest2.ABI.makeIFileUpdateRequest2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<FileUpdateRequest> {
    public override fun getValue() = FileUpdateRequest(pointer.getPointer(0))

    public fun setValue(value: FileUpdateRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<FileUpdateRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): FileUpdateRequest {
      val address = segment.toRawLongValue()
      return FileUpdateRequest(Pointer(address))
    }

    public override fun toNative(obj: FileUpdateRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
