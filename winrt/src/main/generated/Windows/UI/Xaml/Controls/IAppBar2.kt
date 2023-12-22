package Windows.UI.Xaml.Controls

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

@ABIMarker(IAppBar2.ABI::class)
@Signature("{c3ab17b3-7ad7-4676-9910-7fe3f0e8e993}")
@Guid("c3ab17b37ad7467699107fe3f0e8e993")
@WinRTInterface("c3ab17b37ad7467699107fe3f0e8e993")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBar2.ByReference::class)
public interface IAppBar2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ClosedDisplayMode(): AppBarClosedDisplayMode?

  @InterfaceMethod(1)
  public fun put_ClosedDisplayMode(value: AppBarClosedDisplayMode?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppBar2> {
    public override fun getValue() = ABI.makeIAppBar2(pointer.getPointer(0))

    public fun setValue(value: IAppBar2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBar2 {
    public val __1641543516_Ptr: Pointer?

    public val _1641543516_VtblPtr: Pointer?
      get() = __1641543516_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ClosedDisplayMode(): AppBarClosedDisplayMode? {
      val fnPtr = _1641543516_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppBarClosedDisplayMode>()
      val hr = fn.invokeHR(arrayOf(__1641543516_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppBarClosedDisplayMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_ClosedDisplayMode(value: AppBarClosedDisplayMode?): Unit {
      val fnPtr = _1641543516_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1641543516_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppBar2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1641543516_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBar2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c3ab17b37ad7467699107fe3f0e8e993")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBar2(ptr: Pointer?): WithDefault = IAppBar2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBar2 {
      val address = segment.toRawLongValue()
      return makeIAppBar2(Pointer(address))
    }

    public override fun toNative(obj: IAppBar2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1641543516_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBar2): Array<IAppBar2?> = (elements as
        Array<IAppBar2?>).castToImpl<IAppBar2,IAppBar2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBar2?> = arrayOfNulls<IAppBar2_Impl>(size) as
        Array<IAppBar2?>
  }
}
