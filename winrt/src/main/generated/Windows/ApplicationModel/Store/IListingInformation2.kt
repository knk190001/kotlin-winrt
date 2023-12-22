package Windows.ApplicationModel.Store

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

@ABIMarker(IListingInformation2.ABI::class)
@Signature("{c0fd2c1d-b30e-4384-84ea-72fefa82223e}")
@Guid("c0fd2c1db30e438484ea72fefa82223e")
@WinRTInterface("c0fd2c1db30e438484ea72fefa82223e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListingInformation2.ByReference::class)
public interface IListingInformation2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FormattedBasePrice(): String?

  @InterfaceMethod(1)
  public fun get_SaleEndDate(): DateTime?

  @InterfaceMethod(2)
  public fun get_IsOnSale(): Boolean

  @InterfaceMethod(3)
  public fun get_CurrencyCode(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListingInformation2> {
    public override fun getValue() = ABI.makeIListingInformation2(pointer.getPointer(0))

    public fun setValue(value: IListingInformation2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListingInformation2 {
    public val __87930120_Ptr: Pointer?

    public val _87930120_VtblPtr: Pointer?
      get() = __87930120_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FormattedBasePrice(): String? {
      val fnPtr = _87930120_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__87930120_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SaleEndDate(): DateTime? {
      val fnPtr = _87930120_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__87930120_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsOnSale(): Boolean {
      val fnPtr = _87930120_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__87930120_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_CurrencyCode(): String? {
      val fnPtr = _87930120_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__87930120_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IListingInformation2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __87930120_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListingInformation2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c0fd2c1db30e438484ea72fefa82223e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListingInformation2(ptr: Pointer?): WithDefault = IListingInformation2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListingInformation2 {
      val address = segment.toRawLongValue()
      return makeIListingInformation2(Pointer(address))
    }

    public override fun toNative(obj: IListingInformation2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__87930120_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListingInformation2): Array<IListingInformation2?> =
        (elements as
        Array<IListingInformation2?>).castToImpl<IListingInformation2,IListingInformation2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListingInformation2?> =
        arrayOfNulls<IListingInformation2_Impl>(size) as Array<IListingInformation2?>
  }
}
