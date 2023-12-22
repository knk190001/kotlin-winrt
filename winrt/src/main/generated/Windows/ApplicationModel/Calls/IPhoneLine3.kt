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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPhoneLine3.ABI::class)
@Signature("{e2e33cf7-2406-57f3-826a-e5a5f40d6fb5}")
@Guid("e2e33cf7240657f3826ae5a5f40d6fb5")
@WinRTInterface("e2e33cf7240657f3826ae5a5f40d6fb5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneLine3.ByReference::class)
public interface IPhoneLine3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun DialWithResult(number: String?, displayName: String?): PhoneLineDialResult?

  @InterfaceMethod(1)
  public fun DialWithResultAsync(number: String?, displayName: String?):
      IAsyncOperation<PhoneLineDialResult?>?

  @InterfaceMethod(2)
  public fun GetAllActivePhoneCalls(): PhoneCallsResult?

  @InterfaceMethod(3)
  public fun GetAllActivePhoneCallsAsync(): IAsyncOperation<PhoneCallsResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPhoneLine3> {
    public override fun getValue() = ABI.makeIPhoneLine3(pointer.getPointer(0))

    public fun setValue(value: IPhoneLine3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneLine3 {
    public val __2045801745_Ptr: Pointer?

    public val _2045801745_VtblPtr: Pointer?
      get() = __2045801745_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun DialWithResult(number: String?, displayName: String?):
        PhoneLineDialResult? {
      val fnPtr = _2045801745_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneLineDialResult>()
      val hr = fn.invokeHR(arrayOf(__2045801745_Ptr, marshalToNative(number),
          marshalToNative(displayName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneLineDialResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun DialWithResultAsync(number: String?, displayName: String?):
        IAsyncOperation<PhoneLineDialResult?>? {
      val fnPtr = _2045801745_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PhoneLineDialResult?>>()
      val hr = fn.invokeHR(arrayOf(__2045801745_Ptr, marshalToNative(number),
          marshalToNative(displayName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<PhoneLineDialResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetAllActivePhoneCalls(): PhoneCallsResult? {
      val fnPtr = _2045801745_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PhoneCallsResult>()
      val hr = fn.invokeHR(arrayOf(__2045801745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PhoneCallsResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetAllActivePhoneCallsAsync(): IAsyncOperation<PhoneCallsResult?>? {
      val fnPtr = _2045801745_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<PhoneCallsResult?>>()
      val hr = fn.invokeHR(arrayOf(__2045801745_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<PhoneCallsResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneLine3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2045801745_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneLine3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e2e33cf7240657f3826ae5a5f40d6fb5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneLine3(ptr: Pointer?): WithDefault = IPhoneLine3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneLine3 {
      val address = segment.toRawLongValue()
      return makeIPhoneLine3(Pointer(address))
    }

    public override fun toNative(obj: IPhoneLine3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2045801745_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneLine3): Array<IPhoneLine3?> = (elements as
        Array<IPhoneLine3?>).castToImpl<IPhoneLine3,IPhoneLine3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneLine3?> =
        arrayOfNulls<IPhoneLine3_Impl>(size) as Array<IPhoneLine3?>
  }
}
