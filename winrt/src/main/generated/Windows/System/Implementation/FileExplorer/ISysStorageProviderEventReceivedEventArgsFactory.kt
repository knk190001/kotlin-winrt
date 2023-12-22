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

@ABIMarker(ISysStorageProviderEventReceivedEventArgsFactory.ABI::class)
@Signature("{de1a780e-e975-5f68-bcc6-fb46281c6a61}")
@Guid("de1a780ee9755f68bcc6fb46281c6a61")
@WinRTInterface("de1a780ee9755f68bcc6fb46281c6a61")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISysStorageProviderEventReceivedEventArgsFactory.ByReference::class)
public interface ISysStorageProviderEventReceivedEventArgsFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstance(json: String?): SysStorageProviderEventReceivedEventArgs?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISysStorageProviderEventReceivedEventArgsFactory> {
    public override fun getValue() =
        ABI.makeISysStorageProviderEventReceivedEventArgsFactory(pointer.getPointer(0))

    public fun setValue(value: ISysStorageProviderEventReceivedEventArgsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISysStorageProviderEventReceivedEventArgsFactory {
    public val __1947154999_Ptr: Pointer?

    public val _1947154999_VtblPtr: Pointer?
      get() = __1947154999_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstance(json: String?): SysStorageProviderEventReceivedEventArgs? {
      val fnPtr = _1947154999_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SysStorageProviderEventReceivedEventArgs>()
      val hr = fn.invokeHR(arrayOf(__1947154999_Ptr, marshalToNative(json), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<SysStorageProviderEventReceivedEventArgs>(result.getValue())
      return resultValue
    }
  }

  public class ISysStorageProviderEventReceivedEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1947154999_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISysStorageProviderEventReceivedEventArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("de1a780ee9755f68bcc6fb46281c6a61")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISysStorageProviderEventReceivedEventArgsFactory(ptr: Pointer?): WithDefault =
        ISysStorageProviderEventReceivedEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISysStorageProviderEventReceivedEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeISysStorageProviderEventReceivedEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: ISysStorageProviderEventReceivedEventArgsFactory):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__1947154999_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISysStorageProviderEventReceivedEventArgsFactory):
        Array<ISysStorageProviderEventReceivedEventArgsFactory?> = (elements as
        Array<ISysStorageProviderEventReceivedEventArgsFactory?>).castToImpl<ISysStorageProviderEventReceivedEventArgsFactory,ISysStorageProviderEventReceivedEventArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISysStorageProviderEventReceivedEventArgsFactory?>
        = arrayOfNulls<ISysStorageProviderEventReceivedEventArgsFactory_Impl>(size) as
        Array<ISysStorageProviderEventReceivedEventArgsFactory?>
  }
}
