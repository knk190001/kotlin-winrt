package Microsoft.Web.WebView2.Core

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

@ABIMarker(CoreWebView2PermissionSetting.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2PermissionSetting;{b4158d0b-8ef8-575f-8e99-5fe02e8b579e})")
@WinRTByReference(brClass = CoreWebView2PermissionSetting.ByReference::class)
public class CoreWebView2PermissionSetting(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2PermissionSetting.WithDefault, IWinRTObject {
  private val __1982293510_Interface: ICoreWebView2PermissionSetting.WithDefault by lazy {
    as_1982293510()
  }


  public override val __1982293510_Ptr: JNAPointer? by lazy {
    __1982293510_Interface.__1982293510_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1982293510_Interface)

  private fun as_1982293510(): ICoreWebView2PermissionSetting.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2PermissionSetting.ABI.makeICoreWebView2PermissionSetting(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2PermissionSetting>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2PermissionSetting.ABI.makeICoreWebView2PermissionSetting(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2PermissionSetting> {
    public override fun getValue() = CoreWebView2PermissionSetting(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2PermissionSetting): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2PermissionSetting, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2PermissionSetting {
      val address = segment.toRawLongValue()
      return CoreWebView2PermissionSetting(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2PermissionSetting): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
