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

@ABIMarker(CoreWebView2InitializedEventArgs.ABI::class)
@Signature("rc(Microsoft.UI.Xaml.Controls.CoreWebView2InitializedEventArgs;{ee59d277-8b2e-57ab-8631-91d27b12ebd9})")
@WinRTByReference(brClass = CoreWebView2InitializedEventArgs.ByReference::class)
public class CoreWebView2InitializedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2InitializedEventArgs.WithDefault, IWinRTObject {
  private val __326855678_Interface: ICoreWebView2InitializedEventArgs.WithDefault by lazy {
    as_326855678()
  }


  public override val __326855678_Ptr: JNAPointer? by lazy {
    __326855678_Interface.__326855678_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__326855678_Interface)

  private fun as_326855678(): ICoreWebView2InitializedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2InitializedEventArgs.ABI.makeICoreWebView2InitializedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2InitializedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2InitializedEventArgs.ABI.makeICoreWebView2InitializedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2InitializedEventArgs> {
    public override fun getValue() = CoreWebView2InitializedEventArgs(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2InitializedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2InitializedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2InitializedEventArgs {
      val address = segment.toRawLongValue()
      return CoreWebView2InitializedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2InitializedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
