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

@ABIMarker(TouchHitTestingEventArgs.ABI::class)
@Signature("rc(Windows.UI.Core.TouchHitTestingEventArgs;{22f3b823-0b7c-424e-9df7-33d4f962931b})")
@WinRTByReference(brClass = TouchHitTestingEventArgs.ByReference::class)
public class TouchHitTestingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITouchHitTestingEventArgs.WithDefault, ICoreWindowEventArgs.WithDefault,
    IWinRTObject {
  private val __1986994890_Interface: ITouchHitTestingEventArgs.WithDefault by lazy {
    as_1986994890()
  }


  private val __407060269_Interface: ICoreWindowEventArgs.WithDefault by lazy {
    as_407060269()
  }


  public override val __1986994890_Ptr: JNAPointer? by lazy {
    __1986994890_Interface.__1986994890_Ptr
  }


  public override val __407060269_Ptr: JNAPointer? by lazy {
    __407060269_Interface.__407060269_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1986994890_Interface, __407060269_Interface)

  private fun as_1986994890(): ITouchHitTestingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITouchHitTestingEventArgs.ABI.makeITouchHitTestingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITouchHitTestingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITouchHitTestingEventArgs.ABI.makeITouchHitTestingEventArgs(ref.value))
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
      IByReference<TouchHitTestingEventArgs> {
    public override fun getValue() = TouchHitTestingEventArgs(pointer.getPointer(0))

    public fun setValue(value: TouchHitTestingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<TouchHitTestingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): TouchHitTestingEventArgs {
      val address = segment.toRawLongValue()
      return TouchHitTestingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: TouchHitTestingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
