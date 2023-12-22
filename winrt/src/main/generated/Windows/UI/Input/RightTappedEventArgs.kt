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

@ABIMarker(RightTappedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Input.RightTappedEventArgs;{4cbf40bd-af7a-4a36-9476-b1dce141709a})")
@WinRTByReference(brClass = RightTappedEventArgs.ByReference::class)
public class RightTappedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRightTappedEventArgs.WithDefault, IRightTappedEventArgs2.WithDefault,
    IWinRTObject {
  private val __1814265475_Interface: IRightTappedEventArgs.WithDefault by lazy {
    as_1814265475()
  }


  private val __407654827_Interface: IRightTappedEventArgs2.WithDefault by lazy {
    as_407654827()
  }


  public override val __1814265475_Ptr: JNAPointer? by lazy {
    __1814265475_Interface.__1814265475_Ptr
  }


  public override val __407654827_Ptr: JNAPointer? by lazy {
    __407654827_Interface.__407654827_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1814265475_Interface, __407654827_Interface)

  private fun as_1814265475(): IRightTappedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRightTappedEventArgs.ABI.makeIRightTappedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRightTappedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRightTappedEventArgs.ABI.makeIRightTappedEventArgs(ref.value))
  }

  private fun as_407654827(): IRightTappedEventArgs2.WithDefault {
    if(pointer == NULL) {
      return(IRightTappedEventArgs2.ABI.makeIRightTappedEventArgs2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRightTappedEventArgs2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRightTappedEventArgs2.ABI.makeIRightTappedEventArgs2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RightTappedEventArgs> {
    public override fun getValue() = RightTappedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RightTappedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RightTappedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RightTappedEventArgs {
      val address = segment.toRawLongValue()
      return RightTappedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RightTappedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
