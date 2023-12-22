package Windows.Web.Http.Filters

import Windows.System.User
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

@ABIMarker(IHttpBaseProtocolFilter5.ABI::class)
@Signature("{416e4993-31e3-4816-bf09-e018ee8dc1f5}")
@Guid("416e499331e34816bf09e018ee8dc1f5")
@WinRTInterface("416e499331e34816bf09e018ee8dc1f5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpBaseProtocolFilter5.ByReference::class)
public interface IHttpBaseProtocolFilter5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_User(): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpBaseProtocolFilter5> {
    public override fun getValue() = ABI.makeIHttpBaseProtocolFilter5(pointer.getPointer(0))

    public fun setValue(value: IHttpBaseProtocolFilter5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpBaseProtocolFilter5 {
    public val __2000684547_Ptr: Pointer?

    public val _2000684547_VtblPtr: Pointer?
      get() = __2000684547_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_User(): User? {
      val fnPtr = _2000684547_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__2000684547_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class IHttpBaseProtocolFilter5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2000684547_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpBaseProtocolFilter5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("416e499331e34816bf09e018ee8dc1f5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpBaseProtocolFilter5(ptr: Pointer?): WithDefault =
        IHttpBaseProtocolFilter5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpBaseProtocolFilter5 {
      val address = segment.toRawLongValue()
      return makeIHttpBaseProtocolFilter5(Pointer(address))
    }

    public override fun toNative(obj: IHttpBaseProtocolFilter5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2000684547_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpBaseProtocolFilter5):
        Array<IHttpBaseProtocolFilter5?> = (elements as
        Array<IHttpBaseProtocolFilter5?>).castToImpl<IHttpBaseProtocolFilter5,IHttpBaseProtocolFilter5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpBaseProtocolFilter5?> =
        arrayOfNulls<IHttpBaseProtocolFilter5_Impl>(size) as Array<IHttpBaseProtocolFilter5?>
  }
}
