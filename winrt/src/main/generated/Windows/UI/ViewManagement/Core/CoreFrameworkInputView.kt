package Windows.UI.ViewManagement.Core

import Windows.UI.UIContext
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

@ABIMarker(CoreFrameworkInputView.ABI::class)
@Signature("rc(Windows.UI.ViewManagement.Core.CoreFrameworkInputView;{d77c94ae-46b8-5d4a-9489-8ddec3d639a6})")
@WinRTByReference(brClass = CoreFrameworkInputView.ByReference::class)
public class CoreFrameworkInputView(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreFrameworkInputView.WithDefault, IWinRTObject {
  private val __1422234749_Interface: ICoreFrameworkInputView.WithDefault by lazy {
    as_1422234749()
  }


  public override val __1422234749_Ptr: JNAPointer? by lazy {
    __1422234749_Interface.__1422234749_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1422234749_Interface)

  private fun as_1422234749(): ICoreFrameworkInputView.WithDefault {
    if(pointer == NULL) {
      return(ICoreFrameworkInputView.ABI.makeICoreFrameworkInputView(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreFrameworkInputView>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreFrameworkInputView.ABI.makeICoreFrameworkInputView(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreFrameworkInputView> {
    public override fun getValue() = CoreFrameworkInputView(pointer.getPointer(0))

    public fun setValue(value: CoreFrameworkInputView): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreFrameworkInputView, MemoryAddress> {
    public val ICoreFrameworkInputViewStatics_Instance: ICoreFrameworkInputViewStatics by lazy {
      createICoreFrameworkInputViewStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICoreFrameworkInputViewStatics(): ICoreFrameworkInputViewStatics {
      val refiid = Guid.REFIID(ICoreFrameworkInputViewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.ViewManagement.Core.CoreFrameworkInputView".toHandle(),refiid,interfacePtr)
      val result =
          ICoreFrameworkInputViewStatics.ABI.makeICoreFrameworkInputViewStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CoreFrameworkInputView {
      val address = segment.toRawLongValue()
      return CoreFrameworkInputView(Pointer(address))
    }

    public override fun toNative(obj: CoreFrameworkInputView): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForUIContext(context: UIContext) =
        ABI.ICoreFrameworkInputViewStatics_Instance.GetForUIContext(context)

    public fun GetForCurrentView() = ABI.ICoreFrameworkInputViewStatics_Instance.GetForCurrentView()
  }
}
