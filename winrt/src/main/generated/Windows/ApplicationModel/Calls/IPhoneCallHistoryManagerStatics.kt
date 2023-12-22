package Windows.ApplicationModel.Calls

import Windows.Foundation.IAsyncOperation
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneCallHistoryManagerStatics.ABI::class)
@Signature("{f5a6da39-b31f-4f45-ac8e-1b08893c1b50}")
@Guid("f5a6da39b31f4f45ac8e1b08893c1b50")
@WinRTInterface("f5a6da39b31f4f45ac8e1b08893c1b50")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallHistoryManagerStatics.ByReference::class)
public interface IPhoneCallHistoryManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestStoreAsync(accessType: PhoneCallHistoryStoreAccessType?):
      IAsyncOperation<PhoneCallHistoryStore?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallHistoryManagerStatics> {
    public override fun getValue() = ABI.makeIPhoneCallHistoryManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallHistoryManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallHistoryManagerStatics {
    public val __493549950_Ptr: Pointer?

    public val _493549950_VtblPtr: Pointer?
      get() = __493549950_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestStoreAsync(accessType: PhoneCallHistoryStoreAccessType?):
        IAsyncOperation<PhoneCallHistoryStore?>? {
      val fnPtr = _493549950_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PhoneCallHistoryStore?>>()
      val hr = fn.invokeHR(arrayOf(__493549950_Ptr, marshalToNative(accessType), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<PhoneCallHistoryStore?>>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneCallHistoryManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __493549950_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallHistoryManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f5a6da39b31f4f45ac8e1b08893c1b50")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallHistoryManagerStatics(ptr: Pointer?): WithDefault =
        IPhoneCallHistoryManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneCallHistoryManagerStatics {
      val address = segment.toRawLongValue()
      return makeIPhoneCallHistoryManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallHistoryManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__493549950_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallHistoryManagerStatics):
        Array<IPhoneCallHistoryManagerStatics?> = (elements as
        Array<IPhoneCallHistoryManagerStatics?>).castToImpl<IPhoneCallHistoryManagerStatics,IPhoneCallHistoryManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallHistoryManagerStatics?> =
        arrayOfNulls<IPhoneCallHistoryManagerStatics_Impl>(size) as
        Array<IPhoneCallHistoryManagerStatics?>
  }
}
