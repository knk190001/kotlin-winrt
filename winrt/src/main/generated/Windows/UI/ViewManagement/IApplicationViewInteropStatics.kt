package Windows.UI.ViewManagement

import Windows.UI.Core.ICoreWindow
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

@ABIMarker(IApplicationViewInteropStatics.ABI::class)
@Signature("{c446fb5d-4793-4896-a8e2-be57a8bb0f50}")
@Guid("c446fb5d47934896a8e2be57a8bb0f50")
@WinRTInterface("c446fb5d47934896a8e2be57a8bb0f50")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IApplicationViewInteropStatics.ByReference::class)
public interface IApplicationViewInteropStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetApplicationViewIdForWindow(window: ICoreWindow?): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IApplicationViewInteropStatics> {
    public override fun getValue() = ABI.makeIApplicationViewInteropStatics(pointer.getPointer(0))

    public fun setValue(value: IApplicationViewInteropStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IApplicationViewInteropStatics {
    public val __1496158059_Ptr: Pointer?

    public val _1496158059_VtblPtr: Pointer?
      get() = __1496158059_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetApplicationViewIdForWindow(window: ICoreWindow?): Int {
      val fnPtr = _1496158059_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1496158059_Ptr, marshalToNative(window), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class IApplicationViewInteropStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1496158059_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IApplicationViewInteropStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c446fb5d47934896a8e2be57a8bb0f50")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIApplicationViewInteropStatics(ptr: Pointer?): WithDefault =
        IApplicationViewInteropStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IApplicationViewInteropStatics {
      val address = segment.toRawLongValue()
      return makeIApplicationViewInteropStatics(Pointer(address))
    }

    public override fun toNative(obj: IApplicationViewInteropStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1496158059_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IApplicationViewInteropStatics):
        Array<IApplicationViewInteropStatics?> = (elements as
        Array<IApplicationViewInteropStatics?>).castToImpl<IApplicationViewInteropStatics,IApplicationViewInteropStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IApplicationViewInteropStatics?> =
        arrayOfNulls<IApplicationViewInteropStatics_Impl>(size) as
        Array<IApplicationViewInteropStatics?>
  }
}
