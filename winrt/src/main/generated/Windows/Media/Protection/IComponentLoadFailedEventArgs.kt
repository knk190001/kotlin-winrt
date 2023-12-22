package Windows.Media.Protection

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

@ABIMarker(IComponentLoadFailedEventArgs.ABI::class)
@Signature("{95972e93-7746-417e-8495-f031bbc5862c}")
@Guid("95972e937746417e8495f031bbc5862c")
@WinRTInterface("95972e937746417e8495f031bbc5862c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IComponentLoadFailedEventArgs.ByReference::class)
public interface IComponentLoadFailedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Information(): RevocationAndRenewalInformation?

  @InterfaceMethod(1)
  public fun get_Completion(): MediaProtectionServiceCompletion?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IComponentLoadFailedEventArgs> {
    public override fun getValue() = ABI.makeIComponentLoadFailedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IComponentLoadFailedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IComponentLoadFailedEventArgs {
    public val __1828539634_Ptr: Pointer?

    public val _1828539634_VtblPtr: Pointer?
      get() = __1828539634_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Information(): RevocationAndRenewalInformation? {
      val fnPtr = _1828539634_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RevocationAndRenewalInformation>()
      val hr = fn.invokeHR(arrayOf(__1828539634_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RevocationAndRenewalInformation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Completion(): MediaProtectionServiceCompletion? {
      val fnPtr = _1828539634_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MediaProtectionServiceCompletion>()
      val hr = fn.invokeHR(arrayOf(__1828539634_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MediaProtectionServiceCompletion>(result.getValue())
      return resultValue
    }
  }

  public class IComponentLoadFailedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1828539634_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IComponentLoadFailedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("95972e937746417e8495f031bbc5862c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIComponentLoadFailedEventArgs(ptr: Pointer?): WithDefault =
        IComponentLoadFailedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IComponentLoadFailedEventArgs {
      val address = segment.toRawLongValue()
      return makeIComponentLoadFailedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IComponentLoadFailedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1828539634_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IComponentLoadFailedEventArgs):
        Array<IComponentLoadFailedEventArgs?> = (elements as
        Array<IComponentLoadFailedEventArgs?>).castToImpl<IComponentLoadFailedEventArgs,IComponentLoadFailedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IComponentLoadFailedEventArgs?> =
        arrayOfNulls<IComponentLoadFailedEventArgs_Impl>(size) as
        Array<IComponentLoadFailedEventArgs?>
  }
}
