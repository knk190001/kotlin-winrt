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

@ABIMarker(IAppWindowFrameStyle.ABI::class)
@Signature("{ac412946-e1ac-5230-944a-c60873dcf4a9}")
@Guid("ac412946e1ac5230944ac60873dcf4a9")
@WinRTInterface("ac412946e1ac5230944ac60873dcf4a9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppWindowFrameStyle.ByReference::class)
public interface IAppWindowFrameStyle : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetFrameStyle(): AppWindowFrameStyle?

  @InterfaceMethod(1)
  public fun SetFrameStyle(frameStyle: AppWindowFrameStyle?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppWindowFrameStyle> {
    public override fun getValue() = ABI.makeIAppWindowFrameStyle(pointer.getPointer(0))

    public fun setValue(value: IAppWindowFrameStyle_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppWindowFrameStyle {
    public val __1801824526_Ptr: Pointer?

    public val _1801824526_VtblPtr: Pointer?
      get() = __1801824526_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetFrameStyle(): AppWindowFrameStyle? {
      val fnPtr = _1801824526_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppWindowFrameStyle>()
      val hr = fn.invokeHR(arrayOf(__1801824526_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppWindowFrameStyle>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetFrameStyle(frameStyle: AppWindowFrameStyle?): Unit {
      val fnPtr = _1801824526_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1801824526_Ptr, marshalToNative(frameStyle),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppWindowFrameStyle_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1801824526_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppWindowFrameStyle, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ac412946e1ac5230944ac60873dcf4a9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppWindowFrameStyle(ptr: Pointer?): WithDefault = IAppWindowFrameStyle_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppWindowFrameStyle {
      val address = segment.toRawLongValue()
      return makeIAppWindowFrameStyle(Pointer(address))
    }

    public override fun toNative(obj: IAppWindowFrameStyle): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1801824526_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppWindowFrameStyle): Array<IAppWindowFrameStyle?> =
        (elements as
        Array<IAppWindowFrameStyle?>).castToImpl<IAppWindowFrameStyle,IAppWindowFrameStyle_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppWindowFrameStyle?> =
        arrayOfNulls<IAppWindowFrameStyle_Impl>(size) as Array<IAppWindowFrameStyle?>
  }
}
