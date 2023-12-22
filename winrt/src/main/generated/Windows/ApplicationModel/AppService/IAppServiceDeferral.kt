package Windows.ApplicationModel.AppService

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

@ABIMarker(IAppServiceDeferral.ABI::class)
@Signature("{7e1b5322-eab0-4248-ae04-fdf93838e472}")
@Guid("7e1b5322eab04248ae04fdf93838e472")
@WinRTInterface("7e1b5322eab04248ae04fdf93838e472")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppServiceDeferral.ByReference::class)
public interface IAppServiceDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppServiceDeferral> {
    public override fun getValue() = ABI.makeIAppServiceDeferral(pointer.getPointer(0))

    public fun setValue(value: IAppServiceDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppServiceDeferral {
    public val __1341551958_Ptr: Pointer?

    public val _1341551958_VtblPtr: Pointer?
      get() = __1341551958_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _1341551958_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1341551958_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppServiceDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1341551958_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppServiceDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7e1b5322eab04248ae04fdf93838e472")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppServiceDeferral(ptr: Pointer?): WithDefault = IAppServiceDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppServiceDeferral {
      val address = segment.toRawLongValue()
      return makeIAppServiceDeferral(Pointer(address))
    }

    public override fun toNative(obj: IAppServiceDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1341551958_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppServiceDeferral): Array<IAppServiceDeferral?> =
        (elements as
        Array<IAppServiceDeferral?>).castToImpl<IAppServiceDeferral,IAppServiceDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppServiceDeferral?> =
        arrayOfNulls<IAppServiceDeferral_Impl>(size) as Array<IAppServiceDeferral?>
  }
}
