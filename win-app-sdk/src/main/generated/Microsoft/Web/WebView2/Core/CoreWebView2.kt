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

@ABIMarker(CoreWebView2.ABI::class)
@Signature("rc(Microsoft.Web.WebView2.Core.CoreWebView2;{2850f27c-0c9d-5cdc-b356-18f5b97d9fcf})")
@WinRTByReference(brClass = CoreWebView2.ByReference::class)
public class CoreWebView2(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreWebView2PrivatePartial.WithDefault, ICoreWebView2_10.WithDefault,
    ICoreWebView2_11.WithDefault, ICoreWebView2_12.WithDefault, ICoreWebView2_13.WithDefault,
    ICoreWebView2_14.WithDefault, ICoreWebView2_15.WithDefault, ICoreWebView2_16.WithDefault,
    ICoreWebView2_17.WithDefault, ICoreWebView2_18.WithDefault, ICoreWebView2_19.WithDefault,
    ICoreWebView2_2.WithDefault, ICoreWebView2_3.WithDefault, ICoreWebView2_4.WithDefault,
    ICoreWebView2_5.WithDefault, ICoreWebView2_6.WithDefault, ICoreWebView2_7.WithDefault,
    ICoreWebView2_8.WithDefault, ICoreWebView2_9.WithDefault, ICoreWebView2.WithDefault,
    IWinRTObject {
  private val __1050608475_Interface: ICoreWebView2PrivatePartial.WithDefault by lazy {
    as_1050608475()
  }


  private val __1813492969_Interface: ICoreWebView2_10.WithDefault by lazy {
    as_1813492969()
  }


  private val __1813492968_Interface: ICoreWebView2_11.WithDefault by lazy {
    as_1813492968()
  }


  private val __1813492967_Interface: ICoreWebView2_12.WithDefault by lazy {
    as_1813492967()
  }


  private val __1813492966_Interface: ICoreWebView2_13.WithDefault by lazy {
    as_1813492966()
  }


  private val __1813492965_Interface: ICoreWebView2_14.WithDefault by lazy {
    as_1813492965()
  }


  private val __1813492964_Interface: ICoreWebView2_15.WithDefault by lazy {
    as_1813492964()
  }


  private val __1813492963_Interface: ICoreWebView2_16.WithDefault by lazy {
    as_1813492963()
  }


  private val __1813492962_Interface: ICoreWebView2_17.WithDefault by lazy {
    as_1813492962()
  }


  private val __1813492961_Interface: ICoreWebView2_18.WithDefault by lazy {
    as_1813492961()
  }


  private val __1813492960_Interface: ICoreWebView2_19.WithDefault by lazy {
    as_1813492960()
  }


  private val __335594438_Interface: ICoreWebView2_2.WithDefault by lazy {
    as_335594438()
  }


  private val __335594437_Interface: ICoreWebView2_3.WithDefault by lazy {
    as_335594437()
  }


  private val __335594436_Interface: ICoreWebView2_4.WithDefault by lazy {
    as_335594436()
  }


  private val __335594435_Interface: ICoreWebView2_5.WithDefault by lazy {
    as_335594435()
  }


  private val __335594434_Interface: ICoreWebView2_6.WithDefault by lazy {
    as_335594434()
  }


  private val __335594433_Interface: ICoreWebView2_7.WithDefault by lazy {
    as_335594433()
  }


  private val __335594432_Interface: ICoreWebView2_8.WithDefault by lazy {
    as_335594432()
  }


  private val __335594431_Interface: ICoreWebView2_9.WithDefault by lazy {
    as_335594431()
  }


  private val __21997127_Interface: ICoreWebView2.WithDefault by lazy {
    as_21997127()
  }


  public override val __1050608475_Ptr: JNAPointer? by lazy {
    __1050608475_Interface.__1050608475_Ptr
  }


  public override val __1813492969_Ptr: JNAPointer? by lazy {
    __1813492969_Interface.__1813492969_Ptr
  }


  public override val __1813492968_Ptr: JNAPointer? by lazy {
    __1813492968_Interface.__1813492968_Ptr
  }


  public override val __1813492967_Ptr: JNAPointer? by lazy {
    __1813492967_Interface.__1813492967_Ptr
  }


  public override val __1813492966_Ptr: JNAPointer? by lazy {
    __1813492966_Interface.__1813492966_Ptr
  }


  public override val __1813492965_Ptr: JNAPointer? by lazy {
    __1813492965_Interface.__1813492965_Ptr
  }


  public override val __1813492964_Ptr: JNAPointer? by lazy {
    __1813492964_Interface.__1813492964_Ptr
  }


  public override val __1813492963_Ptr: JNAPointer? by lazy {
    __1813492963_Interface.__1813492963_Ptr
  }


  public override val __1813492962_Ptr: JNAPointer? by lazy {
    __1813492962_Interface.__1813492962_Ptr
  }


  public override val __1813492961_Ptr: JNAPointer? by lazy {
    __1813492961_Interface.__1813492961_Ptr
  }


  public override val __1813492960_Ptr: JNAPointer? by lazy {
    __1813492960_Interface.__1813492960_Ptr
  }


  public override val __335594438_Ptr: JNAPointer? by lazy {
    __335594438_Interface.__335594438_Ptr
  }


  public override val __335594437_Ptr: JNAPointer? by lazy {
    __335594437_Interface.__335594437_Ptr
  }


  public override val __335594436_Ptr: JNAPointer? by lazy {
    __335594436_Interface.__335594436_Ptr
  }


  public override val __335594435_Ptr: JNAPointer? by lazy {
    __335594435_Interface.__335594435_Ptr
  }


  public override val __335594434_Ptr: JNAPointer? by lazy {
    __335594434_Interface.__335594434_Ptr
  }


  public override val __335594433_Ptr: JNAPointer? by lazy {
    __335594433_Interface.__335594433_Ptr
  }


  public override val __335594432_Ptr: JNAPointer? by lazy {
    __335594432_Interface.__335594432_Ptr
  }


  public override val __335594431_Ptr: JNAPointer? by lazy {
    __335594431_Interface.__335594431_Ptr
  }


  public override val __21997127_Ptr: JNAPointer? by lazy {
    __21997127_Interface.__21997127_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1050608475_Interface, __1813492969_Interface, __1813492968_Interface,
        __1813492967_Interface, __1813492966_Interface, __1813492965_Interface,
        __1813492964_Interface, __1813492963_Interface, __1813492962_Interface,
        __1813492961_Interface, __1813492960_Interface, __335594438_Interface,
        __335594437_Interface, __335594436_Interface, __335594435_Interface, __335594434_Interface,
        __335594433_Interface, __335594432_Interface, __335594431_Interface, __21997127_Interface)

  private fun as_1050608475(): ICoreWebView2PrivatePartial.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2PrivatePartial.ABI.makeICoreWebView2PrivatePartial(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2PrivatePartial>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2PrivatePartial.ABI.makeICoreWebView2PrivatePartial(ref.value))
  }

  private fun as_1813492969(): ICoreWebView2_10.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2_10.ABI.makeICoreWebView2_10(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2_10>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2_10.ABI.makeICoreWebView2_10(ref.value))
  }

  private fun as_1813492968(): ICoreWebView2_11.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2_11.ABI.makeICoreWebView2_11(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2_11>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2_11.ABI.makeICoreWebView2_11(ref.value))
  }

  private fun as_1813492967(): ICoreWebView2_12.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2_12.ABI.makeICoreWebView2_12(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2_12>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2_12.ABI.makeICoreWebView2_12(ref.value))
  }

  private fun as_1813492966(): ICoreWebView2_13.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2_13.ABI.makeICoreWebView2_13(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2_13>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2_13.ABI.makeICoreWebView2_13(ref.value))
  }

  private fun as_1813492965(): ICoreWebView2_14.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2_14.ABI.makeICoreWebView2_14(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2_14>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2_14.ABI.makeICoreWebView2_14(ref.value))
  }

  private fun as_1813492964(): ICoreWebView2_15.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2_15.ABI.makeICoreWebView2_15(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2_15>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2_15.ABI.makeICoreWebView2_15(ref.value))
  }

  private fun as_1813492963(): ICoreWebView2_16.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2_16.ABI.makeICoreWebView2_16(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2_16>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2_16.ABI.makeICoreWebView2_16(ref.value))
  }

  private fun as_1813492962(): ICoreWebView2_17.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2_17.ABI.makeICoreWebView2_17(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2_17>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2_17.ABI.makeICoreWebView2_17(ref.value))
  }

  private fun as_1813492961(): ICoreWebView2_18.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2_18.ABI.makeICoreWebView2_18(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2_18>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2_18.ABI.makeICoreWebView2_18(ref.value))
  }

  private fun as_1813492960(): ICoreWebView2_19.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2_19.ABI.makeICoreWebView2_19(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2_19>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2_19.ABI.makeICoreWebView2_19(ref.value))
  }

  private fun as_335594438(): ICoreWebView2_2.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2_2.ABI.makeICoreWebView2_2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2_2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2_2.ABI.makeICoreWebView2_2(ref.value))
  }

  private fun as_335594437(): ICoreWebView2_3.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2_3.ABI.makeICoreWebView2_3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2_3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2_3.ABI.makeICoreWebView2_3(ref.value))
  }

  private fun as_335594436(): ICoreWebView2_4.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2_4.ABI.makeICoreWebView2_4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2_4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2_4.ABI.makeICoreWebView2_4(ref.value))
  }

  private fun as_335594435(): ICoreWebView2_5.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2_5.ABI.makeICoreWebView2_5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2_5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2_5.ABI.makeICoreWebView2_5(ref.value))
  }

  private fun as_335594434(): ICoreWebView2_6.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2_6.ABI.makeICoreWebView2_6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2_6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2_6.ABI.makeICoreWebView2_6(ref.value))
  }

  private fun as_335594433(): ICoreWebView2_7.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2_7.ABI.makeICoreWebView2_7(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2_7>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2_7.ABI.makeICoreWebView2_7(ref.value))
  }

  private fun as_335594432(): ICoreWebView2_8.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2_8.ABI.makeICoreWebView2_8(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2_8>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2_8.ABI.makeICoreWebView2_8(ref.value))
  }

  private fun as_335594431(): ICoreWebView2_9.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2_9.ABI.makeICoreWebView2_9(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2_9>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2_9.ABI.makeICoreWebView2_9(ref.value))
  }

  private fun as_21997127(): ICoreWebView2.WithDefault {
    if(pointer == NULL) {
      return(ICoreWebView2.ABI.makeICoreWebView2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreWebView2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreWebView2.ABI.makeICoreWebView2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CoreWebView2> {
    public override fun getValue() = CoreWebView2(pointer.getPointer(0))

    public fun setValue(value: CoreWebView2): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreWebView2, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreWebView2 {
      val address = segment.toRawLongValue()
      return CoreWebView2(Pointer(address))
    }

    public override fun toNative(obj: CoreWebView2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
