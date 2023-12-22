package Microsoft.UI.Windowing

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

@ABIMarker(IAppWindowTitleBar2.ABI::class)
@Signature("{86faed38-748a-5b4b-9ccf-3ba0496c9041}")
@Guid("86faed38748a5b4b9ccf3ba0496c9041")
@WinRTInterface("86faed38748a5b4b9ccf3ba0496c9041")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppWindowTitleBar2.ByReference::class)
public interface IAppWindowTitleBar2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PreferredHeightOption(): TitleBarHeightOption?

  @InterfaceMethod(1)
  public fun put_PreferredHeightOption(value: TitleBarHeightOption?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppWindowTitleBar2> {
    public override fun getValue() = ABI.makeIAppWindowTitleBar2(pointer.getPointer(0))

    public fun setValue(value: IAppWindowTitleBar2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppWindowTitleBar2 {
    public val __1930873751_Ptr: Pointer?

    public val _1930873751_VtblPtr: Pointer?
      get() = __1930873751_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PreferredHeightOption(): TitleBarHeightOption? {
      val fnPtr = _1930873751_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TitleBarHeightOption>()
      val hr = fn.invokeHR(arrayOf(__1930873751_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TitleBarHeightOption>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PreferredHeightOption(value: TitleBarHeightOption?): Unit {
      val fnPtr = _1930873751_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1930873751_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppWindowTitleBar2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1930873751_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppWindowTitleBar2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("86faed38748a5b4b9ccf3ba0496c9041")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppWindowTitleBar2(ptr: Pointer?): WithDefault = IAppWindowTitleBar2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppWindowTitleBar2 {
      val address = segment.toRawLongValue()
      return makeIAppWindowTitleBar2(Pointer(address))
    }

    public override fun toNative(obj: IAppWindowTitleBar2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1930873751_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppWindowTitleBar2): Array<IAppWindowTitleBar2?> =
        (elements as
        Array<IAppWindowTitleBar2?>).castToImpl<IAppWindowTitleBar2,IAppWindowTitleBar2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppWindowTitleBar2?> =
        arrayOfNulls<IAppWindowTitleBar2_Impl>(size) as Array<IAppWindowTitleBar2?>
  }
}
