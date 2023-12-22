package Windows.UI.WindowManagement.Preview

import Windows.Foundation.Size
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

@ABIMarker(WindowManagementPreview.ABI::class)
@Signature("rc(Windows.UI.WindowManagement.Preview.WindowManagementPreview;{4ef55b0d-561d-513c-a67c-2c02b69cef41})")
@WinRTByReference(brClass = WindowManagementPreview.ByReference::class)
public class WindowManagementPreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWindowManagementPreview.WithDefault, IWinRTObject {
  private val __1063902120_Interface: IWindowManagementPreview.WithDefault by lazy {
    as_1063902120()
  }


  public override val __1063902120_Ptr: JNAPointer? by lazy {
    __1063902120_Interface.__1063902120_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1063902120_Interface)

  private fun as_1063902120(): IWindowManagementPreview.WithDefault {
    if(pointer == NULL) {
      return(IWindowManagementPreview.ABI.makeIWindowManagementPreview(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IWindowManagementPreview>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IWindowManagementPreview.ABI.makeIWindowManagementPreview(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<WindowManagementPreview> {
    public override fun getValue() = WindowManagementPreview(pointer.getPointer(0))

    public fun setValue(value: WindowManagementPreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<WindowManagementPreview, MemoryAddress> {
    public val IWindowManagementPreviewStatics_Instance: IWindowManagementPreviewStatics by lazy {
      createIWindowManagementPreviewStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIWindowManagementPreviewStatics(): IWindowManagementPreviewStatics {
      val refiid = Guid.REFIID(IWindowManagementPreviewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.WindowManagement.Preview.WindowManagementPreview".toHandle(),refiid,interfacePtr)
      val result =
          IWindowManagementPreviewStatics.ABI.makeIWindowManagementPreviewStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): WindowManagementPreview {
      val address = segment.toRawLongValue()
      return WindowManagementPreview(Pointer(address))
    }

    public override fun toNative(obj: WindowManagementPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun SetPreferredMinSize(window: AppWindow, preferredFrameMinSize: Size) =
        ABI.IWindowManagementPreviewStatics_Instance.SetPreferredMinSize(window,
        preferredFrameMinSize)
  }
}
