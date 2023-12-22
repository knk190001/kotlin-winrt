package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ExpanderCollapsedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.ExpanderCollapsedEventArgs;{968a6870-7426-535e-a526-279e6eedecd0})")
@WinRTByReference(brClass = ExpanderCollapsedEventArgs.ByReference::class)
public class ExpanderCollapsedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IExpanderCollapsedEventArgs.WithDefault, IWinRTObject {
  private val __1156754898_Interface: IExpanderCollapsedEventArgs.WithDefault by lazy {
    as_1156754898()
  }


  public override val __1156754898_Ptr: JNAPointer? by lazy {
    __1156754898_Interface.__1156754898_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1156754898_Interface)

  private fun as_1156754898(): IExpanderCollapsedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IExpanderCollapsedEventArgs.ABI.makeIExpanderCollapsedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IExpanderCollapsedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IExpanderCollapsedEventArgs.ABI.makeIExpanderCollapsedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ExpanderCollapsedEventArgs> {
    public override fun getValue() = ExpanderCollapsedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ExpanderCollapsedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ExpanderCollapsedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ExpanderCollapsedEventArgs {
      val address = segment.toRawLongValue()
      return ExpanderCollapsedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ExpanderCollapsedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
