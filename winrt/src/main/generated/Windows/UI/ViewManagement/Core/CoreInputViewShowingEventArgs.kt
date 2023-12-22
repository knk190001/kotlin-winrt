package Windows.UI.ViewManagement.Core

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

@ABIMarker(CoreInputViewShowingEventArgs.ABI::class)
@Signature("rc(Windows.UI.ViewManagement.Core.CoreInputViewShowingEventArgs;{ca52261b-fb9e-5daf-a98c-262b8b76af50})")
@WinRTByReference(brClass = CoreInputViewShowingEventArgs.ByReference::class)
public class CoreInputViewShowingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreInputViewShowingEventArgs.WithDefault, IWinRTObject {
  private val __2091216529_Interface: ICoreInputViewShowingEventArgs.WithDefault by lazy {
    as_2091216529()
  }


  public override val __2091216529_Ptr: JNAPointer? by lazy {
    __2091216529_Interface.__2091216529_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2091216529_Interface)

  private fun as_2091216529(): ICoreInputViewShowingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreInputViewShowingEventArgs.ABI.makeICoreInputViewShowingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreInputViewShowingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreInputViewShowingEventArgs.ABI.makeICoreInputViewShowingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreInputViewShowingEventArgs> {
    public override fun getValue() = CoreInputViewShowingEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreInputViewShowingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreInputViewShowingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreInputViewShowingEventArgs {
      val address = segment.toRawLongValue()
      return CoreInputViewShowingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreInputViewShowingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
