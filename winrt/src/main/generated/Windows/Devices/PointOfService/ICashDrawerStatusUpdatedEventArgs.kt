package Windows.Devices.PointOfService

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

@ABIMarker(ICashDrawerStatusUpdatedEventArgs.ABI::class)
@Signature("{30aae98a-0d70-459c-9553-87e124c52488}")
@Guid("30aae98a0d70459c955387e124c52488")
@WinRTInterface("30aae98a0d70459c955387e124c52488")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICashDrawerStatusUpdatedEventArgs.ByReference::class)
public interface ICashDrawerStatusUpdatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): CashDrawerStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICashDrawerStatusUpdatedEventArgs> {
    public override fun getValue() =
        ABI.makeICashDrawerStatusUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICashDrawerStatusUpdatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICashDrawerStatusUpdatedEventArgs {
    public val __1432413583_Ptr: Pointer?

    public val _1432413583_VtblPtr: Pointer?
      get() = __1432413583_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): CashDrawerStatus? {
      val fnPtr = _1432413583_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CashDrawerStatus>()
      val hr = fn.invokeHR(arrayOf(__1432413583_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CashDrawerStatus>(result.getValue())
      return resultValue
    }
  }

  public class ICashDrawerStatusUpdatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1432413583_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICashDrawerStatusUpdatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("30aae98a0d70459c955387e124c52488")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICashDrawerStatusUpdatedEventArgs(ptr: Pointer?): WithDefault =
        ICashDrawerStatusUpdatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICashDrawerStatusUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return makeICashDrawerStatusUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICashDrawerStatusUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1432413583_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICashDrawerStatusUpdatedEventArgs):
        Array<ICashDrawerStatusUpdatedEventArgs?> = (elements as
        Array<ICashDrawerStatusUpdatedEventArgs?>).castToImpl<ICashDrawerStatusUpdatedEventArgs,ICashDrawerStatusUpdatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICashDrawerStatusUpdatedEventArgs?> =
        arrayOfNulls<ICashDrawerStatusUpdatedEventArgs_Impl>(size) as
        Array<ICashDrawerStatusUpdatedEventArgs?>
  }
}
