package Windows.Services.Store

import Windows.Foundation.DateTime
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStoreLicense.ABI::class)
@Signature("{26dc9579-4c4f-4f30-bc89-649f60e36055}")
@Guid("26dc95794c4f4f30bc89649f60e36055")
@WinRTInterface("26dc95794c4f4f30bc89649f60e36055")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStoreLicense.ByReference::class)
public interface IStoreLicense : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SkuStoreId(): String?

  @InterfaceMethod(1)
  public fun get_IsActive(): Boolean

  @InterfaceMethod(2)
  public fun get_ExpirationDate(): DateTime?

  @InterfaceMethod(3)
  public fun get_ExtendedJsonData(): String?

  @InterfaceMethod(4)
  public fun get_InAppOfferToken(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IStoreLicense>
      {
    public override fun getValue() = ABI.makeIStoreLicense(pointer.getPointer(0))

    public fun setValue(value: IStoreLicense_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStoreLicense {
    public val __780351923_Ptr: Pointer?

    public val _780351923_VtblPtr: Pointer?
      get() = __780351923_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SkuStoreId(): String? {
      val fnPtr = _780351923_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__780351923_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsActive(): Boolean {
      val fnPtr = _780351923_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__780351923_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_ExpirationDate(): DateTime? {
      val fnPtr = _780351923_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__780351923_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ExtendedJsonData(): String? {
      val fnPtr = _780351923_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__780351923_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_InAppOfferToken(): String? {
      val fnPtr = _780351923_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__780351923_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IStoreLicense_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __780351923_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStoreLicense, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("26dc95794c4f4f30bc89649f60e36055")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStoreLicense(ptr: Pointer?): WithDefault = IStoreLicense_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStoreLicense {
      val address = segment.toRawLongValue()
      return makeIStoreLicense(Pointer(address))
    }

    public override fun toNative(obj: IStoreLicense): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__780351923_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStoreLicense): Array<IStoreLicense?> = (elements as
        Array<IStoreLicense?>).castToImpl<IStoreLicense,IStoreLicense_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStoreLicense?> =
        arrayOfNulls<IStoreLicense_Impl>(size) as Array<IStoreLicense?>
  }
}
