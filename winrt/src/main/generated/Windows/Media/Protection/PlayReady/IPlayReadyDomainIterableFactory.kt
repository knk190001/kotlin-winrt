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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPlayReadyDomainIterableFactory.ABI::class)
@Signature("{4df384ee-3121-4df3-a5e8-d0c24c0500fc}")
@Guid("4df384ee31214df3a5e8d0c24c0500fc")
@WinRTInterface("4df384ee31214df3a5e8d0c24c0500fc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayReadyDomainIterableFactory.ByReference::class)
public interface IPlayReadyDomainIterableFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(domainAccountId: com.sun.jna.platform.win32.Guid.GUID?):
      PlayReadyDomainIterable?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayReadyDomainIterableFactory> {
    public override fun getValue() = ABI.makeIPlayReadyDomainIterableFactory(pointer.getPointer(0))

    public fun setValue(value: IPlayReadyDomainIterableFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayReadyDomainIterableFactory {
    public val __1362391105_Ptr: Pointer?

    public val _1362391105_VtblPtr: Pointer?
      get() = __1362391105_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(domainAccountId: com.sun.jna.platform.win32.Guid.GUID?):
        PlayReadyDomainIterable? {
      val fnPtr = _1362391105_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayReadyDomainIterable>()
      val hr = fn.invokeHR(arrayOf(__1362391105_Ptr, marshalToNative(domainAccountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayReadyDomainIterable>(result.getValue())
      return resultValue
    }
  }

  public class IPlayReadyDomainIterableFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1362391105_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayReadyDomainIterableFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4df384ee31214df3a5e8d0c24c0500fc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayReadyDomainIterableFactory(ptr: Pointer?): WithDefault =
        IPlayReadyDomainIterableFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayReadyDomainIterableFactory {
      val address = segment.toRawLongValue()
      return makeIPlayReadyDomainIterableFactory(Pointer(address))
    }

    public override fun toNative(obj: IPlayReadyDomainIterableFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1362391105_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayReadyDomainIterableFactory):
        Array<IPlayReadyDomainIterableFactory?> = (elements as
        Array<IPlayReadyDomainIterableFactory?>).castToImpl<IPlayReadyDomainIterableFactory,IPlayReadyDomainIterableFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayReadyDomainIterableFactory?> =
        arrayOfNulls<IPlayReadyDomainIterableFactory_Impl>(size) as
        Array<IPlayReadyDomainIterableFactory?>
  }
}
