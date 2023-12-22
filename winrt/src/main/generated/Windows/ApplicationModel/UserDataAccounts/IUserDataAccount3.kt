package Windows.ApplicationModel.UserDataAccounts

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IUserDataAccount3.ABI::class)
@Signature("{01533845-6c43-4286-9d69-3e1709a1f266}")
@Guid("015338456c4342869d693e1709a1f266")
@WinRTInterface("015338456c4342869d693e1709a1f266")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataAccount3.ByReference::class)
public interface IUserDataAccount3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ExplictReadAccessPackageFamilyNames(): IVector<String?>?

  @InterfaceMethod(1)
  public fun get_DisplayName(): String?

  @InterfaceMethod(2)
  public fun put_DisplayName(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataAccount3> {
    public override fun getValue() = ABI.makeIUserDataAccount3(pointer.getPointer(0))

    public fun setValue(value: IUserDataAccount3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataAccount3 {
    public val __199409665_Ptr: Pointer?

    public val _199409665_VtblPtr: Pointer?
      get() = __199409665_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ExplictReadAccessPackageFamilyNames(): IVector<String?>? {
      val fnPtr = _199409665_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<String?>>()
      val hr = fn.invokeHR(arrayOf(__199409665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DisplayName(): String? {
      val fnPtr = _199409665_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__199409665_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_DisplayName(value: String?): Unit {
      val fnPtr = _199409665_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__199409665_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUserDataAccount3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __199409665_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataAccount3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("015338456c4342869d693e1709a1f266")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataAccount3(ptr: Pointer?): WithDefault = IUserDataAccount3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataAccount3 {
      val address = segment.toRawLongValue()
      return makeIUserDataAccount3(Pointer(address))
    }

    public override fun toNative(obj: IUserDataAccount3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__199409665_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataAccount3): Array<IUserDataAccount3?> = (elements
        as Array<IUserDataAccount3?>).castToImpl<IUserDataAccount3,IUserDataAccount3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataAccount3?> =
        arrayOfNulls<IUserDataAccount3_Impl>(size) as Array<IUserDataAccount3?>
  }
}
