package Windows.ApplicationModel.Calls

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

@ABIMarker(PhoneLineConfiguration.ABI::class)
@Signature("rc(Windows.ApplicationModel.Calls.PhoneLineConfiguration;{fe265862-f64f-4312-b2a8-4e257721aa95})")
@WinRTByReference(brClass = PhoneLineConfiguration.ByReference::class)
public class PhoneLineConfiguration(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPhoneLineConfiguration.WithDefault, IWinRTObject {
  private val __1411118482_Interface: IPhoneLineConfiguration.WithDefault by lazy {
    as_1411118482()
  }


  public override val __1411118482_Ptr: JNAPointer? by lazy {
    __1411118482_Interface.__1411118482_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1411118482_Interface)

  private fun as_1411118482(): IPhoneLineConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IPhoneLineConfiguration.ABI.makeIPhoneLineConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPhoneLineConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPhoneLineConfiguration.ABI.makeIPhoneLineConfiguration(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneLineConfiguration> {
    public override fun getValue() = PhoneLineConfiguration(pointer.getPointer(0))

    public fun setValue(value: PhoneLineConfiguration): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneLineConfiguration, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PhoneLineConfiguration {
      val address = segment.toRawLongValue()
      return PhoneLineConfiguration(Pointer(address))
    }

    public override fun toNative(obj: PhoneLineConfiguration): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
