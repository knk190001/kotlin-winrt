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

@ABIMarker(ESimRemovedEventArgs.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.ESimRemovedEventArgs;{dec5277b-2fd9-4ed9-8376-d9b5e41278a3})")
@WinRTByReference(brClass = ESimRemovedEventArgs.ByReference::class)
public class ESimRemovedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IESimRemovedEventArgs.WithDefault, IWinRTObject {
  private val __1419421726_Interface: IESimRemovedEventArgs.WithDefault by lazy {
    as_1419421726()
  }


  public override val __1419421726_Ptr: JNAPointer? by lazy {
    __1419421726_Interface.__1419421726_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1419421726_Interface)

  private fun as_1419421726(): IESimRemovedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IESimRemovedEventArgs.ABI.makeIESimRemovedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IESimRemovedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IESimRemovedEventArgs.ABI.makeIESimRemovedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ESimRemovedEventArgs> {
    public override fun getValue() = ESimRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ESimRemovedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ESimRemovedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ESimRemovedEventArgs {
      val address = segment.toRawLongValue()
      return ESimRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ESimRemovedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
