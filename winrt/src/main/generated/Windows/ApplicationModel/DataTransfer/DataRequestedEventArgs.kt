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

@ABIMarker(DataRequestedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.DataTransfer.DataRequestedEventArgs;{cb8ba807-6ac5-43c9-8ac5-9ba232163182})")
@WinRTByReference(brClass = DataRequestedEventArgs.ByReference::class)
public class DataRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDataRequestedEventArgs.WithDefault, IWinRTObject {
  private val __2041783645_Interface: IDataRequestedEventArgs.WithDefault by lazy {
    as_2041783645()
  }


  public override val __2041783645_Ptr: JNAPointer? by lazy {
    __2041783645_Interface.__2041783645_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2041783645_Interface)

  private fun as_2041783645(): IDataRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDataRequestedEventArgs.ABI.makeIDataRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataRequestedEventArgs.ABI.makeIDataRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DataRequestedEventArgs> {
    public override fun getValue() = DataRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DataRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DataRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DataRequestedEventArgs {
      val address = segment.toRawLongValue()
      return DataRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DataRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
