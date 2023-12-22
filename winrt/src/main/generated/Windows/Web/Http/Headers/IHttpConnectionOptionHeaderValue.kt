package Windows.Web.Http.Headers

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

@ABIMarker(IHttpConnectionOptionHeaderValue.ABI::class)
@Signature("{cb4af27a-4e90-45eb-8dcd-fd1408f4c44f}")
@Guid("cb4af27a4e9045eb8dcdfd1408f4c44f")
@WinRTInterface("cb4af27a4e9045eb8dcdfd1408f4c44f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpConnectionOptionHeaderValue.ByReference::class)
public interface IHttpConnectionOptionHeaderValue : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Token(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpConnectionOptionHeaderValue> {
    public override fun getValue() = ABI.makeIHttpConnectionOptionHeaderValue(pointer.getPointer(0))

    public fun setValue(value: IHttpConnectionOptionHeaderValue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpConnectionOptionHeaderValue {
    public val __1846233723_Ptr: Pointer?

    public val _1846233723_VtblPtr: Pointer?
      get() = __1846233723_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Token(): String? {
      val fnPtr = _1846233723_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1846233723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IHttpConnectionOptionHeaderValue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1846233723_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpConnectionOptionHeaderValue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cb4af27a4e9045eb8dcdfd1408f4c44f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpConnectionOptionHeaderValue(ptr: Pointer?): WithDefault =
        IHttpConnectionOptionHeaderValue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpConnectionOptionHeaderValue {
      val address = segment.toRawLongValue()
      return makeIHttpConnectionOptionHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: IHttpConnectionOptionHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1846233723_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpConnectionOptionHeaderValue):
        Array<IHttpConnectionOptionHeaderValue?> = (elements as
        Array<IHttpConnectionOptionHeaderValue?>).castToImpl<IHttpConnectionOptionHeaderValue,IHttpConnectionOptionHeaderValue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpConnectionOptionHeaderValue?> =
        arrayOfNulls<IHttpConnectionOptionHeaderValue_Impl>(size) as
        Array<IHttpConnectionOptionHeaderValue?>
  }
}
