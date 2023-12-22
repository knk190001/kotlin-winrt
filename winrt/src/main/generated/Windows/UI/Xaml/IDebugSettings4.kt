package Windows.UI.Xaml

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDebugSettings4.ABI::class)
@Signature("{c9001e45-e824-5a5f-866c-e20cec88a8fc}")
@Guid("c9001e45e8245a5f866ce20cec88a8fc")
@WinRTInterface("c9001e45e8245a5f866ce20cec88a8fc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDebugSettings4.ByReference::class)
public interface IDebugSettings4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FailFastOnErrors(): Boolean

  @InterfaceMethod(1)
  public fun put_FailFastOnErrors(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDebugSettings4> {
    public override fun getValue() = ABI.makeIDebugSettings4(pointer.getPointer(0))

    public fun setValue(value: IDebugSettings4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDebugSettings4 {
    public val __915410480_Ptr: Pointer?

    public val _915410480_VtblPtr: Pointer?
      get() = __915410480_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FailFastOnErrors(): Boolean {
      val fnPtr = _915410480_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__915410480_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_FailFastOnErrors(value: Boolean): Unit {
      val fnPtr = _915410480_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__915410480_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDebugSettings4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __915410480_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDebugSettings4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c9001e45e8245a5f866ce20cec88a8fc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDebugSettings4(ptr: Pointer?): WithDefault = IDebugSettings4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDebugSettings4 {
      val address = segment.toRawLongValue()
      return makeIDebugSettings4(Pointer(address))
    }

    public override fun toNative(obj: IDebugSettings4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__915410480_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDebugSettings4): Array<IDebugSettings4?> = (elements as
        Array<IDebugSettings4?>).castToImpl<IDebugSettings4,IDebugSettings4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDebugSettings4?> =
        arrayOfNulls<IDebugSettings4_Impl>(size) as Array<IDebugSettings4?>
  }
}
