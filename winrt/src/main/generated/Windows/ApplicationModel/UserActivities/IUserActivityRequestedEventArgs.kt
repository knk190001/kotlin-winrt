package Windows.ApplicationModel.UserActivities

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUserActivityRequestedEventArgs.ABI::class)
@Signature("{a4cc7a4c-8229-4cfd-a3bc-c61d318575a4}")
@Guid("a4cc7a4c82294cfda3bcc61d318575a4")
@WinRTInterface("a4cc7a4c82294cfda3bcc61d318575a4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserActivityRequestedEventArgs.ByReference::class)
public interface IUserActivityRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): UserActivityRequest?

  @InterfaceMethod(1)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserActivityRequestedEventArgs> {
    public override fun getValue() = ABI.makeIUserActivityRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IUserActivityRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserActivityRequestedEventArgs {
    public val __1433850518_Ptr: Pointer?

    public val _1433850518_VtblPtr: Pointer?
      get() = __1433850518_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): UserActivityRequest? {
      val fnPtr = _1433850518_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UserActivityRequest>()
      val hr = fn.invokeHR(arrayOf(__1433850518_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UserActivityRequest>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1433850518_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1433850518_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IUserActivityRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1433850518_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserActivityRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a4cc7a4c82294cfda3bcc61d318575a4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserActivityRequestedEventArgs(ptr: Pointer?): WithDefault =
        IUserActivityRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserActivityRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIUserActivityRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IUserActivityRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1433850518_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserActivityRequestedEventArgs):
        Array<IUserActivityRequestedEventArgs?> = (elements as
        Array<IUserActivityRequestedEventArgs?>).castToImpl<IUserActivityRequestedEventArgs,IUserActivityRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserActivityRequestedEventArgs?> =
        arrayOfNulls<IUserActivityRequestedEventArgs_Impl>(size) as
        Array<IUserActivityRequestedEventArgs?>
  }
}
