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

@ABIMarker(IFileSavePickerStatics.ABI::class)
@Signature("{28e3cf9e-961c-5e2c-aed7-e64737f4ce37}")
@Guid("28e3cf9e961c5e2caed7e64737f4ce37")
@WinRTInterface("28e3cf9e961c5e2caed7e64737f4ce37")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileSavePickerStatics.ByReference::class)
public interface IFileSavePickerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateForUser(user: User?): FileSavePicker?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileSavePickerStatics> {
    public override fun getValue() = ABI.makeIFileSavePickerStatics(pointer.getPointer(0))

    public fun setValue(value: IFileSavePickerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileSavePickerStatics {
    public val __1994241508_Ptr: Pointer?

    public val _1994241508_VtblPtr: Pointer?
      get() = __1994241508_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateForUser(user: User?): FileSavePicker? {
      val fnPtr = _1994241508_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FileSavePicker>()
      val hr = fn.invokeHR(arrayOf(__1994241508_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FileSavePicker>(result.getValue())
      return resultValue
    }
  }

  public class IFileSavePickerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1994241508_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileSavePickerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("28e3cf9e961c5e2caed7e64737f4ce37")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileSavePickerStatics(ptr: Pointer?): WithDefault =
        IFileSavePickerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileSavePickerStatics {
      val address = segment.toRawLongValue()
      return makeIFileSavePickerStatics(Pointer(address))
    }

    public override fun toNative(obj: IFileSavePickerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1994241508_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileSavePickerStatics): Array<IFileSavePickerStatics?> =
        (elements as
        Array<IFileSavePickerStatics?>).castToImpl<IFileSavePickerStatics,IFileSavePickerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileSavePickerStatics?> =
        arrayOfNulls<IFileSavePickerStatics_Impl>(size) as Array<IFileSavePickerStatics?>
  }
}
