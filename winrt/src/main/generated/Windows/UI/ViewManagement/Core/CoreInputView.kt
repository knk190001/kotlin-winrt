package Windows.UI.ViewManagement.Core

import Windows.UI.UIContext
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(CoreInputView.ABI::class)
@Signature("rc(Windows.UI.ViewManagement.Core.CoreInputView;{c770cd7a-7001-4c32-bf94-25c1f554cbf1})")
@WinRTByReference(brClass = CoreInputView.ByReference::class)
public class CoreInputView(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreInputView.WithDefault, ICoreInputView2.WithDefault,
    ICoreInputView3.WithDefault, ICoreInputView4.WithDefault, ICoreInputView5.WithDefault,
    IWinRTObject {
  private val __364805885_Interface: ICoreInputView.WithDefault by lazy {
    as_364805885()
  }


  private val __1575919403_Interface: ICoreInputView2.WithDefault by lazy {
    as_1575919403()
  }


  private val __1575919402_Interface: ICoreInputView3.WithDefault by lazy {
    as_1575919402()
  }


  private val __1575919401_Interface: ICoreInputView4.WithDefault by lazy {
    as_1575919401()
  }


  private val __1575919400_Interface: ICoreInputView5.WithDefault by lazy {
    as_1575919400()
  }


  public override val __364805885_Ptr: JNAPointer? by lazy {
    __364805885_Interface.__364805885_Ptr
  }


  public override val __1575919403_Ptr: JNAPointer? by lazy {
    __1575919403_Interface.__1575919403_Ptr
  }


  public override val __1575919402_Ptr: JNAPointer? by lazy {
    __1575919402_Interface.__1575919402_Ptr
  }


  public override val __1575919401_Ptr: JNAPointer? by lazy {
    __1575919401_Interface.__1575919401_Ptr
  }


  public override val __1575919400_Ptr: JNAPointer? by lazy {
    __1575919400_Interface.__1575919400_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__364805885_Interface, __1575919403_Interface, __1575919402_Interface,
        __1575919401_Interface, __1575919400_Interface)

  private fun as_364805885(): ICoreInputView.WithDefault {
    if(pointer == NULL) {
      return(ICoreInputView.ABI.makeICoreInputView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreInputView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreInputView.ABI.makeICoreInputView(ref.value))
  }

  private fun as_1575919403(): ICoreInputView2.WithDefault {
    if(pointer == NULL) {
      return(ICoreInputView2.ABI.makeICoreInputView2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreInputView2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreInputView2.ABI.makeICoreInputView2(ref.value))
  }

  private fun as_1575919402(): ICoreInputView3.WithDefault {
    if(pointer == NULL) {
      return(ICoreInputView3.ABI.makeICoreInputView3(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreInputView3>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreInputView3.ABI.makeICoreInputView3(ref.value))
  }

  private fun as_1575919401(): ICoreInputView4.WithDefault {
    if(pointer == NULL) {
      return(ICoreInputView4.ABI.makeICoreInputView4(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreInputView4>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreInputView4.ABI.makeICoreInputView4(ref.value))
  }

  private fun as_1575919400(): ICoreInputView5.WithDefault {
    if(pointer == NULL) {
      return(ICoreInputView5.ABI.makeICoreInputView5(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreInputView5>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreInputView5.ABI.makeICoreInputView5(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<CoreInputView>
      {
    public override fun getValue() = CoreInputView(pointer.getPointer(0))

    public fun setValue(value: CoreInputView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreInputView, MemoryAddress> {
    public val ICoreInputViewStatics2_Instance: ICoreInputViewStatics2 by lazy {
      createICoreInputViewStatics2()
    }


    public val ICoreInputViewStatics_Instance: ICoreInputViewStatics by lazy {
      createICoreInputViewStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICoreInputViewStatics2(): ICoreInputViewStatics2 {
      val refiid = Guid.REFIID(ICoreInputViewStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.Core.CoreInputView".toHandle(),refiid,interfacePtr)
      val result = ICoreInputViewStatics2.ABI.makeICoreInputViewStatics2(interfacePtr.value)
      return result
    }

    public fun createICoreInputViewStatics(): ICoreInputViewStatics {
      val refiid = Guid.REFIID(ICoreInputViewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.Core.CoreInputView".toHandle(),refiid,interfacePtr)
      val result = ICoreInputViewStatics.ABI.makeICoreInputViewStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CoreInputView {
      val address = segment.toRawLongValue()
      return CoreInputView(Pointer(address))
    }

    public override fun toNative(obj: CoreInputView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForUIContext(context: UIContext) =
        ABI.ICoreInputViewStatics2_Instance.GetForUIContext(context)

    public fun GetForCurrentView() = ABI.ICoreInputViewStatics_Instance.GetForCurrentView()
  }
}
