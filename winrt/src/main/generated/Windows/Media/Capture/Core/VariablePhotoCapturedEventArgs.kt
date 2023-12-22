package Windows.Media.Capture.Core

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

@ABIMarker(VariablePhotoCapturedEventArgs.ABI::class)
@Signature("rc(Windows.Media.Capture.Core.VariablePhotoCapturedEventArgs;{d1eb4c5c-1b53-4e4a-8b5c-db7887ac949b})")
@WinRTByReference(brClass = VariablePhotoCapturedEventArgs.ByReference::class)
public class VariablePhotoCapturedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVariablePhotoCapturedEventArgs.WithDefault, IWinRTObject {
  private val __1806915120_Interface: IVariablePhotoCapturedEventArgs.WithDefault by lazy {
    as_1806915120()
  }


  public override val __1806915120_Ptr: JNAPointer? by lazy {
    __1806915120_Interface.__1806915120_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1806915120_Interface)

  private fun as_1806915120(): IVariablePhotoCapturedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IVariablePhotoCapturedEventArgs.ABI.makeIVariablePhotoCapturedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVariablePhotoCapturedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVariablePhotoCapturedEventArgs.ABI.makeIVariablePhotoCapturedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<VariablePhotoCapturedEventArgs> {
    public override fun getValue() = VariablePhotoCapturedEventArgs(pointer.getPointer(0))

    public fun setValue(value: VariablePhotoCapturedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VariablePhotoCapturedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VariablePhotoCapturedEventArgs {
      val address = segment.toRawLongValue()
      return VariablePhotoCapturedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: VariablePhotoCapturedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
