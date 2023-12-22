package Windows.Foundation

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

@ABIMarker(IWwwFormUrlDecoderEntry.ABI::class)
@Signature("{125e7431-f678-4e8e-b670-20a9b06c512d}")
@Guid("125e7431f6784e8eb67020a9b06c512d")
@WinRTInterface("125e7431f6784e8eb67020a9b06c512d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWwwFormUrlDecoderEntry.ByReference::class)
public interface IWwwFormUrlDecoderEntry : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Name(): String?

  @InterfaceMethod(1)
  public fun get_Value(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWwwFormUrlDecoderEntry> {
    public override fun getValue() = ABI.makeIWwwFormUrlDecoderEntry(pointer.getPointer(0))

    public fun setValue(value: IWwwFormUrlDecoderEntry_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWwwFormUrlDecoderEntry {
    public val __1346214349_Ptr: Pointer?

    public val _1346214349_VtblPtr: Pointer?
      get() = __1346214349_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Name(): String? {
      val fnPtr = _1346214349_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1346214349_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Value(): String? {
      val fnPtr = _1346214349_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1346214349_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IWwwFormUrlDecoderEntry_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1346214349_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWwwFormUrlDecoderEntry, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("125e7431f6784e8eb67020a9b06c512d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWwwFormUrlDecoderEntry(ptr: Pointer?): WithDefault =
        IWwwFormUrlDecoderEntry_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWwwFormUrlDecoderEntry {
      val address = segment.toRawLongValue()
      return makeIWwwFormUrlDecoderEntry(Pointer(address))
    }

    public override fun toNative(obj: IWwwFormUrlDecoderEntry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1346214349_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWwwFormUrlDecoderEntry): Array<IWwwFormUrlDecoderEntry?>
        = (elements as
        Array<IWwwFormUrlDecoderEntry?>).castToImpl<IWwwFormUrlDecoderEntry,IWwwFormUrlDecoderEntry_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWwwFormUrlDecoderEntry?> =
        arrayOfNulls<IWwwFormUrlDecoderEntry_Impl>(size) as Array<IWwwFormUrlDecoderEntry?>
  }
}
