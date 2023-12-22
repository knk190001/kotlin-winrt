package Windows.ApplicationModel.Payments

import Windows.Foundation.Uri
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

@ABIMarker(IPaymentMerchantInfoFactory.ABI::class)
@Signature("{9e89ced3-ccb7-4167-a8ec-e10ae96dbcd1}")
@Guid("9e89ced3ccb74167a8ece10ae96dbcd1")
@WinRTInterface("9e89ced3ccb74167a8ece10ae96dbcd1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPaymentMerchantInfoFactory.ByReference::class)
public interface IPaymentMerchantInfoFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(uri: Uri?): PaymentMerchantInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPaymentMerchantInfoFactory> {
    public override fun getValue() = ABI.makeIPaymentMerchantInfoFactory(pointer.getPointer(0))

    public fun setValue(value: IPaymentMerchantInfoFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPaymentMerchantInfoFactory {
    public val __2029887360_Ptr: Pointer?

    public val _2029887360_VtblPtr: Pointer?
      get() = __2029887360_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(uri: Uri?): PaymentMerchantInfo? {
      val fnPtr = _2029887360_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PaymentMerchantInfo>()
      val hr = fn.invokeHR(arrayOf(__2029887360_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PaymentMerchantInfo>(result.getValue())
      return resultValue
    }
  }

  public class IPaymentMerchantInfoFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2029887360_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPaymentMerchantInfoFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9e89ced3ccb74167a8ece10ae96dbcd1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPaymentMerchantInfoFactory(ptr: Pointer?): WithDefault =
        IPaymentMerchantInfoFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPaymentMerchantInfoFactory {
      val address = segment.toRawLongValue()
      return makeIPaymentMerchantInfoFactory(Pointer(address))
    }

    public override fun toNative(obj: IPaymentMerchantInfoFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2029887360_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPaymentMerchantInfoFactory):
        Array<IPaymentMerchantInfoFactory?> = (elements as
        Array<IPaymentMerchantInfoFactory?>).castToImpl<IPaymentMerchantInfoFactory,IPaymentMerchantInfoFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPaymentMerchantInfoFactory?> =
        arrayOfNulls<IPaymentMerchantInfoFactory_Impl>(size) as Array<IPaymentMerchantInfoFactory?>
  }
}
