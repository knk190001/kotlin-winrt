package Windows.UI.Core

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

@ABIMarker(ISystemNavigationManager2.ABI::class)
@Signature("{8c510401-67be-49ae-9509-671c1e54a389}")
@Guid("8c51040167be49ae9509671c1e54a389")
@WinRTInterface("8c51040167be49ae9509671c1e54a389")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISystemNavigationManager2.ByReference::class)
public interface ISystemNavigationManager2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppViewBackButtonVisibility(): AppViewBackButtonVisibility?

  @InterfaceMethod(1)
  public fun put_AppViewBackButtonVisibility(value: AppViewBackButtonVisibility?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISystemNavigationManager2> {
    public override fun getValue() = ABI.makeISystemNavigationManager2(pointer.getPointer(0))

    public fun setValue(value: ISystemNavigationManager2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISystemNavigationManager2 {
    public val __271661117_Ptr: Pointer?

    public val _271661117_VtblPtr: Pointer?
      get() = __271661117_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppViewBackButtonVisibility(): AppViewBackButtonVisibility? {
      val fnPtr = _271661117_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppViewBackButtonVisibility>()
      val hr = fn.invokeHR(arrayOf(__271661117_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppViewBackButtonVisibility>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_AppViewBackButtonVisibility(value: AppViewBackButtonVisibility?): Unit {
      val fnPtr = _271661117_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__271661117_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISystemNavigationManager2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __271661117_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISystemNavigationManager2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8c51040167be49ae9509671c1e54a389")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISystemNavigationManager2(ptr: Pointer?): WithDefault =
        ISystemNavigationManager2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISystemNavigationManager2 {
      val address = segment.toRawLongValue()
      return makeISystemNavigationManager2(Pointer(address))
    }

    public override fun toNative(obj: ISystemNavigationManager2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__271661117_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISystemNavigationManager2):
        Array<ISystemNavigationManager2?> = (elements as
        Array<ISystemNavigationManager2?>).castToImpl<ISystemNavigationManager2,ISystemNavigationManager2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISystemNavigationManager2?> =
        arrayOfNulls<ISystemNavigationManager2_Impl>(size) as Array<ISystemNavigationManager2?>
  }
}
