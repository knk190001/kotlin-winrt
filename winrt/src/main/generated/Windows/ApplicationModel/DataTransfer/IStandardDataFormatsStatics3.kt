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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IStandardDataFormatsStatics3.ABI::class)
@Signature("{3b57b069-01d4-474c-8b5f-bc8e27f38b21}")
@Guid("3b57b06901d4474c8b5fbc8e27f38b21")
@WinRTInterface("3b57b06901d4474c8b5fbc8e27f38b21")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IStandardDataFormatsStatics3.ByReference::class)
public interface IStandardDataFormatsStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_UserActivityJsonArray(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IStandardDataFormatsStatics3> {
    public override fun getValue() = ABI.makeIStandardDataFormatsStatics3(pointer.getPointer(0))

    public fun setValue(value: IStandardDataFormatsStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IStandardDataFormatsStatics3 {
    public val __998605433_Ptr: Pointer?

    public val _998605433_VtblPtr: Pointer?
      get() = __998605433_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_UserActivityJsonArray(): String? {
      val fnPtr = _998605433_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__998605433_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IStandardDataFormatsStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __998605433_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IStandardDataFormatsStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3b57b06901d4474c8b5fbc8e27f38b21")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIStandardDataFormatsStatics3(ptr: Pointer?): WithDefault =
        IStandardDataFormatsStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IStandardDataFormatsStatics3 {
      val address = segment.toRawLongValue()
      return makeIStandardDataFormatsStatics3(Pointer(address))
    }

    public override fun toNative(obj: IStandardDataFormatsStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__998605433_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IStandardDataFormatsStatics3):
        Array<IStandardDataFormatsStatics3?> = (elements as
        Array<IStandardDataFormatsStatics3?>).castToImpl<IStandardDataFormatsStatics3,IStandardDataFormatsStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IStandardDataFormatsStatics3?> =
        arrayOfNulls<IStandardDataFormatsStatics3_Impl>(size) as
        Array<IStandardDataFormatsStatics3?>
  }
}
