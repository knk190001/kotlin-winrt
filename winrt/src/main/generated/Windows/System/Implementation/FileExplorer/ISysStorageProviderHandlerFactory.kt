package Windows.System.Implementation.FileExplorer

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

@ABIMarker(ISysStorageProviderHandlerFactory.ABI::class)
@Signature("{ee798431-8213-5e89-a623-14d8c72b8a61}")
@Guid("ee79843182135e89a62314d8c72b8a61")
@WinRTInterface("ee79843182135e89a62314d8c72b8a61")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISysStorageProviderHandlerFactory.ByReference::class)
public interface ISysStorageProviderHandlerFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetHttpRequestProvider(syncRootId: String?): ISysStorageProviderHttpRequestProvider?

  @InterfaceMethod(1)
  public fun GetEventSource(syncRootId: String?, eventName: String?):
      ISysStorageProviderEventSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISysStorageProviderHandlerFactory> {
    public override fun getValue() =
        ABI.makeISysStorageProviderHandlerFactory(pointer.getPointer(0))

    public fun setValue(value: ISysStorageProviderHandlerFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISysStorageProviderHandlerFactory {
    public val __1031496411_Ptr: Pointer?

    public val _1031496411_VtblPtr: Pointer?
      get() = __1031496411_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetHttpRequestProvider(syncRootId: String?):
        ISysStorageProviderHttpRequestProvider? {
      val fnPtr = _1031496411_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ISysStorageProviderHttpRequestProvider>()
      val hr = fn.invokeHR(arrayOf(__1031496411_Ptr, marshalToNative(syncRootId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ISysStorageProviderHttpRequestProvider>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetEventSource(syncRootId: String?, eventName: String?):
        ISysStorageProviderEventSource? {
      val fnPtr = _1031496411_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ISysStorageProviderEventSource>()
      val hr = fn.invokeHR(arrayOf(__1031496411_Ptr, marshalToNative(syncRootId),
          marshalToNative(eventName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ISysStorageProviderEventSource>(result.getValue())
      return resultValue
    }
  }

  public class ISysStorageProviderHandlerFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1031496411_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISysStorageProviderHandlerFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ee79843182135e89a62314d8c72b8a61")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISysStorageProviderHandlerFactory(ptr: Pointer?): WithDefault =
        ISysStorageProviderHandlerFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISysStorageProviderHandlerFactory {
      val address = segment.toRawLongValue()
      return makeISysStorageProviderHandlerFactory(Pointer(address))
    }

    public override fun toNative(obj: ISysStorageProviderHandlerFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1031496411_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISysStorageProviderHandlerFactory):
        Array<ISysStorageProviderHandlerFactory?> = (elements as
        Array<ISysStorageProviderHandlerFactory?>).castToImpl<ISysStorageProviderHandlerFactory,ISysStorageProviderHandlerFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISysStorageProviderHandlerFactory?> =
        arrayOfNulls<ISysStorageProviderHandlerFactory_Impl>(size) as
        Array<ISysStorageProviderHandlerFactory?>
  }
}
