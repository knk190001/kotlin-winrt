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

@ABIMarker(IContactAnnotation2.ABI::class)
@Signature("{b691ecf3-4ab7-4a1f-9941-0c9cf3171b75}")
@Guid("b691ecf34ab74a1f99410c9cf3171b75")
@WinRTInterface("b691ecf34ab74a1f99410c9cf3171b75")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactAnnotation2.ByReference::class)
public interface IContactAnnotation2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContactListId(): String?

  @InterfaceMethod(1)
  public fun put_ContactListId(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactAnnotation2> {
    public override fun getValue() = ABI.makeIContactAnnotation2(pointer.getPointer(0))

    public fun setValue(value: IContactAnnotation2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactAnnotation2 {
    public val __1074058097_Ptr: Pointer?

    public val _1074058097_VtblPtr: Pointer?
      get() = __1074058097_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContactListId(): String? {
      val fnPtr = _1074058097_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1074058097_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ContactListId(value: String?): Unit {
      val fnPtr = _1074058097_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1074058097_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContactAnnotation2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1074058097_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactAnnotation2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b691ecf34ab74a1f99410c9cf3171b75")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactAnnotation2(ptr: Pointer?): WithDefault = IContactAnnotation2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactAnnotation2 {
      val address = segment.toRawLongValue()
      return makeIContactAnnotation2(Pointer(address))
    }

    public override fun toNative(obj: IContactAnnotation2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1074058097_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactAnnotation2): Array<IContactAnnotation2?> =
        (elements as
        Array<IContactAnnotation2?>).castToImpl<IContactAnnotation2,IContactAnnotation2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactAnnotation2?> =
        arrayOfNulls<IContactAnnotation2_Impl>(size) as Array<IContactAnnotation2?>
  }
}
