package Windows.ApplicationModel.Contacts

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

@ABIMarker(IContactQueryTextSearch.ABI::class)
@Signature("{f7e3f9cb-a957-439b-a0b7-1c02a1963ff0}")
@Guid("f7e3f9cba957439ba0b71c02a1963ff0")
@WinRTInterface("f7e3f9cba957439ba0b71c02a1963ff0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactQueryTextSearch.ByReference::class)
public interface IContactQueryTextSearch : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Fields(): ContactQuerySearchFields?

  @InterfaceMethod(1)
  public fun put_Fields(value: ContactQuerySearchFields?): Unit

  @InterfaceMethod(2)
  public fun get_Text(): String?

  @InterfaceMethod(3)
  public fun put_Text(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_SearchScope(): ContactQuerySearchScope?

  @InterfaceMethod(5)
  public fun put_SearchScope(value: ContactQuerySearchScope?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactQueryTextSearch> {
    public override fun getValue() = ABI.makeIContactQueryTextSearch(pointer.getPointer(0))

    public fun setValue(value: IContactQueryTextSearch_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactQueryTextSearch {
    public val __33150921_Ptr: Pointer?

    public val _33150921_VtblPtr: Pointer?
      get() = __33150921_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Fields(): ContactQuerySearchFields? {
      val fnPtr = _33150921_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactQuerySearchFields>()
      val hr = fn.invokeHR(arrayOf(__33150921_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactQuerySearchFields>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Fields(value: ContactQuerySearchFields?): Unit {
      val fnPtr = _33150921_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__33150921_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Text(): String? {
      val fnPtr = _33150921_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__33150921_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Text(value: String?): Unit {
      val fnPtr = _33150921_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__33150921_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_SearchScope(): ContactQuerySearchScope? {
      val fnPtr = _33150921_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ContactQuerySearchScope>()
      val hr = fn.invokeHR(arrayOf(__33150921_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ContactQuerySearchScope>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_SearchScope(value: ContactQuerySearchScope?): Unit {
      val fnPtr = _33150921_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__33150921_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContactQueryTextSearch_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __33150921_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactQueryTextSearch, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f7e3f9cba957439ba0b71c02a1963ff0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactQueryTextSearch(ptr: Pointer?): WithDefault =
        IContactQueryTextSearch_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactQueryTextSearch {
      val address = segment.toRawLongValue()
      return makeIContactQueryTextSearch(Pointer(address))
    }

    public override fun toNative(obj: IContactQueryTextSearch): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__33150921_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactQueryTextSearch): Array<IContactQueryTextSearch?>
        = (elements as
        Array<IContactQueryTextSearch?>).castToImpl<IContactQueryTextSearch,IContactQueryTextSearch_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactQueryTextSearch?> =
        arrayOfNulls<IContactQueryTextSearch_Impl>(size) as Array<IContactQueryTextSearch?>
  }
}
