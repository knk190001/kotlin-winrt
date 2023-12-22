package Windows.Web.Http.Filters

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

@ABIMarker(IHttpCacheControl.ABI::class)
@Signature("{c77e1cb4-3cea-4eb5-ac85-04e186e63ab7}")
@Guid("c77e1cb43cea4eb5ac8504e186e63ab7")
@WinRTInterface("c77e1cb43cea4eb5ac8504e186e63ab7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpCacheControl.ByReference::class)
public interface IHttpCacheControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ReadBehavior(): HttpCacheReadBehavior?

  @InterfaceMethod(1)
  public fun put_ReadBehavior(value: HttpCacheReadBehavior?): Unit

  @InterfaceMethod(2)
  public fun get_WriteBehavior(): HttpCacheWriteBehavior?

  @InterfaceMethod(3)
  public fun put_WriteBehavior(value: HttpCacheWriteBehavior?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpCacheControl> {
    public override fun getValue() = ABI.makeIHttpCacheControl(pointer.getPointer(0))

    public fun setValue(value: IHttpCacheControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpCacheControl {
    public val __862080146_Ptr: Pointer?

    public val _862080146_VtblPtr: Pointer?
      get() = __862080146_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ReadBehavior(): HttpCacheReadBehavior? {
      val fnPtr = _862080146_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpCacheReadBehavior>()
      val hr = fn.invokeHR(arrayOf(__862080146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpCacheReadBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ReadBehavior(value: HttpCacheReadBehavior?): Unit {
      val fnPtr = _862080146_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__862080146_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_WriteBehavior(): HttpCacheWriteBehavior? {
      val fnPtr = _862080146_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpCacheWriteBehavior>()
      val hr = fn.invokeHR(arrayOf(__862080146_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpCacheWriteBehavior>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_WriteBehavior(value: HttpCacheWriteBehavior?): Unit {
      val fnPtr = _862080146_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__862080146_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHttpCacheControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __862080146_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpCacheControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c77e1cb43cea4eb5ac8504e186e63ab7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpCacheControl(ptr: Pointer?): WithDefault = IHttpCacheControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpCacheControl {
      val address = segment.toRawLongValue()
      return makeIHttpCacheControl(Pointer(address))
    }

    public override fun toNative(obj: IHttpCacheControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__862080146_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpCacheControl): Array<IHttpCacheControl?> = (elements
        as Array<IHttpCacheControl?>).castToImpl<IHttpCacheControl,IHttpCacheControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpCacheControl?> =
        arrayOfNulls<IHttpCacheControl_Impl>(size) as Array<IHttpCacheControl?>
  }
}
