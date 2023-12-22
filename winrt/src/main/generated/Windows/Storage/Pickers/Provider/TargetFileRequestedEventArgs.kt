package Windows.Storage.Pickers.Provider

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

@ABIMarker(TargetFileRequestedEventArgs.ABI::class)
@Signature("rc(Windows.Storage.Pickers.Provider.TargetFileRequestedEventArgs;{b163dbc1-1b51-4c89-a591-0fd40b3c57c9})")
@WinRTByReference(brClass = TargetFileRequestedEventArgs.ByReference::class)
public class TargetFileRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITargetFileRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1300848761_Interface: ITargetFileRequestedEventArgs.WithDefault by lazy {
    as_1300848761()
  }


  public override val __1300848761_Ptr: JNAPointer? by lazy {
    __1300848761_Interface.__1300848761_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1300848761_Interface)

  private fun as_1300848761(): ITargetFileRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITargetFileRequestedEventArgs.ABI.makeITargetFileRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITargetFileRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITargetFileRequestedEventArgs.ABI.makeITargetFileRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<TargetFileRequestedEventArgs> {
    public override fun getValue() = TargetFileRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: TargetFileRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TargetFileRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TargetFileRequestedEventArgs {
      val address = segment.toRawLongValue()
      return TargetFileRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TargetFileRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
