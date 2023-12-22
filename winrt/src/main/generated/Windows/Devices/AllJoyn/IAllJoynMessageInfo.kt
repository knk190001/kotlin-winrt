package Windows.Devices.AllJoyn

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

@ABIMarker(IAllJoynMessageInfo.ABI::class)
@Signature("{ff2b0127-2c12-4859-aa3a-c74461ee814c}")
@Guid("ff2b01272c124859aa3ac74461ee814c")
@WinRTInterface("ff2b01272c124859aa3ac74461ee814c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAllJoynMessageInfo.ByReference::class)
public interface IAllJoynMessageInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SenderUniqueName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAllJoynMessageInfo> {
    public override fun getValue() = ABI.makeIAllJoynMessageInfo(pointer.getPointer(0))

    public fun setValue(value: IAllJoynMessageInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAllJoynMessageInfo {
    public val __619817284_Ptr: Pointer?

    public val _619817284_VtblPtr: Pointer?
      get() = __619817284_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SenderUniqueName(): String? {
      val fnPtr = _619817284_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__619817284_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IAllJoynMessageInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __619817284_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAllJoynMessageInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ff2b01272c124859aa3ac74461ee814c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAllJoynMessageInfo(ptr: Pointer?): WithDefault = IAllJoynMessageInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAllJoynMessageInfo {
      val address = segment.toRawLongValue()
      return makeIAllJoynMessageInfo(Pointer(address))
    }

    public override fun toNative(obj: IAllJoynMessageInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__619817284_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAllJoynMessageInfo): Array<IAllJoynMessageInfo?> =
        (elements as
        Array<IAllJoynMessageInfo?>).castToImpl<IAllJoynMessageInfo,IAllJoynMessageInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAllJoynMessageInfo?> =
        arrayOfNulls<IAllJoynMessageInfo_Impl>(size) as Array<IAllJoynMessageInfo?>
  }
}
