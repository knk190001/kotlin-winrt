package Windows.UI.Xaml.Hosting

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

@ABIMarker(DesktopWindowXamlSourceGotFocusEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Hosting.DesktopWindowXamlSourceGotFocusEventArgs;{39be4849-d9cc-5b70-8f05-1ad9a4aaa342})")
@WinRTByReference(brClass = DesktopWindowXamlSourceGotFocusEventArgs.ByReference::class)
public class DesktopWindowXamlSourceGotFocusEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IDesktopWindowXamlSourceGotFocusEventArgs.WithDefault, IWinRTObject {
  private val __634308322_Interface: IDesktopWindowXamlSourceGotFocusEventArgs.WithDefault by lazy {
    as_634308322()
  }


  public override val __634308322_Ptr: JNAPointer? by lazy {
    __634308322_Interface.__634308322_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__634308322_Interface)

  private fun as_634308322(): IDesktopWindowXamlSourceGotFocusEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IDesktopWindowXamlSourceGotFocusEventArgs.ABI.makeIDesktopWindowXamlSourceGotFocusEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IDesktopWindowXamlSourceGotFocusEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IDesktopWindowXamlSourceGotFocusEventArgs.ABI.makeIDesktopWindowXamlSourceGotFocusEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<DesktopWindowXamlSourceGotFocusEventArgs> {
    public override fun getValue() = DesktopWindowXamlSourceGotFocusEventArgs(pointer.getPointer(0))

    public fun setValue(value: DesktopWindowXamlSourceGotFocusEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<DesktopWindowXamlSourceGotFocusEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress):
        DesktopWindowXamlSourceGotFocusEventArgs {
      val address = segment.toRawLongValue()
      return DesktopWindowXamlSourceGotFocusEventArgs(Pointer(address))
    }

    public override fun toNative(obj: DesktopWindowXamlSourceGotFocusEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
