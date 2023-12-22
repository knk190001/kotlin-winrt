package Windows.Storage.Pickers

import Windows.System.User
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

@ABIMarker(IFileOpenPicker3.ABI::class)
@Signature("{d9a5c5b3-c5dc-5b98-bd80-a8d0ca0584d8}")
@Guid("d9a5c5b3c5dc5b98bd80a8d0ca0584d8")
@WinRTInterface("d9a5c5b3c5dc5b98bd80a8d0ca0584d8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileOpenPicker3.ByReference::class)
public interface IFileOpenPicker3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_User(): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileOpenPicker3> {
    public override fun getValue() = ABI.makeIFileOpenPicker3(pointer.getPointer(0))

    public fun setValue(value: IFileOpenPicker3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileOpenPicker3 {
    public val __1794071939_Ptr: Pointer?

    public val _1794071939_VtblPtr: Pointer?
      get() = __1794071939_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_User(): User? {
      val fnPtr = _1794071939_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__1794071939_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class IFileOpenPicker3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1794071939_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileOpenPicker3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d9a5c5b3c5dc5b98bd80a8d0ca0584d8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileOpenPicker3(ptr: Pointer?): WithDefault = IFileOpenPicker3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileOpenPicker3 {
      val address = segment.toRawLongValue()
      return makeIFileOpenPicker3(Pointer(address))
    }

    public override fun toNative(obj: IFileOpenPicker3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1794071939_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileOpenPicker3): Array<IFileOpenPicker3?> = (elements as
        Array<IFileOpenPicker3?>).castToImpl<IFileOpenPicker3,IFileOpenPicker3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileOpenPicker3?> =
        arrayOfNulls<IFileOpenPicker3_Impl>(size) as Array<IFileOpenPicker3?>
  }
}
