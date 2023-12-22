package Windows.Storage.Provider

import Windows.Foundation.Collections.IIterable
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

@ABIMarker(IStorageProviderStatusFactory.ABI::class)
@Signature("{d64828c5-9b7a-5fa4-b126-90bd18936c7f}")
@Guid("d64828c59b7a5fa4b12690bd18936c7f")
@WinRTInterface("d64828c59b7a5fa4b12690bd18936c7f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageProviderStatusFactory.ByReference::class)
public interface IStorageProviderStatusFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(state: StorageProviderState?, message: String?): StorageProviderStatus?

  @InterfaceMethod(1)
  public fun CreateInstance2(
    state: StorageProviderState?,
    message: String?,
    errorMessages: IIterable<StorageProviderError?>?
  ): StorageProviderStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageProviderStatusFactory> {
    public override fun getValue() = ABI.makeIStorageProviderStatusFactory(pointer.getPointer(0))

    public fun setValue(value: IStorageProviderStatusFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageProviderStatusFactory {
    public val __876517018_Ptr: Pointer?

    public val _876517018_VtblPtr: Pointer?
      get() = __876517018_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(state: StorageProviderState?, message: String?):
        StorageProviderStatus? {
      val fnPtr = _876517018_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageProviderStatus>()
      val hr = fn.invokeHR(arrayOf(__876517018_Ptr, marshalToNative(state),
          marshalToNative(message), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageProviderStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateInstance2(
      state: StorageProviderState?,
      message: String?,
      errorMessages: IIterable<StorageProviderError?>?
    ): StorageProviderStatus? {
      val fnPtr = _876517018_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<StorageProviderStatus>()
      val hr = fn.invokeHR(arrayOf(__876517018_Ptr, marshalToNative(state),
          marshalToNative(message), marshalToNative(errorMessages), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<StorageProviderStatus>(result.getValue())
      return resultValue
    }
  }

  public class IStorageProviderStatusFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __876517018_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageProviderStatusFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d64828c59b7a5fa4b12690bd18936c7f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageProviderStatusFactory(ptr: Pointer?): WithDefault =
        IStorageProviderStatusFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageProviderStatusFactory {
      val address = segment.toRawLongValue()
      return makeIStorageProviderStatusFactory(Pointer(address))
    }

    public override fun toNative(obj: IStorageProviderStatusFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__876517018_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageProviderStatusFactory):
        Array<IStorageProviderStatusFactory?> = (elements as
        Array<IStorageProviderStatusFactory?>).castToImpl<IStorageProviderStatusFactory,IStorageProviderStatusFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageProviderStatusFactory?> =
        arrayOfNulls<IStorageProviderStatusFactory_Impl>(size) as
        Array<IStorageProviderStatusFactory?>
  }
}
