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

@ABIMarker(CoreWebView2Profile.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2Profile;{b42bfab4-c4bf-5469-89ac-cadc69e3b0f5})")
@WinRTByReference(brClass = CoreWebView2Profile.ByReference::class)
public class CoreWebView2Profile(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), CoreWebView2Profile_Manual.WithDefault,
    CoreWebView2Profile_Manual2.WithDefault, ICoreWebView2Profile2.WithDefault,
    ICoreWebView2Profile3.WithDefault, ICoreWebView2Profile4.WithDefault,
    ICoreWebView2Profile5.WithDefault, ICoreWebView2Profile6.WithDefault,
    ICoreWebView2Profile.WithDefault, IWinRTObject {
  private val __1479330766_Interface: CoreWebView2Profile_Manual.WithDefault by lazy {
    as_1479330766()
  }


  private val __1385386460_Interface: CoreWebView2Profile_Manual2.WithDefault by lazy {
    as_1385386460()
  }


  private val __1990099184_Interface: ICoreWebView2Profile2.WithDefault by lazy {
    as_1990099184()
  }


  private val __1990099183_Interface: ICoreWebView2Profile3.WithDefault by lazy {
    as_1990099183()
  }


  private val __1990099182_Interface: ICoreWebView2Profile4.WithDefault by lazy {
    as_1990099182()
  }


  private val __1990099181_Interface: ICoreWebView2Profile5.WithDefault by lazy {
    as_1990099181()
  }


  private val __1990099180_Interface: ICoreWebView2Profile6.WithDefault by lazy {
    as_1990099180()
  }


  private val __618386078_Interface: ICoreWebView2Profile.WithDefault by lazy {
    as_618386078()
  }


  public override val __1479330766_Ptr: JNAPointer? by lazy {
    __1479330766_Interface.__1479330766_Ptr
  }


  public override val __1385386460_Ptr: JNAPointer? by lazy {
    __1385386460_Interface.__1385386460_Ptr
  }


  public override val __1990099184_Ptr: JNAPointer? by lazy {
    __1990099184_Interface.__1990099184_Ptr
  }


  public override val __1990099183_Ptr: JNAPointer? by lazy {
    __1990099183_Interface.__1990099183_Ptr
  }


  public override val __1990099182_Ptr: JNAPointer? by lazy {
    __1990099182_Interface.__1990099182_Ptr
  }


  public override val __1990099181_Ptr: JNAPointer? by lazy {
    __1990099181_Interface.__1990099181_Ptr
  }


  public override val __1990099180_Ptr: JNAPointer? by lazy {
    __1990099180_Interface.__1990099180_Ptr
  }


  public override val __618386078_Ptr: JNAPointer? by lazy {
    __618386078_Interface.__618386078_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1479330766_Interface, __1385386460_Interface, __1990099184_Interface,
        __1990099183_Interface, __1990099182_Interface, __1990099181_Interface,
        __1990099180_Interface, __618386078_Interface)

  private fun as_1479330766(): CoreWebView2Profile_Manual.WithDefault {
    if(pointer == NULL) {
      return(CoreWebView2Profile_Manual.ABI.makeCoreWebView2Profile_Manual(NULL))
    }
    val refiid = Guid.REFIID(guidOf<CoreWebView2Profile_Manual>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(CoreWebView2Profile_Manual.ABI.makeCoreWebView2Profile_Manual(ref.value))
  }

  private fun as_1385386460(): CoreWebView2Profile_Manual2.WithDefault {
    if(pointer == NULL) {
      return(CoreWebView2Profile_Manual2.ABI.makeCoreWebView2Profile_Manual2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<CoreWebView2Profile_Manual2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(CoreWebView2Profile_Manual2.ABI.makeCoreWebView2Profile_Manual2(ref.value))
  }

  private fun as_1990099184(): ICoreWebView2Profile2.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Profile2.ABI.makeICoreWebView2Profile2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Profile2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Profile2.ABI.makeICoreWebView2Profile2(ref.value))
  }

  private fun as_1990099183(): ICoreWebView2Profile3.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Profile3.ABI.makeICoreWebView2Profile3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Profile3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Profile3.ABI.makeICoreWebView2Profile3(ref.value))
  }

  private fun as_1990099182(): ICoreWebView2Profile4.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Profile4.ABI.makeICoreWebView2Profile4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Profile4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Profile4.ABI.makeICoreWebView2Profile4(ref.value))
  }

  private fun as_1990099181(): ICoreWebView2Profile5.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Profile5.ABI.makeICoreWebView2Profile5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Profile5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Profile5.ABI.makeICoreWebView2Profile5(ref.value))
  }

  private fun as_1990099180(): ICoreWebView2Profile6.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Profile6.ABI.makeICoreWebView2Profile6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Profile6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Profile6.ABI.makeICoreWebView2Profile6(ref.value))
  }

  private fun as_618386078(): ICoreWebView2Profile.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2Profile.ABI.makeICoreWebView2Profile(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2Profile>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2Profile.ABI.makeICoreWebView2Profile(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreWebView2Profile> {
    public override fun getValue() = CoreWebView2Profile(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2Profile): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2Profile, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2Profile {
      val address = segment.toRawLongValue()
      return CoreWebView2Profile(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2Profile): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
