package Windows.ApplicationModel.Store

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

@ABIMarker(IPurchaseResults.ABI::class)
@Signature("{ed50b37e-8656-4f65-b8c8-ac7e0cb1a1c2}")
@Guid("ed50b37e86564f65b8c8ac7e0cb1a1c2")
@WinRTInterface("ed50b37e86564f65b8c8ac7e0cb1a1c2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPurchaseResults.ByReference::class)
public interface IPurchaseResults : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): ProductPurchaseStatus?

  @InterfaceMethod(1)
  public fun get_TransactionId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(2)
  public fun get_ReceiptXml(): String?

  @InterfaceMethod(3)
  public fun get_OfferId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPurchaseResults> {
    public override fun getValue() = ABI.makeIPurchaseResults(pointer.getPointer(0))

    public fun setValue(value: IPurchaseResults_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPurchaseResults {
    public val __536402813_Ptr: Pointer?

    public val _536402813_VtblPtr: Pointer?
      get() = __536402813_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): ProductPurchaseStatus? {
      val fnPtr = _536402813_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ProductPurchaseStatus>()
      val hr = fn.invokeHR(arrayOf(__536402813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ProductPurchaseStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TransactionId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _536402813_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__536402813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ReceiptXml(): String? {
      val fnPtr = _536402813_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__536402813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_OfferId(): String? {
      val fnPtr = _536402813_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__536402813_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPurchaseResults_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __536402813_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPurchaseResults, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ed50b37e86564f65b8c8ac7e0cb1a1c2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPurchaseResults(ptr: Pointer?): WithDefault = IPurchaseResults_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPurchaseResults {
      val address = segment.toRawLongValue()
      return makeIPurchaseResults(Pointer(address))
    }

    public override fun toNative(obj: IPurchaseResults): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__536402813_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPurchaseResults): Array<IPurchaseResults?> = (elements as
        Array<IPurchaseResults?>).castToImpl<IPurchaseResults,IPurchaseResults_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPurchaseResults?> =
        arrayOfNulls<IPurchaseResults_Impl>(size) as Array<IPurchaseResults?>
  }
}
