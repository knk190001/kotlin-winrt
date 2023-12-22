package Windows.ApplicationModel.Chat

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

@ABIMarker(IChatQueryOptions.ABI::class)
@Signature("{2fd364a6-bf36-42f7-b7e7-923c0aabfe16}")
@Guid("2fd364a6bf3642f7b7e7923c0aabfe16")
@WinRTInterface("2fd364a6bf3642f7b7e7923c0aabfe16")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatQueryOptions.ByReference::class)
public interface IChatQueryOptions : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SearchString(): String?

  @InterfaceMethod(1)
  public fun put_SearchString(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatQueryOptions> {
    public override fun getValue() = ABI.makeIChatQueryOptions(pointer.getPointer(0))

    public fun setValue(value: IChatQueryOptions_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatQueryOptions {
    public val __525563979_Ptr: Pointer?

    public val _525563979_VtblPtr: Pointer?
      get() = __525563979_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SearchString(): String? {
      val fnPtr = _525563979_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__525563979_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_SearchString(value: String?): Unit {
      val fnPtr = _525563979_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__525563979_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IChatQueryOptions_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __525563979_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatQueryOptions, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2fd364a6bf3642f7b7e7923c0aabfe16")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatQueryOptions(ptr: Pointer?): WithDefault = IChatQueryOptions_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatQueryOptions {
      val address = segment.toRawLongValue()
      return makeIChatQueryOptions(Pointer(address))
    }

    public override fun toNative(obj: IChatQueryOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__525563979_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatQueryOptions): Array<IChatQueryOptions?> = (elements
        as Array<IChatQueryOptions?>).castToImpl<IChatQueryOptions,IChatQueryOptions_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatQueryOptions?> =
        arrayOfNulls<IChatQueryOptions_Impl>(size) as Array<IChatQueryOptions?>
  }
}
