package Windows.ApplicationModel

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

@ABIMarker(IAppInfo4.ABI::class)
@Signature("{2f34bdeb-1609-4554-9f33-12e1e803e0d4}")
@Guid("2f34bdeb160945549f3312e1e803e0d4")
@WinRTInterface("2f34bdeb160945549f3312e1e803e0d4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInfo4.ByReference::class)
public interface IAppInfo4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SupportedFileExtensions(): Array<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IAppInfo4> {
    public override fun getValue() = ABI.makeIAppInfo4(pointer.getPointer(0))

    public fun setValue(value: IAppInfo4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInfo4 {
    public val __856011894_Ptr: Pointer?

    public val _856011894_VtblPtr: Pointer?
      get() = __856011894_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SupportedFileExtensions(): Array<String?>? {
      val fnPtr = _856011894_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeOutArray<String>()
      val hr = fn.invokeHR(arrayOf(__856011894_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = result.array
      return resultValue
    }
  }

  public class IAppInfo4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __856011894_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInfo4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f34bdeb160945549f3312e1e803e0d4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInfo4(ptr: Pointer?): WithDefault = IAppInfo4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInfo4 {
      val address = segment.toRawLongValue()
      return makeIAppInfo4(Pointer(address))
    }

    public override fun toNative(obj: IAppInfo4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__856011894_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInfo4): Array<IAppInfo4?> = (elements as
        Array<IAppInfo4?>).castToImpl<IAppInfo4,IAppInfo4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInfo4?> = arrayOfNulls<IAppInfo4_Impl>(size)
        as Array<IAppInfo4?>
  }
}
