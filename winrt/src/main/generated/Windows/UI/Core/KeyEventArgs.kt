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

@ABIMarker(KeyEventArgs.ABI::class)
@Signature("rc(Windows.UI.Core.KeyEventArgs;{5ff5e930-2544-4a17-bd78-1f2fdebb106b})")
@WinRTByReference(brClass = KeyEventArgs.ByReference::class)
public class KeyEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IKeyEventArgs.WithDefault, ICoreWindowEventArgs.WithDefault,
    IKeyEventArgs2.WithDefault, IWinRTObject {
  private val __417885779_Interface: IKeyEventArgs.WithDefault by lazy {
    as_417885779()
  }


  private val __407060269_Interface: ICoreWindowEventArgs.WithDefault by lazy {
    as_407060269()
  }


  private val __69557311_Interface: IKeyEventArgs2.WithDefault by lazy {
    as_69557311()
  }


  public override val __417885779_Ptr: JNAPointer? by lazy {
    __417885779_Interface.__417885779_Ptr
  }


  public override val __407060269_Ptr: JNAPointer? by lazy {
    __407060269_Interface.__407060269_Ptr
  }


  public override val __69557311_Ptr: JNAPointer? by lazy {
    __69557311_Interface.__69557311_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__417885779_Interface, __407060269_Interface, __69557311_Interface)

  private fun as_417885779(): IKeyEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IKeyEventArgs.ABI.makeIKeyEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IKeyEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IKeyEventArgs.ABI.makeIKeyEventArgs(ref.value))
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

  private fun as_69557311(): IKeyEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IKeyEventArgs2.ABI.makeIKeyEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IKeyEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IKeyEventArgs2.ABI.makeIKeyEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<KeyEventArgs> {
    public override fun getValue() = KeyEventArgs(pointer.getPointer(0))

    public fun setValue(value: KeyEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KeyEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): KeyEventArgs {
      val address = segment.toRawLongValue()
      return KeyEventArgs(Pointer(address))
    }

    public override fun toNative(obj: KeyEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
