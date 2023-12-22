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

@ABIMarker(ESimAddedEventArgs.ABI::class)
@Signature("rc(Windows.Networking.NetworkOperators.ESimAddedEventArgs;{38bd0a58-4d5a-4d08-8da7-e73eff369ddd})")
@WinRTByReference(brClass = ESimAddedEventArgs.ByReference::class)
public class ESimAddedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IESimAddedEventArgs.WithDefault, IWinRTObject {
  private val __1922644482_Interface: IESimAddedEventArgs.WithDefault by lazy {
    as_1922644482()
  }


  public override val __1922644482_Ptr: JNAPointer? by lazy {
    __1922644482_Interface.__1922644482_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1922644482_Interface)

  private fun as_1922644482(): IESimAddedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IESimAddedEventArgs.ABI.makeIESimAddedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IESimAddedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IESimAddedEventArgs.ABI.makeIESimAddedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ESimAddedEventArgs> {
    public override fun getValue() = ESimAddedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ESimAddedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ESimAddedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ESimAddedEventArgs {
      val address = segment.toRawLongValue()
      return ESimAddedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ESimAddedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
