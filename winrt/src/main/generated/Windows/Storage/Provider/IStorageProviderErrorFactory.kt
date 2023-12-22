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

@ABIMarker(IStorageProviderErrorFactory.ABI::class)
@Signature("{97d6f240-61ab-51dc-9921-18bd0dbef79e}")
@Guid("97d6f24061ab51dc992118bd0dbef79e")
@WinRTInterface("97d6f24061ab51dc992118bd0dbef79e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageProviderErrorFactory.ByReference::class)
public interface IStorageProviderErrorFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(
    id: String?,
    title: String?,
    message: String?
  ): StorageProviderError?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageProviderErrorFactory> {
    public override fun getValue() = ABI.makeIStorageProviderErrorFactory(pointer.getPointer(0))

    public fun setValue(value: IStorageProviderErrorFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageProviderErrorFactory {
    public val __1051989132_Ptr: Pointer?

    public val _1051989132_VtblPtr: Pointer?
      get() = __1051989132_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(
      id: String?,
      title: String?,
      message: String?
    ): StorageProviderError? {
      val fnPtr = _1051989132_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageProviderError>()
      val hr = fn.invokeHR(arrayOf(__1051989132_Ptr, marshalToNative(id), marshalToNative(title),
          marshalToNative(message), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageProviderError>(result.getValue())
      return resultValue
    }
  }

  public class IStorageProviderErrorFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1051989132_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageProviderErrorFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("97d6f24061ab51dc992118bd0dbef79e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageProviderErrorFactory(ptr: Pointer?): WithDefault =
        IStorageProviderErrorFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageProviderErrorFactory {
      val address = segment.toRawLongValue()
      return makeIStorageProviderErrorFactory(Pointer(address))
    }

    public override fun toNative(obj: IStorageProviderErrorFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1051989132_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageProviderErrorFactory):
        Array<IStorageProviderErrorFactory?> = (elements as
        Array<IStorageProviderErrorFactory?>).castToImpl<IStorageProviderErrorFactory,IStorageProviderErrorFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageProviderErrorFactory?> =
        arrayOfNulls<IStorageProviderErrorFactory_Impl>(size) as
        Array<IStorageProviderErrorFactory?>
  }
}
