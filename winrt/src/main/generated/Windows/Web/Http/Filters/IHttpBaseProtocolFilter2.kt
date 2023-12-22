package Windows.Web.Http.Filters

import Windows.Web.Http.HttpVersion
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHttpBaseProtocolFilter2.ABI::class)
@Signature("{2ec30013-9427-4900-a017-fa7da3b5c9ae}")
@Guid("2ec3001394274900a017fa7da3b5c9ae")
@WinRTInterface("2ec3001394274900a017fa7da3b5c9ae")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpBaseProtocolFilter2.ByReference::class)
public interface IHttpBaseProtocolFilter2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MaxVersion(): HttpVersion?

  @InterfaceMethod(1)
  public fun put_MaxVersion(value: HttpVersion?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpBaseProtocolFilter2> {
    public override fun getValue() = ABI.makeIHttpBaseProtocolFilter2(pointer.getPointer(0))

    public fun setValue(value: IHttpBaseProtocolFilter2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpBaseProtocolFilter2 {
    public val __2000684550_Ptr: Pointer?

    public val _2000684550_VtblPtr: Pointer?
      get() = __2000684550_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MaxVersion(): HttpVersion? {
      val fnPtr = _2000684550_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpVersion>()
      val hr = fn.invokeHR(arrayOf(__2000684550_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpVersion>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_MaxVersion(value: HttpVersion?): Unit {
      val fnPtr = _2000684550_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2000684550_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHttpBaseProtocolFilter2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2000684550_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpBaseProtocolFilter2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2ec3001394274900a017fa7da3b5c9ae")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpBaseProtocolFilter2(ptr: Pointer?): WithDefault =
        IHttpBaseProtocolFilter2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpBaseProtocolFilter2 {
      val address = segment.toRawLongValue()
      return makeIHttpBaseProtocolFilter2(Pointer(address))
    }

    public override fun toNative(obj: IHttpBaseProtocolFilter2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2000684550_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpBaseProtocolFilter2):
        Array<IHttpBaseProtocolFilter2?> = (elements as
        Array<IHttpBaseProtocolFilter2?>).castToImpl<IHttpBaseProtocolFilter2,IHttpBaseProtocolFilter2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpBaseProtocolFilter2?> =
        arrayOfNulls<IHttpBaseProtocolFilter2_Impl>(size) as Array<IHttpBaseProtocolFilter2?>
  }
}
