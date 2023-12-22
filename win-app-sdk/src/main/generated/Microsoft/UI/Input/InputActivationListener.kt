package Microsoft.UI.Input

import Microsoft.UI.Content.ContentIsland
import Microsoft.UI.WindowId
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(InputActivationListener.ABI::class)
@Signature("rc(Microsoft.UI.Input.InputActivationListener;{3b818627-6ce7-5e0d-a0f5-6684fd1aec78})")
@WinRTByReference(brClass = InputActivationListener.ByReference::class)
public class InputActivationListener(
  ptr: JNAPointer? = NULL
) : InputObject(ptr), IInputActivationListener.WithDefault, IWinRTObject {
  private val __1049217093_Interface: IInputActivationListener.WithDefault by lazy {
    as_1049217093()
  }


  public override val __1049217093_Ptr: JNAPointer? by lazy {
    __1049217093_Interface.__1049217093_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1049217093_Interface)

  private fun as_1049217093(): IInputActivationListener.WithDefault {
    if(pointer == NULL) {
      return(IInputActivationListener.ABI.makeIInputActivationListener(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputActivationListener>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputActivationListener.ABI.makeIInputActivationListener(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InputActivationListener> {
    public override fun getValue() = InputActivationListener(pointer.getPointer(0))

    public fun setValue(value: InputActivationListener): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InputActivationListener, MemoryAddress> {
    public val IInputActivationListenerStatics_Instance: IInputActivationListenerStatics by lazy {
      createIInputActivationListenerStatics()
    }


    public val IInputActivationListenerStatics2_Instance: IInputActivationListenerStatics2 by lazy {
      createIInputActivationListenerStatics2()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInputActivationListenerStatics(): IInputActivationListenerStatics {
      val refiid = Guid.REFIID(IInputActivationListenerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Input.InputActivationListener".toHandle(),refiid,interfacePtr)
      val result =
          IInputActivationListenerStatics.ABI.makeIInputActivationListenerStatics(interfacePtr.value)
      return result
    }

    public fun createIInputActivationListenerStatics2(): IInputActivationListenerStatics2 {
      val refiid = Guid.REFIID(IInputActivationListenerStatics2.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Input.InputActivationListener".toHandle(),refiid,interfacePtr)
      val result =
          IInputActivationListenerStatics2.ABI.makeIInputActivationListenerStatics2(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InputActivationListener {
      val address = segment.toRawLongValue()
      return InputActivationListener(Pointer(address))
    }

    public override fun toNative(obj: InputActivationListener): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForWindowId(windowId: WindowId) =
        ABI.IInputActivationListenerStatics_Instance.GetForWindowId(windowId)

    public fun GetForIsland(island: ContentIsland) =
        ABI.IInputActivationListenerStatics2_Instance.GetForIsland(island)
  }
}
