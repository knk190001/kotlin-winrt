package Windows.UI.Xaml

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
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IFrameworkElement3.ABI::class)
@Signature("{c81c2720-5c52-4bbe-a199-2b1e34f00f70}")
@Guid("c81c27205c524bbea1992b1e34f00f70")
@WinRTInterface("c81c27205c524bbea1992b1e34f00f70")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFrameworkElement3.ByReference::class)
public interface IFrameworkElement3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun add_Loading(handler: TypedEventHandler<FrameworkElement?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_Loading(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFrameworkElement3> {
    public override fun getValue() = ABI.makeIFrameworkElement3(pointer.getPointer(0))

    public fun setValue(value: IFrameworkElement3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFrameworkElement3 {
    public val __329359555_Ptr: Pointer?

    public val _329359555_VtblPtr: Pointer?
      get() = __329359555_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_Loading(handler: TypedEventHandler<FrameworkElement?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _329359555_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__329359555_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_Loading(token: EventRegistrationToken?): Unit {
      val fnPtr = _329359555_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__329359555_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFrameworkElement3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __329359555_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFrameworkElement3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c81c27205c524bbea1992b1e34f00f70")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFrameworkElement3(ptr: Pointer?): WithDefault = IFrameworkElement3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFrameworkElement3 {
      val address = segment.toRawLongValue()
      return makeIFrameworkElement3(Pointer(address))
    }

    public override fun toNative(obj: IFrameworkElement3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__329359555_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFrameworkElement3): Array<IFrameworkElement3?> =
        (elements as
        Array<IFrameworkElement3?>).castToImpl<IFrameworkElement3,IFrameworkElement3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFrameworkElement3?> =
        arrayOfNulls<IFrameworkElement3_Impl>(size) as Array<IFrameworkElement3?>
  }
}
