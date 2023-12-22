package Windows.UI.Input.Preview

import Windows.UI.WindowManagement.AppWindow
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
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

@ABIMarker(InputActivationListenerPreview.ABI::class)
@WinRTByReference(brClass = InputActivationListenerPreview.ByReference::class)
public class InputActivationListenerPreview(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InputActivationListenerPreview> {
    public override fun getValue() = InputActivationListenerPreview(pointer.getPointer(0))

    public fun setValue(value: InputActivationListenerPreview): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InputActivationListenerPreview, MemoryAddress> {
    public val IInputActivationListenerPreviewStatics_Instance:
        IInputActivationListenerPreviewStatics by lazy {
      createIInputActivationListenerPreviewStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInputActivationListenerPreviewStatics():
        IInputActivationListenerPreviewStatics {
      val refiid = Guid.REFIID(IInputActivationListenerPreviewStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Input.Preview.InputActivationListenerPreview".toHandle(),refiid,interfacePtr)
      val result =
          IInputActivationListenerPreviewStatics.ABI.makeIInputActivationListenerPreviewStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InputActivationListenerPreview {
      val address = segment.toRawLongValue()
      return InputActivationListenerPreview(Pointer(address))
    }

    public override fun toNative(obj: InputActivationListenerPreview): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun CreateForApplicationWindow(window: AppWindow) =
        ABI.IInputActivationListenerPreviewStatics_Instance.CreateForApplicationWindow(window)
  }
}
