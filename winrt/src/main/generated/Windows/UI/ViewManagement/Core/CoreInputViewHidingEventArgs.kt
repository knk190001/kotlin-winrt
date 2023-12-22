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

@ABIMarker(CoreInputViewHidingEventArgs.ABI::class)
@Signature("rc(Windows.UI.ViewManagement.Core.CoreInputViewHidingEventArgs;{eada47bd-bac5-5336-848d-41083584daad})")
@WinRTByReference(brClass = CoreInputViewHidingEventArgs.ByReference::class)
public class CoreInputViewHidingEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreInputViewHidingEventArgs.WithDefault, IWinRTObject {
  private val __1464776933_Interface: ICoreInputViewHidingEventArgs.WithDefault by lazy {
    as_1464776933()
  }


  public override val __1464776933_Ptr: JNAPointer? by lazy {
    __1464776933_Interface.__1464776933_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1464776933_Interface)

  private fun as_1464776933(): ICoreInputViewHidingEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreInputViewHidingEventArgs.ABI.makeICoreInputViewHidingEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreInputViewHidingEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreInputViewHidingEventArgs.ABI.makeICoreInputViewHidingEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreInputViewHidingEventArgs> {
    public override fun getValue() = CoreInputViewHidingEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreInputViewHidingEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreInputViewHidingEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreInputViewHidingEventArgs {
      val address = segment.toRawLongValue()
      return CoreInputViewHidingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreInputViewHidingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
