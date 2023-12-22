package Windows.ApplicationModel.Activation

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

@ABIMarker(IFileOpenPickerActivatedEventArgs2.ABI::class)
@Signature("{5e731f66-8d1f-45fb-af1d-73205c8fc7a1}")
@Guid("5e731f668d1f45fbaf1d73205c8fc7a1")
@WinRTInterface("5e731f668d1f45fbaf1d73205c8fc7a1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFileOpenPickerActivatedEventArgs2.ByReference::class)
public interface IFileOpenPickerActivatedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_CallerPackageFamilyName(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFileOpenPickerActivatedEventArgs2> {
    public override fun getValue() =
        ABI.makeIFileOpenPickerActivatedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IFileOpenPickerActivatedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFileOpenPickerActivatedEventArgs2 {
    public val __2092032143_Ptr: Pointer?

    public val _2092032143_VtblPtr: Pointer?
      get() = __2092032143_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_CallerPackageFamilyName(): String? {
      val fnPtr = _2092032143_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2092032143_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IFileOpenPickerActivatedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2092032143_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFileOpenPickerActivatedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5e731f668d1f45fbaf1d73205c8fc7a1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFileOpenPickerActivatedEventArgs2(ptr: Pointer?): WithDefault =
        IFileOpenPickerActivatedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFileOpenPickerActivatedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIFileOpenPickerActivatedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IFileOpenPickerActivatedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2092032143_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFileOpenPickerActivatedEventArgs2):
        Array<IFileOpenPickerActivatedEventArgs2?> = (elements as
        Array<IFileOpenPickerActivatedEventArgs2?>).castToImpl<IFileOpenPickerActivatedEventArgs2,IFileOpenPickerActivatedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFileOpenPickerActivatedEventArgs2?> =
        arrayOfNulls<IFileOpenPickerActivatedEventArgs2_Impl>(size) as
        Array<IFileOpenPickerActivatedEventArgs2?>
  }
}
