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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUserActivity3.ABI::class)
@Signature("{e7697744-e1a2-5147-8e06-55f1eeef271c}")
@Guid("e7697744e1a251478e0655f1eeef271c")
@WinRTInterface("e7697744e1a251478e0655f1eeef271c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserActivity3.ByReference::class)
public interface IUserActivity3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsRoamable(): Boolean

  @InterfaceMethod(1)
  public fun put_IsRoamable(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IUserActivity3>
      {
    public override fun getValue() = ABI.makeIUserActivity3(pointer.getPointer(0))

    public fun setValue(value: IUserActivity3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserActivity3 {
    public val __747059090_Ptr: Pointer?

    public val _747059090_VtblPtr: Pointer?
      get() = __747059090_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsRoamable(): Boolean {
      val fnPtr = _747059090_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__747059090_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsRoamable(value: Boolean): Unit {
      val fnPtr = _747059090_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__747059090_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUserActivity3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __747059090_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserActivity3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e7697744e1a251478e0655f1eeef271c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserActivity3(ptr: Pointer?): WithDefault = IUserActivity3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserActivity3 {
      val address = segment.toRawLongValue()
      return makeIUserActivity3(Pointer(address))
    }

    public override fun toNative(obj: IUserActivity3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__747059090_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserActivity3): Array<IUserActivity3?> = (elements as
        Array<IUserActivity3?>).castToImpl<IUserActivity3,IUserActivity3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserActivity3?> =
        arrayOfNulls<IUserActivity3_Impl>(size) as Array<IUserActivity3?>
  }
}
