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

@ABIMarker(IFolderPicker3.ABI::class)
@Signature("{673b1e29-d326-53c0-bd24-a25c714cee36}")
@Guid("673b1e29d32653c0bd24a25c714cee36")
@WinRTInterface("673b1e29d32653c0bd24a25c714cee36")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFolderPicker3.ByReference::class)
public interface IFolderPicker3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_User(): User?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IFolderPicker3>
      {
    public override fun getValue() = ABI.makeIFolderPicker3(pointer.getPointer(0))

    public fun setValue(value: IFolderPicker3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFolderPicker3 {
    public val __1762225781_Ptr: Pointer?

    public val _1762225781_VtblPtr: Pointer?
      get() = __1762225781_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_User(): User? {
      val fnPtr = _1762225781_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__1762225781_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }
  }

  public class IFolderPicker3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1762225781_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFolderPicker3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("673b1e29d32653c0bd24a25c714cee36")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFolderPicker3(ptr: Pointer?): WithDefault = IFolderPicker3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFolderPicker3 {
      val address = segment.toRawLongValue()
      return makeIFolderPicker3(Pointer(address))
    }

    public override fun toNative(obj: IFolderPicker3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1762225781_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFolderPicker3): Array<IFolderPicker3?> = (elements as
        Array<IFolderPicker3?>).castToImpl<IFolderPicker3,IFolderPicker3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFolderPicker3?> =
        arrayOfNulls<IFolderPicker3_Impl>(size) as Array<IFolderPicker3?>
  }
}
