package Microsoft.UI.Xaml

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

@ABIMarker(DataContextChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.DataContextChangedEventArgs;{a1be80f4-cf83-5022-b113-9233f1d4fafa})")
@WinRTByReference(brClass = DataContextChangedEventArgs.ByReference::class)
public class DataContextChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDataContextChangedEventArgs.WithDefault, IWinRTObject {
  private val __704961121_Interface: IDataContextChangedEventArgs.WithDefault by lazy {
    as_704961121()
  }


  public override val __704961121_Ptr: JNAPointer? by lazy {
    __704961121_Interface.__704961121_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__704961121_Interface)

  private fun as_704961121(): IDataContextChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDataContextChangedEventArgs.ABI.makeIDataContextChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDataContextChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDataContextChangedEventArgs.ABI.makeIDataContextChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DataContextChangedEventArgs> {
    public override fun getValue() = DataContextChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: DataContextChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DataContextChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): DataContextChangedEventArgs {
      val address = segment.toRawLongValue()
      return DataContextChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DataContextChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
