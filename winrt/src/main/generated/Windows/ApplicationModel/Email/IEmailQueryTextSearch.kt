package Windows.ApplicationModel.Email

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

@ABIMarker(IEmailQueryTextSearch.ABI::class)
@Signature("{9fa0a288-3c5d-46a5-a6e2-31d6fd17e540}")
@Guid("9fa0a2883c5d46a5a6e231d6fd17e540")
@WinRTInterface("9fa0a2883c5d46a5a6e231d6fd17e540")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailQueryTextSearch.ByReference::class)
public interface IEmailQueryTextSearch : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Fields(): EmailQuerySearchFields?

  @InterfaceMethod(1)
  public fun put_Fields(value: EmailQuerySearchFields?): Unit

  @InterfaceMethod(2)
  public fun get_SearchScope(): EmailQuerySearchScope?

  @InterfaceMethod(3)
  public fun put_SearchScope(value: EmailQuerySearchScope?): Unit

  @InterfaceMethod(4)
  public fun get_Text(): String?

  @InterfaceMethod(5)
  public fun put_Text(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailQueryTextSearch> {
    public override fun getValue() = ABI.makeIEmailQueryTextSearch(pointer.getPointer(0))

    public fun setValue(value: IEmailQueryTextSearch_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailQueryTextSearch {
    public val __2061559032_Ptr: Pointer?

    public val _2061559032_VtblPtr: Pointer?
      get() = __2061559032_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Fields(): EmailQuerySearchFields? {
      val fnPtr = _2061559032_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailQuerySearchFields>()
      val hr = fn.invokeHR(arrayOf(__2061559032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailQuerySearchFields>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Fields(value: EmailQuerySearchFields?): Unit {
      val fnPtr = _2061559032_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2061559032_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SearchScope(): EmailQuerySearchScope? {
      val fnPtr = _2061559032_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailQuerySearchScope>()
      val hr = fn.invokeHR(arrayOf(__2061559032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailQuerySearchScope>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SearchScope(value: EmailQuerySearchScope?): Unit {
      val fnPtr = _2061559032_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2061559032_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Text(): String? {
      val fnPtr = _2061559032_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2061559032_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Text(value: String?): Unit {
      val fnPtr = _2061559032_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2061559032_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEmailQueryTextSearch_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2061559032_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailQueryTextSearch, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9fa0a2883c5d46a5a6e231d6fd17e540")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailQueryTextSearch(ptr: Pointer?): WithDefault =
        IEmailQueryTextSearch_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailQueryTextSearch {
      val address = segment.toRawLongValue()
      return makeIEmailQueryTextSearch(Pointer(address))
    }

    public override fun toNative(obj: IEmailQueryTextSearch): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2061559032_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailQueryTextSearch): Array<IEmailQueryTextSearch?> =
        (elements as
        Array<IEmailQueryTextSearch?>).castToImpl<IEmailQueryTextSearch,IEmailQueryTextSearch_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailQueryTextSearch?> =
        arrayOfNulls<IEmailQueryTextSearch_Impl>(size) as Array<IEmailQueryTextSearch?>
  }
}
