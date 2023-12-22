package Windows.Services.Store

import Windows.Foundation.HResult
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

@ABIMarker(IStorePurchaseResult.ABI::class)
@Signature("{add28552-f96a-463d-a7bb-c20b4fca6952}")
@Guid("add28552f96a463da7bbc20b4fca6952")
@WinRTInterface("add28552f96a463da7bbc20b4fca6952")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorePurchaseResult.ByReference::class)
public interface IStorePurchaseResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): StorePurchaseStatus?

  @InterfaceMethod(1)
  public fun get_ExtendedError(): HResult?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorePurchaseResult> {
    public override fun getValue() = ABI.makeIStorePurchaseResult(pointer.getPointer(0))

    public fun setValue(value: IStorePurchaseResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorePurchaseResult {
    public val __704498930_Ptr: Pointer?

    public val _704498930_VtblPtr: Pointer?
      get() = __704498930_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): StorePurchaseStatus? {
      val fnPtr = _704498930_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorePurchaseStatus>()
      val hr = fn.invokeHR(arrayOf(__704498930_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorePurchaseStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ExtendedError(): HResult? {
      val fnPtr = _704498930_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HResult>()
      val hr = fn.invokeHR(arrayOf(__704498930_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HResult>(result.getValue())
      return resultValue
    }
  }

  public class IStorePurchaseResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __704498930_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorePurchaseResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("add28552f96a463da7bbc20b4fca6952")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorePurchaseResult(ptr: Pointer?): WithDefault = IStorePurchaseResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorePurchaseResult {
      val address = segment.toRawLongValue()
      return makeIStorePurchaseResult(Pointer(address))
    }

    public override fun toNative(obj: IStorePurchaseResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__704498930_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorePurchaseResult): Array<IStorePurchaseResult?> =
        (elements as
        Array<IStorePurchaseResult?>).castToImpl<IStorePurchaseResult,IStorePurchaseResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorePurchaseResult?> =
        arrayOfNulls<IStorePurchaseResult_Impl>(size) as Array<IStorePurchaseResult?>
  }
}
