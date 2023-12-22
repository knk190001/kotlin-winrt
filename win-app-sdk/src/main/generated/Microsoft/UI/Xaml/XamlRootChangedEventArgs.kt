package Microsoft.UI.Xaml

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

@ABIMarker(XamlRootChangedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.XamlRootChangedEventArgs;{61d2c719-f8a1-515a-902c-cfa498ba7a7f})")
@WinRTByReference(brClass = XamlRootChangedEventArgs.ByReference::class)
public class XamlRootChangedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXamlRootChangedEventArgs.WithDefault, IWinRTObject {
  private val __1198161140_Interface: IXamlRootChangedEventArgs.WithDefault by lazy {
    as_1198161140()
  }


  public override val __1198161140_Ptr: JNAPointer? by lazy {
    __1198161140_Interface.__1198161140_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1198161140_Interface)

  private fun as_1198161140(): IXamlRootChangedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IXamlRootChangedEventArgs.ABI.makeIXamlRootChangedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXamlRootChangedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXamlRootChangedEventArgs.ABI.makeIXamlRootChangedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<XamlRootChangedEventArgs> {
    public override fun getValue() = XamlRootChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: XamlRootChangedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XamlRootChangedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): XamlRootChangedEventArgs {
      val address = segment.toRawLongValue()
      return XamlRootChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: XamlRootChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
