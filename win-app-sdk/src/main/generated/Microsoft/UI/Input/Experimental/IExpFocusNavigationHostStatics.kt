package Microsoft.UI.Input.Experimental

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

@ABIMarker(IExpFocusNavigationHostStatics.ABI::class)
@Signature("{7634e568-2177-50d9-9d95-18e3caca2b40}")
@Guid("7634e568217750d99d9518e3caca2b40")
@WinRTInterface("7634e568217750d99d9518e3caca2b40")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpFocusNavigationHostStatics.ByReference::class)
public interface IExpFocusNavigationHostStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetForInputSite(inputSite: ExpInputSite?): ExpFocusNavigationHost?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpFocusNavigationHostStatics> {
    public override fun getValue() = ABI.makeIExpFocusNavigationHostStatics(pointer.getPointer(0))

    public fun setValue(value: IExpFocusNavigationHostStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpFocusNavigationHostStatics {
    public val __1846986933_Ptr: Pointer?

    public val _1846986933_VtblPtr: Pointer?
      get() = __1846986933_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetForInputSite(inputSite: ExpInputSite?): ExpFocusNavigationHost? {
      val fnPtr = _1846986933_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ExpFocusNavigationHost>()
      val hr = fn.invokeHR(arrayOf(__1846986933_Ptr, marshalToNative(inputSite), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ExpFocusNavigationHost>(result.getValue())
      return resultValue
    }
  }

  public class IExpFocusNavigationHostStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1846986933_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpFocusNavigationHostStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7634e568217750d99d9518e3caca2b40")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpFocusNavigationHostStatics(ptr: Pointer?): WithDefault =
        IExpFocusNavigationHostStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpFocusNavigationHostStatics {
      val address = segment.toRawLongValue()
      return makeIExpFocusNavigationHostStatics(Pointer(address))
    }

    public override fun toNative(obj: IExpFocusNavigationHostStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1846986933_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpFocusNavigationHostStatics):
        Array<IExpFocusNavigationHostStatics?> = (elements as
        Array<IExpFocusNavigationHostStatics?>).castToImpl<IExpFocusNavigationHostStatics,IExpFocusNavigationHostStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpFocusNavigationHostStatics?> =
        arrayOfNulls<IExpFocusNavigationHostStatics_Impl>(size) as
        Array<IExpFocusNavigationHostStatics?>
  }
}
