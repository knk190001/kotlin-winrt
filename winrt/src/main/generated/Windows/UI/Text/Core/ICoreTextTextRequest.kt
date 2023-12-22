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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreTextTextRequest.ABI::class)
@Signature("{50d950a9-f51e-4cc1-8ca1-e6346d1a61be}")
@Guid("50d950a9f51e4cc18ca1e6346d1a61be")
@WinRTInterface("50d950a9f51e4cc18ca1e6346d1a61be")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreTextTextRequest.ByReference::class)
public interface ICoreTextTextRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Range(): CoreTextRange?

  @InterfaceMethod(1)
  public fun get_Text(): String?

  @InterfaceMethod(2)
  public fun put_Text(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_IsCanceled(): Boolean

  @InterfaceMethod(4)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreTextTextRequest> {
    public override fun getValue() = ABI.makeICoreTextTextRequest(pointer.getPointer(0))

    public fun setValue(value: ICoreTextTextRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreTextTextRequest {
    public val __2111269730_Ptr: Pointer?

    public val _2111269730_VtblPtr: Pointer?
      get() = __2111269730_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Range(): CoreTextRange? {
      val fnPtr = _2111269730_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreTextRange>()
      val hr = fn.invokeHR(arrayOf(__2111269730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreTextRange>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Text(): String? {
      val fnPtr = _2111269730_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2111269730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Text(value: String?): Unit {
      val fnPtr = _2111269730_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2111269730_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_IsCanceled(): Boolean {
      val fnPtr = _2111269730_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2111269730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _2111269730_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__2111269730_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class ICoreTextTextRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2111269730_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreTextTextRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("50d950a9f51e4cc18ca1e6346d1a61be")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreTextTextRequest(ptr: Pointer?): WithDefault = ICoreTextTextRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreTextTextRequest {
      val address = segment.toRawLongValue()
      return makeICoreTextTextRequest(Pointer(address))
    }

    public override fun toNative(obj: ICoreTextTextRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2111269730_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreTextTextRequest): Array<ICoreTextTextRequest?> =
        (elements as
        Array<ICoreTextTextRequest?>).castToImpl<ICoreTextTextRequest,ICoreTextTextRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreTextTextRequest?> =
        arrayOfNulls<ICoreTextTextRequest_Impl>(size) as Array<ICoreTextTextRequest?>
  }
}
