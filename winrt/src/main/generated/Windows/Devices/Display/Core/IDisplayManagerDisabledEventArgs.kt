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

@ABIMarker(IDisplayManagerDisabledEventArgs.ABI::class)
@Signature("{8726dde4-6793-5973-a11f-5ffbc93fdb90}")
@Guid("8726dde467935973a11f5ffbc93fdb90")
@WinRTInterface("8726dde467935973a11f5ffbc93fdb90")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDisplayManagerDisabledEventArgs.ByReference::class)
public interface IDisplayManagerDisabledEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDisplayManagerDisabledEventArgs> {
    public override fun getValue() = ABI.makeIDisplayManagerDisabledEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDisplayManagerDisabledEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDisplayManagerDisabledEventArgs {
    public val __730392174_Ptr: Pointer?

    public val _730392174_VtblPtr: Pointer?
      get() = __730392174_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _730392174_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__730392174_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _730392174_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__730392174_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _730392174_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__730392174_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IDisplayManagerDisabledEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __730392174_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDisplayManagerDisabledEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8726dde467935973a11f5ffbc93fdb90")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDisplayManagerDisabledEventArgs(ptr: Pointer?): WithDefault =
        IDisplayManagerDisabledEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDisplayManagerDisabledEventArgs {
      val address = segment.toRawLongValue()
      return makeIDisplayManagerDisabledEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDisplayManagerDisabledEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__730392174_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDisplayManagerDisabledEventArgs):
        Array<IDisplayManagerDisabledEventArgs?> = (elements as
        Array<IDisplayManagerDisabledEventArgs?>).castToImpl<IDisplayManagerDisabledEventArgs,IDisplayManagerDisabledEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDisplayManagerDisabledEventArgs?> =
        arrayOfNulls<IDisplayManagerDisabledEventArgs_Impl>(size) as
        Array<IDisplayManagerDisabledEventArgs?>
  }
}
