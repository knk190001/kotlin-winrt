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

@ABIMarker(RemoteAutomationDisconnectedEventArgs.ABI::class)
@Signature("rc(Windows.UI.UIAutomation.Core.RemoteAutomationDisconnectedEventArgs;{bbb33a3d-5d90-5c38-9eb2-dd9dcc1b2e3f})")
@WinRTByReference(brClass = RemoteAutomationDisconnectedEventArgs.ByReference::class)
public class RemoteAutomationDisconnectedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IRemoteAutomationDisconnectedEventArgs.WithDefault, IWinRTObject {
  private val __137705879_Interface: IRemoteAutomationDisconnectedEventArgs.WithDefault by lazy {
    as_137705879()
  }


  public override val __137705879_Ptr: JNAPointer? by lazy {
    __137705879_Interface.__137705879_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__137705879_Interface)

  private fun as_137705879(): IRemoteAutomationDisconnectedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IRemoteAutomationDisconnectedEventArgs.ABI.makeIRemoteAutomationDisconnectedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IRemoteAutomationDisconnectedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IRemoteAutomationDisconnectedEventArgs.ABI.makeIRemoteAutomationDisconnectedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<RemoteAutomationDisconnectedEventArgs> {
    public override fun getValue() = RemoteAutomationDisconnectedEventArgs(pointer.getPointer(0))

    public fun setValue(value: RemoteAutomationDisconnectedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<RemoteAutomationDisconnectedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): RemoteAutomationDisconnectedEventArgs {
      val address = segment.toRawLongValue()
      return RemoteAutomationDisconnectedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: RemoteAutomationDisconnectedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
