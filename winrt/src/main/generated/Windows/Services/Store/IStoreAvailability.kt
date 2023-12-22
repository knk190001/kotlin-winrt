package Windows.Services.Store

import Windows.Foundation.DateTime
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

@ABIMarker(IStoreAvailability.ABI::class)
@Signature("{fa060325-0ffd-4493-ad43-f1f9918f69fa}")
@Guid("fa0603250ffd4493ad43f1f9918f69fa")
@WinRTInterface("fa0603250ffd4493ad43f1f9918f69fa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreAvailability.ByReference::class)
public interface IStoreAvailability : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StoreId(): String?

  @InterfaceMethod(1)
  public fun get_EndDate(): DateTime?

  @InterfaceMethod(2)
  public fun get_Price(): StorePrice?

  @InterfaceMethod(3)
  public fun get_ExtendedJsonData(): String?

  @InterfaceMethod(4)
  public fun RequestPurchaseAsync(): IAsyncOperation<StorePurchaseResult?>?

  @InterfaceMethod(5)
  public fun RequestPurchaseAsync(storePurchaseProperties: StorePurchaseProperties?):
      IAsyncOperation<StorePurchaseResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStoreAvailability> {
    public override fun getValue() = ABI.makeIStoreAvailability(pointer.getPointer(0))

    public fun setValue(value: IStoreAvailability_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreAvailability {
    public val __995572431_Ptr: Pointer?

    public val _995572431_VtblPtr: Pointer?
      get() = __995572431_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StoreId(): String? {
      val fnPtr = _995572431_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__995572431_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_EndDate(): DateTime? {
      val fnPtr = _995572431_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__995572431_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Price(): StorePrice? {
      val fnPtr = _995572431_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorePrice>()
      val hr = fn.invokeHR(arrayOf(__995572431_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorePrice>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ExtendedJsonData(): String? {
      val fnPtr = _995572431_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__995572431_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun RequestPurchaseAsync(): IAsyncOperation<StorePurchaseResult?>? {
      val fnPtr = _995572431_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorePurchaseResult?>>()
      val hr = fn.invokeHR(arrayOf(__995572431_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorePurchaseResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun RequestPurchaseAsync(storePurchaseProperties: StorePurchaseProperties?):
        IAsyncOperation<StorePurchaseResult?>? {
      val fnPtr = _995572431_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StorePurchaseResult?>>()
      val hr = fn.invokeHR(arrayOf(__995572431_Ptr, marshalToNative(storePurchaseProperties),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<StorePurchaseResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IStoreAvailability_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __995572431_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreAvailability, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fa0603250ffd4493ad43f1f9918f69fa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreAvailability(ptr: Pointer?): WithDefault = IStoreAvailability_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreAvailability {
      val address = segment.toRawLongValue()
      return makeIStoreAvailability(Pointer(address))
    }

    public override fun toNative(obj: IStoreAvailability): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__995572431_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreAvailability): Array<IStoreAvailability?> =
        (elements as
        Array<IStoreAvailability?>).castToImpl<IStoreAvailability,IStoreAvailability_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreAvailability?> =
        arrayOfNulls<IStoreAvailability_Impl>(size) as Array<IStoreAvailability?>
  }
}
