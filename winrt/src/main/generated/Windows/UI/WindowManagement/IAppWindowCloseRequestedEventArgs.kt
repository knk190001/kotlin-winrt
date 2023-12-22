package Windows.UI.WindowManagement

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

@ABIMarker(IAppWindowCloseRequestedEventArgs.ABI::class)
@Signature("{e9ff01da-e7a2-57a8-8b5e-39c4003afdbb}")
@Guid("e9ff01dae7a257a88b5e39c4003afdbb")
@WinRTInterface("e9ff01dae7a257a88b5e39c4003afdbb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppWindowCloseRequestedEventArgs.ByReference::class)
public interface IAppWindowCloseRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Cancel(): Boolean

  @InterfaceMethod(1)
  public fun put_Cancel(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppWindowCloseRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIAppWindowCloseRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAppWindowCloseRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppWindowCloseRequestedEventArgs {
    public val __1063798185_Ptr: Pointer?

    public val _1063798185_VtblPtr: Pointer?
      get() = __1063798185_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Cancel(): Boolean {
      val fnPtr = _1063798185_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1063798185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Cancel(value: Boolean): Unit {
      val fnPtr = _1063798185_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1063798185_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1063798185_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1063798185_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IAppWindowCloseRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1063798185_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppWindowCloseRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e9ff01dae7a257a88b5e39c4003afdbb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppWindowCloseRequestedEventArgs(ptr: Pointer?): WithDefault =
        IAppWindowCloseRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppWindowCloseRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAppWindowCloseRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAppWindowCloseRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1063798185_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppWindowCloseRequestedEventArgs):
        Array<IAppWindowCloseRequestedEventArgs?> = (elements as
        Array<IAppWindowCloseRequestedEventArgs?>).castToImpl<IAppWindowCloseRequestedEventArgs,IAppWindowCloseRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppWindowCloseRequestedEventArgs?> =
        arrayOfNulls<IAppWindowCloseRequestedEventArgs_Impl>(size) as
        Array<IAppWindowCloseRequestedEventArgs?>
  }
}
