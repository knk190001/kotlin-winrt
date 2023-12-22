package Windows.ApplicationModel.DataTransfer

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

@ABIMarker(IDataRequestedEventArgs.ABI::class)
@Signature("{cb8ba807-6ac5-43c9-8ac5-9ba232163182}")
@Guid("cb8ba8076ac543c98ac59ba232163182")
@WinRTInterface("cb8ba8076ac543c98ac59ba232163182")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDataRequestedEventArgs.ByReference::class)
public interface IDataRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): DataRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDataRequestedEventArgs> {
    public override fun getValue() = ABI.makeIDataRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDataRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDataRequestedEventArgs {
    public val __2041783645_Ptr: Pointer?

    public val _2041783645_VtblPtr: Pointer?
      get() = __2041783645_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): DataRequest? {
      val fnPtr = _2041783645_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DataRequest>()
      val hr = fn.invokeHR(arrayOf(__2041783645_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DataRequest>(result.getValue())
      return resultValue
    }
  }

  public class IDataRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2041783645_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDataRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cb8ba8076ac543c98ac59ba232163182")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDataRequestedEventArgs(ptr: Pointer?): WithDefault =
        IDataRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDataRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIDataRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDataRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2041783645_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDataRequestedEventArgs): Array<IDataRequestedEventArgs?>
        = (elements as
        Array<IDataRequestedEventArgs?>).castToImpl<IDataRequestedEventArgs,IDataRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDataRequestedEventArgs?> =
        arrayOfNulls<IDataRequestedEventArgs_Impl>(size) as Array<IDataRequestedEventArgs?>
  }
}
