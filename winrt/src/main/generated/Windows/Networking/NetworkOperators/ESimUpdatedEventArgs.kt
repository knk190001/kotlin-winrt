package Windows.Networking.NetworkOperators

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

@ABIMarker(ESimUpdatedEventArgs.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.ESimUpdatedEventArgs;{4c125cec-508d-4b88-83cb-68bef8168d12})")
@WinRTByReference(brClass = ESimUpdatedEventArgs.ByReference::class)
public class ESimUpdatedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IESimUpdatedEventArgs.WithDefault, IWinRTObject {
  private val __556713447_Interface: IESimUpdatedEventArgs.WithDefault by lazy {
    as_556713447()
  }


  public override val __556713447_Ptr: JNAPointer? by lazy {
    __556713447_Interface.__556713447_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__556713447_Interface)

  private fun as_556713447(): IESimUpdatedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IESimUpdatedEventArgs.ABI.makeIESimUpdatedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IESimUpdatedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IESimUpdatedEventArgs.ABI.makeIESimUpdatedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ESimUpdatedEventArgs> {
    public override fun getValue() = ESimUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ESimUpdatedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ESimUpdatedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ESimUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return ESimUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ESimUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
