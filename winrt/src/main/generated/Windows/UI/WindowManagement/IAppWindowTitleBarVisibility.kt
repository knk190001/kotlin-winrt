package Windows.UI.WindowManagement

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

@ABIMarker(IAppWindowTitleBarVisibility.ABI::class)
@Signature("{a215a4e3-6e7e-5651-8c3b-624819528154}")
@Guid("a215a4e36e7e56518c3b624819528154")
@WinRTInterface("a215a4e36e7e56518c3b624819528154")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppWindowTitleBarVisibility.ByReference::class)
public interface IAppWindowTitleBarVisibility : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetPreferredVisibility(): AppWindowTitleBarVisibility?

  @InterfaceMethod(1)
  public fun SetPreferredVisibility(visibilityMode: AppWindowTitleBarVisibility?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppWindowTitleBarVisibility> {
    public override fun getValue() = ABI.makeIAppWindowTitleBarVisibility(pointer.getPointer(0))

    public fun setValue(value: IAppWindowTitleBarVisibility_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppWindowTitleBarVisibility {
    public val __1362265385_Ptr: Pointer?

    public val _1362265385_VtblPtr: Pointer?
      get() = __1362265385_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetPreferredVisibility(): AppWindowTitleBarVisibility? {
      val fnPtr = _1362265385_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppWindowTitleBarVisibility>()
      val hr = fn.invokeHR(arrayOf(__1362265385_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppWindowTitleBarVisibility>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetPreferredVisibility(visibilityMode: AppWindowTitleBarVisibility?): Unit {
      val fnPtr = _1362265385_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1362265385_Ptr, marshalToNative(visibilityMode),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppWindowTitleBarVisibility_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1362265385_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppWindowTitleBarVisibility, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a215a4e36e7e56518c3b624819528154")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppWindowTitleBarVisibility(ptr: Pointer?): WithDefault =
        IAppWindowTitleBarVisibility_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppWindowTitleBarVisibility {
      val address = segment.toRawLongValue()
      return makeIAppWindowTitleBarVisibility(Pointer(address))
    }

    public override fun toNative(obj: IAppWindowTitleBarVisibility): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1362265385_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppWindowTitleBarVisibility):
        Array<IAppWindowTitleBarVisibility?> = (elements as
        Array<IAppWindowTitleBarVisibility?>).castToImpl<IAppWindowTitleBarVisibility,IAppWindowTitleBarVisibility_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppWindowTitleBarVisibility?> =
        arrayOfNulls<IAppWindowTitleBarVisibility_Impl>(size) as
        Array<IAppWindowTitleBarVisibility?>
  }
}
