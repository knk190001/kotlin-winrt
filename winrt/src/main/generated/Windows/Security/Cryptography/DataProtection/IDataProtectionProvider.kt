package Windows.Security.Cryptography.DataProtection

import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IBuffer
import Windows.Storage.Streams.IInputStream
import Windows.Storage.Streams.IOutputStream
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

@ABIMarker(IDataProtectionProvider.ABI::class)
@Signature("{09639948-ed22-4270-bd1c-6d72c00f8787}")
@Guid("09639948ed224270bd1c6d72c00f8787")
@WinRTInterface("09639948ed224270bd1c6d72c00f8787")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataProtectionProvider.ByReference::class)
public interface IDataProtectionProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ProtectAsync(`data`: IBuffer?): IAsyncOperation<IBuffer?>?

  @InterfaceMethod(1)
  public fun UnprotectAsync(`data`: IBuffer?): IAsyncOperation<IBuffer?>?

  @InterfaceMethod(2)
  public fun ProtectStreamAsync(src: IInputStream?, dest: IOutputStream?): IAsyncAction?

  @InterfaceMethod(3)
  public fun UnprotectStreamAsync(src: IInputStream?, dest: IOutputStream?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataProtectionProvider> {
    public override fun getValue() = ABI.makeIDataProtectionProvider(pointer.getPointer(0))

    public fun setValue(value: IDataProtectionProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataProtectionProvider {
    public val __766870501_Ptr: Pointer?

    public val _766870501_VtblPtr: Pointer?
      get() = __766870501_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ProtectAsync(`data`: IBuffer?): IAsyncOperation<IBuffer?>? {
      val fnPtr = _766870501_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__766870501_Ptr, marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IBuffer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun UnprotectAsync(`data`: IBuffer?): IAsyncOperation<IBuffer?>? {
      val fnPtr = _766870501_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__766870501_Ptr, marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IBuffer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ProtectStreamAsync(src: IInputStream?, dest: IOutputStream?):
        IAsyncAction? {
      val fnPtr = _766870501_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__766870501_Ptr, marshalToNative(src), marshalToNative(dest),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun UnprotectStreamAsync(src: IInputStream?, dest: IOutputStream?):
        IAsyncAction? {
      val fnPtr = _766870501_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__766870501_Ptr, marshalToNative(src), marshalToNative(dest),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IDataProtectionProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __766870501_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataProtectionProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("09639948ed224270bd1c6d72c00f8787")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataProtectionProvider(ptr: Pointer?): WithDefault =
        IDataProtectionProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataProtectionProvider {
      val address = segment.toRawLongValue()
      return makeIDataProtectionProvider(Pointer(address))
    }

    public override fun toNative(obj: IDataProtectionProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__766870501_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataProtectionProvider): Array<IDataProtectionProvider?>
        = (elements as
        Array<IDataProtectionProvider?>).castToImpl<IDataProtectionProvider,IDataProtectionProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataProtectionProvider?> =
        arrayOfNulls<IDataProtectionProvider_Impl>(size) as Array<IDataProtectionProvider?>
  }
}
