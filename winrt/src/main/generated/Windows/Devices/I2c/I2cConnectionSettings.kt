package Windows.Devices.I2c

import Windows.Devices.I2c.II2cConnectionSettingsFactory.ABI.IID
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
import kotlin.Int
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(I2cConnectionSettings.ABI::class)
@Signature("rc(Windows.Devices.I2c.I2cConnectionSettings;{f2db1307-ab6f-4639-a767-54536dc3460f})")
@WinRTByReference(brClass = I2cConnectionSettings.ByReference::class)
public class I2cConnectionSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), II2cConnectionSettings.WithDefault, IWinRTObject {
  private val __162704176_Interface: II2cConnectionSettings.WithDefault by lazy {
    as_162704176()
  }


  public override val __162704176_Ptr: JNAPointer? by lazy {
    __162704176_Interface.__162704176_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__162704176_Interface)

  public constructor(slaveAddress: Int) : this(ABI.activate(slaveAddress))

  private fun as_162704176(): II2cConnectionSettings.WithDefault {
    if(pointer == NULL) {
      return(II2cConnectionSettings.ABI.makeII2cConnectionSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<II2cConnectionSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(II2cConnectionSettings.ABI.makeII2cConnectionSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<I2cConnectionSettings> {
    public override fun getValue() = I2cConnectionSettings(pointer.getPointer(0))

    public fun setValue(value: I2cConnectionSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<I2cConnectionSettings, MemoryAddress> {
    public val II2cConnectionSettingsFactory_Instance: II2cConnectionSettingsFactory by lazy {
      createII2cConnectionSettingsFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createII2cConnectionSettingsFactory(): II2cConnectionSettingsFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Devices.I2c.I2cConnectionSettings".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(II2cConnectionSettingsFactory.ABI.makeII2cConnectionSettingsFactory(factoryActivatorPtr.value))
    }

    public fun activate(slaveAddress: Int): JNAPointer? =
        II2cConnectionSettingsFactory_Instance.Create(slaveAddress)?.pointer

    public override fun fromNative(segment: MemoryAddress): I2cConnectionSettings {
      val address = segment.toRawLongValue()
      return I2cConnectionSettings(Pointer(address))
    }

    public override fun toNative(obj: I2cConnectionSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
