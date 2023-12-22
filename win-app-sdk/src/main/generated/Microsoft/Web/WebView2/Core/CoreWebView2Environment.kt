package Microsoft.Web.WebView2.Core

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
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CoreWebView2Environment.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2Environment;{c224e69c-1efd-5ecc-adc8-2b52e7b97ce5})")
@WinRTByReference(brClass = CoreWebView2Environment.ByReference::class)
public class CoreWebView2Environment(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2Environment10.WithDefault,
    ICoreWebView2Environment11.WithDefault, ICoreWebView2Environment12.WithDefault,
    ICoreWebView2Environment2.WithDefault, ICoreWebView2Environment3.WithDefault,
    ICoreWebView2Environment4.WithDefault, ICoreWebView2Environment5.WithDefault,
    ICoreWebView2Environment6.WithDefault, ICoreWebView2Environment7.WithDefault,
    ICoreWebView2Environment8.WithDefault, ICoreWebView2Environment9.WithDefault,
    ICoreWebView2Environment_Manual.WithDefault, ICoreWebView2Environment.WithDefault, IWinRTObject
    {
  private val __1129133163_Interface: ICoreWebView2Environment10.WithDefault by lazy {
    as_1129133163()
  }


  private val __1129133164_Interface: ICoreWebView2Environment11.WithDefault by lazy {
    as_1129133164()
  }


  private val __1129133165_Interface: ICoreWebView2Environment12.WithDefault by lazy {
    as_1129133165()
  }


  private val __174970982_Interface: ICoreWebView2Environment2.WithDefault by lazy {
    as_174970982()
  }


  private val __174970983_Interface: ICoreWebView2Environment3.WithDefault by lazy {
    as_174970983()
  }


  private val __174970984_Interface: ICoreWebView2Environment4.WithDefault by lazy {
    as_174970984()
  }


  private val __174970985_Interface: ICoreWebView2Environment5.WithDefault by lazy {
    as_174970985()
  }


  private val __174970986_Interface: ICoreWebView2Environment6.WithDefault by lazy {
    as_174970986()
  }


  private val __174970987_Interface: ICoreWebView2Environment7.WithDefault by lazy {
    as_174970987()
  }


  private val __174970988_Interface: ICoreWebView2Environment8.WithDefault by lazy {
    as_174970988()
  }


  private val __174970989_Interface: ICoreWebView2Environment9.WithDefault by lazy {
    as_174970989()
  }


  private val __271601095_Interface: ICoreWebView2Environment_Manual.WithDefault by lazy {
    as_271601095()
  }


  private val __421286220_Interface: ICoreWebView2Environment.WithDefault by lazy {
    as_421286220()
  }


  public override val __1129133163_Ptr: JNAPointer? by lazy {
    __1129133163_Interface.__1129133163_Ptr
  }


  public override val __1129133164_Ptr: JNAPointer? by lazy {
    __1129133164_Interface.__1129133164_Ptr
  }


  public override val __1129133165_Ptr: JNAPointer? by lazy {
    __1129133165_Interface.__1129133165_Ptr
  }


  public override val __174970982_Ptr: JNAPointer? by lazy {
    __174970982_Interface.__174970982_Ptr
  }


  public override val __174970983_Ptr: JNAPointer? by lazy {
    __174970983_Interface.__174970983_Ptr
  }


  public override val __174970984_Ptr: JNAPointer? by lazy {
    __174970984_Interface.__174970984_Ptr
  }


  public override val __174970985_Ptr: JNAPointer? by lazy {
    __174970985_Interface.__174970985_Ptr
  }


  public override val __174970986_Ptr: JNAPointer? by lazy {
    __174970986_Interface.__174970986_Ptr
  }


  public override val __174970987_Ptr: JNAPointer? by lazy {
    __174970987_Interface.__174970987_Ptr
  }


  public override val __174970988_Ptr: JNAPointer? by lazy {
    __174970988_Interface.__174970988_Ptr
  }


  public override val __174970989_Ptr: JNAPointer? by lazy {
    __174970989_Interface.__174970989_Ptr
  }


  public override val __271601095_Ptr: JNAPointer? by lazy {
    __271601095_Interface.__271601095_Ptr
  }


  public override val __421286220_Ptr: JNAPointer? by lazy {
    __421286220_Interface.__421286220_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1129133163_Interface, __1129133164_Interface, __1129133165_Interface,
        __174970982_Interface, __174970983_Interface, __174970984_Interface, __174970985_Interface,
        __174970986_Interface, __174970987_Interface, __174970988_Interface, __174970989_Interface,
        __271601095_Interface, __421286220_Interface)

  private fun as_1129133163(): ICoreWebView2Environment10.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Environment10.ABI.makeICoreWebView2Environment10(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Environment10>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Environment10.ABI.makeICoreWebView2Environment10(ref.value))
  }

  private fun as_1129133164(): ICoreWebView2Environment11.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Environment11.ABI.makeICoreWebView2Environment11(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Environment11>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Environment11.ABI.makeICoreWebView2Environment11(ref.value))
  }

  private fun as_1129133165(): ICoreWebView2Environment12.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Environment12.ABI.makeICoreWebView2Environment12(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Environment12>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Environment12.ABI.makeICoreWebView2Environment12(ref.value))
  }

  private fun as_174970982(): ICoreWebView2Environment2.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Environment2.ABI.makeICoreWebView2Environment2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Environment2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Environment2.ABI.makeICoreWebView2Environment2(ref.value))
  }

  private fun as_174970983(): ICoreWebView2Environment3.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Environment3.ABI.makeICoreWebView2Environment3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Environment3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Environment3.ABI.makeICoreWebView2Environment3(ref.value))
  }

  private fun as_174970984(): ICoreWebView2Environment4.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Environment4.ABI.makeICoreWebView2Environment4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Environment4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Environment4.ABI.makeICoreWebView2Environment4(ref.value))
  }

  private fun as_174970985(): ICoreWebView2Environment5.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Environment5.ABI.makeICoreWebView2Environment5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Environment5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Environment5.ABI.makeICoreWebView2Environment5(ref.value))
  }

  private fun as_174970986(): ICoreWebView2Environment6.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Environment6.ABI.makeICoreWebView2Environment6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Environment6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Environment6.ABI.makeICoreWebView2Environment6(ref.value))
  }

  private fun as_174970987(): ICoreWebView2Environment7.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Environment7.ABI.makeICoreWebView2Environment7(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Environment7>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Environment7.ABI.makeICoreWebView2Environment7(ref.value))
  }

  private fun as_174970988(): ICoreWebView2Environment8.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Environment8.ABI.makeICoreWebView2Environment8(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Environment8>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Environment8.ABI.makeICoreWebView2Environment8(ref.value))
  }

  private fun as_174970989(): ICoreWebView2Environment9.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Environment9.ABI.makeICoreWebView2Environment9(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Environment9>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Environment9.ABI.makeICoreWebView2Environment9(ref.value))
  }

  private fun as_271601095(): ICoreWebView2Environment_Manual.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Environment_Manual.ABI.makeICoreWebView2Environment_Manual(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Environment_Manual>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Environment_Manual.ABI.makeICoreWebView2Environment_Manual(ref.value))
  }

  private fun as_421286220(): ICoreWebView2Environment.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Environment.ABI.makeICoreWebView2Environment(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Environment>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Environment.ABI.makeICoreWebView2Environment(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2Environment> {
    public override fun getValue() = CoreWebView2Environment(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2Environment): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2Environment, MemoryAddress> {
    public val ICoreWebView2EnvironmentStatics_Instance: ICoreWebView2EnvironmentStatics by lazy {
      createICoreWebView2EnvironmentStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICoreWebView2EnvironmentStatics(): ICoreWebView2EnvironmentStatics {
      val refiid = Guid.REFIID(ICoreWebView2EnvironmentStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.Web.WebView2.Core.CoreWebView2Environment".toHandle(),refiid,interfacePtr)
      val result =
          ICoreWebView2EnvironmentStatics.ABI.makeICoreWebView2EnvironmentStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CoreWebView2Environment {
      val address = segment.toRawLongValue()
      return CoreWebView2Environment(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2Environment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateAsync() = ABI.ICoreWebView2EnvironmentStatics_Instance.CreateAsync()

    public fun CreateWithOptionsAsync(
      browserExecutableFolder: String,
      userDataFolder: String,
      options: CoreWebView2EnvironmentOptions
    ) = ABI.ICoreWebView2EnvironmentStatics_Instance.CreateWithOptionsAsync(browserExecutableFolder,
        userDataFolder, options)

    public fun GetAvailableBrowserVersionString() =
        ABI.ICoreWebView2EnvironmentStatics_Instance.GetAvailableBrowserVersionString()

    public fun GetAvailableBrowserVersionString(browserExecutableFolder: String) =
        ABI.ICoreWebView2EnvironmentStatics_Instance.GetAvailableBrowserVersionString(browserExecutableFolder)

    public fun CompareBrowserVersionString(browserVersionString1: String,
        browserVersionString2: String) =
        ABI.ICoreWebView2EnvironmentStatics_Instance.CompareBrowserVersionString(browserVersionString1,
        browserVersionString2)
  }
}
