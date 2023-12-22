package Windows.Devices.Display.Core

import Windows.Foundation.Deferral
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

@ABIMarker(IDisplayManagerEnabledEventArgs.ABI::class)
@Signature("{f0cf3f6f-42fa-59a2-b297-26e1713de848}")
@Guid("f0cf3f6f42fa59a2b29726e1713de848")
@WinRTInterface("f0cf3f6f42fa59a2b29726e1713de848")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayManagerEnabledEventArgs.ByReference::class)
public interface IDisplayManagerEnabledEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayManagerEnabledEventArgs> {
    public override fun getValue() = ABI.makeIDisplayManagerEnabledEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDisplayManagerEnabledEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayManagerEnabledEventArgs {
    public val __660652803_Ptr: Pointer?

    public val _660652803_VtblPtr: Pointer?
      get() = __660652803_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _660652803_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__660652803_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _660652803_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__660652803_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _660652803_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__660652803_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayManagerEnabledEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __660652803_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayManagerEnabledEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f0cf3f6f42fa59a2b29726e1713de848")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayManagerEnabledEventArgs(ptr: Pointer?): WithDefault =
        IDisplayManagerEnabledEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayManagerEnabledEventArgs {
      val address = segment.toRawLongValue()
      return makeIDisplayManagerEnabledEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDisplayManagerEnabledEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__660652803_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayManagerEnabledEventArgs):
        Array<IDisplayManagerEnabledEventArgs?> = (elements as
        Array<IDisplayManagerEnabledEventArgs?>).castToImpl<IDisplayManagerEnabledEventArgs,IDisplayManagerEnabledEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayManagerEnabledEventArgs?> =
        arrayOfNulls<IDisplayManagerEnabledEventArgs_Impl>(size) as
        Array<IDisplayManagerEnabledEventArgs?>
  }
}
