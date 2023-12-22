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

@ABIMarker(CoreTextCompositionStartedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Text.Core.CoreTextCompositionStartedEventArgs;{276b16a9-64e7-4ab0-bc4b-a02d73835bfb})")
@WinRTByReference(brClass = CoreTextCompositionStartedEventArgs.ByReference::class)
public class CoreTextCompositionStartedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreTextCompositionStartedEventArgs.WithDefault, IWinRTObject {
  private val __1376848092_Interface: ICoreTextCompositionStartedEventArgs.WithDefault by lazy {
    as_1376848092()
  }


  public override val __1376848092_Ptr: JNAPointer? by lazy {
    __1376848092_Interface.__1376848092_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1376848092_Interface)

  private fun as_1376848092(): ICoreTextCompositionStartedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreTextCompositionStartedEventArgs.ABI.makeICoreTextCompositionStartedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreTextCompositionStartedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreTextCompositionStartedEventArgs.ABI.makeICoreTextCompositionStartedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreTextCompositionStartedEventArgs> {
    public override fun getValue() = CoreTextCompositionStartedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreTextCompositionStartedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreTextCompositionStartedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreTextCompositionStartedEventArgs {
      val address = segment.toRawLongValue()
      return CoreTextCompositionStartedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreTextCompositionStartedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
