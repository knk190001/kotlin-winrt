package Windows.Media.PlayTo

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlayToSourceRequest.ABI::class)
@Signature("{f8584665-64f4-44a0-ac0d-468d2b8fda83}")
@Guid("f858466564f444a0ac0d468d2b8fda83")
@WinRTInterface("f858466564f444a0ac0d468d2b8fda83")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayToSourceRequest.ByReference::class)
public interface IPlayToSourceRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Deadline(): DateTime?

  @InterfaceMethod(1)
  public fun DisplayErrorString(errorString: String?): Unit

  @InterfaceMethod(2)
  public fun GetDeferral(): PlayToSourceDeferral?

  @InterfaceMethod(3)
  public fun SetSource(value: PlayToSource?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayToSourceRequest> {
    public override fun getValue() = ABI.makeIPlayToSourceRequest(pointer.getPointer(0))

    public fun setValue(value: IPlayToSourceRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayToSourceRequest {
    public val __1683321760_Ptr: Pointer?

    public val _1683321760_VtblPtr: Pointer?
      get() = __1683321760_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Deadline(): DateTime? {
      val fnPtr = _1683321760_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__1683321760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun DisplayErrorString(errorString: String?): Unit {
      val fnPtr = _1683321760_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1683321760_Ptr, marshalToNative(errorString),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): PlayToSourceDeferral? {
      val fnPtr = _1683321760_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayToSourceDeferral>()
      val hr = fn.invokeHR(arrayOf(__1683321760_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayToSourceDeferral>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SetSource(value: PlayToSource?): Unit {
      val fnPtr = _1683321760_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1683321760_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPlayToSourceRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1683321760_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayToSourceRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f858466564f444a0ac0d468d2b8fda83")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayToSourceRequest(ptr: Pointer?): WithDefault = IPlayToSourceRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayToSourceRequest {
      val address = segment.toRawLongValue()
      return makeIPlayToSourceRequest(Pointer(address))
    }

    public override fun toNative(obj: IPlayToSourceRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1683321760_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayToSourceRequest): Array<IPlayToSourceRequest?> =
        (elements as
        Array<IPlayToSourceRequest?>).castToImpl<IPlayToSourceRequest,IPlayToSourceRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayToSourceRequest?> =
        arrayOfNulls<IPlayToSourceRequest_Impl>(size) as Array<IPlayToSourceRequest?>
  }
}
