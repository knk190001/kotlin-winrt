package Microsoft.UI.Input

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
@Signature("rc(Microsoft.UI.Input.TouchHitTestingEventArgs;{c2196f0c-60ed-5b5d-b919-aa7357e0a25c})")
@WinRTByReference(brClass = TouchHitTestingEventArgs.ByReference::class)
public class TouchHitTestingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ITouchHitTestingEventArgs.WithDefault, IWinRTObject {
  private val __428864724_Interface: ITouchHitTestingEventArgs.WithDefault by lazy {
    as_428864724()
  }


  public override val __428864724_Ptr: JNAPointer? by lazy {
    __428864724_Interface.__428864724_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__428864724_Interface)

  private fun as_428864724(): ITouchHitTestingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ITouchHitTestingEventArgs.ABI.makeITouchHitTestingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ITouchHitTestingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ITouchHitTestingEventArgs.ABI.makeITouchHitTestingEventArgs(ref.value))
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
