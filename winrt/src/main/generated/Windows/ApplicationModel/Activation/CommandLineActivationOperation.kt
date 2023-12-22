package Windows.ApplicationModel.Activation

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

@ABIMarker(CommandLineActivationOperation.ABI::class)
@Signature("rc(Windows.ApplicationModel.Activation.CommandLineActivationOperation;{994b2841-c59e-4f69-bcfd-b61ed4e622eb})")
@WinRTByReference(brClass = CommandLineActivationOperation.ByReference::class)
public class CommandLineActivationOperation(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICommandLineActivationOperation.WithDefault, IWinRTObject {
  private val __2032849445_Interface: ICommandLineActivationOperation.WithDefault by lazy {
    as_2032849445()
  }


  public override val __2032849445_Ptr: JNAPointer? by lazy {
    __2032849445_Interface.__2032849445_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2032849445_Interface)

  private fun as_2032849445(): ICommandLineActivationOperation.WithDefault {
    if(pointer == NULL) {
      return(ICommandLineActivationOperation.ABI.makeICommandLineActivationOperation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommandLineActivationOperation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommandLineActivationOperation.ABI.makeICommandLineActivationOperation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CommandLineActivationOperation> {
    public override fun getValue() = CommandLineActivationOperation(pointer.getPointer(0))

    public fun setValue(value: CommandLineActivationOperation): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CommandLineActivationOperation, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CommandLineActivationOperation {
      val address = segment.toRawLongValue()
      return CommandLineActivationOperation(Pointer(address))
    }

    public override fun toNative(obj: CommandLineActivationOperation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
