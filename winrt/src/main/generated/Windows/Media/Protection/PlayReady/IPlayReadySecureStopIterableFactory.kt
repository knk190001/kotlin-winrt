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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlayReadySecureStopIterableFactory.ABI::class)
@Signature("{5f1f0165-4214-4d9e-81eb-e89f9d294aee}")
@Guid("5f1f016542144d9e81ebe89f9d294aee")
@WinRTInterface("5f1f016542144d9e81ebe89f9d294aee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadySecureStopIterableFactory.ByReference::class)
public interface IPlayReadySecureStopIterableFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(publisherCertBytes: Array<Byte>): PlayReadySecureStopIterable?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadySecureStopIterableFactory> {
    public override fun getValue() =
        ABI.makeIPlayReadySecureStopIterableFactory(pointer.getPointer(0))

    public fun setValue(value: IPlayReadySecureStopIterableFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadySecureStopIterableFactory {
    public val __62816694_Ptr: Pointer?

    public val _62816694_VtblPtr: Pointer?
      get() = __62816694_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(publisherCertBytes: Array<Byte>):
        PlayReadySecureStopIterable? {
      val fnPtr = _62816694_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayReadySecureStopIterable>()
      val hr = fn.invokeHR(arrayOf(__62816694_Ptr,
          publisherCertBytes.size,marshalToNative(publisherCertBytes), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayReadySecureStopIterable>(result.getValue())
      return resultValue
    }
  }

  public class IPlayReadySecureStopIterableFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __62816694_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadySecureStopIterableFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5f1f016542144d9e81ebe89f9d294aee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadySecureStopIterableFactory(ptr: Pointer?): WithDefault =
        IPlayReadySecureStopIterableFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadySecureStopIterableFactory {
      val address = segment.toRawLongValue()
      return makeIPlayReadySecureStopIterableFactory(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadySecureStopIterableFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__62816694_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadySecureStopIterableFactory):
        Array<IPlayReadySecureStopIterableFactory?> = (elements as
        Array<IPlayReadySecureStopIterableFactory?>).castToImpl<IPlayReadySecureStopIterableFactory,IPlayReadySecureStopIterableFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadySecureStopIterableFactory?> =
        arrayOfNulls<IPlayReadySecureStopIterableFactory_Impl>(size) as
        Array<IPlayReadySecureStopIterableFactory?>
  }
}
