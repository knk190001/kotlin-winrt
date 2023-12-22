package Windows.UI.Text.Core

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

@ABIMarker(CoreTextSelectionUpdatingEventArgs.ABI::class)
@Signature("rc(Windows.UI.Text.Core.CoreTextSelectionUpdatingEventArgs;{d445839f-fe7f-4bd5-8a26-0922c1b3e639})")
@WinRTByReference(brClass = CoreTextSelectionUpdatingEventArgs.ByReference::class)
public class CoreTextSelectionUpdatingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreTextSelectionUpdatingEventArgs.WithDefault, IWinRTObject {
  private val __2099320393_Interface: ICoreTextSelectionUpdatingEventArgs.WithDefault by lazy {
    as_2099320393()
  }


  public override val __2099320393_Ptr: JNAPointer? by lazy {
    __2099320393_Interface.__2099320393_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2099320393_Interface)

  private fun as_2099320393(): ICoreTextSelectionUpdatingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreTextSelectionUpdatingEventArgs.ABI.makeICoreTextSelectionUpdatingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreTextSelectionUpdatingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreTextSelectionUpdatingEventArgs.ABI.makeICoreTextSelectionUpdatingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreTextSelectionUpdatingEventArgs> {
    public override fun getValue() = CoreTextSelectionUpdatingEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreTextSelectionUpdatingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreTextSelectionUpdatingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreTextSelectionUpdatingEventArgs {
      val address = segment.toRawLongValue()
      return CoreTextSelectionUpdatingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreTextSelectionUpdatingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
