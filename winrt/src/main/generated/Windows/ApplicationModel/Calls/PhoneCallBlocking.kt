package Windows.ApplicationModel.Calls

import Windows.Foundation.Collections.IIterable
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
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PhoneCallBlocking.ABI::class)
@WinRTByReference(brClass = PhoneCallBlocking.ByReference::class)
public class PhoneCallBlocking(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IWinRTObject {
  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf()

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PhoneCallBlocking> {
    public override fun getValue() = PhoneCallBlocking(pointer.getPointer(0))

    public fun setValue(value: PhoneCallBlocking): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PhoneCallBlocking, MemoryAddress> {
    public val IPhoneCallBlockingStatics_Instance: IPhoneCallBlockingStatics by lazy {
      createIPhoneCallBlockingStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPhoneCallBlockingStatics(): IPhoneCallBlockingStatics {
      val refiid = Guid.REFIID(IPhoneCallBlockingStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Calls.PhoneCallBlocking".toHandle(),refiid,interfacePtr)
      val result = IPhoneCallBlockingStatics.ABI.makeIPhoneCallBlockingStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PhoneCallBlocking {
      val address = segment.toRawLongValue()
      return PhoneCallBlocking(Pointer(address))
    }

    public override fun toNative(obj: PhoneCallBlocking): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_BlockUnknownNumbers() =
        ABI.IPhoneCallBlockingStatics_Instance.get_BlockUnknownNumbers()

    public fun put_BlockUnknownNumbers(value: Boolean) =
        ABI.IPhoneCallBlockingStatics_Instance.put_BlockUnknownNumbers(value)

    public fun get_BlockPrivateNumbers() =
        ABI.IPhoneCallBlockingStatics_Instance.get_BlockPrivateNumbers()

    public fun put_BlockPrivateNumbers(value: Boolean) =
        ABI.IPhoneCallBlockingStatics_Instance.put_BlockPrivateNumbers(value)

    public fun SetCallBlockingListAsync(phoneNumberList: IIterable<String?>) =
        ABI.IPhoneCallBlockingStatics_Instance.SetCallBlockingListAsync(phoneNumberList)
  }
}
