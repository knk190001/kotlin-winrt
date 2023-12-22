package Windows.Devices.Spi

import Windows.Devices.Spi.Provider.ISpiProvider
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

@ABIMarker(SpiController.ABI::class)
@Signature("rc(Windows.Devices.Spi.SpiController;{a8d3c829-9895-4159-a934-8741f1ee6d27})")
@WinRTByReference(brClass = SpiController.ByReference::class)
public class SpiController(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISpiController.WithDefault, IWinRTObject {
  private val __716528239_Interface: ISpiController.WithDefault by lazy {
    as_716528239()
  }


  public override val __716528239_Ptr: JNAPointer? by lazy {
    __716528239_Interface.__716528239_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__716528239_Interface)

  private fun as_716528239(): ISpiController.WithDefault {
    if(pointer == NULL) {
      return(ISpiController.ABI.makeISpiController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISpiController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISpiController.ABI.makeISpiController(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<SpiController>
      {
    public override fun getValue() = SpiController(pointer.getPointer(0))

    public fun setValue(value: SpiController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SpiController, MemoryAddress> {
    public val ISpiControllerStatics_Instance: ISpiControllerStatics by lazy {
      createISpiControllerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createISpiControllerStatics(): ISpiControllerStatics {
      val refiid = Guid.REFIID(ISpiControllerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.Spi.SpiController".toHandle(),refiid,interfacePtr)
      val result = ISpiControllerStatics.ABI.makeISpiControllerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): SpiController {
      val address = segment.toRawLongValue()
      return SpiController(Pointer(address))
    }

    public override fun toNative(obj: SpiController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetDefaultAsync() = ABI.ISpiControllerStatics_Instance.GetDefaultAsync()

    public fun GetControllersAsync(provider: ISpiProvider) =
        ABI.ISpiControllerStatics_Instance.GetControllersAsync(provider)
  }
}
