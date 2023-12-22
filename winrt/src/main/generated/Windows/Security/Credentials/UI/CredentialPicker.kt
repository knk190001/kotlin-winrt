package Windows.Security.Credentials.UI

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

@ABIMarker(CredentialPicker.ABI::class)
@WinRTByReference(brClass = CredentialPicker.ByReference::class)
public class CredentialPicker(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<CredentialPicker> {
    public override fun getValue() = CredentialPicker(pointer.getPointer(0))

    public fun setValue(value: CredentialPicker): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<CredentialPicker, MemoryAddress> {
    public val ICredentialPickerStatics_Instance: ICredentialPickerStatics by lazy {
      createICredentialPickerStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createICredentialPickerStatics(): ICredentialPickerStatics {
      val refiid = Guid.REFIID(ICredentialPickerStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Security.Credentials.UI.CredentialPicker".toHandle(),refiid,interfacePtr)
      val result = ICredentialPickerStatics.ABI.makeICredentialPickerStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): CredentialPicker {
      val address = segment.toRawLongValue()
      return CredentialPicker(Pointer(address))
    }

    public override fun toNative(obj: CredentialPicker): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun PickAsync(options: CredentialPickerOptions) =
        ABI.ICredentialPickerStatics_Instance.PickAsync(options)

    public fun PickAsync(targetName: String, message: String) =
        ABI.ICredentialPickerStatics_Instance.PickAsync(targetName, message)

    public fun PickAsync(
      targetName: String,
      message: String,
      caption: String
    ) = ABI.ICredentialPickerStatics_Instance.PickAsync(targetName, message, caption)
  }
}
