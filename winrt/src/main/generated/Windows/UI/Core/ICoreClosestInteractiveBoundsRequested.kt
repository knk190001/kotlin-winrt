package Windows.UI.Core

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(ICoreClosestInteractiveBoundsRequested.ABI::class)
@Signature("{f303043a-e8bf-4e8e-ae69-c9dadd57a114}")
@Guid("f303043ae8bf4e8eae69c9dadd57a114")
@WinRTInterface("f303043ae8bf4e8eae69c9dadd57a114")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreClosestInteractiveBoundsRequested.ByReference::class)
public interface ICoreClosestInteractiveBoundsRequested : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public
      fun add_ClosestInteractiveBoundsRequested(handler: TypedEventHandler<CoreComponentInputSource?,
      ClosestInteractiveBoundsRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_ClosestInteractiveBoundsRequested(cookie: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreClosestInteractiveBoundsRequested> {
    public override fun getValue() =
        ABI.makeICoreClosestInteractiveBoundsRequested(pointer.getPointer(0))

    public fun setValue(value: ICoreClosestInteractiveBoundsRequested_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreClosestInteractiveBoundsRequested {
    public val __2101848234_Ptr: Pointer?

    public val _2101848234_VtblPtr: Pointer?
      get() = __2101848234_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun add_ClosestInteractiveBoundsRequested(handler: TypedEventHandler<CoreComponentInputSource?,
        ClosestInteractiveBoundsRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _2101848234_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__2101848234_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_ClosestInteractiveBoundsRequested(cookie: EventRegistrationToken?):
        Unit {
      val fnPtr = _2101848234_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2101848234_Ptr, marshalToNative(cookie),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreClosestInteractiveBoundsRequested_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2101848234_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreClosestInteractiveBoundsRequested, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f303043ae8bf4e8eae69c9dadd57a114")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreClosestInteractiveBoundsRequested(ptr: Pointer?): WithDefault =
        ICoreClosestInteractiveBoundsRequested_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreClosestInteractiveBoundsRequested {
      val address = segment.toRawLongValue()
      return makeICoreClosestInteractiveBoundsRequested(Pointer(address))
    }

    public override fun toNative(obj: ICoreClosestInteractiveBoundsRequested): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2101848234_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreClosestInteractiveBoundsRequested):
        Array<ICoreClosestInteractiveBoundsRequested?> = (elements as
        Array<ICoreClosestInteractiveBoundsRequested?>).castToImpl<ICoreClosestInteractiveBoundsRequested,ICoreClosestInteractiveBoundsRequested_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreClosestInteractiveBoundsRequested?> =
        arrayOfNulls<ICoreClosestInteractiveBoundsRequested_Impl>(size) as
        Array<ICoreClosestInteractiveBoundsRequested?>
  }
}
