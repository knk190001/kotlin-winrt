package Windows.UI.Xaml.Controls

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

@ABIMarker(WebViewNewWindowRequestedEventArgs.ABI::class)
@Signature("rc(Windows.UI.Xaml.Controls.WebViewNewWindowRequestedEventArgs;{470fa818-6862-44d9-b3d1-c0696373de35})")
@WinRTByReference(brClass = WebViewNewWindowRequestedEventArgs.ByReference::class)
public class WebViewNewWindowRequestedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWebViewNewWindowRequestedEventArgs.WithDefault, IWinRTObject {
  private val __1149399588_Interface: IWebViewNewWindowRequestedEventArgs.WithDefault by lazy {
    as_1149399588()
  }


  public override val __1149399588_Ptr: JNAPointer? by lazy {
    __1149399588_Interface.__1149399588_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1149399588_Interface)

  private fun as_1149399588(): IWebViewNewWindowRequestedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IWebViewNewWindowRequestedEventArgs.ABI.makeIWebViewNewWindowRequestedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWebViewNewWindowRequestedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWebViewNewWindowRequestedEventArgs.ABI.makeIWebViewNewWindowRequestedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WebViewNewWindowRequestedEventArgs> {
    public override fun getValue() = WebViewNewWindowRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: WebViewNewWindowRequestedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WebViewNewWindowRequestedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): WebViewNewWindowRequestedEventArgs {
      val address = segment.toRawLongValue()
      return WebViewNewWindowRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: WebViewNewWindowRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
