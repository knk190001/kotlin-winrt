package Windows.Devices.I2c

import Windows.Devices.I2c.Provider.II2cProvider
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

@ABIMarker(I2cController.ABI::class)
@Signature("rc(Windows.Devices.I2c.I2cController;{c48ab1b2-87a0-4166-8e3e-b4b8f97cd729})")
@WinRTByReference(brClass = I2cController.ByReference::class)
public class I2cController(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), II2cController.WithDefault, IWinRTObject {
  private val __1676020149_Interface: II2cController.WithDefault by lazy {
    as_1676020149()
  }


  public override val __1676020149_Ptr: JNAPointer? by lazy {
    __1676020149_Interface.__1676020149_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1676020149_Interface)

  private fun as_1676020149(): II2cController.WithDefault {
    if(pointer == NULL) {
      return(II2cController.ABI.makeII2cController(NULL))
    }
    val refiid = Guid.REFIID(guidOf<II2cController>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(II2cController.ABI.makeII2cController(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<I2cController>
      {
    public override fun getValue() = I2cController(pointer.getPointer(0))

    public fun setValue(value: I2cController): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<I2cController, MemoryAddress> {
    public val II2cControllerStatics_Instance: II2cControllerStatics by lazy {
      createII2cControllerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createII2cControllerStatics(): II2cControllerStatics {
      val refiid = Guid.REFIID(II2cControllerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.I2c.I2cController".toHandle(),refiid,interfacePtr)
      val result = II2cControllerStatics.ABI.makeII2cControllerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): I2cController {
      val address = segment.toRawLongValue()
      return I2cController(Pointer(address))
    }

    public override fun toNative(obj: I2cController): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetControllersAsync(provider: II2cProvider) =
        ABI.II2cControllerStatics_Instance.GetControllersAsync(provider)

    public fun GetDefaultAsync() = ABI.II2cControllerStatics_Instance.GetDefaultAsync()
  }
}
