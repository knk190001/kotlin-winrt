package Windows.ApplicationModel.Core

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

@ABIMarker(CoreApplicationView.ABI::class)
@Signature("rc(Windows.ApplicationModel.Core.CoreApplicationView;{638bb2db-451d-4661-b099-414f34ffb9f1})")
@WinRTByReference(brClass = CoreApplicationView.ByReference::class)
public class CoreApplicationView(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreApplicationView.WithDefault, ICoreApplicationView2.WithDefault,
    ICoreApplicationView3.WithDefault, ICoreApplicationView5.WithDefault,
    ICoreApplicationView6.WithDefault, IWinRTObject {
  private val __1817371734_Interface: ICoreApplicationView.WithDefault by lazy {
    as_1817371734()
  }


  private val __503948956_Interface: ICoreApplicationView2.WithDefault by lazy {
    as_503948956()
  }


  private val __503948957_Interface: ICoreApplicationView3.WithDefault by lazy {
    as_503948957()
  }


  private val __503948959_Interface: ICoreApplicationView5.WithDefault by lazy {
    as_503948959()
  }


  private val __503948960_Interface: ICoreApplicationView6.WithDefault by lazy {
    as_503948960()
  }


  public override val __1817371734_Ptr: JNAPointer? by lazy {
    __1817371734_Interface.__1817371734_Ptr
  }


  public override val __503948956_Ptr: JNAPointer? by lazy {
    __503948956_Interface.__503948956_Ptr
  }


  public override val __503948957_Ptr: JNAPointer? by lazy {
    __503948957_Interface.__503948957_Ptr
  }


  public override val __503948959_Ptr: JNAPointer? by lazy {
    __503948959_Interface.__503948959_Ptr
  }


  public override val __503948960_Ptr: JNAPointer? by lazy {
    __503948960_Interface.__503948960_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1817371734_Interface, __503948956_Interface, __503948957_Interface,
        __503948959_Interface, __503948960_Interface)

  private fun as_1817371734(): ICoreApplicationView.WithDefault {
    if(pointer == NULL) {
      return(ICoreApplicationView.ABI.makeICoreApplicationView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreApplicationView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreApplicationView.ABI.makeICoreApplicationView(ref.value))
  }

  private fun as_503948956(): ICoreApplicationView2.WithDefault {
    if(pointer == NULL) {
      return(ICoreApplicationView2.ABI.makeICoreApplicationView2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreApplicationView2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreApplicationView2.ABI.makeICoreApplicationView2(ref.value))
  }

  private fun as_503948957(): ICoreApplicationView3.WithDefault {
    if(pointer == NULL) {
      return(ICoreApplicationView3.ABI.makeICoreApplicationView3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreApplicationView3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreApplicationView3.ABI.makeICoreApplicationView3(ref.value))
  }

  private fun as_503948959(): ICoreApplicationView5.WithDefault {
    if(pointer == NULL) {
      return(ICoreApplicationView5.ABI.makeICoreApplicationView5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreApplicationView5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreApplicationView5.ABI.makeICoreApplicationView5(ref.value))
  }

  private fun as_503948960(): ICoreApplicationView6.WithDefault {
    if(pointer == NULL) {
      return(ICoreApplicationView6.ABI.makeICoreApplicationView6(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreApplicationView6>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreApplicationView6.ABI.makeICoreApplicationView6(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreApplicationView> {
    public override fun getValue() = CoreApplicationView(pointer.getPointer(0))

    public fun setValue(value: CoreApplicationView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreApplicationView, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): CoreApplicationView {
      val address = segment.toRawLongValue()
      return CoreApplicationView(Pointer(address))
    }

    public override fun toNative(obj: CoreApplicationView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
