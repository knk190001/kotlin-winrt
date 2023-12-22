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

@ABIMarker(CoreTextTextUpdatingEventArgs.ABI::class)
@Signature("rc(Windows.UI.Text.Core.CoreTextTextUpdatingEventArgs;{eea7918d-cc2b-4f03-8ff6-02fd217db450})")
@WinRTByReference(brClass = CoreTextTextUpdatingEventArgs.ByReference::class)
public class CoreTextTextUpdatingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreTextTextUpdatingEventArgs.WithDefault, IWinRTObject {
  private val __1822825792_Interface: ICoreTextTextUpdatingEventArgs.WithDefault by lazy {
    as_1822825792()
  }


  public override val __1822825792_Ptr: JNAPointer? by lazy {
    __1822825792_Interface.__1822825792_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1822825792_Interface)

  private fun as_1822825792(): ICoreTextTextUpdatingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreTextTextUpdatingEventArgs.ABI.makeICoreTextTextUpdatingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreTextTextUpdatingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreTextTextUpdatingEventArgs.ABI.makeICoreTextTextUpdatingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreTextTextUpdatingEventArgs> {
    public override fun getValue() = CoreTextTextUpdatingEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreTextTextUpdatingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreTextTextUpdatingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreTextTextUpdatingEventArgs {
      val address = segment.toRawLongValue()
      return CoreTextTextUpdatingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreTextTextUpdatingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
