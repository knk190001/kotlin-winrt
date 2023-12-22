package Windows.Storage.Provider

import Windows.Foundation.Uri
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

@ABIMarker(IStorageProviderErrorCommandFactory.ABI::class)
@Signature("{ecc1f555-3ab4-556f-8bb2-7e5515eed8dc}")
@Guid("ecc1f5553ab4556f8bb27e5515eed8dc")
@WinRTInterface("ecc1f5553ab4556f8bb27e5515eed8dc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageProviderErrorCommandFactory.ByReference::class)
public interface IStorageProviderErrorCommandFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(label: String?, actionUri: Uri?): StorageProviderErrorCommand?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageProviderErrorCommandFactory> {
    public override fun getValue() =
        ABI.makeIStorageProviderErrorCommandFactory(pointer.getPointer(0))

    public fun setValue(value: IStorageProviderErrorCommandFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageProviderErrorCommandFactory {
    public val __1704736363_Ptr: Pointer?

    public val _1704736363_VtblPtr: Pointer?
      get() = __1704736363_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(label: String?, actionUri: Uri?):
        StorageProviderErrorCommand? {
      val fnPtr = _1704736363_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageProviderErrorCommand>()
      val hr = fn.invokeHR(arrayOf(__1704736363_Ptr, marshalToNative(label),
          marshalToNative(actionUri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageProviderErrorCommand>(result.getValue())
      return resultValue
    }
  }

  public class IStorageProviderErrorCommandFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1704736363_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageProviderErrorCommandFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ecc1f5553ab4556f8bb27e5515eed8dc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageProviderErrorCommandFactory(ptr: Pointer?): WithDefault =
        IStorageProviderErrorCommandFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageProviderErrorCommandFactory {
      val address = segment.toRawLongValue()
      return makeIStorageProviderErrorCommandFactory(Pointer(address))
    }

    public override fun toNative(obj: IStorageProviderErrorCommandFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1704736363_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageProviderErrorCommandFactory):
        Array<IStorageProviderErrorCommandFactory?> = (elements as
        Array<IStorageProviderErrorCommandFactory?>).castToImpl<IStorageProviderErrorCommandFactory,IStorageProviderErrorCommandFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageProviderErrorCommandFactory?> =
        arrayOfNulls<IStorageProviderErrorCommandFactory_Impl>(size) as
        Array<IStorageProviderErrorCommandFactory?>
  }
}
