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

@ABIMarker(CoreTextFormatUpdatingEventArgs.ABI::class)
@Signature("rc(Windows.UI.Text.Core.CoreTextFormatUpdatingEventArgs;{7310bd33-b4a8-43b1-b37b-0724d4aca7ab})")
@WinRTByReference(brClass = CoreTextFormatUpdatingEventArgs.ByReference::class)
public class CoreTextFormatUpdatingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreTextFormatUpdatingEventArgs.WithDefault, IWinRTObject {
  private val __216451254_Interface: ICoreTextFormatUpdatingEventArgs.WithDefault by lazy {
    as_216451254()
  }


  public override val __216451254_Ptr: JNAPointer? by lazy {
    __216451254_Interface.__216451254_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__216451254_Interface)

  private fun as_216451254(): ICoreTextFormatUpdatingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreTextFormatUpdatingEventArgs.ABI.makeICoreTextFormatUpdatingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreTextFormatUpdatingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreTextFormatUpdatingEventArgs.ABI.makeICoreTextFormatUpdatingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreTextFormatUpdatingEventArgs> {
    public override fun getValue() = CoreTextFormatUpdatingEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreTextFormatUpdatingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreTextFormatUpdatingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreTextFormatUpdatingEventArgs {
      val address = segment.toRawLongValue()
      return CoreTextFormatUpdatingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreTextFormatUpdatingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
