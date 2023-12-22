package Windows.ApplicationModel.ExtendedExecution

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

@ABIMarker(ExtendedExecutionRevokedEventArgs.ABI::class)
@Signature("rc(Windows.ApplicationModel.ExtendedExecution.ExtendedExecutionRevokedEventArgs;{bfbc9f16-63b5-4c0b-aad6-828af5373ec3})")
@WinRTByReference(brClass = ExtendedExecutionRevokedEventArgs.ByReference::class)
public class ExtendedExecutionRevokedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IExtendedExecutionRevokedEventArgs.WithDefault, IWinRTObject {
  private val __1387627364_Interface: IExtendedExecutionRevokedEventArgs.WithDefault by lazy {
    as_1387627364()
  }


  public override val __1387627364_Ptr: JNAPointer? by lazy {
    __1387627364_Interface.__1387627364_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1387627364_Interface)

  private fun as_1387627364(): IExtendedExecutionRevokedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IExtendedExecutionRevokedEventArgs.ABI.makeIExtendedExecutionRevokedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExtendedExecutionRevokedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExtendedExecutionRevokedEventArgs.ABI.makeIExtendedExecutionRevokedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ExtendedExecutionRevokedEventArgs> {
    public override fun getValue() = ExtendedExecutionRevokedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ExtendedExecutionRevokedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ExtendedExecutionRevokedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ExtendedExecutionRevokedEventArgs {
      val address = segment.toRawLongValue()
      return ExtendedExecutionRevokedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ExtendedExecutionRevokedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
