package Microsoft.Web.WebView2.Core

import Windows.UI.Core.CoreWindow
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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
import com.sun.jna.platform.win32.WinDef
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CoreWebView2ControllerWindowReference.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2ControllerWindowReference;{0feddad4-48a3-5cc4-9f61-e7adfd1e9c76})")
@WinRTByReference(brClass = CoreWebView2ControllerWindowReference.ByReference::class)
public class CoreWebView2ControllerWindowReference(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2ControllerWindowReference.WithDefault, IWinRTObject {
  private val __210067080_Interface: ICoreWebView2ControllerWindowReference.WithDefault by lazy {
    as_210067080()
  }


  public override val __210067080_Ptr: JNAPointer? by lazy {
    __210067080_Interface.__210067080_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__210067080_Interface)

  private fun as_210067080(): ICoreWebView2ControllerWindowReference.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2ControllerWindowReference.ABI.makeICoreWebView2ControllerWindowReference(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2ControllerWindowReference>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2ControllerWindowReference.ABI.makeICoreWebView2ControllerWindowReference(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2ControllerWindowReference> {
    public override fun getValue() = CoreWebView2ControllerWindowReference(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2ControllerWindowReference): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2ControllerWindowReference, MemoryAddress> {
    public val ICoreWebView2ControllerWindowReferenceStatics_Instance:
        ICoreWebView2ControllerWindowReferenceStatics by lazy {
      createICoreWebView2ControllerWindowReferenceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICoreWebView2ControllerWindowReferenceStatics():
        ICoreWebView2ControllerWindowReferenceStatics {
      val refiid = Guid.REFIID(ICoreWebView2ControllerWindowReferenceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Web.WebView2.Core.CoreWebView2ControllerWindowReference".toHandle(),refiid,interfacePtr)
      val result =
          ICoreWebView2ControllerWindowReferenceStatics.ABI.makeICoreWebView2ControllerWindowReferenceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CoreWebView2ControllerWindowReference {
      val address = segment.toRawLongValue()
      return CoreWebView2ControllerWindowReference(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2ControllerWindowReference): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateFromWindowHandle(windowHandle: WinDef.ULONG) =
        ABI.ICoreWebView2ControllerWindowReferenceStatics_Instance.CreateFromWindowHandle(windowHandle)

    public fun CreateFromCoreWindow(coreWindow: CoreWindow) =
        ABI.ICoreWebView2ControllerWindowReferenceStatics_Instance.CreateFromCoreWindow(coreWindow)
  }
}
