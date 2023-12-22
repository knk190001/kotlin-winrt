package Windows.Storage

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStorageLibrary3.ABI::class)
@Signature("{8a281291-2154-4201-8113-d2c05ce1ad23}")
@Guid("8a281291215442018113d2c05ce1ad23")
@WinRTInterface("8a281291215442018113d2c05ce1ad23")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStorageLibrary3.ByReference::class)
public interface IStorageLibrary3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AreFolderSuggestionsAvailableAsync(): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStorageLibrary3> {
    public override fun getValue() = ABI.makeIStorageLibrary3(pointer.getPointer(0))

    public fun setValue(value: IStorageLibrary3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStorageLibrary3 {
    public val __431479994_Ptr: Pointer?

    public val _431479994_VtblPtr: Pointer?
      get() = __431479994_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AreFolderSuggestionsAvailableAsync(): IAsyncOperation<Boolean>? {
      val fnPtr = _431479994_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__431479994_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IStorageLibrary3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __431479994_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStorageLibrary3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8a281291215442018113d2c05ce1ad23")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStorageLibrary3(ptr: Pointer?): WithDefault = IStorageLibrary3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStorageLibrary3 {
      val address = segment.toRawLongValue()
      return makeIStorageLibrary3(Pointer(address))
    }

    public override fun toNative(obj: IStorageLibrary3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__431479994_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStorageLibrary3): Array<IStorageLibrary3?> = (elements as
        Array<IStorageLibrary3?>).castToImpl<IStorageLibrary3,IStorageLibrary3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStorageLibrary3?> =
        arrayOfNulls<IStorageLibrary3_Impl>(size) as Array<IStorageLibrary3?>
  }
}
