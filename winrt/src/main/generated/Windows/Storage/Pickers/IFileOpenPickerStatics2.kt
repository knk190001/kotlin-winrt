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

@ABIMarker(IFileOpenPickerStatics2.ABI::class)
@Signature("{e8917415-eddd-5c98-b6f3-366fdfcad392}")
@Guid("e8917415eddd5c98b6f3366fdfcad392")
@WinRTInterface("e8917415eddd5c98b6f3366fdfcad392")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileOpenPickerStatics2.ByReference::class)
public interface IFileOpenPickerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateForUser(user: User?): FileOpenPicker?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileOpenPickerStatics2> {
    public override fun getValue() = ABI.makeIFileOpenPickerStatics2(pointer.getPointer(0))

    public fun setValue(value: IFileOpenPickerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileOpenPickerStatics2 {
    public val __1893364643_Ptr: Pointer?

    public val _1893364643_VtblPtr: Pointer?
      get() = __1893364643_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateForUser(user: User?): FileOpenPicker? {
      val fnPtr = _1893364643_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FileOpenPicker>()
      val hr = fn.invokeHR(arrayOf(__1893364643_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FileOpenPicker>(result.getValue())
      return resultValue
    }
  }

  public class IFileOpenPickerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1893364643_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileOpenPickerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e8917415eddd5c98b6f3366fdfcad392")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileOpenPickerStatics2(ptr: Pointer?): WithDefault =
        IFileOpenPickerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileOpenPickerStatics2 {
      val address = segment.toRawLongValue()
      return makeIFileOpenPickerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IFileOpenPickerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1893364643_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileOpenPickerStatics2): Array<IFileOpenPickerStatics2?>
        = (elements as
        Array<IFileOpenPickerStatics2?>).castToImpl<IFileOpenPickerStatics2,IFileOpenPickerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileOpenPickerStatics2?> =
        arrayOfNulls<IFileOpenPickerStatics2_Impl>(size) as Array<IFileOpenPickerStatics2?>
  }
}
