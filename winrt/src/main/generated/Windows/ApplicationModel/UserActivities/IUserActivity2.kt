package Windows.ApplicationModel.UserActivities

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

@ABIMarker(IUserActivity2.ABI::class)
@Signature("{9dc40c62-08c4-47ac-aa9c-2bb2221c55fd}")
@Guid("9dc40c6208c447acaa9c2bb2221c55fd")
@WinRTInterface("9dc40c6208c447acaa9c2bb2221c55fd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserActivity2.ByReference::class)
public interface IUserActivity2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ToJson(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUserActivity2>
      {
    public override fun getValue() = ABI.makeIUserActivity2(pointer.getPointer(0))

    public fun setValue(value: IUserActivity2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserActivity2 {
    public val __747059089_Ptr: Pointer?

    public val _747059089_VtblPtr: Pointer?
      get() = __747059089_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ToJson(): String? {
      val fnPtr = _747059089_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__747059089_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IUserActivity2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __747059089_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserActivity2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9dc40c6208c447acaa9c2bb2221c55fd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserActivity2(ptr: Pointer?): WithDefault = IUserActivity2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserActivity2 {
      val address = segment.toRawLongValue()
      return makeIUserActivity2(Pointer(address))
    }

    public override fun toNative(obj: IUserActivity2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__747059089_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserActivity2): Array<IUserActivity2?> = (elements as
        Array<IUserActivity2?>).castToImpl<IUserActivity2,IUserActivity2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserActivity2?> =
        arrayOfNulls<IUserActivity2_Impl>(size) as Array<IUserActivity2?>
  }
}
