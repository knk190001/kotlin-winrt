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

@ABIMarker(CoreFrameworkInputViewAnimationStartingEventArgs.ABI::class)
@Signature("rc(Windows.UI.ViewManagement.Core.CoreFrameworkInputViewAnimationStartingEventArgs;{c0ec901c-bba4-501b-ae8b-65c9e756a719})")
@WinRTByReference(brClass = CoreFrameworkInputViewAnimationStartingEventArgs.ByReference::class)
public class CoreFrameworkInputViewAnimationStartingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreFrameworkInputViewAnimationStartingEventArgs.WithDefault, IWinRTObject {
  private val __1866160374_Interface: ICoreFrameworkInputViewAnimationStartingEventArgs.WithDefault
      by lazy {
    as_1866160374()
  }


  public override val __1866160374_Ptr: JNAPointer? by lazy {
    __1866160374_Interface.__1866160374_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1866160374_Interface)

  private fun as_1866160374(): ICoreFrameworkInputViewAnimationStartingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreFrameworkInputViewAnimationStartingEventArgs.ABI.makeICoreFrameworkInputViewAnimationStartingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreFrameworkInputViewAnimationStartingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreFrameworkInputViewAnimationStartingEventArgs.ABI.makeICoreFrameworkInputViewAnimationStartingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreFrameworkInputViewAnimationStartingEventArgs> {
    public override fun getValue() =
        CoreFrameworkInputViewAnimationStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreFrameworkInputViewAnimationStartingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreFrameworkInputViewAnimationStartingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        CoreFrameworkInputViewAnimationStartingEventArgs {
      val address = segment.toRawLongValue()
      return CoreFrameworkInputViewAnimationStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreFrameworkInputViewAnimationStartingEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
