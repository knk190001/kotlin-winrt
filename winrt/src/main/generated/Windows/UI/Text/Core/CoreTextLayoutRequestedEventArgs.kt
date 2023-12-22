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

@ABIMarker(CoreTextLayoutRequestedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Text.Core.CoreTextLayoutRequestedEventArgs;{b1dc6ae0-9a7b-4e9e-a566-4a6b5f8ad676})")
@WinRTByReference(brClass = CoreTextLayoutRequestedEventArgs.ByReference::class)
public class CoreTextLayoutRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreTextLayoutRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1290874135_Interface: ICoreTextLayoutRequestedEventArgs.WithDefault by lazy {
    as_1290874135()
  }


  public override val __1290874135_Ptr: JNAPointer? by lazy {
    __1290874135_Interface.__1290874135_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1290874135_Interface)

  private fun as_1290874135(): ICoreTextLayoutRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreTextLayoutRequestedEventArgs.ABI.makeICoreTextLayoutRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreTextLayoutRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreTextLayoutRequestedEventArgs.ABI.makeICoreTextLayoutRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreTextLayoutRequestedEventArgs> {
    public override fun getValue() = CoreTextLayoutRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreTextLayoutRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreTextLayoutRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreTextLayoutRequestedEventArgs {
      val address = segment.toRawLongValue()
      return CoreTextLayoutRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreTextLayoutRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
