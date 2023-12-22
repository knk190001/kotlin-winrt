package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IFocusEngagedEventArgs.ABI::class)
@Signature("{1e71e8e4-74b2-50a1-8f2b-42c0118ab0ea}")
@Guid("1e71e8e474b250a18f2b42c0118ab0ea")
@WinRTInterface("1e71e8e474b250a18f2b42c0118ab0ea")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFocusEngagedEventArgs.ByReference::class)
public interface IFocusEngagedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFocusEngagedEventArgs> {
    public override fun getValue() = ABI.makeIFocusEngagedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IFocusEngagedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFocusEngagedEventArgs {
    public val __681725509_Ptr: Pointer?

    public val _681725509_VtblPtr: Pointer?
      get() = __681725509_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _681725509_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__681725509_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _681725509_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__681725509_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFocusEngagedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __681725509_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFocusEngagedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1e71e8e474b250a18f2b42c0118ab0ea")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFocusEngagedEventArgs(ptr: Pointer?): WithDefault =
        IFocusEngagedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFocusEngagedEventArgs {
      val address = segment.toRawLongValue()
      return makeIFocusEngagedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IFocusEngagedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__681725509_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFocusEngagedEventArgs): Array<IFocusEngagedEventArgs?> =
        (elements as
        Array<IFocusEngagedEventArgs?>).castToImpl<IFocusEngagedEventArgs,IFocusEngagedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFocusEngagedEventArgs?> =
        arrayOfNulls<IFocusEngagedEventArgs_Impl>(size) as Array<IFocusEngagedEventArgs?>
  }
}
