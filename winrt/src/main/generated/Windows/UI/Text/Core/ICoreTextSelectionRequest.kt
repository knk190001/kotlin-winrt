package Windows.UI.Text.Core

import Windows.Foundation.Deferral
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreTextSelectionRequest.ABI::class)
@Signature("{f0a70403-208b-4301-883c-74ca7485fd8d}")
@Guid("f0a70403208b4301883c74ca7485fd8d")
@WinRTInterface("f0a70403208b4301883c74ca7485fd8d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreTextSelectionRequest.ByReference::class)
public interface ICoreTextSelectionRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Selection(): CoreTextRange?

  @InterfaceMethod(1)
  public fun put_Selection(value: CoreTextRange?): Unit

  @InterfaceMethod(2)
  public fun get_IsCanceled(): Boolean

  @InterfaceMethod(3)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreTextSelectionRequest> {
    public override fun getValue() = ABI.makeICoreTextSelectionRequest(pointer.getPointer(0))

    public fun setValue(value: ICoreTextSelectionRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreTextSelectionRequest {
    public val __1569942297_Ptr: Pointer?

    public val _1569942297_VtblPtr: Pointer?
      get() = __1569942297_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Selection(): CoreTextRange? {
      val fnPtr = _1569942297_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreTextRange>()
      val hr = fn.invokeHR(arrayOf(__1569942297_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreTextRange>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Selection(value: CoreTextRange?): Unit {
      val fnPtr = _1569942297_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1569942297_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_IsCanceled(): Boolean {
      val fnPtr = _1569942297_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1569942297_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1569942297_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1569942297_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class ICoreTextSelectionRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1569942297_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreTextSelectionRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f0a70403208b4301883c74ca7485fd8d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreTextSelectionRequest(ptr: Pointer?): WithDefault =
        ICoreTextSelectionRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreTextSelectionRequest {
      val address = segment.toRawLongValue()
      return makeICoreTextSelectionRequest(Pointer(address))
    }

    public override fun toNative(obj: ICoreTextSelectionRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1569942297_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreTextSelectionRequest):
        Array<ICoreTextSelectionRequest?> = (elements as
        Array<ICoreTextSelectionRequest?>).castToImpl<ICoreTextSelectionRequest,ICoreTextSelectionRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreTextSelectionRequest?> =
        arrayOfNulls<ICoreTextSelectionRequest_Impl>(size) as Array<ICoreTextSelectionRequest?>
  }
}
