package Windows.Storage.Pickers

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

@ABIMarker(IFileSavePicker3.ABI::class)
@Signature("{698aec69-ba3c-4e51-bd90-4abcbbf4cfaf}")
@Guid("698aec69ba3c4e51bd904abcbbf4cfaf")
@WinRTInterface("698aec69ba3c4e51bd904abcbbf4cfaf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileSavePicker3.ByReference::class)
public interface IFileSavePicker3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EnterpriseId(): String?

  @InterfaceMethod(1)
  public fun put_EnterpriseId(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileSavePicker3> {
    public override fun getValue() = ABI.makeIFileSavePicker3(pointer.getPointer(0))

    public fun setValue(value: IFileSavePicker3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileSavePicker3 {
    public val __906586134_Ptr: Pointer?

    public val _906586134_VtblPtr: Pointer?
      get() = __906586134_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EnterpriseId(): String? {
      val fnPtr = _906586134_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__906586134_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_EnterpriseId(value: String?): Unit {
      val fnPtr = _906586134_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__906586134_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IFileSavePicker3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __906586134_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileSavePicker3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("698aec69ba3c4e51bd904abcbbf4cfaf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileSavePicker3(ptr: Pointer?): WithDefault = IFileSavePicker3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileSavePicker3 {
      val address = segment.toRawLongValue()
      return makeIFileSavePicker3(Pointer(address))
    }

    public override fun toNative(obj: IFileSavePicker3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__906586134_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileSavePicker3): Array<IFileSavePicker3?> = (elements as
        Array<IFileSavePicker3?>).castToImpl<IFileSavePicker3,IFileSavePicker3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileSavePicker3?> =
        arrayOfNulls<IFileSavePicker3_Impl>(size) as Array<IFileSavePicker3?>
  }
}
