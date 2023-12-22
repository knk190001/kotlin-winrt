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

@ABIMarker(CoreWebView2Settings.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2Settings;{377d3480-fdb2-56e7-bade-507d352887e9})")
@WinRTByReference(brClass = CoreWebView2Settings.ByReference::class)
public class CoreWebView2Settings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2Settings2.WithDefault, ICoreWebView2Settings3.WithDefault,
    ICoreWebView2Settings4.WithDefault, ICoreWebView2Settings5.WithDefault,
    ICoreWebView2Settings6.WithDefault, ICoreWebView2Settings7.WithDefault,
    ICoreWebView2Settings8.WithDefault, ICoreWebView2Settings_Manual.WithDefault,
    ICoreWebView2Settings.WithDefault, IWinRTObject {
  private val __965763560_Interface: ICoreWebView2Settings2.WithDefault by lazy {
    as_965763560()
  }


  private val __965763561_Interface: ICoreWebView2Settings3.WithDefault by lazy {
    as_965763561()
  }


  private val __965763562_Interface: ICoreWebView2Settings4.WithDefault by lazy {
    as_965763562()
  }


  private val __965763563_Interface: ICoreWebView2Settings5.WithDefault by lazy {
    as_965763563()
  }


  private val __965763564_Interface: ICoreWebView2Settings6.WithDefault by lazy {
    as_965763564()
  }


  private val __965763565_Interface: ICoreWebView2Settings7.WithDefault by lazy {
    as_965763565()
  }


  private val __965763566_Interface: ICoreWebView2Settings8.WithDefault by lazy {
    as_965763566()
  }


  private val __804154821_Interface: ICoreWebView2Settings_Manual.WithDefault by lazy {
    as_804154821()
  }


  private val __446795658_Interface: ICoreWebView2Settings.WithDefault by lazy {
    as_446795658()
  }


  public override val __965763560_Ptr: JNAPointer? by lazy {
    __965763560_Interface.__965763560_Ptr
  }


  public override val __965763561_Ptr: JNAPointer? by lazy {
    __965763561_Interface.__965763561_Ptr
  }


  public override val __965763562_Ptr: JNAPointer? by lazy {
    __965763562_Interface.__965763562_Ptr
  }


  public override val __965763563_Ptr: JNAPointer? by lazy {
    __965763563_Interface.__965763563_Ptr
  }


  public override val __965763564_Ptr: JNAPointer? by lazy {
    __965763564_Interface.__965763564_Ptr
  }


  public override val __965763565_Ptr: JNAPointer? by lazy {
    __965763565_Interface.__965763565_Ptr
  }


  public override val __965763566_Ptr: JNAPointer? by lazy {
    __965763566_Interface.__965763566_Ptr
  }


  public override val __804154821_Ptr: JNAPointer? by lazy {
    __804154821_Interface.__804154821_Ptr
  }


  public override val __446795658_Ptr: JNAPointer? by lazy {
    __446795658_Interface.__446795658_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__965763560_Interface, __965763561_Interface, __965763562_Interface,
        __965763563_Interface, __965763564_Interface, __965763565_Interface, __965763566_Interface,
        __804154821_Interface, __446795658_Interface)

  private fun as_965763560(): ICoreWebView2Settings2.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Settings2.ABI.makeICoreWebView2Settings2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Settings2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Settings2.ABI.makeICoreWebView2Settings2(ref.value))
  }

  private fun as_965763561(): ICoreWebView2Settings3.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Settings3.ABI.makeICoreWebView2Settings3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Settings3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Settings3.ABI.makeICoreWebView2Settings3(ref.value))
  }

  private fun as_965763562(): ICoreWebView2Settings4.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Settings4.ABI.makeICoreWebView2Settings4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Settings4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Settings4.ABI.makeICoreWebView2Settings4(ref.value))
  }

  private fun as_965763563(): ICoreWebView2Settings5.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Settings5.ABI.makeICoreWebView2Settings5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Settings5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Settings5.ABI.makeICoreWebView2Settings5(ref.value))
  }

  private fun as_965763564(): ICoreWebView2Settings6.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Settings6.ABI.makeICoreWebView2Settings6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Settings6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Settings6.ABI.makeICoreWebView2Settings6(ref.value))
  }

  private fun as_965763565(): ICoreWebView2Settings7.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Settings7.ABI.makeICoreWebView2Settings7(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Settings7>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Settings7.ABI.makeICoreWebView2Settings7(ref.value))
  }

  private fun as_965763566(): ICoreWebView2Settings8.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Settings8.ABI.makeICoreWebView2Settings8(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Settings8>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Settings8.ABI.makeICoreWebView2Settings8(ref.value))
  }

  private fun as_804154821(): ICoreWebView2Settings_Manual.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Settings_Manual.ABI.makeICoreWebView2Settings_Manual(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Settings_Manual>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Settings_Manual.ABI.makeICoreWebView2Settings_Manual(ref.value))
  }

  private fun as_446795658(): ICoreWebView2Settings.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Settings.ABI.makeICoreWebView2Settings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Settings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Settings.ABI.makeICoreWebView2Settings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2Settings> {
    public override fun getValue() = CoreWebView2Settings(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2Settings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2Settings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2Settings {
      val address = segment.toRawLongValue()
      return CoreWebView2Settings(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2Settings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
