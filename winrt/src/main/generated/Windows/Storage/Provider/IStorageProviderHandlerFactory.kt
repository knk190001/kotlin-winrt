package Windows.Storage.Provider

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageProviderHandlerFactory.ABI::class)
@Signature("{6154dc3a-fc1d-5aae-9e23-e8659a22c5f6}")
@Guid("6154dc3afc1d5aae9e23e8659a22c5f6")
@WinRTInterface("6154dc3afc1d5aae9e23e8659a22c5f6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageProviderHandlerFactory.ByReference::class)
public interface IStorageProviderHandlerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetStatusSource(syncRootId: String?): IStorageProviderStatusSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageProviderHandlerFactory> {
    public override fun getValue() = ABI.makeIStorageProviderHandlerFactory(pointer.getPointer(0))

    public fun setValue(value: IStorageProviderHandlerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageProviderHandlerFactory {
    public val __374981774_Ptr: Pointer?

    public val _374981774_VtblPtr: Pointer?
      get() = __374981774_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetStatusSource(syncRootId: String?): IStorageProviderStatusSource? {
      val fnPtr = _374981774_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IStorageProviderStatusSource>()
      val hr = fn.invokeHR(arrayOf(__374981774_Ptr, marshalToNative(syncRootId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IStorageProviderStatusSource>(result.getValue())
      return resultValue
    }
  }

  public class IStorageProviderHandlerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __374981774_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageProviderHandlerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6154dc3afc1d5aae9e23e8659a22c5f6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageProviderHandlerFactory(ptr: Pointer?): WithDefault =
        IStorageProviderHandlerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageProviderHandlerFactory {
      val address = segment.toRawLongValue()
      return makeIStorageProviderHandlerFactory(Pointer(address))
    }

    public override fun toNative(obj: IStorageProviderHandlerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__374981774_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageProviderHandlerFactory):
        Array<IStorageProviderHandlerFactory?> = (elements as
        Array<IStorageProviderHandlerFactory?>).castToImpl<IStorageProviderHandlerFactory,IStorageProviderHandlerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageProviderHandlerFactory?> =
        arrayOfNulls<IStorageProviderHandlerFactory_Impl>(size) as
        Array<IStorageProviderHandlerFactory?>
  }
}
