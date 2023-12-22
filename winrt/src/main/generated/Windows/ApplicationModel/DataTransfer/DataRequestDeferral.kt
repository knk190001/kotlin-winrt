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

@ABIMarker(DataRequestDeferral.ABI::class)
@Signature("rc(Windows.ApplicationModel.DataTransfer.DataRequestDeferral;{6dc4b89f-0386-4263-87c1-ed7dce30890e})")
@WinRTByReference(brClass = DataRequestDeferral.ByReference::class)
public class DataRequestDeferral(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDataRequestDeferral.WithDefault, IWinRTObject {
  private val __1638612730_Interface: IDataRequestDeferral.WithDefault by lazy {
    as_1638612730()
  }


  public override val __1638612730_Ptr: JNAPointer? by lazy {
    __1638612730_Interface.__1638612730_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1638612730_Interface)

  private fun as_1638612730(): IDataRequestDeferral.WithDefault {
    if(pointer == NULL) {
      return(IDataRequestDeferral.ABI.makeIDataRequestDeferral(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataRequestDeferral>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataRequestDeferral.ABI.makeIDataRequestDeferral(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DataRequestDeferral> {
    public override fun getValue() = DataRequestDeferral(pointer.getPointer(0))

    public fun setValue(value: DataRequestDeferral): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DataRequestDeferral, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DataRequestDeferral {
      val address = segment.toRawLongValue()
      return DataRequestDeferral(Pointer(address))
    }

    public override fun toNative(obj: DataRequestDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
