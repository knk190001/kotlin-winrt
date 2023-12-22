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

@ABIMarker(VisibilityChangedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Core.VisibilityChangedEventArgs;{bf9918ea-d801-4564-a495-b1e84f8ad085})")
@WinRTByReference(brClass = VisibilityChangedEventArgs.ByReference::class)
public class VisibilityChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IVisibilityChangedEventArgs.WithDefault, ICoreWindowEventArgs.WithDefault,
    IWinRTObject {
  private val __434012560_Interface: IVisibilityChangedEventArgs.WithDefault by lazy {
    as_434012560()
  }


  private val __407060269_Interface: ICoreWindowEventArgs.WithDefault by lazy {
    as_407060269()
  }


  public override val __434012560_Ptr: JNAPointer? by lazy {
    __434012560_Interface.__434012560_Ptr
  }


  public override val __407060269_Ptr: JNAPointer? by lazy {
    __407060269_Interface.__407060269_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__434012560_Interface, __407060269_Interface)

  private fun as_434012560(): IVisibilityChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IVisibilityChangedEventArgs.ABI.makeIVisibilityChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IVisibilityChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IVisibilityChangedEventArgs.ABI.makeIVisibilityChangedEventArgs(ref.value))
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
      IByReference<VisibilityChangedEventArgs> {
    public override fun getValue() = VisibilityChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: VisibilityChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<VisibilityChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): VisibilityChangedEventArgs {
      val address = segment.toRawLongValue()
      return VisibilityChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: VisibilityChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
