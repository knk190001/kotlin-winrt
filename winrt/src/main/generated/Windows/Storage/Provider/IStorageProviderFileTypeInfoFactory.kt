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

@ABIMarker(IStorageProviderFileTypeInfoFactory.ABI::class)
@Signature("{3fa12c6f-cce6-5d5d-80b1-389e7cf92dbf}")
@Guid("3fa12c6fcce65d5d80b1389e7cf92dbf")
@WinRTInterface("3fa12c6fcce65d5d80b1389e7cf92dbf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageProviderFileTypeInfoFactory.ByReference::class)
public interface IStorageProviderFileTypeInfoFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(fileExtension: String?, iconResource: String?):
      StorageProviderFileTypeInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageProviderFileTypeInfoFactory> {
    public override fun getValue() =
        ABI.makeIStorageProviderFileTypeInfoFactory(pointer.getPointer(0))

    public fun setValue(value: IStorageProviderFileTypeInfoFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageProviderFileTypeInfoFactory {
    public val __446539276_Ptr: Pointer?

    public val _446539276_VtblPtr: Pointer?
      get() = __446539276_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(fileExtension: String?, iconResource: String?):
        StorageProviderFileTypeInfo? {
      val fnPtr = _446539276_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageProviderFileTypeInfo>()
      val hr = fn.invokeHR(arrayOf(__446539276_Ptr, marshalToNative(fileExtension),
          marshalToNative(iconResource), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageProviderFileTypeInfo>(result.getValue())
      return resultValue
    }
  }

  public class IStorageProviderFileTypeInfoFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __446539276_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageProviderFileTypeInfoFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3fa12c6fcce65d5d80b1389e7cf92dbf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageProviderFileTypeInfoFactory(ptr: Pointer?): WithDefault =
        IStorageProviderFileTypeInfoFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageProviderFileTypeInfoFactory {
      val address = segment.toRawLongValue()
      return makeIStorageProviderFileTypeInfoFactory(Pointer(address))
    }

    public override fun toNative(obj: IStorageProviderFileTypeInfoFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__446539276_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageProviderFileTypeInfoFactory):
        Array<IStorageProviderFileTypeInfoFactory?> = (elements as
        Array<IStorageProviderFileTypeInfoFactory?>).castToImpl<IStorageProviderFileTypeInfoFactory,IStorageProviderFileTypeInfoFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageProviderFileTypeInfoFactory?> =
        arrayOfNulls<IStorageProviderFileTypeInfoFactory_Impl>(size) as
        Array<IStorageProviderFileTypeInfoFactory?>
  }
}
