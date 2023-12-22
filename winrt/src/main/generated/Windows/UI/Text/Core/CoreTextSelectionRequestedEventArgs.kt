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

@ABIMarker(CoreTextSelectionRequestedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Text.Core.CoreTextSelectionRequestedEventArgs;{13c6682b-f614-421a-8f4b-9ec8a5a37fcd})")
@WinRTByReference(brClass = CoreTextSelectionRequestedEventArgs.ByReference::class)
public class CoreTextSelectionRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreTextSelectionRequestedEventArgs.WithDefault, IWinRTObject {
  private val __724489585_Interface: ICoreTextSelectionRequestedEventArgs.WithDefault by lazy {
    as_724489585()
  }


  public override val __724489585_Ptr: JNAPointer? by lazy {
    __724489585_Interface.__724489585_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__724489585_Interface)

  private fun as_724489585(): ICoreTextSelectionRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreTextSelectionRequestedEventArgs.ABI.makeICoreTextSelectionRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreTextSelectionRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreTextSelectionRequestedEventArgs.ABI.makeICoreTextSelectionRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreTextSelectionRequestedEventArgs> {
    public override fun getValue() = CoreTextSelectionRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreTextSelectionRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreTextSelectionRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreTextSelectionRequestedEventArgs {
      val address = segment.toRawLongValue()
      return CoreTextSelectionRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreTextSelectionRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
