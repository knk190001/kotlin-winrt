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

@ABIMarker(IFolderPickerStatics.ABI::class)
@Signature("{9be34740-7ca1-5942-a3c8-46f2551ecff3}")
@Guid("9be347407ca15942a3c846f2551ecff3")
@WinRTInterface("9be347407ca15942a3c846f2551ecff3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFolderPickerStatics.ByReference::class)
public interface IFolderPickerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateForUser(user: User?): FolderPicker?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFolderPickerStatics> {
    public override fun getValue() = ABI.makeIFolderPickerStatics(pointer.getPointer(0))

    public fun setValue(value: IFolderPickerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFolderPickerStatics {
    public val __1094634599_Ptr: Pointer?

    public val _1094634599_VtblPtr: Pointer?
      get() = __1094634599_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateForUser(user: User?): FolderPicker? {
      val fnPtr = _1094634599_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FolderPicker>()
      val hr = fn.invokeHR(arrayOf(__1094634599_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FolderPicker>(result.getValue())
      return resultValue
    }
  }

  public class IFolderPickerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1094634599_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFolderPickerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9be347407ca15942a3c846f2551ecff3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFolderPickerStatics(ptr: Pointer?): WithDefault = IFolderPickerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFolderPickerStatics {
      val address = segment.toRawLongValue()
      return makeIFolderPickerStatics(Pointer(address))
    }

    public override fun toNative(obj: IFolderPickerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1094634599_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFolderPickerStatics): Array<IFolderPickerStatics?> =
        (elements as
        Array<IFolderPickerStatics?>).castToImpl<IFolderPickerStatics,IFolderPickerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFolderPickerStatics?> =
        arrayOfNulls<IFolderPickerStatics_Impl>(size) as Array<IFolderPickerStatics?>
  }
}
