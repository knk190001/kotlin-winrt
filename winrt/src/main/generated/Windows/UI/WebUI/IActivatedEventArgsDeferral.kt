package Windows.UI.WebUI

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

@ABIMarker(IActivatedEventArgsDeferral.ABI::class)
@Signature("{ca6d5f74-63c2-44a6-b97b-d9a03c20bc9b}")
@Guid("ca6d5f7463c244a6b97bd9a03c20bc9b")
@WinRTInterface("ca6d5f7463c244a6b97bd9a03c20bc9b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IActivatedEventArgsDeferral.ByReference::class)
public interface IActivatedEventArgsDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ActivatedOperation(): ActivatedOperation?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IActivatedEventArgsDeferral> {
    public override fun getValue() = ABI.makeIActivatedEventArgsDeferral(pointer.getPointer(0))

    public fun setValue(value: IActivatedEventArgsDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IActivatedEventArgsDeferral {
    public val __1254540095_Ptr: Pointer?

    public val _1254540095_VtblPtr: Pointer?
      get() = __1254540095_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ActivatedOperation(): ActivatedOperation? {
      val fnPtr = _1254540095_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ActivatedOperation>()
      val hr = fn.invokeHR(arrayOf(__1254540095_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ActivatedOperation>(result.getValue())
      return resultValue
    }
  }

  public class IActivatedEventArgsDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1254540095_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IActivatedEventArgsDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ca6d5f7463c244a6b97bd9a03c20bc9b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIActivatedEventArgsDeferral(ptr: Pointer?): WithDefault =
        IActivatedEventArgsDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IActivatedEventArgsDeferral {
      val address = segment.toRawLongValue()
      return makeIActivatedEventArgsDeferral(Pointer(address))
    }

    public override fun toNative(obj: IActivatedEventArgsDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1254540095_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IActivatedEventArgsDeferral):
        Array<IActivatedEventArgsDeferral?> = (elements as
        Array<IActivatedEventArgsDeferral?>).castToImpl<IActivatedEventArgsDeferral,IActivatedEventArgsDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IActivatedEventArgsDeferral?> =
        arrayOfNulls<IActivatedEventArgsDeferral_Impl>(size) as Array<IActivatedEventArgsDeferral?>
  }
}
