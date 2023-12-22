package Windows.Devices.Geolocation

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICivicAddress.ABI::class)
@Signature("{a8567a1a-64f4-4d48-bcea-f6b008eca34c}")
@Guid("a8567a1a64f44d48bceaf6b008eca34c")
@WinRTInterface("a8567a1a64f44d48bceaf6b008eca34c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICivicAddress.ByReference::class)
public interface ICivicAddress : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Country(): String?

  @InterfaceMethod(1)
  public fun get_State(): String?

  @InterfaceMethod(2)
  public fun get_City(): String?

  @InterfaceMethod(3)
  public fun get_PostalCode(): String?

  @InterfaceMethod(4)
  public fun get_Timestamp(): DateTime?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ICivicAddress>
      {
    public override fun getValue() = ABI.makeICivicAddress(pointer.getPointer(0))

    public fun setValue(value: ICivicAddress_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICivicAddress {
    public val __108653655_Ptr: Pointer?

    public val _108653655_VtblPtr: Pointer?
      get() = __108653655_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Country(): String? {
      val fnPtr = _108653655_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__108653655_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_State(): String? {
      val fnPtr = _108653655_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__108653655_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_City(): String? {
      val fnPtr = _108653655_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__108653655_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PostalCode(): String? {
      val fnPtr = _108653655_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__108653655_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _108653655_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__108653655_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }
  }

  public class ICivicAddress_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __108653655_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICivicAddress, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a8567a1a64f44d48bceaf6b008eca34c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICivicAddress(ptr: Pointer?): WithDefault = ICivicAddress_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICivicAddress {
      val address = segment.toRawLongValue()
      return makeICivicAddress(Pointer(address))
    }

    public override fun toNative(obj: ICivicAddress): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__108653655_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICivicAddress): Array<ICivicAddress?> = (elements as
        Array<ICivicAddress?>).castToImpl<ICivicAddress,ICivicAddress_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICivicAddress?> =
        arrayOfNulls<ICivicAddress_Impl>(size) as Array<ICivicAddress?>
  }
}
