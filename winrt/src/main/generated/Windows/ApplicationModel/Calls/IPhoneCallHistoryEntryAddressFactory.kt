package Windows.ApplicationModel.Calls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneCallHistoryEntryAddressFactory.ABI::class)
@Signature("{fb0fadba-c7f0-4bb6-9f6b-ba5d73209aca}")
@Guid("fb0fadbac7f04bb69f6bba5d73209aca")
@WinRTInterface("fb0fadbac7f04bb69f6bba5d73209aca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallHistoryEntryAddressFactory.ByReference::class)
public interface IPhoneCallHistoryEntryAddressFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(rawAddress: String?, rawAddressKind: PhoneCallHistoryEntryRawAddressKind?):
      PhoneCallHistoryEntryAddress?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallHistoryEntryAddressFactory> {
    public override fun getValue() =
        ABI.makeIPhoneCallHistoryEntryAddressFactory(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallHistoryEntryAddressFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallHistoryEntryAddressFactory {
    public val __269770462_Ptr: Pointer?

    public val _269770462_VtblPtr: Pointer?
      get() = __269770462_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(rawAddress: String?,
        rawAddressKind: PhoneCallHistoryEntryRawAddressKind?): PhoneCallHistoryEntryAddress? {
      val fnPtr = _269770462_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallHistoryEntryAddress>()
      val hr = fn.invokeHR(arrayOf(__269770462_Ptr, marshalToNative(rawAddress),
          marshalToNative(rawAddressKind), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallHistoryEntryAddress>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneCallHistoryEntryAddressFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __269770462_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallHistoryEntryAddressFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fb0fadbac7f04bb69f6bba5d73209aca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallHistoryEntryAddressFactory(ptr: Pointer?): WithDefault =
        IPhoneCallHistoryEntryAddressFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCallHistoryEntryAddressFactory {
      val address = segment.toRawLongValue()
      return makeIPhoneCallHistoryEntryAddressFactory(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallHistoryEntryAddressFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__269770462_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallHistoryEntryAddressFactory):
        Array<IPhoneCallHistoryEntryAddressFactory?> = (elements as
        Array<IPhoneCallHistoryEntryAddressFactory?>).castToImpl<IPhoneCallHistoryEntryAddressFactory,IPhoneCallHistoryEntryAddressFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallHistoryEntryAddressFactory?> =
        arrayOfNulls<IPhoneCallHistoryEntryAddressFactory_Impl>(size) as
        Array<IPhoneCallHistoryEntryAddressFactory?>
  }
}
