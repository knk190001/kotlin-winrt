package Windows.Phone.PersonalInformation

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IContactQueryOptions.ABI::class)
@Signature("{580cab76-3f31-46c1-9a50-424a53dacae3}")
@Guid("580cab763f3146c19a50424a53dacae3")
@WinRTInterface("580cab763f3146c19a50424a53dacae3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactQueryOptions.ByReference::class)
public interface IContactQueryOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DesiredFields(): IVector<String?>?

  @InterfaceMethod(1)
  public fun get_OrderBy(): ContactQueryResultOrdering?

  @InterfaceMethod(2)
  public fun put_OrderBy(value: ContactQueryResultOrdering?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactQueryOptions> {
    public override fun getValue() = ABI.makeIContactQueryOptions(pointer.getPointer(0))

    public fun setValue(value: IContactQueryOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactQueryOptions {
    public val __806013522_Ptr: Pointer?

    public val _806013522_VtblPtr: Pointer?
      get() = __806013522_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DesiredFields(): IVector<String?>? {
      val fnPtr = _806013522_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__806013522_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_OrderBy(): ContactQueryResultOrdering? {
      val fnPtr = _806013522_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactQueryResultOrdering>()
      val hr = fn.invokeHR(arrayOf(__806013522_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactQueryResultOrdering>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_OrderBy(value: ContactQueryResultOrdering?): Unit {
      val fnPtr = _806013522_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__806013522_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContactQueryOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __806013522_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactQueryOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("580cab763f3146c19a50424a53dacae3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactQueryOptions(ptr: Pointer?): WithDefault = IContactQueryOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactQueryOptions {
      val address = segment.toRawLongValue()
      return makeIContactQueryOptions(Pointer(address))
    }

    public override fun toNative(obj: IContactQueryOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__806013522_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactQueryOptions): Array<IContactQueryOptions?> =
        (elements as
        Array<IContactQueryOptions?>).castToImpl<IContactQueryOptions,IContactQueryOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactQueryOptions?> =
        arrayOfNulls<IContactQueryOptions_Impl>(size) as Array<IContactQueryOptions?>
  }
}
