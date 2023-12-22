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

@ABIMarker(ICoreTextLayoutRequest.ABI::class)
@Signature("{2555a8cc-51fd-4f03-98bf-ac78174d68e0}")
@Guid("2555a8cc51fd4f0398bfac78174d68e0")
@WinRTInterface("2555a8cc51fd4f0398bfac78174d68e0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreTextLayoutRequest.ByReference::class)
public interface ICoreTextLayoutRequest : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Range(): CoreTextRange?

  @InterfaceMethod(1)
  public fun get_LayoutBounds(): CoreTextLayoutBounds?

  @InterfaceMethod(2)
  public fun get_IsCanceled(): Boolean

  @InterfaceMethod(3)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreTextLayoutRequest> {
    public override fun getValue() = ABI.makeICoreTextLayoutRequest(pointer.getPointer(0))

    public fun setValue(value: ICoreTextLayoutRequest_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreTextLayoutRequest {
    public val __1342928639_Ptr: Pointer?

    public val _1342928639_VtblPtr: Pointer?
      get() = __1342928639_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Range(): CoreTextRange? {
      val fnPtr = _1342928639_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreTextRange>()
      val hr = fn.invokeHR(arrayOf(__1342928639_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreTextRange>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LayoutBounds(): CoreTextLayoutBounds? {
      val fnPtr = _1342928639_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreTextLayoutBounds>()
      val hr = fn.invokeHR(arrayOf(__1342928639_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreTextLayoutBounds>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_IsCanceled(): Boolean {
      val fnPtr = _1342928639_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1342928639_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1342928639_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1342928639_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class ICoreTextLayoutRequest_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1342928639_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreTextLayoutRequest, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2555a8cc51fd4f0398bfac78174d68e0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreTextLayoutRequest(ptr: Pointer?): WithDefault =
        ICoreTextLayoutRequest_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreTextLayoutRequest {
      val address = segment.toRawLongValue()
      return makeICoreTextLayoutRequest(Pointer(address))
    }

    public override fun toNative(obj: ICoreTextLayoutRequest): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1342928639_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreTextLayoutRequest): Array<ICoreTextLayoutRequest?> =
        (elements as
        Array<ICoreTextLayoutRequest?>).castToImpl<ICoreTextLayoutRequest,ICoreTextLayoutRequest_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreTextLayoutRequest?> =
        arrayOfNulls<ICoreTextLayoutRequest_Impl>(size) as Array<ICoreTextLayoutRequest?>
  }
}
