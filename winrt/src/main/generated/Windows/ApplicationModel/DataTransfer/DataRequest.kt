package Windows.ApplicationModel.DataTransfer

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

@ABIMarker(DataRequest.ABI::class)
@Signature("rc(Windows.ApplicationModel.DataTransfer.DataRequest;{4341ae3b-fc12-4e53-8c02-ac714c415a27})")
@WinRTByReference(brClass = DataRequest.ByReference::class)
public class DataRequest(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDataRequest.WithDefault, IWinRTObject {
  private val __1643839611_Interface: IDataRequest.WithDefault by lazy {
    as_1643839611()
  }


  public override val __1643839611_Ptr: JNAPointer? by lazy {
    __1643839611_Interface.__1643839611_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1643839611_Interface)

  private fun as_1643839611(): IDataRequest.WithDefault {
    if(pointer == NULL) {
      return(IDataRequest.ABI.makeIDataRequest(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataRequest>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataRequest.ABI.makeIDataRequest(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<DataRequest> {
    public override fun getValue() = DataRequest(pointer.getPointer(0))

    public fun setValue(value: DataRequest): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DataRequest, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DataRequest {
      val address = segment.toRawLongValue()
      return DataRequest(Pointer(address))
    }

    public override fun toNative(obj: DataRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
