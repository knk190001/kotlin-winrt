package Windows.ApplicationModel.Contacts

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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(KnownContactField.ABI::class)
@WinRTByReference(brClass = KnownContactField.ByReference::class)
public class KnownContactField(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<KnownContactField> {
    public override fun getValue() = KnownContactField(pointer.getPointer(0))

    public fun setValue(value: KnownContactField): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<KnownContactField, MemoryAddress> {
    public val IKnownContactFieldStatics_Instance: IKnownContactFieldStatics by lazy {
      createIKnownContactFieldStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIKnownContactFieldStatics(): IKnownContactFieldStatics {
      val refiid = Guid.REFIID(IKnownContactFieldStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Contacts.KnownContactField".toHandle(),refiid,interfacePtr)
      val result = IKnownContactFieldStatics.ABI.makeIKnownContactFieldStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): KnownContactField {
      val address = segment.toRawLongValue()
      return KnownContactField(Pointer(address))
    }

    public override fun toNative(obj: KnownContactField): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_Email() = ABI.IKnownContactFieldStatics_Instance.get_Email()

    public fun get_PhoneNumber() = ABI.IKnownContactFieldStatics_Instance.get_PhoneNumber()

    public fun get_Location() = ABI.IKnownContactFieldStatics_Instance.get_Location()

    public fun get_InstantMessage() = ABI.IKnownContactFieldStatics_Instance.get_InstantMessage()

    public fun ConvertNameToType(name: String) =
        ABI.IKnownContactFieldStatics_Instance.ConvertNameToType(name)

    public fun ConvertTypeToName(type: ContactFieldType) =
        ABI.IKnownContactFieldStatics_Instance.ConvertTypeToName(type)
  }
}
