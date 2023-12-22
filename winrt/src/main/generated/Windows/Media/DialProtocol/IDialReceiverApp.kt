package Windows.Media.DialProtocol

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
import Windows.Foundation.Collections.IMap
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IDialReceiverApp.ABI::class)
@Signature("{fd3e7c57-5045-470e-b304-4dd9b13e7d11}")
@Guid("fd3e7c575045470eb3044dd9b13e7d11")
@WinRTInterface("fd3e7c575045470eb3044dd9b13e7d11")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDialReceiverApp.ByReference::class)
public interface IDialReceiverApp : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAdditionalDataAsync(): IAsyncOperation<IMap<String?, String?>?>?

  @InterfaceMethod(1)
  public fun SetAdditionalDataAsync(additionalData: IIterable<IKeyValuePair<String?, String?>?>?):
      IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDialReceiverApp> {
    public override fun getValue() = ABI.makeIDialReceiverApp(pointer.getPointer(0))

    public fun setValue(value: IDialReceiverApp_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDialReceiverApp {
    public val __69640246_Ptr: Pointer?

    public val _69640246_VtblPtr: Pointer?
      get() = __69640246_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAdditionalDataAsync(): IAsyncOperation<IMap<String?, String?>?>? {
      val fnPtr = _69640246_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IMap<String?, String?>?>>()
      val hr = fn.invokeHR(arrayOf(__69640246_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IMap<String?,
          String?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetAdditionalDataAsync(additionalData: IIterable<IKeyValuePair<String?,
        String?>?>?): IAsyncAction? {
      val fnPtr = _69640246_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__69640246_Ptr, marshalToNative(additionalData), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IDialReceiverApp_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __69640246_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDialReceiverApp, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fd3e7c575045470eb3044dd9b13e7d11")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDialReceiverApp(ptr: Pointer?): WithDefault = IDialReceiverApp_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDialReceiverApp {
      val address = segment.toRawLongValue()
      return makeIDialReceiverApp(Pointer(address))
    }

    public override fun toNative(obj: IDialReceiverApp): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__69640246_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDialReceiverApp): Array<IDialReceiverApp?> = (elements as
        Array<IDialReceiverApp?>).castToImpl<IDialReceiverApp,IDialReceiverApp_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDialReceiverApp?> =
        arrayOfNulls<IDialReceiverApp_Impl>(size) as Array<IDialReceiverApp?>
  }
}
