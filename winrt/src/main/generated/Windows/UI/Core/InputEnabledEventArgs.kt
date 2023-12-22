package Windows.UI.Core

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

@ABIMarker(InputEnabledEventArgs.ABI::class)
@Signature("rc(Windows.UI.Core.InputEnabledEventArgs;{80371d4f-2fd8-4c24-aa86-3163a87b4e5a})")
@WinRTByReference(brClass = InputEnabledEventArgs.ByReference::class)
public class InputEnabledEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInputEnabledEventArgs.WithDefault, ICoreWindowEventArgs.WithDefault,
    IWinRTObject {
  private val __750448827_Interface: IInputEnabledEventArgs.WithDefault by lazy {
    as_750448827()
  }


  private val __407060269_Interface: ICoreWindowEventArgs.WithDefault by lazy {
    as_407060269()
  }


  public override val __750448827_Ptr: JNAPointer? by lazy {
    __750448827_Interface.__750448827_Ptr
  }


  public override val __407060269_Ptr: JNAPointer? by lazy {
    __407060269_Interface.__407060269_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__750448827_Interface, __407060269_Interface)

  private fun as_750448827(): IInputEnabledEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IInputEnabledEventArgs.ABI.makeIInputEnabledEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputEnabledEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputEnabledEventArgs.ABI.makeIInputEnabledEventArgs(ref.value))
  }

  private fun as_407060269(): ICoreWindowEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWindowEventArgs.ABI.makeICoreWindowEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWindowEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWindowEventArgs.ABI.makeICoreWindowEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InputEnabledEventArgs> {
    public override fun getValue() = InputEnabledEventArgs(pointer.getPointer(0))

    public fun setValue(value: InputEnabledEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InputEnabledEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): InputEnabledEventArgs {
      val address = segment.toRawLongValue()
      return InputEnabledEventArgs(Pointer(address))
    }

    public override fun toNative(obj: InputEnabledEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
