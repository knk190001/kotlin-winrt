package Windows.Devices.I2c.Provider

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

@ABIMarker(ProviderI2cConnectionSettings.ABI::class)
@Signature("rc(Windows.Devices.I2c.Provider.ProviderI2cConnectionSettings;{e9db4e34-e510-44b7-809d-f2f85b555339})")
@WinRTByReference(brClass = ProviderI2cConnectionSettings.ByReference::class)
public class ProviderI2cConnectionSettings(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IProviderI2cConnectionSettings.WithDefault, IWinRTObject {
  private val __1267512414_Interface: IProviderI2cConnectionSettings.WithDefault by lazy {
    as_1267512414()
  }


  public override val __1267512414_Ptr: JNAPointer? by lazy {
    __1267512414_Interface.__1267512414_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1267512414_Interface)

  private fun as_1267512414(): IProviderI2cConnectionSettings.WithDefault {
    if(pointer == NULL) {
      return(IProviderI2cConnectionSettings.ABI.makeIProviderI2cConnectionSettings(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IProviderI2cConnectionSettings>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IProviderI2cConnectionSettings.ABI.makeIProviderI2cConnectionSettings(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ProviderI2cConnectionSettings> {
    public override fun getValue() = ProviderI2cConnectionSettings(pointer.getPointer(0))

    public fun setValue(value: ProviderI2cConnectionSettings): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ProviderI2cConnectionSettings, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ProviderI2cConnectionSettings {
      val address = segment.toRawLongValue()
      return ProviderI2cConnectionSettings(Pointer(address))
    }

    public override fun toNative(obj: ProviderI2cConnectionSettings): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
