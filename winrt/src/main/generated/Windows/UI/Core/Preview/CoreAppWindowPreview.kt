package Windows.UI.Core.Preview

import Windows.UI.WindowManagement.AppWindow
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

@ABIMarker(CoreAppWindowPreview.ABI::class)
@Signature("rc(Windows.UI.Core.Preview.CoreAppWindowPreview;{a4f6e665-365e-5fde-87a5-9543c3a15aa8})")
@WinRTByReference(brClass = CoreAppWindowPreview.ByReference::class)
public class CoreAppWindowPreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ICoreAppWindowPreview.WithDefault, IWinRTObject {
  private val __6733385_Interface: ICoreAppWindowPreview.WithDefault by lazy {
    as_6733385()
  }


  public override val __6733385_Ptr: JNAPointer? by lazy {
    __6733385_Interface.__6733385_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__6733385_Interface)

  private fun as_6733385(): ICoreAppWindowPreview.WithDefault {
    if(pointer == NULL) {
      return(ICoreAppWindowPreview.ABI.makeICoreAppWindowPreview(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICoreAppWindowPreview>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICoreAppWindowPreview.ABI.makeICoreAppWindowPreview(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CoreAppWindowPreview> {
    public override fun getValue() = CoreAppWindowPreview(pointer.getPointer(0))

    public fun setValue(value: CoreAppWindowPreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CoreAppWindowPreview, MemoryAddress> {
    public val ICoreAppWindowPreviewStatics_Instance: ICoreAppWindowPreviewStatics by lazy {
      createICoreAppWindowPreviewStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICoreAppWindowPreviewStatics(): ICoreAppWindowPreviewStatics {
      val refiid = Guid.REFIID(ICoreAppWindowPreviewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Core.Preview.CoreAppWindowPreview".toHandle(),refiid,interfacePtr)
      val result =
          ICoreAppWindowPreviewStatics.ABI.makeICoreAppWindowPreviewStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CoreAppWindowPreview {
      val address = segment.toRawLongValue()
      return CoreAppWindowPreview(Pointer(address))
    }

    public override fun toNative(obj: CoreAppWindowPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetIdFromWindow(window: AppWindow) =
        ABI.ICoreAppWindowPreviewStatics_Instance.GetIdFromWindow(window)
  }
}
