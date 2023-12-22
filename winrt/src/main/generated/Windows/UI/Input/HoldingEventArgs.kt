package Windows.UI.Input

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

@ABIMarker(HoldingEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.HoldingEventArgs;{2bf755c5-e799-41b4-bb40-242f40959b71})")
@WinRTByReference(brClass = HoldingEventArgs.ByReference::class)
public class HoldingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHoldingEventArgs.WithDefault, IHoldingEventArgs2.WithDefault, IWinRTObject {
  private val __751689758_Interface: IHoldingEventArgs.WithDefault by lazy {
    as_751689758()
  }


  private val __1827545968_Interface: IHoldingEventArgs2.WithDefault by lazy {
    as_1827545968()
  }


  public override val __751689758_Ptr: JNAPointer? by lazy {
    __751689758_Interface.__751689758_Ptr
  }


  public override val __1827545968_Ptr: JNAPointer? by lazy {
    __1827545968_Interface.__1827545968_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__751689758_Interface, __1827545968_Interface)

  private fun as_751689758(): IHoldingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IHoldingEventArgs.ABI.makeIHoldingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHoldingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHoldingEventArgs.ABI.makeIHoldingEventArgs(ref.value))
  }

  private fun as_1827545968(): IHoldingEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IHoldingEventArgs2.ABI.makeIHoldingEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHoldingEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHoldingEventArgs2.ABI.makeIHoldingEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HoldingEventArgs> {
    public override fun getValue() = HoldingEventArgs(pointer.getPointer(0))

    public fun setValue(value: HoldingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HoldingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HoldingEventArgs {
      val address = segment.toRawLongValue()
      return HoldingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: HoldingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
