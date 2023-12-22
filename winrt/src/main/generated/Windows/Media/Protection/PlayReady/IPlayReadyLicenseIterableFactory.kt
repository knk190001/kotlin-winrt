package Windows.Media.Protection.PlayReady

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

@ABIMarker(IPlayReadyLicenseIterableFactory.ABI::class)
@Signature("{d4179f08-0837-4978-8e68-be4293c8d7a6}")
@Guid("d4179f08083749788e68be4293c8d7a6")
@WinRTInterface("d4179f08083749788e68be4293c8d7a6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyLicenseIterableFactory.ByReference::class)
public interface IPlayReadyLicenseIterableFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(contentHeader: PlayReadyContentHeader?, fullyEvaluated: Boolean):
      PlayReadyLicenseIterable?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyLicenseIterableFactory> {
    public override fun getValue() = ABI.makeIPlayReadyLicenseIterableFactory(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyLicenseIterableFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyLicenseIterableFactory {
    public val __943826388_Ptr: Pointer?

    public val _943826388_VtblPtr: Pointer?
      get() = __943826388_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(contentHeader: PlayReadyContentHeader?,
        fullyEvaluated: Boolean): PlayReadyLicenseIterable? {
      val fnPtr = _943826388_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayReadyLicenseIterable>()
      val hr = fn.invokeHR(arrayOf(__943826388_Ptr, marshalToNative(contentHeader), fullyEvaluated,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayReadyLicenseIterable>(result.getValue())
      return resultValue
    }
  }

  public class IPlayReadyLicenseIterableFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __943826388_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyLicenseIterableFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d4179f08083749788e68be4293c8d7a6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyLicenseIterableFactory(ptr: Pointer?): WithDefault =
        IPlayReadyLicenseIterableFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadyLicenseIterableFactory {
      val address = segment.toRawLongValue()
      return makeIPlayReadyLicenseIterableFactory(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyLicenseIterableFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__943826388_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyLicenseIterableFactory):
        Array<IPlayReadyLicenseIterableFactory?> = (elements as
        Array<IPlayReadyLicenseIterableFactory?>).castToImpl<IPlayReadyLicenseIterableFactory,IPlayReadyLicenseIterableFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyLicenseIterableFactory?> =
        arrayOfNulls<IPlayReadyLicenseIterableFactory_Impl>(size) as
        Array<IPlayReadyLicenseIterableFactory?>
  }
}
