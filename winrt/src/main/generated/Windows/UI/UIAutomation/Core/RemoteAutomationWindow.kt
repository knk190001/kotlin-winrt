package Windows.UI.UIAutomation.Core

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

@ABIMarker(RemoteAutomationWindow.ABI::class)
@Signature("rc(Windows.UI.UIAutomation.Core.RemoteAutomationWindow;{7c607689-496d-512a-9bd5-c050cfaf1428})")
@WinRTByReference(brClass = RemoteAutomationWindow.ByReference::class)
public class RemoteAutomationWindow(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteAutomationWindow.WithDefault, IWinRTObject {
  private val __944622653_Interface: IRemoteAutomationWindow.WithDefault by lazy {
    as_944622653()
  }


  public override val __944622653_Ptr: JNAPointer? by lazy {
    __944622653_Interface.__944622653_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__944622653_Interface)

  private fun as_944622653(): IRemoteAutomationWindow.WithDefault {
    if(pointer == NULL) {
      return(IRemoteAutomationWindow.ABI.makeIRemoteAutomationWindow(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteAutomationWindow>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteAutomationWindow.ABI.makeIRemoteAutomationWindow(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteAutomationWindow> {
    public override fun getValue() = RemoteAutomationWindow(pointer.getPointer(0))

    public fun setValue(value: RemoteAutomationWindow): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteAutomationWindow, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RemoteAutomationWindow {
      val address = segment.toRawLongValue()
      return RemoteAutomationWindow(Pointer(address))
    }

    public override fun toNative(obj: RemoteAutomationWindow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
