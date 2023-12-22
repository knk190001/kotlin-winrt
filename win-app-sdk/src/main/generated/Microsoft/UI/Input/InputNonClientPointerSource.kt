package Microsoft.UI.Input

import Microsoft.UI.WindowId
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

@ABIMarker(InputNonClientPointerSource.ABI::class)
@Signature("rc(Microsoft.UI.Input.InputNonClientPointerSource;{471732b4-3d07-5104-b192-ebacf71e86df})")
@WinRTByReference(brClass = InputNonClientPointerSource.ByReference::class)
public class InputNonClientPointerSource(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IInputNonClientPointerSource.WithDefault, IWinRTObject {
  private val __1925868017_Interface: IInputNonClientPointerSource.WithDefault by lazy {
    as_1925868017()
  }


  public override val __1925868017_Ptr: JNAPointer? by lazy {
    __1925868017_Interface.__1925868017_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1925868017_Interface)

  private fun as_1925868017(): IInputNonClientPointerSource.WithDefault {
    if(pointer == NULL) {
      return(IInputNonClientPointerSource.ABI.makeIInputNonClientPointerSource(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IInputNonClientPointerSource>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IInputNonClientPointerSource.ABI.makeIInputNonClientPointerSource(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<InputNonClientPointerSource> {
    public override fun getValue() = InputNonClientPointerSource(pointer.getPointer(0))

    public fun setValue(value: InputNonClientPointerSource): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<InputNonClientPointerSource, MemoryAddress> {
    public val IInputNonClientPointerSourceStatics_Instance: IInputNonClientPointerSourceStatics by
        lazy {
      createIInputNonClientPointerSourceStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIInputNonClientPointerSourceStatics(): IInputNonClientPointerSourceStatics {
      val refiid = Guid.REFIID(IInputNonClientPointerSourceStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Microsoft.UI.Input.InputNonClientPointerSource".toHandle(),refiid,interfacePtr)
      val result =
          IInputNonClientPointerSourceStatics.ABI.makeIInputNonClientPointerSourceStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): InputNonClientPointerSource {
      val address = segment.toRawLongValue()
      return InputNonClientPointerSource(Pointer(address))
    }

    public override fun toNative(obj: InputNonClientPointerSource): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetForWindowId(windowId: WindowId) =
        ABI.IInputNonClientPointerSourceStatics_Instance.GetForWindowId(windowId)
  }
}
