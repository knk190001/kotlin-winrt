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

@ABIMarker(PointerEventArgs.ABI::class)
@Signature("rc(Windows.UI.Core.PointerEventArgs;{920d9cb1-a5fc-4a21-8c09-49dfe6ffe25f})")
@WinRTByReference(brClass = PointerEventArgs.ByReference::class)
public class PointerEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPointerEventArgs.WithDefault, ICoreWindowEventArgs.WithDefault, IWinRTObject
    {
  private val __564354379_Interface: IPointerEventArgs.WithDefault by lazy {
    as_564354379()
  }


  private val __407060269_Interface: ICoreWindowEventArgs.WithDefault by lazy {
    as_407060269()
  }


  public override val __564354379_Ptr: JNAPointer? by lazy {
    __564354379_Interface.__564354379_Ptr
  }


  public override val __407060269_Ptr: JNAPointer? by lazy {
    __407060269_Interface.__407060269_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__564354379_Interface, __407060269_Interface)

  private fun as_564354379(): IPointerEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IPointerEventArgs.ABI.makeIPointerEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPointerEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPointerEventArgs.ABI.makeIPointerEventArgs(ref.value))
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
      IByReference<PointerEventArgs> {
    public override fun getValue() = PointerEventArgs(pointer.getPointer(0))

    public fun setValue(value: PointerEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PointerEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PointerEventArgs {
      val address = segment.toRawLongValue()
      return PointerEventArgs(Pointer(address))
    }

    public override fun toNative(obj: PointerEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
